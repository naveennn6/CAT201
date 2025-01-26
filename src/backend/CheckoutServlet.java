import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {
    private static final String DATA_FILE = "src/backend/cart.json";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Load cart data
        JSONObject jsonData = loadData();
        JSONArray cartItems = jsonData.getJSONArray("cartItems");

        // Send cart items as response
        response.setContentType("application/json");
        response.getWriter().write(cartItems.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Parse order details from request body
        StringBuilder requestBody = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                requestBody.append(line);
            }
        }

        JSONObject orderDetails = new JSONObject(requestBody.toString());

        // Load existing data
        JSONObject jsonData = loadData();
        JSONArray orders = jsonData.getJSONArray("orders");

        // Add new order
        orders.put(orderDetails);

        // Save updated data
        saveData(jsonData);

        // Respond with success
        response.setContentType("application/json");
        response.getWriter().write("{\"message\":\"Order placed successfully\"}");
    }

    private JSONObject loadData() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(DATA_FILE)));
        return new JSONObject(content);
    }

    private void saveData(JSONObject data) throws IOException {
        try (FileWriter file = new FileWriter(DATA_FILE)) {
            file.write(data.toString(4)); // Pretty print with 4 spaces
        }
    }
}

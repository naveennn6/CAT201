package com.yourpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register") // Define the URL pattern for this servlet
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Read the JSON data from the request
        StringBuilder sb = new StringBuilder();
        String line;
        try (BufferedReader reader = request.getReader()) {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }

        // Parse the incoming JSON data
        Gson gson = new Gson();
        User user = gson.fromJson(sb.toString(), User.class);

        // Store the user data
        UserStorage.saveUser(user);

        // Respond with a success message
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print("{\"message\":\"User registered successfully!\"}");
        out.flush();
    }
}

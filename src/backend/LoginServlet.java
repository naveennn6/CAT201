import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get login data from the request
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Get the list of users from JSON
        List<User> users = UserStorage.getUsers();
        
        // Check if the provided email and password match any user
        boolean isAuthenticated = users.stream()
                .anyMatch(user -> user.getEmail().equals(email) && user.getPassword().equals(password));

        // Set response based on authentication result
        if (isAuthenticated) {
            response.getWriter().write("Login successful!"); // Handle successful login
        } else {
            response.getWriter().write("Invalid email or password."); // Handle failed login
        }
    }
}

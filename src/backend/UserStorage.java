import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private static final String FILE_PATH = "users.json"; // Path to your JSON file

    // Method to save user data to JSON file
    public static void saveUser(User user) {
        List<User> users = getUsers(); // Read existing users

        users.add(user); // Add new user to the list

        // Write updated list back to the JSON file
        try (Writer writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions as needed
        }
    }

    // Method to read users from JSON file
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();

        // Check if the file exists before reading
        Path path = Paths.get(FILE_PATH);
        if (Files.exists(path)) {
            try (Reader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                Gson gson = new Gson();
                users = gson.fromJson(reader, new TypeToken<List<User>>() {}.getType());
            } catch (IOException e) {
                e.printStackTrace(); // Handle exceptions as needed
            }
        }

        return users;
    }
}

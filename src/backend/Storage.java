import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class JsonStorage {
    private static final String FILE_PATH = "contactForms.json"; // Change to your desired file path

    // Method to save contact form data to JSON file
    public static void saveContactForm(ContactForm contactForm) {
        List<ContactForm> contactForms = getContactForms(); // Read existing data

        contactForms.add(contactForm); // Add new contact form to the list

        // Write updated list back to the JSON file
        try (Writer writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(contactForms, writer);
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions as needed
        }
    }

    // Method to read contact forms from JSON file
    public static List<ContactForm> getContactForms() {
        List<ContactForm> contactForms = new ArrayList<>();

        // Check if the file exists before reading
        Path path = Paths.get(FILE_PATH);
        if (Files.exists(path)) {
            try (Reader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                Gson gson = new Gson();
                contactForms = gson.fromJson(reader, new TypeToken<List<ContactForm>>() {}.getType());
            } catch (IOException e) {
                e.printStackTrace(); // Handle exceptions as needed
            }
        }

        return contactForms;
    }
}

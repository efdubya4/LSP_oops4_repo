import java.io.*;
import java.nio.file.*;
import java.util.*;
/*
 * Foster Ware IV
 * LSP Spring 2025
 */
public class ETLProductTransformer {

    public static void main(String[] args) {
        // Define paths for input and output files
        Path inputPath = Paths.get("LSP_oops4_repo/data/products.csv");
        Path outputPath = Paths.get("LSP_oops4_repo/data/transformed_products.csv");

        try {
            // Read all lines from the input file
            List<String> lines = Files.readAllLines(inputPath);

            // Skip the header and process each line
            List<String> transformedLines = new ArrayList<>();
            transformedLines.add("ProductID,Name,Price,Category,PriceRange"); // Add header to output

            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] fields = line.split(",");

                int productID = Integer.parseInt(fields[0]);
                String name = fields[1].toUpperCase(); // Convert name to uppercase
                double price = Double.parseDouble(fields[2]);
                String category = fields[3];

                // Apply 10% discount for Electronics category
                if (category.equals("Electronics")) {
                    price *= 0.9;
                    price = Math.round(price * 100.0) / 100.0; // Round to 2 decimal places
                }

                // Adjust category for products with price > $500
                if (category.equals("Electronics") && price > 500) {
                    category = "Premium Electronics";
                }

                // Determine PriceRange
                String priceRange = getPriceRange(price);

                // Add transformed line to the list
                transformedLines.add(String.format("%d,%s,%.2f,%s,%s",
                        productID, name, price, category, priceRange));
            }

            // Write transformed lines to the output file
            Files.write(outputPath, transformedLines);

            System.out.println("Transformation complete. Output written to " + outputPath);

        } catch (NoSuchFileException e) {
            System.err.println("Error: Input file not found at " + inputPath);
        } catch (IOException e) {
            System.err.println("Error: An I/O error occurred while processing the file.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error: An unexpected error occurred.");
            e.printStackTrace();
        }
    }

    // Helper method to determine PriceRange based on price
    private static String getPriceRange(double price) {
        if (price >= 0 && price <= 10) {
            return "Low";
        } else if (price > 10 && price <= 100) {
            return "Medium";
        } else if (price > 100 && price <= 500) {
            return "High";
        } else {
            return "Premium";
        }
    }
}

/**
 * This code was developed with assistance from DeepSeek Chat (https://www.deepseek.com).
 * The logic and structure of the code were guided by the requirements provided in the assignment.
 * No direct code was copied, but the solution was developed with the help of the AI assistant.
 */
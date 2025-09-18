package org.example.Lecture2.Exercises;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        inventoryTracking();
    }

    public static void inventoryTracking(){
        HashMap<String, Integer> inventory = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Store Inventory");

        while (running){
            // Options
            System.out.println("Choose an option:");
            System.out.println("1. Add a product");
            System.out.println("2. Check product quantity");
            System.out.println("3. Restock a product");
            System.out.println("4. Mark a product as out of stock");
            System.out.println("5. Remove a product");
            System.out.println("6. View inventory");
            System.out.println("7. Exit");

            System.out.println("Enter number for your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    // Add product
                    inventory = addProduct(inventory, scanner);
                    break;
                case 2:
                    // Check quantity
                    System.out.println("Enter product name to check: ");
                    String checkProduct = scanner.nextLine();
                    int quantity = inventory.getOrDefault(checkProduct, -1);
                    System.out.println("Quantity of " + checkProduct + " is: " + quantity);
                    System.out.println("If the quantity is -1, the product is missing in inventory");
                    break;
                case 3:
                    // Restock product
                    System.out.println("Enter product name to restock: ");
                    String restockProduct = scanner.nextLine();
                    System.out.println("Enter product quantity to add: ");
                    int restockQuantity = scanner.nextInt();
                    if (inventory.containsKey(restockProduct)){
                        inventory.put(restockProduct, inventory.getOrDefault(restockProduct, 0) + restockQuantity);
//                        int currentQuantity = inventory.get(restockProduct);
//                        inventory.put(restockProduct, currentQuantity+restockQuantity);
                        System.out.println("Product is restocked successfully!");
                    }
                    else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;
                case 4:
                    // Mark product as out of stock
                    System.out.println("Enter product name to set out of stock: ");
                    String outOfStockProduct = scanner.nextLine();
                    if (inventory.containsKey(outOfStockProduct)){
                        inventory.put(outOfStockProduct, 0);
                        System.out.println("Product is set to out of stock successfully!");
                    }
                    else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;
                case 5:
                    // Remove product
                    System.out.println("Enter product name to remove: ");
                    String removeProduct = scanner.nextLine();
                    if (inventory.containsKey(removeProduct)){
                        inventory.remove(removeProduct);
                        System.out.println("Product is removed successfully!");
                    }
                    else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;
                case 6:
                    // View Inventory
                    System.out.println("Current Inventory is:");
                    if (inventory.isEmpty()){
                        System.out.println("Inventory is empty.");
                    }
                    else{
                        for (var item : inventory.entrySet()){
                            System.out.println(item.getKey() + ": " + item.getValue());
                        }
                    }
                    break;
                case 7:
                    // Close inventory
                    running = false;
                    System.out.println("Exiting the inventory. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static HashMap<String,Integer> addProduct(HashMap<String,Integer> inventory, Scanner scanner){
        System.out.println("Enter product name: ");
        String addProduct = scanner.nextLine();
        System.out.println("Enter product quantity: ");
        int addQuantity = scanner.nextInt();
        inventory.put(addProduct, inventory.getOrDefault(addProduct, 0) + addQuantity);
        System.out.println("Product is added successfully!");
        return inventory;
    }
}

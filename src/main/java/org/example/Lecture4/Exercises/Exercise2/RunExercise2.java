package org.example.Lecture4.Exercises.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RunExercise2 {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Store Inventory");

        while (running){
            System.out.println("Type the following pattern to select command:");
            System.out.println("add <product name> <product quantity>");
            System.out.println("sell <product name> <product quantity>");
            System.out.println("stock");
            System.out.println("exit");

            System.out.println("Enter the command:");
            String choice = scanner.nextLine();
            HashMap<String, String> inputCommand = splitInput(choice);
            switch (inputCommand.get("Command")){
                case "add":
                    int currentProductQuantity = inventory.getOrDefault(inputCommand.get("ProductName"), -1);
                    if (currentProductQuantity == -1) {
                        inventory.put(inputCommand.get("ProductName"), Integer.parseInt(inputCommand.get("ProductQuantity")));
                    }
                    else{
                        inventory.put(inputCommand.get("ProductName"), currentProductQuantity + Integer.parseInt(inputCommand.get("ProductQuantity")));
                    }
                    break;
                case "sell":
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    }
                    else {
                        int productQuantity = inventory.getOrDefault(inputCommand.get("ProductName"), -1);
                        if (productQuantity == -1) {
                            System.out.println("No product is found in inventory");
                        }
                        else {
                            if (productQuantity < Integer.parseInt(inputCommand.get("ProductQuantity"))) {
                                System.out.println("Not enough quantity to complete the sell");
                            }
                            else {
                                int leftQuantity = productQuantity - Integer.parseInt(inputCommand.get("ProductQuantity"));
                                inventory.put(inputCommand.get("ProductName"), leftQuantity);
                            }
                        }
                    }
                    break;
                case "stock":
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
                case "exit":
                    running = false;
                    System.out.println("Exiting the inventory. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static HashMap<String,String> splitInput(String input){
        HashMap<String, String> inputParsed = new HashMap<>();
        String[] inputSplit = input.split(" ");

        if (inputSplit.length == 1){
            inputParsed.put("Command", inputSplit[0]);
        }
        else {
            String productName = "";

            for (int i = 1; i < inputSplit.length - 1; i++) {
                if (i == 1) {
                    productName = inputSplit[i];
                }
                else {
                    productName = productName + " " + inputSplit[i];
                }
            }

            inputParsed.put("Command", inputSplit[0]);
            inputParsed.put("ProductName", productName);
            inputParsed.put("ProductQuantity", inputSplit[inputSplit.length - 1]);
        }
        return inputParsed;
    }
}

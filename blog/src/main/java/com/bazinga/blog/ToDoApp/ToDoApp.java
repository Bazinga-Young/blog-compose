package com.bazinga.blog.ToDoApp;

public class ToDoApp {
    public static void main(String[] args) {
        printOptions();

        String command = "";
        while (!command.equals("exit")) {
            CommandLineInputHandler commandLineInputHandler = new CommandLineInputHandler();
            command = commandLineInputHandler.readInput();
            String res = commandLineInputHandler.processInput(command);
            System.out.println(res);
        }
    }

    private static void printOptions() {
        System.out.println();
    }
}

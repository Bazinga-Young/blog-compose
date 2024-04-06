package com.bazinga.blog.ToDoApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CommandLineInputHandler {
    private BufferedReader reader;

    public CommandLineInputHandler() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readInput() {
        String input = "";
        try {
            input = this.reader.readLine();
        } catch (IOException e) {
            input = "Exception happen when read input.";
        }
        return input;
    }

    public String mappedInput(String input) {
        return CommandLineInput.valueOf(input).toString();
    }

    public String processInput(String input) {
        if (input.equals("find all")) {
            return InMemoryToDoRepository.findAll().toString();
        }
        return "";
    }
}

package org.example;
import org.example.ConfigLoader;
import org.example.DirectoryLister;
import org.example.DirectoryValidator;
import org.example.FileWriterService;

import java.io.File;
import java.io.IOException;
import java.util.Properties;


public class Main {

    public static void main(String[] args) {
        ConfigLoader configLoader = new ConfigLoader();
        DirectoryValidator validator = new DirectoryValidator();
        DirectoryLister lister = new DirectoryLister();
        FileWriterService writerService = new FileWriterService();

        try {
            Properties props = configLoader.load("config.properties");

            String inputDir = props.getProperty("input.directory");
            String outputFile = props.getProperty("output.file");

            if (inputDir == null || outputFile == null) {
                System.out.println("Missing configuration properties.");
                return;
            }

            if (!validator.isValidDirectory(inputDir)) {
                System.out.println("Invalid directory path.");
                return;
            }

            writerService.writeToFile(outputFile, new File(inputDir), lister);
            System.out.println("Output written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

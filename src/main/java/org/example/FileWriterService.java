package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService {
    public void writeToFile(String outputPath, File root, DirectoryLister lister) throws IOException {
        try (FileWriter writer = new FileWriter(outputPath)) {
            lister.listDirectory(root, 0, writer);
        }
    }
}

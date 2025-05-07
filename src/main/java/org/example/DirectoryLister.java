package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class DirectoryLister {
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void listDirectory(File dir, int level, FileWriter writer) throws IOException {
        File[] files = dir.listFiles();
        if (files == null) return;

        Arrays.sort(files);
        for (File file : files) {
            String type = file.isDirectory() ? "(D)" : "(F)";
            String date = sdf.format(new Date(file.lastModified()));
            String indent = "  ".repeat(level);
            String line = indent + type + " " + file.getName() + " - " + date;
            writer.write(line + System.lineSeparator());

            if (file.isDirectory()) {
                listDirectory(file, level + 1, writer);
            }
        }
    }
}

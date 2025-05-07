package org.example;

import java.io.File;



public class DirectoryValidator {
    public boolean isValidDirectory(String path) {
        File dir = new File(path);
        return dir.exists() && dir.isDirectory();
    }


}

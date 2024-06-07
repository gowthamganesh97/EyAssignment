package com.ey.day7.Q1;
import java.io.File;

public class FileSearchUtility {
    public static void searchFile(String filePath, String fileName) {
        File directory = new File(filePath);

        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().equals(fileName)) {
                        System.out.println("File found: " + file.getAbsolutePath());
                    }
                }
                else if (file.isDirectory()) {
                    searchFile(file.getAbsolutePath(), fileName);
                }
            }
        }
    }

    public static void main(String[] args) {
        String directoryPath = "D:\\"; 
        String fileName = "Readme.txt"; 

        searchFile(directoryPath, fileName);
    }
}

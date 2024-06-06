package com.ey.day7.Q1;
import java.io.File;
public class Content {
    public static void displayFolders(String folderPath) {
        
        File folder = new File(folderPath);
        System.out.println(folder.getPath());
      
        File[] items = folder.listFiles();
        
        if (items != null) {
            
            for (File item : items) {
                
                if (item.isDirectory()) {
                    
                    displayFolders(item.getPath());
                }
            }
        }
    }

    public static void main(String[] args) {
        
        String folderPath = "C:\\Program Files\\Git";       
        displayFolders(folderPath);
    }
}
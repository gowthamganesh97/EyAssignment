package com.ey.day7.Q1;
import java.io.*;

public class SourceDestination {

    public static void main(String[] args) {
        String sourceFile = "C:\\JAVA";
        String destinationFile = "D:\\Softwares";

        try {
            copyFile(sourceFile, destinationFile);
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } catch (IOException e) {
            System.out.println("Error occurred while copying the file: " + e.getMessage());
        }
    }

    private static void copyFile(String sourceFile, String destinationFile) throws IOException {
        File src = new File(sourceFile);
        if (!src.exists()) {
            throw new FileNotFoundException();
        }

        File dest = new File(destinationFile);
        if (dest.exists()) {
            System.out.print("Destination file already exists. Do you want to overwrite? (Yes/No): ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choice = reader.readLine().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("File not copied.");
                return;
            }
        }

        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");
        }
    }
}
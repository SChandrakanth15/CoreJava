import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LogProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the folder path
        System.out.print("Enter the path to the folder containing log files: ");
        String folderPath = scanner.nextLine().trim();
        
        scanner.close();

        // Check if the provided path exists and is a directory
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("Error: Invalid folder path or folder does not exist.");
            return;
        }
        
        // Show processing message
        System.out.println("Processing...");

        // Create and start a new thread for processing
        Thread processingThread = new Thread(new ProcessingTask(folder));
        processingThread.start();

        // Main thread can continue with other tasks
        // For demonstration, let's just print dots while processing
        while (processingThread.isAlive()) {
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
                System.out.print("."); // Print dots to indicate processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("\nProcessing completed.");
    }

    static class ProcessingTask implements Runnable {
        private File folder;

        public ProcessingTask(File folder) {
            this.folder = folder;
        }

        @Override
        public void run() {
            // Add your processing logic here
            // For demonstration, let's read contents of all files in the folder
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                        readLogFile(file);
                    }
                }
            } else {
                System.out.println("Folder is empty.");
            }
            
            // Simulate some processing time
            try {
                Thread.sleep(2000); // Simulating 2 seconds of processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void readLogFile(File file) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Process each line here (you can add your logic)
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

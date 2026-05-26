package com.day5proj2.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {
    public static void logError(String message) {
        String fileName = "error.log";
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("[" + LocalDateTime.now() + "]:  " + message  + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error while writing log to file: " + fileName);
        }
    }
}

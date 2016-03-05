package com.epam.spring.core.beans;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dzmitry_Hryhoryeu on 3/2/2016.
 */
public class FileEventLogger implements EventLogger {

    private String fileName;
    private File file;

    public FileEventLogger() {
    }

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    private void init() throws IOException {
        this.file = new File(fileName);
        file.createNewFile();
        if (!this.file.canWrite()) {
            throw new IOException();
        }
    }

    public void logEvent(Event event) {
       // FileUtils.writeStringToFile();

    }
}

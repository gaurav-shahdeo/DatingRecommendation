package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileInput implements InputService {
    private String filePath;

    public FileInput(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String> readInput() {
        Path path = Paths.get(filePath);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }

    }
}

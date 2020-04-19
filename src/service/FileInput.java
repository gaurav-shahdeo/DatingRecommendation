package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput implements InputService {
    private String filePath;

    public FileInput(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String> readInput() {

        List<String> inputs = new ArrayList<>();
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String input;
            while ((input = br.readLine()) != null) {
                inputs.add(input);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return inputs;
    }
}

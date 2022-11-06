package org.example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

        try {

            JsonNode root = mapper.readTree(new File("example.json"));

            JsonNode tree = root.path("properties");
                for (JsonNode node : root) {
                    System.out.println("node : " + node);
                }
            for (JsonNode node : tree) {
                System.out.println("tree : " + node);
            }


        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
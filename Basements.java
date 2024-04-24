import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Basements{

    public static void main(String[] args) {
        String instructions = readInstructionsFromFile("puzzleKey.txt");

        int finalFloor = calculateFinalFloor(instructions);
        int basementPosition = findBasementPosition(instructions);

        System.out.println("Final Floor: " + finalFloor);
        System.out.println("Basement Position: " + basementPosition);
    }

    private static String readInstructionsFromFile(String filename) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

    private static int calculateFinalFloor(String instructions) {
        int floor = 0;

        for (char instruction : instructions.toCharArray()) {
            if (instruction == '(') {
                floor++;
            } else if (instruction == ')') {
                floor--;
            }
        }

        return floor;
    }

    private static int findBasementPosition(String instructions) {
        int floor = 0;

        for (int i = 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);

            if (instruction == '(') {
                floor++;
            } else if (instruction == ')') {
                floor--;
            }

            if (floor == -1) {
                return i + 1; // Position starts from 1
            }
        }

        return -1;
    }
}

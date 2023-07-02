package ui;

import java.io.FileWriter;
import java.io.IOException;

public class ScoreWriter {

    public static void write_score_to_file(int score) {
        try {
            FileWriter writer = new FileWriter("score.txt");
            writer.write("You scored " + score + "%");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

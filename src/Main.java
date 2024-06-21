import java.util.ArrayList;
import java.util.List;
public class Main {
    private static int counter = 0;
    private static List<Character> stage = new ArrayList<>();
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'B', 'C', 'D'); //list of all characters (as in characters - letters and characters - people)
        sceneSwap(characters, 0); //starting with 0 because we want to start from the empty stage
    }
        private static void sceneSwap(List<Character> characters, int index) {
            System.out.println(stage + " " + counter++); //I am starting with counter = 0 because I don't really count empty stage as a stage number 1

            for (int i = index; i < characters.size(); i++) {
                stage.add(characters.get(i)); //add character to the stage
                sceneSwap(characters, i + 1); //recursive call! - it prints the stage after adding a character to the second place
                stage.remove(stage.size() - 1); //remove character from the stage
            }
        }
    }
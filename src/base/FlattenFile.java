package base;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FlattenFile {

    /**
     * match on first and second column
     * also match on sixth column if third column is the same within first/second column groups
     * concatenate values within fourth with fourth and fifth with fifth column vlaues.
     */
    public static Random r = new Random();

    public static void main(String[] args) throws IOException {
        List<String> firstCol = List.of("a", "b", "c");
        List<String> secondCol = List.of("a", "b", "c");
        List<String> thirdCol = List.of("1", "2", "3", "4");
        List<String> fourthCol = List.of("a", "b", "c");
        List<String> fifthCol = List.of("a", "b", "c");
        List<String> sixthCol = List.of("1", "2", "3", "4");

        int numberOfRow = Math.abs((Math.abs(r.nextInt()) % 10) + 10);
        FileWriter f = new FileWriter("test.csv");

        for (int i = 0; i < numberOfRow; i++) {
            String sb = firstCol.get(Math.abs(r.nextInt()) % firstCol.size()) + "," + secondCol.get(Math.abs(r.nextInt()) % secondCol.size()) + "," + thirdCol.get(Math.abs(r.nextInt()) % thirdCol.size()) + "," + fourthCol.get(Math.abs(r.nextInt()) % fourthCol.size()) + "," + fifthCol.get(Math.abs(r.nextInt()) % fifthCol.size()) + "," + sixthCol.get(Math.abs(r.nextInt()) % sixthCol.size()) + "\r\n";

            f.write(sb);
            System.out.print(sb);

        }
        f.close();

        // beginning of solution



    }


}
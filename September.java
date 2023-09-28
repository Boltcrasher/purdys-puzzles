import java.io.*;
import java.util.*;

public class September {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("September.dat"));
        StringBuilder binary = new StringBuilder();
        while(in.hasNextLine()) {
            String line = in.nextLine() + "\n";
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                String b = Integer.toBinaryString(c);
                binary.append(b);
            }
        }
        int ones = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                ones++;
            }
        }
        System.out.println(ones);
        // -2 because no new line character at the end
    }
}
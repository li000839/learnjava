import java.util.Scanner;
import java.util.Arrays;
import java.io.FileReader;
import java.io.IOException;

public class distinguishCodeStyle {
    public static void main(String[] args) {
        final int ROW = 100;
        final int COL = 200;
        final String[] C = {"#include", "#define", "->", ".h"};
        final String[] JAVA = {"public", "import", "new", "String"};
        final String[] PYTHON = {"dict", "tuple", "#", "import"};

        System.out.print("Input filename: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        // read file
        int cCount = 0;
        int javaCount = 0;
        int pythonCount = 0;

        try (Scanner scannerFile = new Scanner(new FileReader(fileName))) {
            while (scannerFile.hasNext()) {
                String text = scannerFile.nextLine();

                // count keyword
                for(int iC = 0; iC < C.length; iC++) {
                    if(text.contains(C[iC])) {
                        cCount++;
                    }
                }
                for(int iJava = 0; iJava < JAVA.length; iJava++) {
                    if(text.contains(JAVA[iJava])) {
                        javaCount++;
                    }
                }
                for(int iPython = 0; iPython < PYTHON.length; iPython++) {
                    if(text.contains(PYTHON[iPython])) {
                        pythonCount++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // output language style
        int[] keyWord = new int[] {cCount, javaCount, pythonCount};
        Arrays.sort(keyWord);
        if (keyWord[1] == keyWord[2]) {
            System.out.format("Can't decide what language" + fileName + "was written in...");
        } else if (keyWord[2] == cCount) {
            System.out.format(fileName + " was written in C");
        } else if (keyWord[2] == javaCount) {
            System.out.format(fileName + " was written in Java");
        } else if (keyWord[2] == pythonCount) {
            System.out.format(fileName + " was written in python");
        }
    }
}

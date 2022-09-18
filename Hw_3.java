import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Hw_3 {

    private static void personalInfoRecorder() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your personal information (full name, birth date in format dd.mm.yyyy, phone number, " +
                "sex): ");
        String inputInfo = scanner.nextLine();
        String[] subStr = inputInfo.split(" ");
        if (checkData(subStr)) {
            File file = new File("C:\\Users\\roman.LAPTOP-UOUKIJR8\\IdeaProjects\\GB\\ExceptionsHws",
                    "PersonalInfo.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(inputInfo);
            writer.flush();
            writer.close();
        }
    }

    private static boolean checkData (String[] info) {
        boolean quantity = false;
        boolean emptyParameter = true;
        boolean sexParameter = false;
        boolean birthdateParameter = false;
        boolean phoneParameter = false;
        boolean res = false;
        if (info.length == 6) {
            quantity = true;
        }
        for (int i = 0; i < info.length; i++) {
            if (info[i].isEmpty()) {
                emptyParameter = false;
            }
            if (Objects.equals(info[i], "m") || Objects.equals(info[i], "f")) {
                sexParameter = true;
            }
            if (info[i].length() == 10) {
                char[] chars = info[i].toCharArray();
                if (chars[2] == '.' || chars[5] == '.') {
                    birthdateParameter = true;
                }
            }
            try {
//                int number = Integer.parseInt(info[i]);
                long number = Long.parseLong(info[i]);
                phoneParameter = true;
            } catch (NumberFormatException e) {
                if (!phoneParameter && i == info.length - 1) {
                    System.out.println("Phone number not detected.");
                }
            }
        }


        if (!quantity) {
            throw new RuntimeException("Parameters quantity not correct");
        }
        if (!sexParameter) {
            throw new IllegalArgumentException("Sex parameter not detected");
        }
        if (!birthdateParameter) {
            throw new IllegalArgumentException("Birthdate parameter not detected");
        }
        if (!emptyParameter) {
            throw new RuntimeException("Empty parameter");
        }

        if (quantity && sexParameter && birthdateParameter && phoneParameter && emptyParameter) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        personalInfoRecorder();

    }
}

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
            File file = new File("C:\\Users\\r.LAPTOP\\IdeaProjects\\GB\\ExceptionsHws",
                    "PersonalInfo.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(inputInfo);
            writer.flush();
            writer.close();
        }
    }

    private static boolean checkData (String[] info) {
        boolean quantity = false;
        boolean emptyParametr = true;
        boolean sexParametr = false;
        boolean birthdateParametr = false;
        boolean phoneParametr = false;
        boolean res = false;
        if (info.length == 6) {
            quantity = true;
        }
        for (int i = 0; i < info.length; i++) {
            if (info[i].isEmpty()) {
                emptyParametr = false;
            }
            if (Objects.equals(info[i], "m") || Objects.equals(info[i], "f")) {
                sexParametr = true;
            }
            if (info[i].length() == 10) {
                char[] chars = info[i].toCharArray();
                if (chars[2] == '.' || chars[5] == '.') {
                    birthdateParametr = true;
                }
            }
            try {
                int number = Integer.parseInt(info[i]);
                phoneParametr = true;
            } catch (NumberFormatException e) {
                if (!phoneParametr && i == info.length - 1) {
                    System.out.println("Phone number not detected.");
                }
            }
        }


        if (!quantity) {
            throw new RuntimeException("Parametrs quantity not correct");
        }
        if (!sexParametr) {
            throw new IllegalArgumentException("Sex parametr not detected");
        }
        if (!birthdateParametr) {
            throw new IllegalArgumentException("Birthdate parametr not detected");
        }
        if (!emptyParametr) {
            throw new RuntimeException("Empty parametr");
        }

        if (quantity && sexParametr && birthdateParametr && phoneParametr && emptyParametr) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        personalInfoRecorder();

    }
}

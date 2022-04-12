import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        Scanner scr = new Scanner (System.in);
        String scr_str = scr.nextLine();
        FileWriter w = null;
        if (scr_str.length() <= 128) {
            try {
                w = new FileWriter("C://Soft//Test//Test.txt", false);
                w.write(scr_str);
            } catch (IOException ioe) {
                System.out.println(ioe);
            } finally {
                if (w != null)
                    w.close();
            }

            String scr_str_2 = scr_str.replaceAll("\\p{P}", " ");
            String scr_str_3 = scr_str_2.toLowerCase();

            String[] substrings = scr_str.split(" ");
            int maxLength = 0;
            for(String s : substrings) {
                if(s.length() > 6)  list.add(s);
            }

            try {
                w = new FileWriter("C://Soft//Test//Test2.txt", false);
                w.write(scr_str_3 + list);
            } catch (IOException ioe) {
                System.out.println(ioe);
            } finally {
                if (w != null)
                    w.close();
            }
        }
        else System.out.println("Размер данных больше 128 символов");
    }

}

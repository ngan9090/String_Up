import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai3 {
    //Bài 3: Viết chương trình chuẩn hóa một xâu ký tự nhập từ bàn phím
    public static void main(String[] args) {
        input();
    }

    //Input value
    private static void input() {
        System.out.print("Enter your String: ");
        String string = "";
        string = new Scanner(System.in).nextLine();
        System.out.println("Result: ");
        transfer(string);
    }

    //Change value follow as requirement
    private static void transfer(String str) {
        str = str.toLowerCase();
        StringTokenizer stringToken = new StringTokenizer(str);
        String str1 = "";
        while (stringToken.hasMoreTokens()) {
            String str2 = stringToken.nextToken();
            str1 += str2.toUpperCase().charAt(0) + str2.substring(1) + " ";
        }
        System.out.println(str1.trim());
    }
}

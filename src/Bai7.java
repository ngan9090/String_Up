import java.util.Scanner;

public class Bai7 {
    //Bài 7: chương trình xóa hết str2 trong str1
    public static void main(String[] args) {
        input();
    }

    //Input value
    private static void input() {
        System.out.print("Enter your String 1: ");
        String string = new Scanner(System.in).nextLine();
        System.out.print("Enter your String 2: ");
        String string2 = new Scanner(System.in).nextLine();
        System.out.println("Delete all string 2 if string 2 have in string1. Result: ");
        del(string, string2);
    }

    //Find str2 and delete all from str1
    private static void del(String str1, String str2) {
        int index = 0;
        while (index >= 0) {
            index = str1.indexOf(str2);
            str1 = str1.replaceAll(str2, "");
        }
        System.out.println(str1);
    }
}

import java.util.Scanner;

public class Bai1 {
    //Bài tập: Liệt kê những số nghịch đảo có 6 chữ số
    public static void main(String[] args) {
        input();
    }

    //Input function
    private static void input() {
        System.out.println("Những số thuận nghịch có 6 chữ số: ");
        for (int i = 100000; i <= 999999; i++){
            check(i);
        }
    }

    //Check number value
    private static void check(int a) {
        String string = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder conver = stringBuilder.reverse();
        int countRight = 0;
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i) == conver.charAt(i)) {
                countRight++;
            }
        }
        if (countRight == string.length()/2) {
            System.out.println(a);
        }
    }


}

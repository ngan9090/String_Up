import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {
    //Bài 5: Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc: họ...đệm...tên; chuyển xâu đó sang biểu
    //diễn theo cấu trúc tên...họ...đệm.
    public static void main(String[] args) {
        input();
    }

    //Input value
    private static void input() {
        System.out.print("Enter your String: ");
        String string = new Scanner(System.in).nextLine();
        System.out.println("Result: ");
        change(string);
    }

    //change value
    private static void change(String str) {
        StringTokenizer stringToken = new StringTokenizer(str,".;");
        String[] arr = new String[stringToken.countTokens()];
        int k = 0;
        while (stringToken.hasMoreTokens()) {
            arr[k] = stringToken.nextToken();
            k++;
        }
        System.out.println(arr[2] + "..." + arr[0] + "..." + arr[1]+".");
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {
    //Bài 4: tìm từ dài nhất và vị trí của nó
    public static void main(String[] args) {
        input();
    }

    //Input value
    private static void input() {
        System.out.print("Enter your String: ");
        String string = "";
        string = new Scanner(System.in).nextLine();
        System.out.println("Result: ");
        System.out.println(find(string));
    }

    //Find longest content at index
    private static String find(String str) {
        StringTokenizer stringToken = new StringTokenizer(str);
        int[] arr = new int[stringToken.countTokens()];
        String[] content = new String[stringToken.countTokens()];
        int k = 0;
        while (stringToken.hasMoreTokens()) {
            String str1 = stringToken.nextToken();
            content[k] = str1;
            arr[k] = str1.length();
            k++;
        }

        int max = arr[0];
        int index = 0;
        int position =0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        if((index - 1) == -1){
            position = 0;
        }else{
            position = index -1;
        }
        String result = content[position] + " is longest word at position " + index + " .";
        return result;
    }

}

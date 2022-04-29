import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai6 {
    public static void main(String[] args) {
        input();
    }

    //Input value
    private static void input() {
        //Viết chương sắp xếp lại chuỗi dài không quá 20 từ và mỗi từ không quá 10 chữ cái
        System.out.print("Enter your String: ");
        int countLength = 0;
        do {
            int countTime = 0;
            String string = new Scanner(System.in).nextLine();
            StringTokenizer stringToken = new StringTokenizer(string, " ");
            countLength = stringToken.countTokens();
            String[] arr = new String[countLength];

            int k = 0;
            while (stringToken.hasMoreTokens()) {
                arr[k] = stringToken.nextToken();
                k++;
            }
            if (countLength > 20) {
                System.out.print("Please enter string lower 21 words: ");
            } else if (countLength <= 20) {
                for (int i = 0; i < countLength; i++) {
                    if (arr[i].length() > 10) {
                        System.out.print("Each word lower than 11 character: ");
                        countTime++;
                    }
                }
            }
            if (countLength <= 20 && countTime == 0) {
                change(string);
                break;
            }
        } while (true);

    }

    private static void change(String str) {
        StringTokenizer stringToken = new StringTokenizer(str, " ");
        String[] arr = new String[stringToken.countTokens()];
        int k = 0;
        while (stringToken.hasMoreTokens()) {
            arr[k] = stringToken.nextToken();
            k++;
        }

        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Chuỗi sau khi sắp xếp là: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

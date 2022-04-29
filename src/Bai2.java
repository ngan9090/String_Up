import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Locale;
import java.util.Scanner;

public class Bai2 {
    //Bài 2: Chuyển sang dạng hoa thường xen kẻ từ chuỗi bất kỳ nhập vào.
    public static void main(String[] args) {
        input();
    }

    //Input value
    private static void input(){
        System.out.print("Enter your String: ");
        String string ="";
        do {
            string = new Scanner(System.in).nextLine();
            if(string.matches("[a-zA-z]+")==true ){
                transfer(string);
            }else {
                System.out.println("Please enter string dont have number, special char, distance, accent: ");
            }

        }while(string.matches("[a-zA-z]+")==false);
    }

    //Change value flowing requirement
    private static void transfer(String str){
        String str1 = str.toUpperCase();
        StringBuilder str2 = new StringBuilder("");
        for(int i =0; i< str1.length(); i++){
            if(i == 0|| i%2==0 ) {
                str2.append(str1.charAt(i));
            }else{
                str2.append(str1.toLowerCase().charAt(i));
            }
        }
        System.out.println(str2);
    }
}

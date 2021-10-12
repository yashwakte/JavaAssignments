package Test;
import java.util.Scanner;
public class digitcount{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        int i = 0;
        while(num!=0){
            num = num/10;
            i++;
            if(num == 1){
                i++;
                break;
            }
        }
        System.out.println("Number of Digits is : "+ i);
    }
}
import java.util.Scanner;

/**
 * Bcln
 */
public class Bcln {
    public static int kiemtra(int a , int b){
        if(a*b<=0){
            System.out.print("erorr!");
        }
        int c = a*b;
        int uocchung=0;
        for(int i= Math.max(a, b); i <= c;i++ ){
            if(i%a==0&& i%b==0){
                uocchung=i;
                break;
            }
        }
        return uocchung;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("boi chung lon nhat la:"+kiemtra(a, b));

    }
}
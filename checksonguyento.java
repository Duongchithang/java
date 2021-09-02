import java.util.Scanner;

/**
 * checksonguyento
 */
public class checksonguyento {
      public static boolean kiemtra(int n ){
          for(int i=2 ; i <= Math.sqrt(n);i++){
              if(n%i==0){
                  return false;
              }
          }
          return true;
      } 
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(kiemtra(n)==true){
            System.out.print("la so nguyen to");
        }
        else{
            System.out.print("khong phai la so nguyen to");
        }
        
    }
}
import java.util.Scanner;

/**
 * ppchiadoi
 */
public class ppchiadoi {
    public static float ham(float x){
        //nhap ham tuy y
      return (x*x*x+4*x*x-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("nhap khoang nghiem:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.print("nhap sai so :");
        float saiso= input.nextFloat();
       
        while(Math.abs(a-b)>=saiso){
            float x0 = (a+b)/2;
            if(ham(a)*ham(x0)<0){
                b=x0;
            }
            else{
                if(ham(x0)*ham(b)<0)
                    a=x0;
            }
            System.out.println("x="+(double)Math.round(x0*1000)/1000);
        }
    }
}

 
        

    

    

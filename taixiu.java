import java.util.Random;
import java.util.Scanner;

/**
 * taixiu
 */
public class taixiu {
    public static void showmenu(){
        System.out.println("1. Dat cuoc !");
        System.out.println("2. Thoat");
    }
    public static void main(String[] args) {
        double nguoichoi= 5000;
        Scanner sc = new Scanner(System.in);
        showmenu();
        int choose = sc.nextInt();
        while(choose>=1&&choose<=2){
            switch (choose) {
                case 1: 
                double datcuoc=0;
                System.out.println("----Bat dau choi---");
                System.out.println("----tai khoan cua ban co "+nguoichoi+"de dat cuoc ");
                System.out.println("nhap so tien dac cuoc :");
                datcuoc= sc.nextDouble();
                int luachon=0;
                System.out.println("1.tai");
                System.out.println("2.xiu");
                luachon=sc.nextInt();

               Random xucxac1 = new Random();
               Random xucxac2 = new Random();
               Random xucxac3 = new Random();
               int giatri1=xucxac1.nextInt(5)+1;
               int giatri2 = xucxac2.nextInt(5)+1;
               int giatri3= xucxac3.nextInt(5)+1;
               int tong= giatri1+giatri2+giatri3;
               System.out.println("ket qua :"+giatri1+"-"+giatri2+"-"+giatri3);
               if(tong==3|| tong==18){
                   System.out.println("tong la "+tong+"bao, cai an het!");
                   nguoichoi=nguoichoi-datcuoc;
                   System.out.println("so tien con lai la:"+nguoichoi);
               }
               else if(tong>=4&& tong<=10){
                   System.out.println("tong la :"+tong+"\nXiu xiu toan xiu");
                   if(luachon==2){
                       System.out.print("ban da thang!");
                       nguoichoi=nguoichoi+datcuoc;
                       System.out.println("so tien con lai :"+nguoichoi);
                   }
                   else{
                    System.out.println("ban da thua!");
                   nguoichoi=nguoichoi-datcuoc;
                   System.out.println("so tien con lai la :"+nguoichoi);
               }
              
            }
            else{
                System.out.println("tong la "+tong+"\nTai tai toan tai");
                if(luachon==1){
                    System.out.print("ban da thang");
                    nguoichoi=nguoichoi+datcuoc;
                    System.out.println("so tien con lai la"+nguoichoi);
                }
                else{
                    System.out.println("ban da thua");
                    nguoichoi=nguoichoi-datcuoc;
                    System.out.println("so tien con lai la "+nguoichoi);
                }
                
            }
        
               


                    
                    break;
                case 2:
                System.out.print("thoat chuong trinh");
                break;
                default:
                    break;
            }
            break;
        }
        
    }
}
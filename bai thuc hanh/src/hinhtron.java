import java.util.Scanner;

public class hinhtron {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("x=");
        double x=sc.nextInt();
        System.out.println("y=");
        double y=sc.nextInt();
        sc.close();
        double n =((x-10)*(x-10)+(y-20)*(y-20));
        if(n>100){
                System.out.println("ngoai duong tron");
        }

        if(n<100){
                System.out.println("trong duong tron");
        }

        if(n==100){
                System.out.println("tren duong tron");
        }

   
}

}
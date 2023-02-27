import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=2023-sc.nextInt();
        sc.close();
 
switch (n){
        case(0):
        case(1):
        case(2):
        case(3):
        case(4):
        case(5):
        System.out.print("Mau giao");
        case(6):
        case(7):
        case(8):
        case(9):
        case(10):
        System.out.print("tieu hoc");
        break;
        case(11):
        case(12):
        case(13):
        case(14):
        case(15):
        System.out.print("trung hoc");
        break;
        case(16):
        case(17):
        case(18):
        System.out.print("trung hoc pt");
        break;
        default:
        System.out.println("dai hoc");
        break;
        
}

}
}
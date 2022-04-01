import java.util.Scanner;

public class RCBandPlayoffsCodechef {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int i;
        int totalpoint;

        Scanner reader= new Scanner(System.in);
        System.out.println("Number of Points RCB earned");
        x= reader.nextInt();

        System.out.println("To qualify for the playoffs they");
        y= reader.nextInt();

        System.out.println("Games left");
        z= reader.nextInt();
        int draw=(x+z*1);


        totalpoint=(x+z*2);
        if (x>y){
            System.out.println("qualify");
        }else if (totalpoint>=y){
            System.out.println("yes qualify");
        }else if (draw>=y){
            System.out.println("b Qualify");
        }else {
            System.out.println("not qualify");
        }





    }
}

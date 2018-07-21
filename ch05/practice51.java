import java.util.Scanner;

public class practice51 {
    public static Scanner in = new Scanner(System.in);

    public static void checkFermat( double a, double b, double c, double n) {
        if (n > 2) {
            if( Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)){

                System.out.println("Hole smokes, Feramt was wrong!");
            } else {
                System.out.println("No that doesnt work");
            }
        }
    }
    public static void main(String[] args) {
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      double n = in.nextDouble();
      checkFermat(a,b,c,n);
    }
  //  public static void equation(){



    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }

    }
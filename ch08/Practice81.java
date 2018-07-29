import java.util.Arrays;

public class Practice81 {

    public static double[] powArray( double[] a, int raisedTo){
        double[] updated = new double[a.length];
        for( int i = 0; i < a.length; i++ ){
            updated[i] = Math.pow(a[i], raisedTo);
        }return updated;
    }
    public static void main(String[] args){
        double[] array = {2,3,5};
        System.out.println(Arrays.toString(powArray(array,3)));
    }
}

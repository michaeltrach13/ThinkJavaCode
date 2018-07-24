public class power {
    public static double power(double x, int n){
        if(n ==0)
            return 1;
        else {
        return power(x, n - 1) * x;
    }
}
    public static void main(String[] args){
        System.out.println(power(5,4));
    }
}

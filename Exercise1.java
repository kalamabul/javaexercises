import java.util.Arrays;
public class Exercise1
{
    public static double powArray(double[]a){
    for (int i = 0; i < a.length; i++) {
     a[i] = Math.pow(a[i], 2.0);
     System.out.println(a[i]);
     }
    return 1;
    }
    public static void main(String[]args){
        double a[] = {3,4,5,6};
        powArray(a);
    }
}

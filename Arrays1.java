import java.util. Arrays;
public class Arrays1{
    public static void main(String[]args){
        double[]tempForecast = {26.0,24.5,22.3};
        double[]tempForecastcopy =new double[3];
        for(int i=0; i<2; i++){
            tempForecast[i] = tempForecast [i];
            System.out.print(tempForecastcopy[i]+ " ");
        }
     }
}

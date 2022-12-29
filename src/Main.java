;import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[110];
        array(arr);

        }
    static void array(int[]arr){
        for (int i = 10; i < arr.length; i+=10) {
           arr[i] = i;
           if(arr[i]% 3==0) {
             arr[i] =3333333;
           }  arr[arr.length/2] = -1;
               System.out.println(arr[i]+",");
           }
        }
    }
















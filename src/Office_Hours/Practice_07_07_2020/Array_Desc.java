package Office_Hours.Practice_07_07_2020;

import java.util.Arrays;

public class Array_Desc {
    public static void main(String[] args) {

        int [] arr = {98, 97 , 100 , 200, 55, 68,79};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] descArr = new int[arr.length];
        int j=0;
        for (int i=arr.length-1 ; i>=0 ; i--){
            descArr [j] = arr [i];
            j++;
        }

        System.out.println(Arrays.toString(descArr));

    }
}

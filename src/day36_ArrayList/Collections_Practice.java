package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {
    /*
     {30,20, 40, 50, 15};
     output: 50 40 30 20 15
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        list.add(30);

        Collections.sort(list);

        System.out.println(list);

        ArrayList<Integer> descendingList = new ArrayList<>();

        for (int i=list.size()-1 ; i >=0; i --){

        }


    }

}

package day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i =0; i <= 5; i++){ // i: 1,2,3,4,5

            if (i == 3){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("==========");
        for (char ch = 'A'; ch<= 'F'; ch++){

            if (ch == 'C' || ch == 'F'){
                continue;
            }
            System.out.print(ch);
        }



    }
}

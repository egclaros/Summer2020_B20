package day09;

public class Alcohol {
    public static void main(String[] args) {
        boolean hasID =true;
        int age = 26;
        boolean eligible = hasID && age >= 21;
        //                  true && false ==>false
        String result = "";

        if (eligible == true){
           // System.out.println(" Eligible to buy Alcohol");
            result = "Eligible to buy alcohol";
        }
        if (eligible == false){
          //  System.out.println("Go buy your milk");
            result = "You are not old enough to buy alcohol";
        }
        System.out.println(result);
    }
}

package day12_Switch_Scaner;

public class Switch_DaysToMonth {
    public static void main(String[] args) {
        int monhts = 7;

        switch (monhts){
            case 2 :
                System.out.println("28 Days");
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println("30 Days");
                break;
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println("31 Days");
                break;
            default:
                System.out.println("Invalid");
        }

    }


}

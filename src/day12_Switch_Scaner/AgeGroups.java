package day12_Switch_Scaner;
/*
2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

                  age cannot be negative or greater than 150

                  NOTE: MUST APPLY NESTED IF
 */
public class AgeGroups {
    public static void main(String[] args) {
        int age =55;
        String ageGroup = "";
        if (age>0 && age<=150){
            // Solution 1
//            if(age<21){
//                ageGroup="Teenager";
//            }else if (age >=21 && age<55){
//                ageGroup="Adult";
//            }else{
//                ageGroup ="Senior";
//            }
             ageGroup = (age<21)?"Teenager":(age >=21 && age<55)?"Adult":"Senior";
        }else {
            ageGroup = "Invalid";
        }

        System.out.println(ageGroup);
    }
}

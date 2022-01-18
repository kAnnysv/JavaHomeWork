package hw2;

public class CheckYear {
    public static void main(String[] args){
        System.out.println(checkYear(2024));


    }
    public static boolean checkYear(int year){
        return((((year % 4) == 0) && ((year % 100) > 0)) || ((year % 400) == 0));
    }
}

package hw2;

public class BasicStructures {

    public static void main(String[] args){

        System.out.println(checkSum(22,11,10,20));
        numberSign(-23);
        System.out.println(numberSign1(8));
        numberOfLines("********",5);
        System.out.println(checkYear(2000));






    }
    public static boolean checkSum(int a,int b,int bottomLine, int upperLine){
        return((a + b) >= bottomLine && (a + b) <= upperLine);
    }
    public static void numberSign(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        }System.out.println("Число отрицательное");
    }
    public static boolean numberSign1(int a){
        return(a <= 0);

    }
    public static void numberOfLines(String b, int a){
        for(int i = 0; i < a; i++){
            System.out.println(b);
        }

    }
    public static boolean checkYear(int year){
        if ((year % 4) == 0){
            if ((year % 100) == 0){
                if((year % 400) == 0){
                    return true;

                }else{
                    return false;
                }

            }else{
                return true;
            }


        }else{
            return false;
        }


    }

}

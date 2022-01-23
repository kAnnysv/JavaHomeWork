package hw31;

import java.util.Arrays;

public class LessonArray {
    public static void main(String[] args) {
        int numbers [] = {1, 0, 1, 0, 1, 1, 0, 0};
        int multiplyArray [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,1};
        int minMax []= {25, 21, 567, 2456, 1 };
        changeArray(numbers);
        System.out.println("****************");
        oneHundredArray();
        System.out.println("****************");
        multiplyByTwo(multiplyArray);
        System.out.println("****************");
        squareArray(5,5);
        System.out.println("****************");
        System.out.println(Arrays.toString(oneArray(10,5)));
        System.out.println("****************");
        minMaxNumberArr(minMax);




    }

    public static void changeArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                array[i] = 1;

            }else{
                array[i] = 0;

            }
            System.out.print(array[i] +" ");


        }
        System.out.println();
    }
    public static void oneHundredArray(){
        int[] myArray =new int[100];
        for(int i =0; i < myArray.length; i++){
            myArray[i] = (i +1);
            System.out.print(myArray[i] +" ");
        }
        System.out.println();
    }
    public static void multiplyByTwo(int[] array){
         for(int i = 0; i < array.length; i++ ){
             if(array[i] < 6){
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");

        }
        System.out.println();
   }

    public static void squareArray(int height, int width){
        int[][] arr = new int[height][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if((i == j) || (i + j) == (arr[i].length - 1)){
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();

        }


    }
    public static int[] oneArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;

        }
        System.out.println();
        return arr;


    }

    public static void minMaxNumberArr(int[] arr) {


        int max = arr[1];
        int min = 0;
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] > max) {
                max = arr[i];

            } else {
                min = arr[i];
            }

        }
        System.out.println("Max = " + max + " Min = " + min);

    }







}

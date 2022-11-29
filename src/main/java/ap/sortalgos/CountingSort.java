package ap.sortalgos;

public class CountingSort {
    public static void CountingSortImpl (){
        int [] myArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        CountingSrt(myArray, 1, 10);

        System.out.println("Counting Sort in Action:");
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static void CountingSrt(int [] input, int min, int max){
        int [] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++){
            while (countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }


}

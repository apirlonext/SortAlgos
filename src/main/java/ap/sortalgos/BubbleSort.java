package ap.sortalgos;

public class BubbleSort {

    public static void BubbleSortImpl(){
        int[] myArray = {10, -10, 20, -20, 30, -30, 40, -40};

        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if (myArray[i] > myArray[i+1]){
                    swap(myArray, i, i+1);
                }
            }
        }
        System.out.println("Bubble Sort In Action:");
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static void swap(int [] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}



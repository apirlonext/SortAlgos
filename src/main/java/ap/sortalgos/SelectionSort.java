package ap.sortalgos;

public class SelectionSort {
    public static void SelectionSortImpl(){
        int[] myArrayToSort = {99,-12,-5,25,45,15};

        for(int lastUnsortedIndex = myArrayToSort.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++){
                if(myArrayToSort[i] > myArrayToSort[largest]){
                    largest = i;
                }
            }
        swap(myArrayToSort, largest, lastUnsortedIndex);
        }
        System.out.println("Selection Sort In Action:");
        for (int i = 0; i < myArrayToSort.length ; i++){
            System.out.println(myArrayToSort[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

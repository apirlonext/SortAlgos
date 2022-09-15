package ap.sortalgos;

public class InsertionSort {
    public static void InsertionSortImpl(){
        int [] myArrayToSort = {-9,55,45,10,14,6,2};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < myArrayToSort.length; firstUnsortedIndex++){
            int newElement = myArrayToSort[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && myArrayToSort[i-1] > newElement; i--){
                myArrayToSort[i] = myArrayToSort[i-1];
            }
            myArrayToSort[i] = newElement;
        }
        System.out.println("Insertion Sort In Action:");
        for (int i=0; i < myArrayToSort.length; i++)
            System.out.println(myArrayToSort[i]);
    }
}

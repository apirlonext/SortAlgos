package ap.sortalgos;

public class QuickSort {
    public static void QuickSortImpl (){
        int [] myArray = {20, 35, -15, 7, 55, 1, -22};

        quicksort(myArray, 0, myArray.length);

        System.out.println("Quick Sort In Action:");
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static void quicksort(int [] input, int start, int end){
        if(end-start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quicksort(input, start, pivotIndex);
        quicksort(input, pivotIndex + 1, end );
    }

    public static int partition(int [] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j){
            // Empty loop body
            while(i < j && input[--j] >= pivot);

            if (i < j){
                input[i] = input[j];
            }

            // Empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }

}

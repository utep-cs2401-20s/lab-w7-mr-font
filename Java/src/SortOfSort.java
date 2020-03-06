public class SortOfSort {




    //NOTE: The SortOfSortTester tests for this method were run with sortOfSort
    // being given a temporary return type of int[] to simplify testing.
    //To run SortOfSortTester change the void return type to int[] and uncomment the return statement on line 49
    public  static void sortOfSort(int[] unsortedArray) {

        int sortedOffsetRight = unsortedArray.length;
        int sortedOffsetLeft = -1;

        int temp = 0;


        while(sortedOffsetLeft +1 < sortedOffsetRight){

            for(int i = sortedOffsetRight-1; i >= sortedOffsetRight-2; --i){
                temp = 0;
                for(int j = i - 1; j > sortedOffsetLeft; --j){
                    if(unsortedArray[j] > unsortedArray[i]){
                        temp = unsortedArray[i];
                        unsortedArray[i] = unsortedArray[j];
                        unsortedArray[j] = temp;
                    }

                }

            }

            sortedOffsetRight -= 2;

            for (int k = sortedOffsetLeft +1; k <= sortedOffsetLeft+2; ++k){
                temp = 0;
                for (int l = k + 1; l < sortedOffsetRight; ++l){
                    if (unsortedArray[l] > unsortedArray[k]){
                        temp = unsortedArray[k];
                        unsortedArray[k] = unsortedArray[l];
                        unsortedArray[l] = temp;
                    }
                }
            }

            sortedOffsetLeft+=2;
        }

        //Return statement used for testing
        //return unsortedArray;
    }
}

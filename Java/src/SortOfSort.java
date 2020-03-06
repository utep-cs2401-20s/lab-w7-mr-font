public class SortOfSort {




    public  static  void sortOfSort(int[] unsortedArray){

        int sortedOffsetRight = 1;
        int sortedOffsetLeft = 0;
        int rightOffSetMultiplier = 1;
        int leftOffSetMultiplier = 1;
        int offSet = 2;
        int loopNum = 0;
        //int temp = 0;

        //false = left, true = right
        boolean leftOrRight = true;

        //int largestNum = unsortedArray[unsortedArray.length-1];

        while(sortedOffsetLeft <= ((unsortedArray.length-1)/ 2) ){


            if(leftOrRight){
                loopNum = 0;
                for(int i = unsortedArray.length-1; i >= (sortedOffsetLeft * leftOffSetMultiplier)-1; --i){

                    int largestNum = i;

                    for(int j = i - 1; j >= sortedOffsetLeft; --j){

                        if(unsortedArray[j] > largestNum){
                            largestNum = j;
                        }
                    }

                    if(unsortedArray[largestNum] != i){
                        int temp = unsortedArray[largestNum];

                        unsortedArray[largestNum] = unsortedArray[i];
                        unsortedArray[i] = temp;

                    }
                    loopNum ++;
                    rightOffSetMultiplier++;
                    if(loopNum == 2){
                        leftOrRight = false;
                    }
                }
            }else{
                loopNum = 0;
                sortedOffsetLeft = 1;
                for(int i = 0; i < (sortedOffsetRight * rightOffSetMultiplier); ++i){

                    int largestNum = i;

                    for(int j = i - 1; j >= sortedOffsetLeft; --j){

                        if(unsortedArray[j] > largestNum){
                            largestNum = j;
                        }
                    }

                    if(unsortedArray[largestNum] != i){
                        int temp = unsortedArray[largestNum];

                        unsortedArray[largestNum] = unsortedArray[i];
                        unsortedArray[i] = temp;

                    }
                    loopNum ++;
                    leftOffSetMultiplier++;
                    if(loopNum == 2){
                        leftOrRight = true;
                    }
            }
        }
    }

    public int[] sortOfHelper(int[] unsortedArray, boolean leftRight, int offsetMultiplier){


    }
}

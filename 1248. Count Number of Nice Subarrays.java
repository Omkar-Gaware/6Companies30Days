class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        //SubArrays which have exactly k odd numbers = total subArrays with k odd - totalSubArray with k-1 odd
        return  findTotalSubArrays(nums, k) - findTotalSubArrays(nums, k - 1);
    }
    //this will find all the subarrays till k odd numbers
    public int findTotalSubArrays(int[] nums, int k){

        int i = 0;
        int j = 0;
        int subArrays = 0;
        int countOdd = 0;

        while(j < nums.length){

            if(nums[j] % 2 != 0){   //calculation part
                countOdd++;
            }

            while(countOdd > k){    //if !condition 

                if(nums[i] % 2 != 0){   //remove the calculation part using i
                    countOdd--;
                }
                i++;    
            }
            subArrays += j - i + 1;     //find all subarrays
            j++;
        } 
        return subArrays;
    }
}
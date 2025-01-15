class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=1, diff=0, n=nums.length, sum=Integer.MIN_VALUE;
        int count=0;
        while(j<n && i<n-1){
		    // ((nums[i]+nums[j])!=sum) -> this will take care of no repetetion
			//if we found any match, increase i , j by 1
            if(nums[j]-nums[i]==k && (nums[i]+nums[j])!=sum){
                sum=nums[i]+nums[j];
                i++; j++; count++;
            }
			//if diff is smaller than k increase j by 1
			else if((nums[j]-nums[i])<k){
                j++;
            }
			//else case, when diff is greater than k, increase i by 1
			else{
                i++;
            }
			//check if i and j are not same to aoid duplicates
            if(i==j) j++;
        }
        return count;
    }
}
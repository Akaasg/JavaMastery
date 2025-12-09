// Maximum subarray
class kadanesalgorithm  {
	public static void main(String[]args) {
		int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
		int csum=nums[0];
		int msum=nums[0];
		for(int i=1; i<nums.length; i++) {
			csum=Math.max(nums[i],nums[i]+csum);
			msum=Math.max(csum, msum);
		}
		System.out.println(msum);
	}
}
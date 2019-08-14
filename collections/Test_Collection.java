package collections;

import java.util.Arrays;

public class Test_Collection {
public static void main(String[] args) {
	int[] nums={1,3,4,5,6};
	for(int i=0;i<nums.length;i++)
	{
		System.out.println(nums[i]);
		
	}
	System.out.println("natural order:"+Arrays.toString(nums));
	for(int num:nums)
	{
		System.out.println(num);
	}
	Arrays.sort(nums);
	System.out.println("sorted order:"+Arrays.toString(nums));
	char[] alpha={'A','B','C','D','E'};
	System.out.println("natursl order:"+Arrays.toString(alpha));
	Arrays.sort(alpha);
	String[] days={"son","mon","tue","wed","thu","fri","sat"};
	Arrays.sort(days);
	System.out.println("Sorted order:"+Arrays.toString(days));
	
}
}

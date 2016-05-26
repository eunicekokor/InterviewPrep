int[] nums = {1, 33, 5, 22, 83, 99, 30, 2};

max = nums[1];
second = nums[0];

for (i = 1; i < nums.length; i++){
	    
		    if (nums[i] >= second) {
				        if (nums[i] < max) {
							            second = nums[i];
										        }
												        
														        if (nums[i] >= max){
																	            second = max;
																				            max = nums[i];
																							        }
																									        
																											        
																													    }
}

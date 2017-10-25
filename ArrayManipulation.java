class ArrayManipulation {
	// solution 1
	public static int[] add_one(int[] given_array) {
		int carry = 1;
		int[] result = new int[given_array.length];
		
		for(int i = given_array.length-1; i >= 0; i--) {
			int total = given_array[i] + carry;
			carry = (total == 10) ? 1:0;
			result[i] = total % 10;
		}
		if(carry == 1){
			result = new int[given_array.length+1];
			result[0] = 1;
		}
		return result;
	}
	// solution 2
	public static int toString(int[] given_array){
		String s = "";
		for(int i = 0; i < given_array.length; i++){
			s += String.valueOf(given_array[i]);
		}
		int n = Integer.parseInt(s)+1;
		return n;
	}
	
	public static void main(String[] args){
		int[] nums = {2,9,9,8,9};
		int[] result = add_one(nums);
		
		for(int i : result){
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.print(toString(nums));
	}
}
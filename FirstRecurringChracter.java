class FirstRecurringChracter{
	public static void main(String[] args){
		String s = "ABCA";
		//String s = "ABC"; /*No recurring character*/
		char[] ch = s.toCharArray();
		boolean isDone = false;
		String message = "";
		for(int i = 0; i < s.length(); i++){
			for(int y = i+1; y < s.length(); y++){
				if(s.charAt(i) == s.charAt(y) && isDone == false){
					isDone = true;
					System.out.print(s.charAt(i));
				}else{
					message = "No recurring character";
				}
			}
		}
		System.out.print(isDone == false ? message:"");
	}
}
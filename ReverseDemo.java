class Reverse {
	 // String b = "beautiful woman";
	 // char reverseR(String s) {
	 // 	char f = s.charAt(0);
	 // 	char k;
	 // 	int length = s.length;
		// if(s.indexOf(f) == length - 1){
		// 	return f;
		// }
		// else {
		
			
		// 	return k;
	
    public String reverseR(String str) {
    	char c[] = str.toCharArray();
    	int i = str.length()-1;
    	String j ;
    	String s;
    	if( i <= 0) {
     	return Character.toString(c[0]);
    	}
    	else {
        	s = Character.toString(c[i]);
        	j = reverseR(s) ;
        	i--;
        
    
        	return new String(j);
    	}

	}
}

class ReverseDemo {
	public static void main(String[] args) {
		Reverse p = new Reverse();

		System.out.println(p.reverseR("hey girl how you doing"));
	}

}

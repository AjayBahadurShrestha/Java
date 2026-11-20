class StringConstructor{
	public static void main(String... args){
		String s1 = new String(); //empty String
		System.out.println(s1);
		System.out.println(s1.length());
		
		String s2 = new String("Lbef College"); // String with literals
		System.out.println(s2);
		System.out.println(s2.length());
		
		// using char array
		char ch []= {'W', 'E', 'L', 'C', 'O', 'M', 'E'};
		String s3 = new String(ch,3,4); 
		System.out.println(s3);
		System.out.println(s3.length());
		
		// using byte array
		byte b []= {101, 102, 103, 104,105,106};
		String s4 = new String(b); 
		System.out.println(s4);
		System.out.println(s4.length());
		
		// using StringBuffer
		StringBuffer sb = new StringBuffer("Ram");
		String s5 = new String(sb); 
		System.out.println(s5);
		System.out.println(s5.length());
		
		// using StringBuilder
		StringBuilder sb1 = new StringBuilder("Ajay");
		String s6 = new String(sb1); 
		System.out.println(s6);
		System.out.println(s6.length());
		
		
	}

}
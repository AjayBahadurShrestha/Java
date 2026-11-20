class StringMethods{
	public static void main(String... args){
		String s1 = new String("Kathmandu");
		String s2 = new String("KAthmandu");
		System.out.println("String: "+s1);
		System.out.println("Length: "+s1.length());
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 equalsIgnoreCase: "+s1.equalsIgnoreCase(s2)); 
		System.out.println("Uppercase: "+s1.toUpperCase());
		System.out.println("Lowercase: "+s1.toLowerCase());
		System.out.println("char at 3: "+s1.charAt(3));
		System.out.println("index of t: "+s1.indexOf('t'));
		
		
		
		
	}

}
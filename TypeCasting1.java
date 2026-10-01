class TypeCasting{
	public static void main(String... args){
		// Implicit
		byte b=126;
		int i=b;
		System.out.println("Byte: "+b);
		System.out.println("int: "+i);
		// Explicit
		int i1=126;
		byte b1=(byte)i1;
		System.out.println("Byte: "+b1);
		System.out.println("int: "+i1);
	}
}
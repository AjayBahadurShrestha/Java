class Anonymous1{
	public static void main(String... args){
		int sum=0;
		int a[]=new int[]{2,4,6,8};
		for(int x:a){
			sum=sum+x;
		}
		System.out.println("Sum of Array elements: "+ sum);
	}
}
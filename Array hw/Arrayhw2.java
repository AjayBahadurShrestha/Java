// given int[] arr = {5, 10, 15, 20}; need sum

class Arrayhw2{
	public static void main(String args[]){
		int[] a = {5,10,15,20};
		
		int sum =0;
		for (int i=0; i<a.length; i++){
		 sum = sum+a[i];
		
		}
		System.out.println("The sum is : " +sum);
	
	}

}
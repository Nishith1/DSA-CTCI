package BigO;

public class Exercise_2 {
	
	public static void main(String[] args) {
		System.out.println(power(2,3));
	}
	
	static int power(int a,int b) {  
		if(b<0)return 0;
		else if(b==0)return 1;
		else return a * power(a,b-1);
	}
	
}

public class Calculator{
	public static void add(int x,int y){
		System.out.println("Addition is "+(x+y));
	}
	public static void sub(int x,int y){
		System.out.println("Subtraction is "+(x-y));
	}
	public static void mul(int x,int y){
		System.out.println("Multiplication is "+(x*y));
	}
	public static void div(int x,int y){
		System.out.println("Division is "+(x/y));
	}
	public static void main(String[]args){
		add(7,5);
		mul(10,7);
	}
}
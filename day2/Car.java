package week1.day2;

public class Car {
	public String carName() {
		return "Hyundai";
	
	}
	
	public String carColor() {
		return "Black";
	}
	
	public int chasisNumber() {
		return(12356687);
	}
	
	public int substraction(int a , int b) {
		int c=a-b;
		return c;
	}
	
	public int multi(int a , int b) {
		int c=a*b;
		return c;
		
	}

	public int division(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.carName();
		System.out.println(obj.carName());
		String carcolor = obj.carColor();
		System.out.println(carcolor);
		int carchasisNumber = obj.chasisNumber();
		System.out.println(carchasisNumber);
		int sub = obj.substraction(5,3);
		System.out.println(sub);
		int mul  = obj.multi(4,3);
		System.out.println(mul);
		int div = obj.division(10,5);
		System.out.println(div);
	}
}

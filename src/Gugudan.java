public class Gugudan {
	public static int[] calculate(int times) {
		        //int[] : 출력해줌, (int times) : 입력값을 받아서
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		        //void는 반환(출력)되는 값이 없다는 의미
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		        //void는 반환(출력)되는 값이 없다는 의미
		for(int i=2; i<10; i++) {
			int[] result = calculate(i);
			print(result);			
		}
	}
}

// 구구단 메소드 활용
/*public class Gugudan {
	public static int[] calculate(int times) {
		//int[] : 출력해줌, (int times) : 입력값을 받아서
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		//void는 반환(출력)되는 값이 없다는 의미
		for(int i=2; i<10; i++) {
			int[] result = calculate(i);
			print(result);			
		}
	}
}*/	

//import java.util.Scanner;		
//public class Gugudan {
//	public static void main(String[] args) {
		
		// 8, 9단
		/*System.out.print("구구단중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number + "단");
		
		if (number < 2) {
			System.out.println("값을 잘못 입력하셨습니다.^^");
		} else if (number > 9) {
			System.out.println("값을 잘못 입력하셨습니다.^^");
		} else {
			for(int i=1; i<10; i++) {
				System.out.println(number * i);
			}
		}
		*/
		
		// 6단
//		int i=1;
//		while(i<10){
//			System.out.println(6*i);
//			i=i+1; //i++
//		}
//		
//		// 7단
//		for(int j=1; j<10; j++) {
//			System.out.println(7*j);
//		}		
		
		// 2단
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		
		// 4단
//		System.out.println("4단");
//		int result = 4*1;
//		System.out.println(result);
//		result = 4*2;
//		System.out.println(result);
//		result = 4*3;
//		System.out.println(result);
//		result = 4*4;
//		System.out.println(result);
//		result = 4*5;
//		System.out.println(result);
//		result = 4*6;
//		System.out.println(result);
		
//		System.out.print("구구단중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);		
//	}
//}

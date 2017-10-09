//클래스 활용해 구구단 다시 구현

public class GugudanMain {
	public static void main(String[] args) {
        //void는 반환(출력)되는 값이 없다는 의미
		for(int i=2; i<10; i++) {
			int[] result = Gugudan.calculate(i);
			Gugudan.print(result);
			}
	}
}

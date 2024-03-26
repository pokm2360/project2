package main;
/*
 * 정수 자료형*/
public class Ex4 {

	public static void main(String[] args) {
		
		short s = 10;
		byte b = 10;
		int i = 10;
		long l = 10;

			//long 타입에 값을 담을 때, int형 범위를 넘어가면 식별자 붙여야함
		l = 123456l;
		
		System.out.println(s + b); // 서로 다른 타입의 변수도 연산 가능
		
		s = 200; // 범위에 벗어나느 값을 대입하면 에러
	}

}

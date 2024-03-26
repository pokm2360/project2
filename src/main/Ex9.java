package main;

public class Ex9 {

	public static void main(String[] args) {
	// 정수형
		byte b = 10;
		int i = b; // b변수 값을 i에 복사
		System.out.println(i);

	// 실수형
		float f = 10.0f;
		double d = f; //f변수를 d변수에 복사
		System.out.println(d);
		
		// 정수형과 실수형
		int iNum = 1;
		float fNum = iNum; // 더 정밀한 쪽으로 변환될때는 자동으로 형변환됨, 실수형은 소수점
		System.out.println(fNum); // 1.0
		
		// 연산중에 자동변환되는 경우
		System.out.println(iNum + fNum); // 컴퓨터가 더하기 연산을 수행할 때, 두 항을 같은 형으로 변환시켜줌
	}

}

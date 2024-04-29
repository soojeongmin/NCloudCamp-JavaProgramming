package chap04_controlstatement;

public class _07_DuplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 중첩 for문
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(" i: "+i+", j: "+j);
			}
			System.out.println(" i값 증가");
		}
		
		// 2. 2~9단까지 구구단 출력
		for(int k=2;k<=9;k++) {
			System.out.print(k+"단 시작 ");
			for(int l = 1; l<=9; l++) {
				System.out.print(k+" * "+l+" = "+(k*l)+" ");
			}
			System.out.println(k+ "단 끝 ");
		}
		
		// 3. 
		// *****
		// *****
		// *****
		// *****
		// *****
		// 위 모양대로 출력할 수 있는 중첩 for문을 작성하세요.
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 4. AB+BA=99를 만족하는 A, B값을 모두 출력하는 중첩 for문을 작성하세요.(A,B는 0~9까지의 정수)
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(((i*10)+j)+((j*10)+i)==99) System.out.println("A: "+i+", B: "+j);
			}
		}
	}

}

package chap04_controlstatement;

public class _10_Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. for문에서의 continue: 아래의 코드를 실행하지 않고 증감식으로 이동
		for(int i=0;i<10;i++)
		{
			if(i<5) continue;
			System.out.println();
		}
		
		// 2. while문에서의 continue: 아래의 코드를 실행하지 않고 조건식으로 이동
		int num = 1;
		while(num<=100) {
			if(num%3==0) continue;
			System.out.println(num++);
		}
		
		
	}

}
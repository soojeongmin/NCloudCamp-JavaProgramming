package chap05_Array;

public class _03_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. chArr의 요소 중 소문자는 대문자로, 대문자는 소문자로 변환하여 convertArr에 저장하세요.
		char[] chArr = {'b','I','t','C'};
		char[] convertArr = new char[4];
		for(int i=0;i<chArr.length;i++) {
			if(chArr[i]>=65 && chArr[i]<=90) convertArr[i] = Character.toLowerCase(chArr[i]);
			else convertArr[i] = Character.toUpperCase(chArr[i]);
			System.out.println(convertArr[i]);
		}
	}

}

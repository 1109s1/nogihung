import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {

		Scanner s = s.next();
		System.out.println("-------------------");
		System.out.println("가위, 바위, 보 입력 : ");
		System.out.println("-------------------");
		System.out.println("홍길동 입력 : ");
		String hong = s.next();
		System.out.println("김길동 입력 : ");
		String kim = s.next();
		
		//String 문자열 비교
		if (hong.equals("가위")) 
			if(kim.equals("가위")) {
				System.out.println("비겼습니다.");
		}
			else if (kim.equals("바위")) {
				System.out.println("김길동이 이겼습니다.");
		}
			
			else (kim.equals("보")) {
				System.out.println("홍길동이 이겼습니다.");
			}
			else if (kim.equals("가위")) {
				System.out.println("김길동이 이겼습니다.");
			}
	
			
			else if (kim.equals("바위")){
				System.out.println("홍길동이 이겼습니다.");
			}
			else if (kim.equals("보")) {
				System.out.println("비겼습니다.");
			}
	}
}

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.print("���ڸ� �Է�: ");
	int num = s.nextInt();
			
	if(num % 2 !=0) {
		System.out.println("Ȧ���Դϴ�.");
	}
	else {
		System.out.println("¦���Դϴ�.");
	}
	}

}
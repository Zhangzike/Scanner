package Scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       Scanner s=new Scanner(System.in);
       System.out.println("�����������");
       int a=s.nextInt();
       System.out.println("�����뱻������");
       int b=s.nextInt();
       int sum=a-b;
       System.out.println("����������Ϊ��"+sum);
	}

}

package ex0111.method;

//UsingMethod.java
class UsingMethodExam{
     //�Ʒ��� ���� �޼ҵ带 �ۼ��ϼ���.
   
     /*Method�̸� :  methodExam03_01
     �ڱ��ڽŸ� ���ٰ���
     ReturnType : ����
     Parameter : ���� 1��
	(�����ο���)�ϴ� �� : 
	methodExam03_01�� ȣ��Ǿ����ϴ�. ���
	�μ��� ���� ���� ��� 
	����*2 ����. */
		
	private int methodExam03_01(int num) {
		System.out.println("methodExam03_01�� ȣ��Ǿ����ϴ�.");
		System.out.println("argument value : " + num);
		return num * 2;
	}
	
	 
	 /*Method�̸� :  methodExam03_02
     ��𼭳� �ƹ��� ���ٰ���
     Return String
     Parameter : String 1��, ���� 1��
	(�����ο���)�ϴ� �� : 
		methodExam03_02�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ���
		�ι�°�μ��� ���� ���� methodExam03_01�� �־� �ָ� methodExam03_01�� ȣ���ϰ� �����ϴ� ���� ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ����
	*/	
	
	public String methodExam03_02(String string, int num) {
		System.out.println("methodExam03_02�� ȣ��Ǿ����ϴ�.");
		System.out.println("argument value : " + string + "�ٺ�");
		System.out.println("methodExam03_01 result : " + this.methodExam03_01(num));
		return string + "�ٺ�";
	}
			
	
	 /*Method�̸� :  methodExam03_03
     ���� package���� �ƹ��� ���� ����
     ReturnType : ���Ͼ���
     Parameter : ���� 1���� String 1��
     (�����ο���)�ϴ� �� : 
		methodExam03_03�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� 1���� String 1���� �Ѱ��ָ�
		methodExam03_02ȣ��
	*/	
		
	void methodExam03_03(int num, String string) {
		System.out.println("methodExam03_03�� ȣ��Ǿ����ϴ�.");
		this.methodExam03_02(string, num);
	}
	
     
     /*Method�̸� :  methodExam03_04
     ��Ӱ����� ��𼭳� ���� ����
     ReturnType : �Ǽ�(�ε��Ҽ���)
     Parameter : ù��° �μ�(����),�ι�° �μ�(�Ǽ�), ����°�μ�(����)
	(�����ο���)�ϴ� �� : 
		methodExam03_04�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� �̿��� 
		MakeMethodExam02��ü�� methodExam02_04�޼ҵ� ȣ���ϰ�
		method02_04�� �����ϴ� ���� ����
	*/	

	protected double methodExam03_04(int num1, double floating, int num2) {
		System.out.println("methodExam03_04�� ȣ��Ǿ����ϴ�.");
		MakeMethodExam02 mm = new MakeMethodExam02();
		return mm.methodExam02_04(num1, floating, num2);
	}
	
		
} // UsingMethodExam ��

public class UsingMethod{
	//���θ޼ҵ忡��
		//UsingMethodExam�� ȣ�Ⱑ���� �޼ҵ���� ȣ���ϰ�
		// �����ϴ� �� �ִٸ� ���
		
	public static void main(String args[]) {
		UsingMethodExam example = new UsingMethodExam();
		//example.methodExam03_01(1);
		System.out.println("return of methodExam03_02 : " + example.methodExam03_02("hello", 2));
		example.methodExam03_03(3, "hello");
		System.out.println("return of methodExam03_04 : " + example.methodExam03_04(3, 5.5, 4));
	}
	
}

  
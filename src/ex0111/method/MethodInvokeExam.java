package ex0111.method; 

class Methodinvoke01{
	//������ ���� �޼ҵ带 �ۼ��ϼ���.
	
	/*method �̸� : method01
	��𼭳� ������ ���ٰ���
	���� ����
	�μ��� ����2�� ����
	�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ����*/
		
	public int method01(int num1, int num2) {
		System.out.println("result : " + (num1 * num2));
		return num1 * num2;
	}
}

class Methodinvoke02{
	
	//method �̸� : method02
	//��𼭳� ������ ���ٰ���,��ü�� �������� �ʰ� ���ٰ���
	//���� ����
	//�μ��� ����2�� ����
	//�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ���Ѽ� ����
		
	static int method02(int num1, int num2) {
		System.out.println("result : " + (num1 + num2));
		return num1 + num2;
	}
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01�� method01 ȣ��
		Methodinvoke01 mm = new Methodinvoke01();
		mm.method01(1, 2);

		//MethodInvoke02�� method02 ȣ��
		Methodinvoke02.method02(1, 2);
	}
}


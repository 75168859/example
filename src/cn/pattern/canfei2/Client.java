package cn.pattern.canfei2;
public class Client {
	public static void main(String[] args) {
		
		//System.out.println("the ret1=" + ret1);
		//String ret2 = h3.handleFeeRequest("С��", 300);
		//System.out.println("the ret2=" + ret2);
		//����ķ����ߺ��������߽��н���Ĳ���
		f().handleFeeRequest("С��", 500);
	}
	//�����Ĺ�������װ����������������������㼴��
	//����µ����������޸Ĺ���
	static Handler f(){
		// ��Ҫ��װְ����
				Handler h1 = new GeneralManager();
				Handler h2 = new DepManager();
				
				Handler h3 = new ProjectManager();
				
				h3.setSuccessor(h2);
				h2.setSuccessor(h1);
				
				// ��ʼ����
				//System.out.println(h3.handleFeeRequest(name, price));
	     return h3;
	}
}
package cn.pattern.canfei1;



public class Client {
	transient int a;
	public static void main(String[] args) {

		FeeRequest request = new FeeRequest();

		// ��ʼ����
		String ret1 = request.requestToProjectManager("С��", 1000);
		System.out.println("the ret1=" + ret1);
		//String ret2 = request.requestToProjectManager("С��", 300);
		//System.out.println("the ret2=" + ret2);
   
	}
}

package cn.pattern.canfei1;



public class Client {
	transient int a;
	public static void main(String[] args) {

		FeeRequest request = new FeeRequest();

		// 开始测试
		String ret1 = request.requestToProjectManager("小李", 1000);
		System.out.println("the ret1=" + ret1);
		//String ret2 = request.requestToProjectManager("小张", 300);
		//System.out.println("the ret2=" + ret2);
   
	}
}

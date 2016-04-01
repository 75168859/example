package cn.pattern.Observer;

public class Observer1 implements Observer{

	@Override
	public void update() {
		System.out.println("名字修改了打印到控制台...");
	}

}

package cn.pattern.Observer;

public class Observer2 implements Observer{

	@Override
	public void update() {
		System.out.println("名字修改了记录到数据库...");
	}

}

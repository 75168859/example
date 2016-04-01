package cn.pattern.Observer;

public class Test {
	public static void main(String[] args) {
		Target target = new Target();
		Observer1 obs1 = new Observer1();
		Observer2 obs2 = new Observer2();
		target.addObserver(obs1);
		target.addObserver(obs2);
		System.out.println("hello");
		target.setName("world");
	}

}

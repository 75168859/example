package cn.pattern.abstractfactory;

public class Test {
	public static void main(String[] args) {
		//AbstractFactory abstractFactory = new AppleFactory();
		//依赖与具体的工厂，可以通过配置文件+反射解耦 
		AbstractFactory abstractFactory = new SamsungFactory();
		Computer computer = abstractFactory.createComputer();
		Mobile mobile = abstractFactory.createMobile();
		computer.work();
		mobile.work();
	}

}

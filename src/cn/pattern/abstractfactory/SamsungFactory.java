package cn.pattern.abstractfactory;

public class SamsungFactory extends AbstractFactory{

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new SamsungComputer();
	}

	@Override
	public Mobile createMobile() {
		// TODO Auto-generated method stub
		return new SamsungMobile();
	}

}

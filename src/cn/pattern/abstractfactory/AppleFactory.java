package cn.pattern.abstractfactory;

public class AppleFactory extends AbstractFactory{

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new AppleComputer();
	}

	@Override
	public Mobile createMobile() {
		// TODO Auto-generated method stub
		return new AppleMobile();
	}

}

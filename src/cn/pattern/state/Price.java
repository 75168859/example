package cn.pattern.state;

public abstract class Price {
	public abstract double getCharge(int days);
	public int getFre(int days){
		return 1;
	}
}

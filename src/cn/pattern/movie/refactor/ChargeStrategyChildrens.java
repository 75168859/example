package cn.pattern.movie.refactor;

public class ChargeStrategyChildrens extends ChargeStrategy {
	public double charge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
}
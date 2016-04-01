package cn.pattern.movie.refactor;

public class StrategyContext {
	public static ChargeStrategy createStrategy(Movie movie) {
		ChargeStrategy chargeStrategy = null;
		// ���ݵ�Ӱ�ļ۸����ͽ��з��ദ���
		switch (movie.getPriceCode()) {
		case Movie.REGULAR:
			chargeStrategy = new ChargeStrategyRegular();
			break;
		/*
		 * �����µ�Ӱ
		 */
		case Movie.NEW_RELEASE: // ����ŷ����Ƭ
			chargeStrategy = new ChargeStrategyRegular();
			break;
		/*
		 * �Ƕ�ͯ��Ӱ
		 */
		case Movie.CHILDRENS: // ��ͯ��Ӱ�w
			chargeStrategy = new ChargeStrategyRegular();
			break;
		}
		return chargeStrategy;
	}
}
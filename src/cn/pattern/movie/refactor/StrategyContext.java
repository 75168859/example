package cn.pattern.movie.refactor;

public class StrategyContext {
	public static ChargeStrategy createStrategy(Movie movie) {
		ChargeStrategy chargeStrategy = null;
		// 根据电影的价格类型进行分类处理
		switch (movie.getPriceCode()) {
		case Movie.REGULAR:
			chargeStrategy = new ChargeStrategyRegular();
			break;
		/*
		 * 是最新电影
		 */
		case Movie.NEW_RELEASE: // 最新欧美大片
			chargeStrategy = new ChargeStrategyRegular();
			break;
		/*
		 * 是儿童电影
		 */
		case Movie.CHILDRENS: // 儿童电影
			chargeStrategy = new ChargeStrategyRegular();
			break;
		}
		return chargeStrategy;
	}
}
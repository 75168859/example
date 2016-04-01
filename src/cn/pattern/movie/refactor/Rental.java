package cn.pattern.movie.refactor;

public class Rental {
	private Movie _movie; // 租的影片
	private int _daysRented; // 租期,(几天)

	public Rental(Movie vimoviee, int daysRented) {
		_movie = vimoviee;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	double getCharge() {
		return StrategyContext.createStrategy(getMovie()).charge(
				getDaysRented());
	}

	int getFrequentRenterPoints() {
		/*
		 * 计算本次客户租赁电影的,积分信息 积分规则1:每次累计增加1 分 2:如果是新片,并且租期大于1 天,再增加一分
		 */
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&& getDaysRented() > 1)
			return 2;
		else
			return 1;

	}
}



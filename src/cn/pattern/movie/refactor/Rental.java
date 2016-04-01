package cn.pattern.movie.refactor;

public class Rental {
	private Movie _movie; // ���ӰƬ�w
	private int _daysRented; // ����,(����)

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
		 * ���㱾�οͻ����޵�Ӱ��,������Ϣ ���ֹ���1:ÿ���ۼ�����1 �� 2:�������Ƭ,�������ڴ���1 ��,������һ��
		 */
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&& getDaysRented() > 1)
			return 2;
		else
			return 1;

	}
}



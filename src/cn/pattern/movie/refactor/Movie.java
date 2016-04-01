package cn.pattern.movie.refactor;

public class Movie {
	public static final int CHILDRENS = 2; // 儿童片
	public static final int REGULAR = 0; // 普通影片
	public static final int NEW_RELEASE = 1; // 最新大片, 欧美排行
	private String _title; // 片名
	private int _priceCode; // 价格类型

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int arg) {
		_priceCode = arg;
	}

	public String getTitle() {

		return _title;
	}
}
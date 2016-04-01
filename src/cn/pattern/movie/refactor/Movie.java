package cn.pattern.movie.refactor;

public class Movie {
	public static final int CHILDRENS = 2; // ��ͯƬ
	public static final int REGULAR = 0; // ��ͨӰƬ
	public static final int NEW_RELEASE = 1; // ���´�Ƭ, ŷ������
	private String _title; // ��Ƭ��
	private int _priceCode; // �۸�����

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
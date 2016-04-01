package cn.pattern.movie.refactor;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name; // ﹎
	private Vector _rentals = new Vector(); //
	private PrintInvoiceHandler printHandler;

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public Vector getRental() {
		return _rentals;
	}

	public String getName() {
		return _name;
	}

	public void printInvoice() {
		printHandler.printInvoice();
	}

	/**
	 * 获得所有积分
	 * 
	 * @return
	 */
	public int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = getRental().elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	/**
	 * 获得所有的费用
	 * 
	 * @return 
	 */
	public double getTotalCharge() {
		double result = 0;
		Enumeration rentals = getRental().elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	public void setPrintHandler(PrintInvoiceHandler printHandler) {
		this.printHandler = printHandler;
		this.printHandler.setCustomer(this);
	}
}
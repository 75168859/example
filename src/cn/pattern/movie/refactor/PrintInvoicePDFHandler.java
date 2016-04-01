package cn.pattern.movie.refactor;

import java.util.Enumeration;

public class PrintInvoicePDFHandler extends PrintInvoiceHandler {
	/**
*
*/
	public void printBody() {
		Enumeration rentals = getCustomer().getRental().elements();
		String result = "";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// 显示电影的名称和本片的详细费用信息敍
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + " 元\n";
		}
		// 打印本次租赁的电影的详细信息(名称租期费用)
		System.out.println("租赁的电影详细信息如下: ");
		System.out.println(result);
	}

	/**
*
*/
	private void printTotal() {
		// 打印本次租赁的总体信息(费用和积分)
		String total = "总金额" + String.valueOf(getCustomer().getTotalCharge())
				+ "元\n";
		total += "总累计积分"
				+ String.valueOf(getCustomer().getTotalFrequentRenterPoints()
						+ "分");
		System.out.println("本次租赁汇总信息: ");
		System.out.println(total);
	}
}
package cn.pattern.movie.refactor;

public abstract class PrintInvoiceHandler {
	private Customer customer;

	public PrintInvoiceHandler() {
	}

	/*
*
*/
	public final void printInvoice() {
		pringHead();
		printBody();
		printTotal();
		printFoot();
	}

	/**
*
*/
	private void pringHead() {
		System.out.println("***************************************");
		System.out.println(" 打印客户帐单");
		System.out.println("***************************************");
		System.out.println("客户姓名:" + customer.getName() + "\n");
	}

	/**
	 * @param rentals
	 */
	public abstract void printBody();

	/**
*
*/
	private void printTotal() {
		// 打印本次租赁的总体信息(费用和积分)
		String total = "总金额" + String.valueOf(customer.getTotalCharge())
				+ "元\n";
		total += "总累计积分"
				+ String.valueOf(customer.getTotalFrequentRenterPoints() + "分");
		System.out.println("本次租赁汇总信息: ");
		System.out.println(total);
	}

	/**
*
*/
	private void printFoot() {
		// 打印帐单结束
		System.out.println("***************************************");
		System.out.println(" 帐单结束");
		System.out.println("***************************************");
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
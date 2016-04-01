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
		System.out.println(" ��ӡ�ͻ��ʵ�");
		System.out.println("***************************************");
		System.out.println("�ͻ�����:" + customer.getName() + "\n");
	}

	/**
	 * @param rentals
	 */
	public abstract void printBody();

	/**
*
*/
	private void printTotal() {
		// ��ӡ�������޵�������Ϣ(���úͻ���)
		String total = "�ܽ��" + String.valueOf(customer.getTotalCharge())
				+ "Ԫ\n";
		total += "���ۼƻ���"
				+ String.valueOf(customer.getTotalFrequentRenterPoints() + "��");
		System.out.println("�������޻�����Ϣ: ");
		System.out.println(total);
	}

	/**
*
*/
	private void printFoot() {
		// ��ӡ�ʵ�����
		System.out.println("***************************************");
		System.out.println(" �ʵ�����");
		System.out.println("***************************************");
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
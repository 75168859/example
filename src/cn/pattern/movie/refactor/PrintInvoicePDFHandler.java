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
			// ��ʾ��Ӱ�����ƺͱ�Ƭ����ϸ������Ϣ���^
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + " Ԫ\n";
		}
		// ��ӡ�������޵ĵ�Ӱ����ϸ��Ϣ(�������ڷ���)
		System.out.println("���޵ĵ�Ӱ��ϸ��Ϣ����: ");
		System.out.println(result);
	}

	/**
*
*/
	private void printTotal() {
		// ��ӡ�������޵�������Ϣ(���úͻ���)
		String total = "�ܽ��" + String.valueOf(getCustomer().getTotalCharge())
				+ "Ԫ\n";
		total += "���ۼƻ���"
				+ String.valueOf(getCustomer().getTotalFrequentRenterPoints()
						+ "��");
		System.out.println("�������޻�����Ϣ: ");
		System.out.println(total);
	}
}
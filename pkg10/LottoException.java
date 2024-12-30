package pkg10;

public class LottoException extends Exception { // Exception Ŭ���� < Throwable Ŭ���� < Object Ŭ����
	private int lotto;

	public LottoException(String message, int lotto) {
		super(message);
		this.lotto = lotto;
	}

	@Override
	public String toString() {
		String imsi = this.lotto + "��(��) ������ �ִ� ��ȣ";
		return super.toString() + "\n" + imsi;
	}
}
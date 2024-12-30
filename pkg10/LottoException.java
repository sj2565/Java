package pkg10;

public class LottoException extends Exception { // Exception 클래스 < Throwable 클래스 < Object 클래스
	private int lotto;

	public LottoException(String message, int lotto) {
		super(message);
		this.lotto = lotto;
	}

	@Override
	public String toString() {
		String imsi = this.lotto + "는(은) 문제가 있는 번호";
		return super.toString() + "\n" + imsi;
	}
}
package day6;

public class IPTV extends ColorTV {

	private String ipAddr;

	public IPTV(String ipAddr, int size, int color) {
		super(size, color);
		this.ipAddr = ipAddr;
	}

	@Override
	public void printProperty() {
		// "192.1.1.2" 주소에 32인치, 2048컬러
		System.out.println("나의 IPTV는 " + ipAddr + " 주소의 " + super.getSize() + "인치, " + super.getColor() + "컬러");
	}

}

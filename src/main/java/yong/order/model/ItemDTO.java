package yong.order.model;

public class ItemDTO {

	private int idx;//상품번호
	private String name;//상품명
	private int num;//상품개수
	private String bigo;//비고
	
	public ItemDTO() {
		super();
	}
	public ItemDTO(int idx, String name, int num, String bigo) {
		super();
		this.idx = idx;
		this.name = name;
		this.num = num;
		this.bigo = bigo;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBigo() {
		return bigo;
	}
	public void setBigo(String bigo) {
		this.bigo = bigo;
	}
	
	
}

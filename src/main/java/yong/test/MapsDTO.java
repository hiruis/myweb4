package yong.test;

public class MapsDTO {
	private  int idx;
	private String name;
	private int xbar;
	private int ybar;
	public MapsDTO() {
		super();
	}
	public MapsDTO(int idx, String name, int xbar, int ybar) {
		super();
		this.idx = idx;
		this.name = name;
		this.xbar = xbar;
		this.ybar = ybar;
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
	public int getXbar() {
		return xbar;
	}
	public void setXbar(int xbar) {
		this.xbar = xbar;
	}
	public int getYbar() {
		return ybar;
	}
	public void setYbar(int ybar) {
		this.ybar = ybar;
	}
	
	
	
}

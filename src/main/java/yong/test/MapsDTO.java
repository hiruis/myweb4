package yong.test;

public class MapsDTO {
	private  int idx;
	private String name;
	private float lat;
	private float lng;
	private String addr;
	public MapsDTO() {
		super();
	}
	public MapsDTO(int idx, String name, float lat, float lng, String addr) {
		super();
		this.idx = idx;
		this.name = name;
		this.lat = lat;
		this.lng = lng;
		this.addr = addr;
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
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}

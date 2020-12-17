package vo;

public class Lunboimage {
	private int imageid;
	private String path;
	private String href;
	@Override
	public String toString() {
		return "LunboImage [imageid=" + imageid + ", path=" + path + ", href="
				+ href + "]";
	}
	public int getImageid() {
		return imageid;
	}
	public void setImageid(int imageid) {
		this.imageid = imageid;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public Lunboimage(int imageid, String path, String href) {
		super();
		this.imageid = imageid;
		this.path = path;
		this.href = href;
	}
	public Lunboimage() {
		super();
	}
	

}

package tw.brad.apis;

public class Brad19M {
	private int x, y;

	public Brad19M(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);

	}

	public int plus() {
		return x + y;
	}
}

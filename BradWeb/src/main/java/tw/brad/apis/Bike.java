package tw.brad.apis;

import java.io.Serializable;

public class Bike implements Serializable {
	protected int speed;
	protected int color;
	protected String name;

	public Bike(String name) {
		this.name = name;
	}

	public Bike() {

	}

	public Bike(int speed, char color) {
		this.speed = speed;
		this.color = color;
	}

	public void upSpeed() {
		this.speed += 10;
	}

	public void downSpeed() {
		this.speed -= 10;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

}

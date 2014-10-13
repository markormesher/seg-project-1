package global;

import java.io.Serializable;

public class Message implements Serializable {

	protected static final long serialVersionUID = 1112122200L;

	public static final int SET_USERNAME = 1, READY_TO_PLAY = 2, SHOOT = 3, HIT = 4, MISS = 5, MESSAGE = 6;
	private String recipient;
	private int type;
	private String message;
	private int x;
	private int y;

	public Message(String recipient, int type) {
		this.recipient = recipient;
		this.type = type;
	}

	public Message(String recipient, int type, String message) {
		this.recipient = recipient;
		this.type = type;
		this.message = message;
	}

	public Message(String recipient, int type, int x, int y) {
		this.recipient = recipient;
		this.type = type;
		this.x = x;
		this.y = y;
	}

	public String getRecipient() {
		return recipient;
	}

	public int getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
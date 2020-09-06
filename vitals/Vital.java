package vitals;

public class Vital {
	
	private String name;
	private int lowLimit;
	private int highLimit;
	private int value;
	
	public Vital(String name, int lowLimit, int highLimit, int value) {
		super();
		this.name = name;
		this.lowLimit = lowLimit;
		this.highLimit = highLimit;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getLowLimit() {
		return lowLimit;
	}
	public void setLowLimit(int lowLimit) {
		this.lowLimit = lowLimit;
	}
	public int getHighLimit() {
		return highLimit;
	}
	public void setHighLimit(int highLimit) {
		this.highLimit = highLimit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

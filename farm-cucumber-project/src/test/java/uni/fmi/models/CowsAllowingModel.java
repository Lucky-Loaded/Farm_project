package uni.fmi.models;

public class CowsAllowingModel {

	private String message;
	private int motherAge;
	private int fatherAge;
	private int pregnantingTime;

	public boolean checkMotherAge(int motherAge) {
		this.motherAge = motherAge;
		if(motherAge>=2)
		{
			return true;
		}
		return false;
	}

	public boolean checkFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
		if(fatherAge>=2)
		{
			return true;
		}
		return false;
	}

	public boolean GoodPregnanting(int month) {
		if(motherAge>=2) {pregnantingTime = month;
		if(month>=10)
		{
			return true;
		}
		}
		return false;
		
	}

	public String getMessage() {
		return message;
	}

}

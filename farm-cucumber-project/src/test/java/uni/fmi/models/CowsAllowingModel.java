package uni.fmi.models;

import uni.fmi.cows.service.CowsService;

public class CowsAllowingModel {

	private String message;
	private int motherAge;
	private int fatherAge;
	private int pregnantingTime;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the motherAge
	 */
	public int getMotherAge() {
		return motherAge;
	}
	/**
	 * @param motherAge the motherAge to set
	 */
	public void setMotherAge(int motherAge) {
		this.motherAge = motherAge;
	}
	/**
	 * @return the fatherAge
	 */
	public int getFatherAge() {
		return fatherAge;
	}
	/**
	 * @param fatherAge the fatherAge to set
	 */
	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}
	/**
	 * @return the pregnantingTime
	 */
	public int getPregnantingTime() {
		return pregnantingTime;
	}
	/**
	 * @param pregnantingTime the pregnantingTime to set
	 */
	public void setPregnantingTime(int pregnantingTime) {
		this.pregnantingTime = pregnantingTime;
	}
	
	public String checkMotherAge(int age) {
		boolean mAge = CowsService.checkMotherAge(age);
		
		return mAge ? "Mother is over 2 year" : "Mother is under 2 year";
	}
	public String checkFatherAge(int age) {
		boolean mAge = CowsService.checkMotherAge(age);
		
		return mAge ? "Father is over 2 year" : "Father is under 2 year"; 
	}
	public String GoodPregnanting(int pregnantMonth) {
		boolean pMonth = CowsService.GoodPregnanting(pregnantMonth, motherAge);
		return pMonth ? "Pregnanting is over 10 month" : "Pregnanting is under 10 month" ;
	}
	


}

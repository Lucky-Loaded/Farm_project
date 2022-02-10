package uni.fmi.cows.service;


public class CowsService {
	private static int minMotherAge = 2;
	private static int minFatherAge = 2;
	private static int minPregnantingTime = 10;
	
	static public boolean checkMotherAge(int motherAge) {
		return motherAge > minMotherAge;
	}

	static public boolean checkFatherAge(int fatherAge) {
		return fatherAge > minFatherAge;
	}

	static public boolean GoodPregnanting(int pregnantMonth, int motherAge) {
		if((motherAge > minMotherAge) && (pregnantMonth > minPregnantingTime)) {
			return true;
		}
		
		return false;
	}
}

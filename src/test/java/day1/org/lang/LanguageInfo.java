package day1.org.lang;

public class LanguageInfo {
	
	public void tamilLanguage() {
		System.out.println("Tamil is the mother tonuge Language ");
	}
	
	public void englishLanguage() {
		System.out.println("English is the 2nd Language");
	}
	
	public void hindiLanguage() {
		System.out.println("Hindi is the 3rd Lanuage");
	}
	
	
	//Another Nested class in same java file : with static class
	public static class StateDetails{
		
		public StateDetails() {
			System.out.println("**********Control comes to inner class constructor**********");
		}
		
		public void southIndia() {
			System.out.println("South indians speaks : Tamil, English");
		}
		
		public void northIndia() {
			System.out.println("North indians speaks : Tamil, English,Hindi");
		}
		
	
	}

	public static void main(String[] args) {
		LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();lang.englishLanguage();lang.hindiLanguage();
		StateDetails state = new LanguageInfo.StateDetails();
		state.southIndia();state.northIndia();
	}

}

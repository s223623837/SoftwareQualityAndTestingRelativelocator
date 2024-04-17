public class Main {

	 public static void main(String[] args) {
	        SeleniumTest seleniumTest = new SeleniumTest();
	        seleniumTest.performOfficeworksRegistration("https://www.officeworks.com.au/app/identity/create-account");
	        seleniumTest.closeBrowser();
	    }
    }
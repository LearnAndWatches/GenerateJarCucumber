package cucumber.framework.scenariotest.hrms;

public enum HRMSSceneLogin{
	

	T101("User valid login"),// 1 skenario
	T102("User valid login"),// 1 skenario
	T103("User valid login"),// 1 skenario
	T104("User valid login"),// 1 skenario
	T105("User valid login"),// 1 skenario
	T106("User valid login"),// 1 skenario
	T107("User valid login"),// 1 skenario
	T108("User valid login"),// 1 skenario
	T109("User valid login"),// 1 skenario
	T110("User valid login"),// 1 skenario
	T111("User valid login"),// 1 skenario
	T112("User invalid login"),
	T113("User valid login"),
	T114("User valid login"),
	T115("User valid login"),
	T116("Dashboard user function");
	
	private String testName;
	
	private HRMSSceneLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
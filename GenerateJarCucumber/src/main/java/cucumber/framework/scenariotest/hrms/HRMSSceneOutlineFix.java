package cucumber.framework.scenariotest.hrms;

public enum HRMSSceneOutlineFix{
	

	T1("User invalid login Outlinee"),// 6 skenario
	T2("User invalid empty username and password Outline"), // 6 skenario
	T3("User valid login"),// 1 skenario
	T4("User valid login"),// 1 skenario
	T5("User valid login"),// 1 skenario
	T6("User valid login"),// 1 skenario
	T7("User valid login"),// 1 skenario
	T8("User valid login"),// 1 skenario
	T9("User valid login"),// 1 skenario
	T10("User valid login"),// 1 skenario
	T11("User valid login"),// 1 skenario
	T12("User valid login"),// 1 skenario
	T13("User valid login"),// 1 skenario
	T14("User valid login"),// 1 skenario
	T15("User valid login"),// 1 skenario
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
	
	private HRMSSceneOutlineFix(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
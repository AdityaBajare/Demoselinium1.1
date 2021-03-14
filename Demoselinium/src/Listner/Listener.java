package Listner;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test started");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		System.out.println("Test Success");
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		System.out.println("Test Failled");
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped");
	}
	

}

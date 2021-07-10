package io.pragra.learning.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
public class LogListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("*****************************");
        System.out.println(result.getName() + "STARTED");
        System.out.println("*****************************");
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("-----------------------------");
        System.out.println(result.getName() + "PASSED");
        System.out.println("-------------------------------");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("#################################");
        System.out.println(result.getName()+ "FAILED");
        System.out.println("#################################\"");
    }
}

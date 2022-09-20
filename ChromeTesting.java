package com.leo.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class ChromeTesting {
	public static AndroidDriver driver;

public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setCapability("PlatformName","Android");
	capabilities.setCapability("PlatformVersion","11");
	capabilities.setCapability("udid","emulator-5556");
	capabilities.setCapability("deviceName","sdk_gphone_x86");
	capabilities.setCapability("appPackage","com.example.bloc_auth");
	capabilities.setCapability("appActivity","com.example.bloc_auth.MainActivity");
	
	
	URL url=new URL("http://0.0.0.0:4723/wd/hub");
	driver=new AndroidDriver(url,capabilities);
	System.out.println("done");
}

}

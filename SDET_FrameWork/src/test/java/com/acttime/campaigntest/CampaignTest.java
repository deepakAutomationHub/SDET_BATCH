package com.acttime.campaigntest;

import org.testng.annotations.Test;

public class CampaignTest {
	
	@Test
	public void createCamapginTest() {
		String data = System.getProperty("url");
		String bName = System.getProperty("browser");
		System.out.println(data+"===="+bName+"=====>execute createCamapginTest");
	}
	
	

}

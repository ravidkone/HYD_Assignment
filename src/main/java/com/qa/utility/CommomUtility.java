package com.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommomUtility {
	
	public boolean waitForElementVisible(WebDriver driver, WebElement ele, int iTimeInSeconds) throws Exception {
		boolean bRes_flag = false;
		for (int i = 0; i < iTimeInSeconds; i++) {
			if (!isDisplayed(ele))
				Thread.sleep(1000);
			else
				break;
		}
		return bRes_flag;

	}
	public boolean isDisplayed(WebElement ele) throws Exception {
		boolean bRes_flag = false;
		try {
			if (ele.isDisplayed()) {
				System.out.println("Displayed " + ele);
				bRes_flag = true;
			}
		} catch (Exception ea) {
		}
		return bRes_flag;
	}

}

package com.qa.Testscript;

import org.testng.annotations.BeforeMethod;

import com.qa.base.base;
import com.qa.page.buy_product;

public class registration_test extends base{
	
	registration reg = null;
	buy_product buy = null;
	@BeforeMethod
	public void setup() {
		initilization();
		this.reg =new registration();
		this.buy=new buy_product(null);
		
	}
	

}

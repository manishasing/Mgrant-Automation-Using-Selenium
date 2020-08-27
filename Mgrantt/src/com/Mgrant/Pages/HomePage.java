package com.Mgrant.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {


	@FindBy(how=How.XPATH,using="//a[text()='Home']") WebElement home;
	
	@FindBy(how=How.XPATH,using="//a[text()='Dashboard']") WebElement dashboard;
	
	@FindBy(how=How.XPATH,using="//a[text()='Project']") WebElement project;
	
	@FindBy(how=How.XPATH,using="//a[@class=\"dropdown-toggle\" and text()='Master ']") WebElement masters;
	
	@FindBy(how=How.XPATH,using="//a[text()='Users']") WebElement users;
	
	@FindBy(how=How.XPATH,using="//a[text()='User Levels']") WebElement user_level;
	
	@FindBy(how=How.XPATH,using="//a[@class=\"dropdown-toggle\" and text()='Dhwani (Admin) ']") WebElement admin;
	
	@FindBy(how=How.XPATH,using="//a[text()='State']")WebElement state;
	
	@FindBy(how=How.XPATH,using="//a[text()='District']")WebElement district;

	@FindBy(how=How.XPATH,using="//a[text()='Block']")WebElement block;
	
	@FindBy(how=How.XPATH,using="//a[text()='Village']")WebElement village;
	
	@FindBy(how=How.XPATH,using="//a[text()='Group']")WebElement group;

	@FindBy(how=How.XPATH,using="//a[text()='Entity']")WebElement entity;

	@FindBy(how=How.XPATH,using="//a[text()='Financial Year']")WebElement financial_year;

	@FindBy(how=How.XPATH,using="//a[text()='Entity Budget']")WebElement entity_budget;

	@FindBy(how=How.XPATH,using="//a[text()='NGO Partner']")WebElement ngo_partner;

	@FindBy(how=How.XPATH,using="//a[text()='Thrust Area']")WebElement thrust_area;

	@FindBy(how=How.XPATH,using="//a[text()='Programme']")WebElement programme;

	@FindBy(how=How.XPATH,using="//a[text()='Outreach']")WebElement outreach;

	@FindBy(how=How.XPATH,using="//a[text()='Outcome']")WebElement outcome;

	@FindBy(how=How.XPATH,using="//a[text()='Output']")WebElement output;

	@FindBy(how=How.XPATH,using="//a[text()='Shining Stories']")WebElement shining_stories;





	

}

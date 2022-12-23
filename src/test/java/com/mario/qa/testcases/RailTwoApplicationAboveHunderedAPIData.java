package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RailTwoApplicationAboveHunderedAPIData extends TestBase1{


	public RailTwoApplicationAboveHunderedAPIData() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	//before this do setting for railone in setting page otherwise give credit score error
    @Test(priority=1)
    public void inValidData() {
    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead";
    	RequestSpecification httprequest=RestAssured.given();
    	JSONObject requestparams= new JSONObject();
    	requestparams.put( "vendor_id","5db2cadd07492e00180353d3");
    	requestparams.put( "agent_email", "riya@test.com");
    	requestparams.put(  "first_name","John");
    	requestparams.put( "last_name","Shoy");
    	requestparams.put( "birth_date","04/30/1908");
    	requestparams.put( "ssn_number", "678-98-9898");
    	requestparams.put( "annual_gross_income", "45000");
    	requestparams.put(  "mobile", "8569854589");
    	requestparams.put(  "email","mock+265@evenfinancial.com");
    	requestparams.put(  "address","Washington DC");
    	requestparams.put( "city", "USA");
    	requestparams.put(   "state", "OK");
    	requestparams.put(  "zip_code", "12345");
    	requestparams.put("loan_purpose", "taxes");
    	requestparams.put(  "loan_amount", "2300");
    	requestparams.put(  "employment_status", "employed");
    	requestparams.put(  "employment_pay_frequency", "weekly");
    	requestparams.put( "self_reported_credit_score", "720+");
    	requestparams.put(  "housing_type", "rent");
    	requestparams.put( "card_purposes", "balance_transfer");
    	requestparams.put(  "custom_debt_balance","12");
    	requestparams.put(  "custom_interest_rate","11");
    	requestparams.put(  "custom_term","1");
    	requestparams.put(    "custom_savings","12");
    	requestparams.put(  "custom_cost","12");
    	requestparams.put(  "custom_monthly_payment","12");
    	requestparams.put( "custom_lender_id","Test Offer");
    	requestparams.put(  "custom_offer_url","http://www.google.com");
    	requestparams.put(  "co_app_first_name","Riya");
    	requestparams.put(  "co_app_last_name","Simson");
    	requestparams.put(  "co_app_dob","12/21/1998");
    	requestparams.put(  "co_app_address1","Washington DC");
    	requestparams.put(  "co_app_city","USA");
    	requestparams.put(  "co_app_state","OK");
    	requestparams.put(  "co_app_zipcode","12345");
    	requestparams.put(  "co_app_annual_income","45000");
    	requestparams.put(  "income_source","employed");
    	requestparams.put(   "military","0");
    	requestparams.put(   "employer_name","Software services");
    	requestparams.put(  "months_at_employer","24");
    	requestparams.put( "months_at_address","65");
    	requestparams.put( "monthly_rent","2300");
    	requestparams.put(  "co_app","1");
    	requestparams.put(  "cardCustomLenderId", "Test Lender Id 4");
    	requestparams.put(  "customAnnualFee", "1");
    	requestparams.put(  "customPurchaseApr", "2");
    	requestparams.put(  "customPurchaseIntroApr", "3");
    	requestparams.put( "customCashAdvanceApr", "4");
    	requestparams.put(  "customPurchaseIntroAprTerm", "5");
    	requestparams.put(  "customCardOfferUrl", "http://www.google.com");
    	
    	httprequest.header("Content-Type","application/json");
    	httprequest.body(requestparams.toJSONString());
    	
    	Response response=httprequest.request(Method.POST);
   String responsebody=response.getBody().asString();
   System.out.println(responsebody);
   
   String responsebody1= response.jsonPath().get("message");
   Assert.assertEquals(responsebody1,"Application created successful. Please confirm application by redirect to confirmation_url.");
    	
    }//it is showing in app list page
    @Test(priority=2)
    public void navigateAppListPage() throws Exception {
    	Thread.sleep(3000);
    	driver.navigate().to("https://demo.fitsyn.com/applications");
    	driver.manage().window().maximize();}


}


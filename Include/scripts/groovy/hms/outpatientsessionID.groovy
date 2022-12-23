package hms
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class outpatientsessionID {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.outpatientsessionId.001
	@Given("User Set method to GET M1")
	def setValidM1() {
		println ("Set method GET")
	}

	@When("User Set URL http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions M1")
	def setValidURLM1() {
		println ("http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions")
		response = WS.sendRequest(findTestObject('outpatientsession/TC Get outpatientsession By ID/outpatientsessionID.001'))
	}

	@And("User click button test Request M1")
	def clickButtonM1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK M1")
	def verifystatusCodeM1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.outpatientsessionId.002
	@Given("User Set method to GET M2")
	def setValidM2() {
		println ("Set method GET")
	}

	@When("User Set URL http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions M2")
	def setValidURLM2() {
		println ("http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions")
		response = WS.sendRequest(findTestObject('outpatientsession/TC Get outpatientsession By ID/outpatientsessionID.002'))
	}

	@And("User click button test Request M2")
	def clickButtonM2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed M2")
	def verifystatusCodeM2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	// TC.outpatientsessionId.003
	@Given("User Set method to GET M3")
	def setValidM3() {
		println ("Set method GET")
	}

	@When("User Set URL http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions M3")
	def setValidURLM3() {
		println ("http://eM2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions")
		response = WS.sendRequest(findTestObject('outpatientsession/TC Get outpatientsession By ID/outpatientsessionID.003'))
	}

	@And("User click button test Request M3")
	def clickButtonM3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request M3")
	def verifystatusCodeM3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
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



class allPatient {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.allpatient.001
	@Given("User Set method to GET B1")
	def setValidB1() {
		println ("Set method GET")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients B1")
	def setValidURLB1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Get All Patient/allPatient.001'))
	}

	@And("User click button test Request B1")
	def clickButtonB1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK B1")
	def verifystatusCodeB1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.allpatient.002
	@Given("User Set method to GET B2")
	def setValidB2() {
		println ("Set method GET")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients B2")
	def setValidURLB2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Get All Patient/allPatient.002'))
	}

	@And("User click button test Request B2")
	def clickButtonB2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed B2")
	def verifystatusCodeB2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}
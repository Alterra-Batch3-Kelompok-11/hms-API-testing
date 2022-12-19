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



class deletePatient {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.deletepatient.001
	@Given("User Set method to DELETE E1")
	def setValidE1() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E1")
	def setValidURLE1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletepatient.001'))
	}

	@And("User click button test Request E1")
	def clickButtonE1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK E1")
	def verifystatusCodeE1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	
	// TC.deletepatient.002
	@Given("User Set method to POST E2")
	def setValidE2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E2")
	def setValidURLE2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletepatient.002'))
	}

	@And("User click button test Request E2")
	def clickButtonE2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed E2")
	def verifystatusCodeE2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
	
	// TC.deletepatient.003
	@Given("User Set method to DELETE E3")
	def setValidE3() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E3")
	def setValidURLE3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletepatient.003'))
	}

	@And("User click button test Request E3")
	def clickButtonE3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request E3")
	def verifystatusCodeE3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
	// TC.deletepatient.004
	@Given("User Set method to DELETE E4")
	def setValidE4() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 E4")
	def setValidURLE4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletepatient.004'))
	}

	@And("User click button test Request E4")
	def clickButtonE4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request E4")
	def verifystatusCodeE4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
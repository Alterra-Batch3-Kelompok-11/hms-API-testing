
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



class patientID {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.PatientId.001
	@Given("User Set method to GET C1")
	def setValidC1() {
		println ("Set method GET")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients C1")
	def setValidURLC1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Get Patient By ID/patientID.001'))
	}

	@And("User click button test Request C1")
	def clickButtonC1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK C1")
	def verifystatusCodeC1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	
	// TC.PatientId.002
	@Given("User Set method to GET C2")
	def setValidC2() {
		println ("Set method GET")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients C2")
	def setValidURLC2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Get Patient By ID/patientID.002'))
	}

	@And("User click button test Request C2")
	def clickButtonC2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed C2")
	def verifystatusCodeC2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
	
	// TC.PatientId.003
	@Given("User Set method to GET C3")
	def setValidC3() {
		println ("Set method GET")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients C3")
	def setValidURLC3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Get Patient By ID/patientID.003'))
	}

	@And("User click button test Request C3")
	def clickButtonC3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request C3")
	def verifystatusCodeC3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
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



class deleteOutpatientSession {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.deleteoutpatientsession.001
	@Given("User Set method to DELETE O1")
	def setValidO1() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O1")
	def setValidURLO1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deleteoutpatientsession.001'))
	}

	@And("User click button test Request O1")
	def clickButtonO1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK O1")
	def verifystatusCodeO1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.deleteoutpatientsession.002
	@Given("User Set method to POST O2")
	def setValidO2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O2")
	def setValidURLO2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deleteoutpatientsession.002'))
	}

	@And("User click button test Request O2")
	def clickButtonO2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed O2")
	def verifystatusCodeO2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	// TC.deleteoutpatientsession.003
	@Given("User Set method to DELETE O3")
	def setValidO3() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O3")
	def setValidURLO3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deleteoutpatientsession.003'))
	}

	@And("User click button test Request O3")
	def clickButtonO3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request O3")
	def verifystatusCodeO3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.deleteoutpatientsession.004
	@Given("User Set method to DELETE O4")
	def setValidO4() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 O4")
	def setValidURLO4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deleteoutpatientsession.004'))
	}

	@And("User click button test Request O4")
	def clickButtonO4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request O4")
	def verifystatusCodeO4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
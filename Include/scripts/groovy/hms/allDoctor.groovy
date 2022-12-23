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



class allDoctor {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.alldoctor.001
	@Given("User Set method to GET G1")
	def setValidG1() {
		println ("Set method GET")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors G1")
	def setValidURLG1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Get All doctor/alldoctor.001'))
	}

	@And("User click button test Request G1")
	def clickButtonG1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK G1")
	def verifystatusCodeG1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.alldoctor.002
	@Given("User Set method to GET G2")
	def setValidG2() {
		println ("Set method GET")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors G2")
	def setValidURLG2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Get All doctor/alldoctor.002'))
	}

	@And("User click button test Request G2")
	def clickButtonG2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed G2")
	def verifystatusCodeG2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}
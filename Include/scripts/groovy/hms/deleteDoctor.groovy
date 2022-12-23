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



class deleteDoctor {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.deletedoctor.001
	@Given("User Set method to DELETE J1")
	def setValidJ1() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J1")
	def setValidURLJ1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletedoctor.001'))
	}

	@And("User click button test Request J1")
	def clickButtonJ1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK J1")
	def verifystatusCodeJ1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.deletedoctor.002
	@Given("User Set method to POST J2")
	def setValidJ2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J2")
	def setValidURLJ2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletedoctor.002'))
	}

	@And("User click button test Request J2")
	def clickButtonJ2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed J2")
	def verifystatusCodeJ2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	// TC.deletedoctor.003
	@Given("User Set method to DELETE J3")
	def setValidJ3() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J3")
	def setValidURLJ3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletedoctor.003'))
	}

	@And("User click button test Request J3")
	def clickButtonJ3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request J3")
	def verifystatusCodeJ3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.deletedoctor.004
	@Given("User Set method to DELETE J4")
	def setValidJ4() {
		println ("Set method DELETE")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1 J4")
	def setValidURLJ4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Delete Patient/deletedoctor.004'))
	}

	@And("User click button test Request J4")
	def clickButtonJ4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request J4")
	def verifystatusCodeJ4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
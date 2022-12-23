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



class updateOutpatientSession {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.updateoutpatientsession.001
	@Given("User Set method to PUT N1")
	def setValidN1() {
		println ("Set method PUT")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N1")
	def setValidURLN1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update outpatientsession/updateoutpatientsession.001'))
	}

	@And("User input HTTP Body N1")
	def inputValidDataN1() {
		println ("input valid")
	}

	@And("User click button test Request N1")
	def clickButtonN1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK N1")
	def verifystatusCodeN1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.updateoutpatientsession.002
	@Given("User Set method to POST N2")
	def setValidN2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N2")
	def setValidURLN2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update outpatientsession/updateoutpatientsession.002'))
	}

	@And("User input HTTP Body N2")
	def inputValidDataN2() {
		println ("input valid")
	}

	@And("User click button test Request N2")
	def clickButtonN2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed N2")
	def verifystatusCodeN2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	// TC.updateoutpatientsession.003
	@Given("User Set method to POST N3")
	def setValidN3() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N3")
	def setValidURLN3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update outpatientsession/updateoutpatientsession.003'))
	}

	@And("User input HTTP Body N3")
	def inputValidDataN3() {
		println ("input valid")
	}

	@And("User click button test Request N3")
	def clickButtonN3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request N3")
	def verifystatusCodeN3() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.updateoutpatientsession.004
	@Given("User Set method to POST N4")
	def setValidN4() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N4")
	def setValidURLN4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update outpatientsession/updateoutpatientsession.004'))
	}

	@And("User input HTTP Body N4")
	def inputValidDataN4() {
		println ("input valid")
	}

	@And("User click button test Request N4")
	def clickButtonN4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request N4")
	def verifystatusCodeN4() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.updateoutpatientsession.005
	@Given("User Set method to POST N5")
	def setValidN5() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1 N5")
	def setValidURLN5() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outpatient_sessions/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update outpatientsession/updateoutpatientsession.005'))
	}

	@And("User input HTTP Body N5")
	def inputValidDataN5() {
		println ("input valid")
	}

	@And("User click button test Request N5")
	def clickButtonN5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request N5")
	def verifystatusCodeN5() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
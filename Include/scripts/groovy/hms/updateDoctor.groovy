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



class updateDoctor {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.updateDoctor.001
	@Given("User Set method to PUT I1")
	def setValidI1() {
		println ("Set method PUT")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1 I1")
	def setValidURLI1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update Doctor/updateDoctor.001'))
	}

	@And("User input HTTP Body I1")
	def inputValidDataI1() {
		println ("input valid")
	}

	@And("User click button test Request I1")
	def clickButtonI1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK I1")
	def verifystatusCodeI1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.updateDoctor.002
	@Given("User Set method to POST I2")
	def setValidI2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1 I2")
	def setValidURLI2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update Doctor/updateDoctor.002'))
	}

	@And("User input HTTP Body I2")
	def inputValidDataI2() {
		println ("input valid")
	}

	@And("User click button test Request I2")
	def clickButtonI2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed I2")
	def verifystatusCodeI2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	// TC.updateDoctor.003
	@Given("User Set method to POST I3")
	def setValidI3() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1 I3")
	def setValidURLI3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update Doctor/updateDoctor.003'))
	}

	@And("User input HTTP Body I3")
	def inputValidDataI3() {
		println ("input valid")
	}

	@And("User click button test Request I3")
	def clickButtonI3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request I3")
	def verifystatusCodeI3() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	// TC.updateDoctor.004
	@Given("User Set method to POST I4")
	def setValidI4() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1 I4")
	def setValidURLI4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update Doctor/updateDoctor.004'))
	}

	@And("User input HTTP Body I4")
	def inputValidDataI4() {
		println ("input valid")
	}

	@And("User click button test Request I4")
	def clickButtonI4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request I4")
	def verifystatusCodeI4() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.updateDoctor.005
	@Given("User Set method to POST I5")
	def setValidI5() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1 I5")
	def setValidURLI5() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/Doctors/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update Doctor/updateDoctor.005'))
	}

	@And("User input HTTP Body I5")
	def inputValidDataI5() {
		println ("input valid")
	}

	@And("User click button test Request I5")
	def clickButtonI5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request I5")
	def verifystatusCodeI5() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
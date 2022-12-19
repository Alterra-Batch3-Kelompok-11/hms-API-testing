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



class updatePatient {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.updatepatient.001
	@Given("User Set method to PUT D1")
	def setValidD1() {
		println ("Set method PUT")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D1")
	def setValidURLD1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update patient/updatePatient.001'))
	}

	@And("User input HTTP Body D1")
	def inputValidDataD1() {
		println ("input valid")
	}

	@And("User click button test Request D1")
	def clickButtonD1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK D1")
	def verifystatusCodeD1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}
	
	// TC.updatepatient.002
	@Given("User Set method to POST D2")
	def setValidD2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D2")
	def setValidURLD2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update patient/updatePatient.002'))
	}

	@And("User input HTTP Body D2")
	def inputValidDataD2() {
		println ("input valid")
	}

	@And("User click button test Request D2")
	def clickButtonD2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed D2")
	def verifystatusCodeD2() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
	
	// TC.updatepatient.003
	@Given("User Set method to POST D3")
	def setValidD3() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D3")
	def setValidURLD3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update patient/updatePatient.003'))
	}

	@And("User input HTTP Body D3")
	def inputValidDataD3() {
		println ("input valid")
	}

	@And("User click button test Request D3")
	def clickButtonD3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request D3")
	def verifystatusCodeD3() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
	
	// TC.updatepatient.004
	@Given("User Set method to POST D4")
	def setValidD4() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D4")
	def setValidURLD4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update patient/updatePatient.004'))
	}

	@And("User input HTTP Body D4")
	def inputValidDataD4() {
		println ("input valid")
	}

	@And("User click button test Request D4")
	def clickButtonD4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request D4")
	def verifystatusCodeD4() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
	
	// TC.updatepatient.005
	@Given("User Set method to POST D5")
	def setValidD5() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1 D5")
	def setValidURLD5() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients/1")
		response = WS.sendRequest(findTestObject('Patient/TC Update patient/updatePatient.005'))
	}

	@And("User input HTTP Body D5")
	def inputValidDataD5() {
		println ("input valid")
	}

	@And("User click button test Request D5")
	def clickButtonD5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request D5")
	def verifystatusCodeD5() {
		println ("Show the verify result 404 bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
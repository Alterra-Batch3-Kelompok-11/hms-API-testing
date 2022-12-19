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



class createPatient {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.patient.001
	@Given("User Set method to POST A1")
	def setValidA1() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A1")
	def setValidURLA1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.001'))
	}

	@And("User input HTTP Body A1")
	def inputValidDataA1() {
		println ("input valid")
	}

	@And("User click button test Request A1")
	def clickButtonA1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK A1")
	def verifystatusCodeA1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.patient.002
	@Given("User Set method to POST A2")
	def setValidA2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A2")
	def setValidURLA2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.002'))
	}

	@And("User input HTTP Body A2")
	def inputValidDataA2() {
		println ("input HTTP Body by blank nik")
	}

	@And("User click button test Request A2")
	def clickButtonA2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A2")
	def verifystatusCodeA2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.003
	@Given("User Set method to POST A3")
	def setValidA3() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A3")
	def setValidURLA3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.003'))
	}

	@And("User input HTTP Body A3")
	def inputValidDataA3() {
		println ("input HTTP Body by blank name")
	}

	@And("User click button test Request A3")
	def clickButtonA3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A3")
	def verifystatusCodeA3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.004
	@Given("User Set method to POST A4")
	def setValidA4() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A4")
	def setValidURLA4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.004'))
	}

	@And("User input HTTP Body A4")
	def inputValidDataA4() {
		println ("input HTTP Body by blank gender")
	}

	@And("User click button test Request A4")
	def clickButtonA4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A4")
	def verifystatusCodeA4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.005
	@Given("User Set method to POST A5")
	def setValidA5() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A5")
	def setValidURLA5() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.005'))
	}

	@And("User input HTTP Body A5")
	def inputValidDataA5() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A5")
	def clickButtonA5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A5")
	def verifystatusCodeA5() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.006
	@Given("User Set method to POST A6")
	def setValidA6() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A6")
	def setValidURLA6() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.006'))
	}

	@And("User input HTTP Body A6")
	def inputValidDataA6() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A6")
	def clickButtonA6() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A6")
	def verifystatusCodeA6() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.007
	@Given("User Set method to POST A7")
	def setValidA7() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A7")
	def setValidURLA7() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.007'))
	}

	@And("User input HTTP Body A7")
	def inputValidDataA7() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A7")
	def clickButtonA7() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A7")
	def verifystatusCodeA7() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.008
	@Given("User Set method to POST A8")
	def setValidA8() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A8")
	def setValidURLA8() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.008'))
	}

	@And("User input HTTP Body A8")
	def inputValidDataA8() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A8")
	def clickButtonA8() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A8")
	def verifystatusCodeA8() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.009
	@Given("User Set method to POST A9")
	def setValidA9() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A9")
	def setValidURLA9() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.009'))
	}

	@And("User input HTTP Body A9")
	def inputValidDataA9() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A9")
	def clickButtonA9() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A9")
	def verifystatusCodeA9() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.010
	@Given("User Set method to POST A10")
	def setValidA10() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A10")
	def setValidURLA10() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.010'))
	}

	@And("User input HTTP Body A10")
	def inputValidDataA10() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A10")
	def clickButtonA10() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A10")
	def verifystatusCodeA10() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.011
	@Given("User Set method to POST A11")
	def setValidA11() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A11")
	def setValidURLA11() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.011'))
	}

	@And("User input HTTP Body A11")
	def inputValidDataA11() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A11")
	def clickButtonA11() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A11")
	def verifystatusCodeA11() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.012
	@Given("User Set method to POST A12")
	def setValidA12() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A12")
	def setValidURLA12() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.012'))
	}

	@And("User input HTTP Body A12")
	def inputValidDataA12() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A12")
	def clickButtonA12() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A12")
	def verifystatusCodeA12() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.013
	@Given("User Set method to POST A13")
	def setValidA13() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A13")
	def setValidURLA13() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.013'))
	}

	@And("User input HTTP Body A13")
	def inputValidDataA13() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A13")
	def clickButtonA13() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A13")
	def verifystatusCodeA13() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.014
	@Given("User Set method to POST A14")
	def setValidA14() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A14")
	def setValidURLA14() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.014'))
	}

	@And("User input HTTP Body A14")
	def inputValidDataA14() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A14")
	def clickButtonA14() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A14")
	def verifystatusCodeA14() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.015
	@Given("User Set method to POST A15")
	def setValidA15() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A15")
	def setValidURLA15() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.015'))
	}

	@And("User input HTTP Body A15")
	def inputValidDataA15() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A15")
	def clickButtonA15() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A15")
	def verifystatusCodeA15() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.016
	@Given("User Set method to POST A16")
	def setValidA16() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A16")
	def setValidURLA16() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.016'))
	}

	@And("User input HTTP Body A16")
	def inputValidDataA16() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A16")
	def clickButtonA16() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A16")
	def verifystatusCodeA16() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.017
	@Given("User Set method to POST A17")
	def setValidA17() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A17")
	def setValidURLA17() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.017'))
	}

	@And("User input HTTP Body A17")
	def inputValidDataA17() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A17")
	def clickButtonA17() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A17")
	def verifystatusCodeA17() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.018
	@Given("User Set method to POST A18")
	def setValidA18() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A18")
	def setValidURLA18() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.018'))
	}

	@And("User input HTTP Body A18")
	def inputValidDataA18() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A18")
	def clickButtonA18() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A18")
	def verifystatusCodeA18() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.019
	@Given("User Set method to POST A19")
	def setValidA19() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A19")
	def setValidURLA19() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.019'))
	}

	@And("User input HTTP Body A19")
	def inputValidDataA19() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A19")
	def clickButtonA19() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request A19")
	def verifystatusCodeA19() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.patient.020
	@Given("User Set method to PUT A20")
	def setValidA20() {
		println ("Set method PUT")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients A20")
	def setValidURLA20() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/patient.020'))
	}

	@And("User input HTTP Body A20")
	def inputValidDataA20() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request A20")
	def clickButtonA20() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Method Not Allowed A20")
	def verifystatusCodeA20() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}
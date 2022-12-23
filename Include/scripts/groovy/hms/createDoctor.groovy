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



class createDoctor {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.doctor.001
	@Given("User Set method to POST F1")
	def setValidF1() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F1")
	def setValidURLF1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.001'))
	}

	@And("User input HTTP Body F1")
	def inputValidDataF1() {
		println ("input valid")
	}

	@And("User click button test Request F1")
	def clickButtonF1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK F1")
	def verifystatusCodeF1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.doctor.002
	@Given("User Set method to POST F2")
	def setValidF2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F2")
	def setValidURLF2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.002'))
	}

	@And("User input HTTP Body F2")
	def inputValidDataF2() {
		println ("input HTTP Body by blank nik")
	}

	@And("User click button test Request F2")
	def clickButtonF2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F2")
	def verifystatusCodeF2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.003
	@Given("User Set method to POST F3")
	def setValidF3() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F3")
	def setValidURLF3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.003'))
	}

	@And("User input HTTP Body F3")
	def inputValidDataF3() {
		println ("input HTTP Body by blank name")
	}

	@And("User click button test Request F3")
	def clickButtonF3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F3")
	def verifystatusCodeF3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.004
	@Given("User Set method to POST F4")
	def setValidF4() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F4")
	def setValidURLF4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.004'))
	}

	@And("User input HTTP Body F4")
	def inputValidDataF4() {
		println ("input HTTP Body by blank gender")
	}

	@And("User click button test Request F4")
	def clickButtonF4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F4")
	def verifystatusCodeF4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.005
	@Given("User Set method to POST F5")
	def setValidF5() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F5")
	def setValidURLF5() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.005'))
	}

	@And("User input HTTP Body F5")
	def inputValidDataF5() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F5")
	def clickButtonF5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F5")
	def verifystatusCodeF5() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.006
	@Given("User Set method to POST F6")
	def setValidF6() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F6")
	def setValidURLF6() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.006'))
	}

	@And("User input HTTP Body F6")
	def inputValidDataF6() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F6")
	def clickButtonF6() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F6")
	def verifystatusCodeF6() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.007
	@Given("User Set method to POST F7")
	def setValidF7() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F7")
	def setValidURLF7() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.007'))
	}

	@And("User input HTTP Body F7")
	def inputValidDataF7() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F7")
	def clickButtonF7() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F7")
	def verifystatusCodeF7() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.008
	@Given("User Set method to POST F8")
	def setValidF8() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F8")
	def setValidURLF8() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.008'))
	}

	@And("User input HTTP Body F8")
	def inputValidDataF8() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F8")
	def clickButtonF8() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F8")
	def verifystatusCodeF8() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.009
	@Given("User Set method to POST F9")
	def setValidF9() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F9")
	def setValidURLF9() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.009'))
	}

	@And("User input HTTP Body F9")
	def inputValidDataF9() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F9")
	def clickButtonF9() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F9")
	def verifystatusCodeF9() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.010
	@Given("User Set method to POST F10")
	def setValidF10() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F10")
	def setValidURLF10() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.010'))
	}

	@And("User input HTTP Body F10")
	def inputValidDataF10() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F10")
	def clickButtonF10() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F10")
	def verifystatusCodeF10() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.011
	@Given("User Set method to POST F11")
	def setValidF11() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F11")
	def setValidURLF11() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.011'))
	}

	@And("User input HTTP Body F11")
	def inputValidDataF11() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F11")
	def clickButtonF11() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F11")
	def verifystatusCodeF11() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.012
	@Given("User Set method to POST F12")
	def setValidF12() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F12")
	def setValidURLF12() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.012'))
	}

	@And("User input HTTP Body F12")
	def inputValidDataF12() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F12")
	def clickButtonF12() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F12")
	def verifystatusCodeF12() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.013
	@Given("User Set method to POST F13")
	def setValidF13() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F13")
	def setValidURLF13() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.013'))
	}

	@And("User input HTTP Body F13")
	def inputValidDataF13() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F13")
	def clickButtonF13() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F13")
	def verifystatusCodeF13() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.014
	@Given("User Set method to POST F14")
	def setValidF14() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F14")
	def setValidURLF14() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.014'))
	}

	@And("User input HTTP Body F14")
	def inputValidDataF14() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F14")
	def clickButtonF14() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F14")
	def verifystatusCodeF14() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.015
	@Given("User Set method to POST F15")
	def setValidF15() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F15")
	def setValidURLF15() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.015'))
	}

	@And("User input HTTP Body F15")
	def inputValidDataF15() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F15")
	def clickButtonF15() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F15")
	def verifystatusCodeF15() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.016
	@Given("User Set method to POST F16")
	def setValidF16() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F16")
	def setValidURLF16() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.016'))
	}

	@And("User input HTTP Body F16")
	def inputValidDataF16() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F16")
	def clickButtonF16() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F16")
	def verifystatusCodeF16() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.017
	@Given("User Set method to POST F17")
	def setValidF17() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F17")
	def setValidURLF17() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.017'))
	}

	@And("User input HTTP Body F17")
	def inputValidDataF17() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F17")
	def clickButtonF17() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F17")
	def verifystatusCodeF17() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.018
	@Given("User Set method to POST F18")
	def setValidF18() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F18")
	def setValidURLF18() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.018'))
	}

	@And("User input HTTP Body F18")
	def inputValidDataF18() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F18")
	def clickButtonF18() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F18")
	def verifystatusCodeF18() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.doctor.019
	@Given("User Set method to POST F19")
	def setValidF19() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors F19")
	def setValidURLF19() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/doctors")
		response = WS.sendRequest(findTestObject('doctor/TC Create doctor/doctor.019'))
	}

	@And("User input HTTP Body F19")
	def inputValidDataF19() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request F19")
	def clickButtonF19() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request F19")
	def verifystatusCodeF19() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
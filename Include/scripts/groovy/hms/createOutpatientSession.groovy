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



class createOutpatientSession {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.outpatientsession.001
	@Given("User Set method to POST L1")
	def setValidL1() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L1")
	def setValidURLL1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.001'))
	}

	@And("User input HTTP Body L1")
	def inputValidDataL1() {
		println ("input valid")
	}

	@And("User click button test Request L1")
	def clickButtonL1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK L1")
	def verifystatusCodeL1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.outpatientsession.002
	@Given("User Set method to POST L2")
	def setValidL2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L2")
	def setValidURLL2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.002'))
	}

	@And("User input HTTP Body L2")
	def inputValidDataL2() {
		println ("input HTTP Body by blank nik")
	}

	@And("User click button test Request L2")
	def clickButtonL2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L2")
	def verifystatusCodeL2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.003
	@Given("User Set method to POST L3")
	def setValidL3() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L3")
	def setValidURLL3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.003'))
	}

	@And("User input HTTP Body L3")
	def inputValidDataL3() {
		println ("input HTTP Body by blank name")
	}

	@And("User click button test Request L3")
	def clickButtonL3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L3")
	def verifystatusCodeL3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.004
	@Given("User Set method to POST L4")
	def setValidL4() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L4")
	def setValidURLL4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.004'))
	}

	@And("User input HTTP Body L4")
	def inputValidDataL4() {
		println ("input HTTP Body by blank gender")
	}

	@And("User click button test Request L4")
	def clickButtonL4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L4")
	def verifystatusCodeL4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.005
	@Given("User Set method to POST L5")
	def setValidL5() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L5")
	def setValidURLL5() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.005'))
	}

	@And("User input HTTP Body L5")
	def inputValidDataL5() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L5")
	def clickButtonL5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L5")
	def verifystatusCodeL5() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.006
	@Given("User Set method to POST L6")
	def setValidL6() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L6")
	def setValidURLL6() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.006'))
	}

	@And("User input HTTP Body L6")
	def inputValidDataL6() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L6")
	def clickButtonL6() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L6")
	def verifystatusCodeL6() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.007
	@Given("User Set method to POST L7")
	def setValidL7() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L7")
	def setValidURLL7() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.007'))
	}

	@And("User input HTTP Body L7")
	def inputValidDataL7() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L7")
	def clickButtonL7() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L7")
	def verifystatusCodeL7() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.008
	@Given("User Set method to POST L8")
	def setValidL8() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L8")
	def setValidURLL8() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.008'))
	}

	@And("User input HTTP Body L8")
	def inputValidDataL8() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L8")
	def clickButtonL8() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L8")
	def verifystatusCodeL8() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.009
	@Given("User Set method to POST L9")
	def setValidL9() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L9")
	def setValidURLL9() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.009'))
	}

	@And("User input HTTP Body L9")
	def inputValidDataL9() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L9")
	def clickButtonL9() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L9")
	def verifystatusCodeL9() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.010
	@Given("User Set method to POST L10")
	def setValidL10() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L10")
	def setValidURLL10() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.010'))
	}

	@And("User input HTTP Body L10")
	def inputValidDataL10() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L10")
	def clickButtonL10() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L10")
	def verifystatusCodeL10() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.011
	@Given("User Set method to POST L11")
	def setValidL11() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L11")
	def setValidURLL11() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.011'))
	}

	@And("User input HTTP Body L11")
	def inputValidDataL11() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L11")
	def clickButtonL11() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L11")
	def verifystatusCodeL11() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.012
	@Given("User Set method to POST L12")
	def setValidL12() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L12")
	def setValidURLL12() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.012'))
	}

	@And("User input HTTP Body L12")
	def inputValidDataL12() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L12")
	def clickButtonL12() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L12")
	def verifystatusCodeL12() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.013
	@Given("User Set method to POST L13")
	def setValidL13() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L13")
	def setValidURLL13() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.013'))
	}

	@And("User input HTTP Body L13")
	def inputValidDataL13() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L13")
	def clickButtonL13() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L13")
	def verifystatusCodeL13() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.outpatientsession.014
	@Given("User Set method to POST L14")
	def setValidL14() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions L14")
	def setValidURLL14() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/outoutpatientSession_sessions")
		response = WS.sendRequest(findTestObject('Patient/TC Create Patient/outpatientSession.014'))
	}

	@And("User input HTTP Body L14")
	def inputValidDataL14() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request L14")
	def clickButtonL14() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request L14")
	def verifystatusCodeL14() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}
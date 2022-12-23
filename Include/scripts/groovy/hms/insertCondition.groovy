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



class insertCondition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	// TC.insertcondition.001
	@Given("User Set method to POST Q1")
	def setValidQ1() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q1")
	def setValidURLQ1() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.001'))
	}

	@And("User input HTTP Body Q1")
	def inputValidDataQ1() {
		println ("input valid")
	}

	@And("User click button test Request Q1")
	def clickButtonQ1() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 200 OK Q1")
	def verifystatusCodeQ1() {
		println ("Show the verify result 200 OK")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// TC.insertcondition.002
	@Given("User Set method to POST Q2")
	def setValidQ2() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q2")
	def setValidURLQ2() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.002'))
	}

	@And("User input HTTP Body Q2")
	def inputValidDataQ2() {
		println ("input HTTP Body by blank nik")
	}

	@And("User click button test Request Q2")
	def clickButtonQ2() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q2")
	def verifystatusCodeQ2() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.003
	@Given("User Set method to POST Q3")
	def setValidQ3() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q3")
	def setValidURLQ3() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.003'))
	}

	@And("User input HTTP Body Q3")
	def inputValidDataQ3() {
		println ("input HTTP Body by blank name")
	}

	@And("User click button test Request Q3")
	def clickButtonQ3() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q3")
	def verifystatusCodeQ3() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.004
	@Given("User Set method to POST Q4")
	def setValidQ4() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q4")
	def setValidURLQ4() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.004'))
	}

	@And("User input HTTP Body Q4")
	def inputValidDataQ4() {
		println ("input HTTP Body by blank gender")
	}

	@And("User click button test Request Q4")
	def clickButtonQ4() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q4")
	def verifystatusCodeQ4() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.005
	@Given("User Set method to POST Q5")
	def setValidQ5() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q5")
	def setValidURLQ5() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.005'))
	}

	@And("User input HTTP Body Q5")
	def inputValidDataQ5() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request Q5")
	def clickButtonQ5() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q5")
	def verifystatusCodeQ5() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.006
	@Given("User Set method to POST Q6")
	def setValidQ6() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q6")
	def setValidURLQ6() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.006'))
	}

	@And("User input HTTP Body Q6")
	def inputValidDataQ6() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request Q6")
	def clickButtonQ6() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q6")
	def verifystatusCodeQ6() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.007
	@Given("User Set method to POST Q7")
	def setValidQ7() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q7")
	def setValidURLQ7() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.007'))
	}

	@And("User input HTTP Body Q7")
	def inputValidDataQ7() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request Q7")
	def clickButtonQ7() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q7")
	def verifystatusCodeQ7() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.008
	@Given("User Set method to POST Q8")
	def setValidQ8() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q8")
	def setValidURLQ8() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.008'))
	}

	@And("User input HTTP Body Q8")
	def inputValidDataQ8() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request Q8")
	def clickButtonQ8() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q8")
	def verifystatusCodeQ8() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.009
	@Given("User Set method to POST Q9")
	def setValidQ9() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q9")
	def setValidURLQ9() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.009'))
	}

	@And("User input HTTP Body Q9")
	def inputValidDataQ9() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request Q9")
	def clickButtonQ9() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q9")
	def verifystatusCodeQ9() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.010
	@Given("User Set method to POST Q10")
	def setValidQ10() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q10")
	def setValidURLQ10() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.010'))
	}

	@And("User input HTTP Body Q10")
	def inputValidDataQ10() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request Q10")
	def clickButtonQ10() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 400 Bad Request Q10")
	def verifystatusCodeQ10() {
		println ("Show the verify result 400 Bad Request")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	// TC.insertcondition.011
	@Given("User Set method to POST Q11")
	def setValidQ11() {
		println ("Set method POST")
	}

	@When("User Set URL http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions Q11")
	def setValidURLQ11() {
		println ("http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patient_conditions")
		response = WS.sendRequest(findTestObject('insertcondition/TC Create insertcondition/insertcondition.011'))
	}

	@And("User input HTTP Body Q11")
	def inputValidDataQ11() {
		println ("input HTTP Body by blank address")
	}

	@And("User click button test Request Q11")
	def clickButtonQ11() {
		println ("User click button test Request")
	}

	@Then("Show the verify result 405 Method Not Allowed Q11")
	def verifystatusCodeQ11() {
		println ("Show the verify result 405 Method Not Allowed")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}
}
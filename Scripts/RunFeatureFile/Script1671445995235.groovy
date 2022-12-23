import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CucumberKW.runFeatureFile('Include/features/Patient/createPatient.feature')

CucumberKW.runFeatureFile('Include/features/Patient/allPatient.feature')

CucumberKW.runFeatureFile('Include/features/Patient/patientID.feature')

CucumberKW.runFeatureFile('Include/features/Patient/updatePatient.feature')

CucumberKW.runFeatureFile('Include/features/Patient/deletePatient.feature')

CucumberKW.runFeatureFile('Include/features/Doctor/createDoctor.feature')

CucumberKW.runFeatureFile('Include/features/Doctor/allDoctor.feature')

CucumberKW.runFeatureFile('Include/features/Doctor/doctorID.feature')

CucumberKW.runFeatureFile('Include/features/Doctor/updateDoctor.feature')

CucumberKW.runFeatureFile('Include/features/Doctor/deleteDoctor.feature')

CucumberKW.runFeatureFile('Include/features/Outpatient Session/createoutpatientsessions.feature')

CucumberKW.runFeatureFile('Include/features/Outpatient Session/allOutpatientSession.feature')

CucumberKW.runFeatureFile('Include/features/Outpatient Session/outpatientsessionID.feature')

CucumberKW.runFeatureFile('Include/features/Outpatient Session/updateOutpatientSession.feature')

CucumberKW.runFeatureFile('Include/features/Outpatient Session/deleteOutpatientSession.feature')

CucumberKW.runFeatureFile('Include/features/Dashboard/dashboardWeb.feature')

CucumberKW.runFeatureFile('Include/features/Dashboard/dashboardMobile.feature')

CucumberKW.runFeatureFile('Include/features/Patient Condition/insertCondition.feature')

CucumberKW.runFeatureFile('Include/features/Patient Condition/patientConditionID.feature')


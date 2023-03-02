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

WebUI.scrollToElement(findTestObject('Web saucedemo/shopping cart'), GlobalVariable.generalTime)

WebUI.click(findTestObject('Web saucedemo/shopping cart'))

WebUI.waitForElementVisible(findTestObject('Web saucedemo/title cart'), GlobalVariable.generalTime)

WebUI.scrollToElement(findTestObject('Web saucedemo/button checkout'), GlobalVariable.generalTime)

WebUI.click(findTestObject('Web saucedemo/button checkout'))

WebUI.waitForElementVisible(findTestObject('Web saucedemo/title checkout'), GlobalVariable.generalTime)

WebUI.setText(findTestObject('Web saucedemo/input checkout firstname'), GlobalVariable.firstname)

WebUI.setText(findTestObject('Web saucedemo/input checkoutt lastname'), GlobalVariable.lastname)

WebUI.setText(findTestObject('Web saucedemo/input checkout postalcode'), GlobalVariable.postalcode)

WebUI.scrollToElement(findTestObject('Web saucedemo/button continue'), GlobalVariable.generalTime)

WebUI.click(findTestObject('Web saucedemo/button continue'))

WebUI.waitForElementVisible(findTestObject('Web saucedemo/title overview'), GlobalVariable.generalTime)

WebUI.scrollToElement(findTestObject('Web saucedemo/button finish'), GlobalVariable.generalTime)

WebUI.click(findTestObject('Web saucedemo/button finish'))

WebUI.takeScreenshot()

WebUI.closeBrowser()


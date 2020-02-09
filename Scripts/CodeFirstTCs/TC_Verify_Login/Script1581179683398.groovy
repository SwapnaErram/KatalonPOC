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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.testdata.ExcelData

 ExcelData testData =findTestData("LoginUsers")

for (def index : (0..testData.getRowNumbers()-1)) 
{
	  WebUI.openBrowser('')
	  WebUI.navigateToUrl('http://demoaut.katalon.com/profile.php')
		  
	  WebUI.setText(findTestObject('Page_Login/txt_UserName'), testData.getVaue("UserName", index))
	 
	  WebUI.setText(findTestObject('Page_Login/txt_Password'), testData.getValue("Password", index))
	  WebUI.click(findTestObject('Page_Login/btn_Login')) 
	  WebUI.verifyElementPresent(findTestObject('Page_CuraHomepage/btn_MakeAppointment'), 0) 
	  WebUI.closeBrowser()
	  }
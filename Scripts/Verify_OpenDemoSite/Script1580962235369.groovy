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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input_Username_txtPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/a_User Management'))

WebUI.setText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input_Username_searchSystemUseruserName'), 
    'sandeep')

WebUI.selectOptionByValue(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/select_AllAdminESS'), '1', 
    true)

WebUI.setText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input_Employee Name_searchSystemUseremploye_55f714'), 
    'sssss')

WebUI.selectOptionByValue(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/select_AllEnabledDisabled'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input_Status__search'))

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input_Status_btnAdd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/select_AdminESS'), '1', true)

WebUI.setText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input__systemUseremployeeNameempName'), 
    'jo')

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/li_John Smith'))

WebUI.setText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input__systemUseruserName'), 'sssssss')

WebUI.setEncryptedText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input__systemUserpassword'), '+9k2UH0SQUPaAwMU9vRMMA==')

WebUI.setEncryptedText(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input__systemUserconfirmPassword'), 
    '+9k2UH0SQUPaAwMU9vRMMA==')

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/div_Successfully Saved       Close'))

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/a_Welcome Admin'))

WebUI.click(findTestObject('Object Repository/orangeHRMlocators/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

WebUI.acceptAlert()


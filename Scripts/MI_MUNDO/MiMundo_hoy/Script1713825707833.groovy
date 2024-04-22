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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mimundo.upn.edu.pe/')

WebUI.setText(findTestObject('Object Repository/MI_MUNDO_HOY/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_loginfmt'), 
    'N00034693@upn.pe')

WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/MI_MUNDO_HOY/Page_Iniciar sesin/input_Se requiere JavaScript_Password'), 
    'UAj/HGe0ccIVqy0CyzR+uQ==')

WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_UPN Student Portal/img_Egresado_dash-close img-fluid'))

WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_UPN Student Portal/img_Egresado_dash-close img-fluid_1'))

WebUI.closeBrowser()


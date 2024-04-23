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

WebUI.setText(findTestObject('Object Repository/testtt/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_loginfmt'), 'n00034693@upn.pe')

WebUI.click(findTestObject('Object Repository/testtt/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/testtt/Page_Iniciar sesin/input_Se requiere JavaScript_Password'), 
    'UAj/HGe0ccIVqy0CyzR+uQ==')

WebUI.click(findTestObject('Object Repository/testtt/Page_Iniciar sesin/span_Iniciar sesin'))

// Close Modales

//WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_UPN Student Portal/img_Egresado_dash-close img-fluid'))

WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_UPN Student Portal/img_Egresado_dash-close img-fluid_1'))


//SOLICITUDES

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/div_SOLICITUDES'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/div_CONSOLIDADOS DE MATRCULA'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/div_CONSOLIDADOS DE MATRCULA_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.takeScreenshot('Imagenes/consolidadoMatricula.png')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/div_SOLICITUD CARTA DE PRESENTACIN'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/div_CARTA DE PRESENTACIN'))

WebUI.takeScreenshot('Imagenes/cartaPresentacion.png')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/div_DOCUMENTOS VIRTUALES'))

WebUI.switchToWindowTitle('Intranet - UPN')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_Intranet - UPN/a_JONATHAN SOLIER'))

WebUI.takeScreenshot('Imagenes/documentosViertuales.png')

WebUI.delay(5)

WebUI.switchToWindowTitle('UPN Student Portal')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/div_OTRAS SOLICITUDES'))

WebUI.switchToWindowTitle('Portal Tramites')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_Portal Tramites/h1_OTRAS SOLICITUDES'))

WebUI.takeScreenshot('Imagenes/tramites.png')

WebUI.delay(5)

WebUI.closeBrowser()


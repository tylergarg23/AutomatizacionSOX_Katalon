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

WebUI.navigateToUrl('https://intranet.upn.edu.pe/')

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Login - Intranet UPN/input_video_btnLoginDocente'))

WebUI.setText(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_loginfmt'), 
    'roger.villar@upn.pe')

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Iniciar sesin/input_Se requiere JavaScript_Password'), 
    '73owGZ5kgPQYKtu4U7bsvA==')

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Iniciar sesin/span_Iniciar sesin'))

WebUI.delay(2)

WebUI.switchToWindowTitle('Intranet UPN')

WebUI.takeScreenshot('Imagenes/loginPortalDocente.png')

WebUI.switchToWindowTitle('Intranet UPN')

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Intranet UPN/p_Acadmico'))

WebUI.switchToWindowTitle('Inicio - Portal Docentes')

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Inicio - Portal Docentes/button_OK'))

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Inicio - Portal Docentes/h5_Pgina Principal'))

WebUI.takeScreenshot('Imagenes/academico.png')

WebUI.closeWindowTitle('Inicio - Portal Docentes')

WebUI.switchToWindowTitle('Intranet UPN')

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Intranet UPN/p_Aula Virtual'))

WebUI.switchToWindowTitle('Página principal')

WebUI.click(findTestObject('Object Repository/PORTAL_DOCENTE_BASE/Page_Pgina principal/h3_Ayuda - Docente'))

WebUI.takeScreenshot('Imagenes/aulaVirtual.png')

WebUI.closeWindowTitle('Página principal')

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Login - Intranet UPN/input_video_btnLoginAdmin'))

WebUI.setText(findTestObject('Object Repository/INTRANET_BASE/Page_Login - Intranet UPN/input_Usuario_logUPNUserName'), 
    'tyc')

WebUI.setEncryptedText(findTestObject('Object Repository/INTRANET_BASE/Page_Login - Intranet UPN/input_Password_logUPNPassword'), 
    '1ns3yGZiMI+BR7VjE6GMQg==')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Login - Intranet UPN/input_Cambia tu clave aqu_logUPNLoginButton'))

WebUI.takeScreenshot('Imagenes/loginIntrane.png')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Intranet UPN/p_Direccin'))

WebUI.switchToWindowTitle('Inicio - Portal Dirección')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Inicio - Portal Direccin/h1_Documentos'))

WebUI.takeScreenshot('Imagenes/direccion.png')

WebUI.closeWindowTitle('Inicio - Portal Dirección')

WebUI.switchToWindowTitle('Intranet UPN')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Intranet UPN/p_Gestin Documental'))

WebUI.switchToWindowTitle('..::CRM | UPN::..')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_CRM  UPN/span_Guas'))

WebUI.takeScreenshot('Imagenes/gestionDocumental.png')

WebUI.closeWindowTitle('..::CRM | UPN::..')

WebUI.switchToWindowTitle('Intranet UPN')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Intranet UPN/p_Gestor de Contenidos'))

WebUI.switchToWindowTitle('.:: UNIVERSIDAD PRIVADA DEL NORTE - UPN Virtual ::.')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_UNIVERSIDAD PRIVADA DEL NORTE - UPN Virtual/label_Nombre de usuario'))

WebUI.takeScreenshot('Imagenes/gestorContenidos.png')

WebUI.closeWindowTitle('.:: UNIVERSIDAD PRIVADA DEL NORTE - UPN Virtual ::.')

WebUI.switchToWindowTitle('Intranet UPN')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Intranet UPN/p_Intranet'))

WebUI.switchToWindowTitle('Sistema de Intranet de la Universidad Privada del Norte')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Sistema de Intranet de la Universidad _3da85c/div_Bienvenido al Sistema de Intranet'))

WebUI.takeScreenshot('Imagenes/intranet.png')

WebUI.closeWindowTitle('Sistema de Intranet de la Universidad Privada del Norte')

WebUI.switchToWindowTitle('Intranet UPN')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Intranet UPN/p_Reservas Online'))

WebUI.switchToWindowTitle('Universidad Privada del Norte - Reservas Online')

WebUI.click(findTestObject('Object Repository/INTRANET_BASE/Page_Universidad Privada del Norte - Reserv_040ce1/h2_Bienvenido al sistema de reservas online'))

WebUI.takeScreenshot('Imagenes/reservasOnline.png')

WebUI.closeWindowTitle('Universidad Privada del Norte - Reservas Online')

WebUI.delay(2)

WebUI.closeBrowser()


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

WebUI.setText(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_loginfmt'), 
    'n00034693@upn.pe')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_Iniciar sesin en la cuenta/input_Iniciar sesin_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_Iniciar sesin/input_Se requiere JavaScript_Password'), 
    'UAj/HGe0ccIVqy0CyzR+uQ==')

WebUI.click(findTestObject('Object Repository/testtt/Page_Iniciar sesin/span_Iniciar sesin'))

// Close Modales

//WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_UPN Student Portal/img_Egresado_dash-close img-fluid'))

WebUI.click(findTestObject('Object Repository/MI_MUNDO_HOY/Page_UPN Student Portal/img_Egresado_dash-close img-fluid_1'))

WebUI.delay(5)
//Img Home
WebUI.takeScreenshot('Imagenes/miMundoHome.png')

WebUI.waitForPageLoad(15)

// img Pagos Mi Mundo
WebUI.takeScreenshot('Imagenes/pagosMiMundo.png')

WebUI.switchToWindowTitle('UPN Student Portal')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/div_CURSO'))

WebUI.delay(5)

//img curso
WebUI.takeScreenshot('Imagenes/cursos.png')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/div_Notas'))

//img notas
WebUI.takeScreenshot('Imagenes/notas.png')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/div_Documentos'))

WebUI.delay(5)

//img documentos
WebUI.takeScreenshot('Imagenes/documentosMiMundo.png')


WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/div_Mis Servicios'))

WebUI.delay(5)

//img mis servicios
WebUI.takeScreenshot('Imagenes/misServicios.png')


WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/div_Cursos Historicos'))

WebUI.delay(5)

//img cursos historicos
WebUI.takeScreenshot('Imagenes/cursosHistoricos.png')


WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/i_SOLICITUDES_fa drop_icon fa-angle-up'))

//img final page
WebUI.takeScreenshot('Imagenes/finalPageMiMundo.png')

// SOLICITUDES //


WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img'))

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_UPN Student Portal (1)/img_NOTIFICACIN_logo pointer'))

WebUI.click(findTestObject('PORTAL_MIMUNDO_BASE/Page_UPN Student Portal/img_VER TODOS_img-fluid rounded_img img_ser_bae34f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('Perfil del alumno')

WebUI.click(findTestObject('Object Repository/PORTAL_MIMUNDO_BASE/Page_Perfil del alumno/h1_Perfil del alumno -  JONATHAN MICHAEL SO_1e31d7'))

// Img Matricula en Linea
WebUI.takeScreenshot('Imagenes/matriculaEnLinea.png')


WebUI.closeBrowser()


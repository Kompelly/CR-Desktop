import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/sample/Mega menu/a_Shoes'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/sneakers'))

WebUI.click(findTestObject('Collection page/product 3'))

WebUI.click(findTestObject('product page/White color variant'))

WebUI.click(findTestObject('product page/Size -6'))

WebUI.click(findTestObject('product page/span_Add to Bag (2)'))

WebUI.click(findTestObject('Cart flyout/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('product page/size -7'))

WebUI.click(findTestObject('product page/span_Add to Bag (2)'))

WebUI.click(findTestObject('Cart flyout/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/a_Jeans'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/Boy friend jeans'))

WebUI.click(findTestObject('Collection page/Product 2'))

WebUI.click(findTestObject('product page/size -18'))

WebUI.click(findTestObject('product page/span_Add to Bag (1)'))

WebUI.click(findTestObject('Cart flyout/cart collpase'))

WebUI.click(findTestObject('product page/size -20'))

WebUI.click(findTestObject('product page/span_Add to Bag (1)'))

WebUI.click(findTestObject('Cart flyout/cart collpase'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/a_Accessories'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/Scarves'))

WebUI.click(findTestObject('Collection page/product 1'))

WebUI.click(findTestObject('product page/Size - one size'))

WebUI.click(findTestObject('product page/Add to bag'))

WebUI.click(findTestObject('Cart flyout/Checkout'))

WebUI.setText(findTestObject('Customer info page/Email'), 'suman@gmail.com')

WebUI.setText(findTestObject('Customer info page/First name'), 'suman')

WebUI.setText(findTestObject('Customer info page/Last name'), 'kompelly')

WebUI.setText(findTestObject('Customer info page/Address'), '123 saint alxendre')

WebUI.setText(findTestObject('Customer info page/apt suite'), '199')

WebUI.setText(findTestObject('Customer info page/City'), 'montreal')

WebUI.selectOptionByValue(findTestObject('Customer info page/state dropdown'), 'NJ', true)

WebUI.setText(findTestObject('Customer info page/Zip code'), '07057')

WebUI.click(findTestObject('Customer info page/Continue to shipping'))

WebUI.click(findTestObject('Payment page/Continue to payment'))

WebUI.openBrowser('')

WebUI.click(findTestObject('Cart flyout/cart quantity increase - cart flyout'))

WebUI.setText(findTestObject('Cart flyout/Input update - cart flyout'), '4')

WebUI.click(findTestObject('Cart flyout/click outside'))

WebUI.click(findTestObject('Cart flyout/click outside'))

WebUI.click(findTestObject('Page_High Top Slip On Sneaker  Char/span_14.99'))

WebUI.click(findTestObject('Page_High Top Slip On Sneaker  Char/div_21.94'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.setText(findTestObject('CR-DESKTOP/Cart page/input update qunatity'), '4')

WebUI.click(findTestObject('CR-DESKTOP/Cart page/td_Quantity'))

WebUI.setText(findTestObject('CR-DESKTOP/Cart page/input update qunatity'), '6')

WebUI.click(findTestObject('CR-DESKTOP/Cart page/td_Quantity'))

WebUI.click(findTestObject('CR-DESKTOP/Cart page/Get price - subtotal - cart page'))

WebUI.click(findTestObject('CR-DESKTOP/Cart page/Update cart'))

WebUI.click(findTestObject('CR-DESKTOP/Cart page/Check out - cart page'))


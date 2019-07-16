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

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/a_Shoes'))

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/sneakers'))

WebUI.click(findTestObject('CR-DESKTOP/Collection page/product 3'))

WebUI.click(findTestObject('CR-DESKTOP/product page/White color variant'))

WebUI.click(findTestObject('CR-DESKTOP/product page/Size -6'))

WebUI.click(findTestObject('CR-DESKTOP/product page/span_Add to Bag (2)'))

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('CR-DESKTOP/product page/size -7'))

WebUI.click(findTestObject('CR-DESKTOP/product page/span_Add to Bag (2)'))

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/a_Jeans'))

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/Boy friend jeans'))

WebUI.click(findTestObject('CR-DESKTOP/Collection page/Product 2'))

WebUI.click(findTestObject('CR-DESKTOP/product page/size -18'))

WebUI.click(findTestObject('CR-DESKTOP/product page/span_Add to Bag (1)'))

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart collpase'))

WebUI.click(findTestObject('CR-DESKTOP/product page/size -20'))

WebUI.click(findTestObject('CR-DESKTOP/product page/span_Add to Bag (1)'))

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart collpase'))

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/a_Accessories'))

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/Scarves'))

WebUI.click(findTestObject('CR-DESKTOP/Collection page/product 1'))

WebUI.click(findTestObject('CR-DESKTOP/product page/Size - one size'))

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/Checkout'))

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Email'), 'suman@gmail.com')

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/First name'), 'suman')

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Last name'), 'kompelly')

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Address'), '123 saint alxendre')

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/apt suite'), '199')

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/City'), 'montreal')

WebUI.selectOptionByValue(findTestObject('CR-DESKTOP/Customer info page/state dropdown'), 'NJ', true)

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Zip code'), '07057')

WebUI.click(findTestObject('CR-DESKTOP/Customer info page/Continue to shipping'))

WebUI.click(findTestObject('CR-DESKTOP/Payment page/Continue to payment'))


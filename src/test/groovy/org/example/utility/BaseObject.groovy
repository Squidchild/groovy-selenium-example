package org.example.utility

import org.example.coca_cola.page_objects.*

class BaseObject {
	Browser browser = new Browser()

	CokeHomePage cokeHomePage = new CokeHomePage(browser)
	CokeFaqPage cokeFaqPage = new CokeFaqPage(browser)
	HomePage homePage = new HomePage(browser)
	AboutPage aboutPage = new AboutPage(browser)
	ContactPage contactPage = new ContactPage(browser)

}

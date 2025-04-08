package org.example.coca_cola.page_objects

import org.example.utility.Browser
import org.openqa.selenium.By

class ContactPage extends BasePage {
	ContactPage(Browser browser) {
		super(browser)
		this.url = "http://imthirsty.servebeer.com/contact.html"
		this.atChecker = By.cssSelector("""#contact-text""")
	}

	private By aboutLink = By.cssSelector("""#about-link-contact""")
	private By homeLink = By.cssSelector("""#home-link-contact""")
	private By redText = By.cssSelector(".highlight")

	void clickAboutLink() {
		browser.click(aboutLink)
	}

	void clickHomeLink() {
		browser.click(homeLink)
	}

	String readRedText(){
		return browser.getText(redText)
	}

}

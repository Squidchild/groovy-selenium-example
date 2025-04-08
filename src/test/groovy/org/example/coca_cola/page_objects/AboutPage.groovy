package org.example.coca_cola.page_objects

import org.example.utility.Browser
import org.openqa.selenium.By

class AboutPage extends BasePage {
	AboutPage(Browser browser) {
		super(browser)
		this.url = "http://imthirsty.servebeer.com/about.html"
		this.atChecker = By.cssSelector("""#about-text""")
	}

	private By homeLink = By.cssSelector("""#home-link-contact""")
	private By contactLink = By.cssSelector("""#contact-link-about""")

	void clickHomeLink() {
		browser.click(homeLink)
	}

	void clickContactLink() {
		browser.click(contactLink)
	}
}

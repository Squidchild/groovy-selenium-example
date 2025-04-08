package org.example.coca_cola.page_objects

import org.example.utility.Browser
import org.openqa.selenium.By

class HomePage extends BasePage {
	HomePage(Browser browser) {
		super(browser)
		this.url = "http://imthirsty.servebeer.com/index.html"
		this.atChecker = By.cssSelector("""#intro-text""")
	}

	private By aboutLink = By.cssSelector("""#about-link""")
	private By contactLink = By.cssSelector("""#contact-link""")

	void clickAboutLink() {
		browser.click(aboutLink)
	}

	void clickContactLink() {
		browser.click(contactLink)
	}

}
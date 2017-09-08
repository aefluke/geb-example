import geb.Browser

import pages.HomePage

Browser.drive{
	
	to HomePage
	
	"enter search key"("deneme")
	"click search"()
}
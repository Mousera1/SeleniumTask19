# SeleniumTask19
Possible locators code for individual fields.

Full name field:-
ID Locator:  WebElement nameField = driver.findElement(By.id("name"));
Class Name: WebElement fullname = driver.findElement(By.className("form-control"));
TagName:     WebElement nameField = driver.findElement(By.tagName("input"));
cssSelector: WebElement nameField = driver.findElement(By.cssSelector("#name"));
	     WebElement nameField = driver.findElement(By.cssSelector("input[id^='na']"));
             WebElement nameField = driver.findElement(By.cssSelector("input[id$='me']"));
             WebElement nameField = driver.findElement(By.cssSelector("[id='name']"));
xpath:       WebElement nameField = driver.findElement(By.xpath("//input[@id='name']"));//single attribute
	     WebElement nameField = driver.findElement(By.xpath("//input[@id='name'][@class='form-control']"));// multiple attribute
	     WebElement nameField = driver.findElement(By.xpath("//input[contains(@id,'name')]")); //contains method


Email Address Field:-

ID Locator:  WebElement email = driver.findElement(By.id("email"));
TagName:     WebElement email = driver.findElement(By.tagName("input"));
cssSelector: WebElement email = driver.findElement(By.cssSelector("#email"));

	     WebElement email = driver.findElement(By.cssSelector("input[id^='em']"));
             WebElement email = driver.findElement(By.cssSelector("input[id$='il']"));
             WebElement email = driver.findElement(By.cssSelector("[id='email']"));
xpath:       WebElement email = driver.findElement(By.xpath("//input[@id='email']"));


PassWord Field:-
ID Locator:  WebElement password = driver.findElement(By.id("password"));

Class Name: WebElement fullname = driver.findElement(By.className("form-control"));
TagName:     WebElement nameField = driver.findElement(By.tagName("input"));
cssSelector: WebElement password = driver.findElement(By.cssSelector("#password"));

	     WebElement nameField = driver.findElement(By.cssSelector("input[id^='pa']"));
             WebElement nameField = driver.findElement(By.cssSelector("input[id$='rd']"));
             WebElement nameField = driver.findElement(By.cssSelector("[id='password']"));
xpath:       WebElement nameField = driver.findElement(By.xpath("//input[@id='password']"));

Mobile Number Field:-

ID Locator:  WebElement mobile = driver.findElement(By.id("mobileNumber"));


Class Name: WebElement password = driver.findElement(By.className("form-control"));
TagName:     WebElement password = driver.findElement(By.tagName("input"));
cssSelector: WebElement password = driver.findElement(By.cssSelector("#mobileNumber"));

	     WebElement password = driver.findElement(By.cssSelector("input[id^='mo']"));
             WebElement password = driver.findElement(By.cssSelector("input[id$='er']"));
             WebElement password = driver.findElement(By.cssSelector("[id='password']"));
xpath:       WebElement password = driver.findElement(By.xpath("//input[@id='mobileNumber']"));

Sign Up button Field:-
ID Locator:  WebElement signup = driver.findElement(By.id("signup-btn"));

Class Name: WebElement password = driver.findElement(By.className("form-control"));
TagName:     WebElement password = driver.findElement(By.tagName("input"));
cssSelector: WebElement password = driver.findElement(By.cssSelector("#signup-btn"));

	     WebElement password = driver.findElement(By.cssSelector("[id='signup-btn']"));
xpath:       WebElement password = driver.findElement(By.xpath("//input[@id='signup-btn']"));

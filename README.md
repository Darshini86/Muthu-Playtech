# Playtech Automation by Muthu

Created Bdd cucumber framework and validated the below Assertions.
Assertion validate below values--
Number of Employees,
Number of countries Playtech has offices,
Global licensees

For corssbrowser we can support initialize browser details in Runner class using @beforeclass and which browser we want to run we can give it in runner class
or we can use desiredcapability for cross browser testing if we plan to use Browserstack or perfecto.

@BeforeClass
public static void before() {   

       String browserName=System.getenv("browserName");
    if (browserName
            .equalsIgnoreCase("Chrome")) {
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriverNew\\chromedriver.exe");
        driver=new ChromeDriver(); 
    } else if (browserName
            .equalsIgnoreCase("Firefox")) {
        //Set gecko driver path and initiate firefox 
    } else if (browserName
            .equalsIgnoreCase("IE")) {
        //Set IEDriver path and initiate IE
    } else {
        logger.debug("Error Message----> "
                + "browser name not mentioned properly");
        System.exit(0);
    }
           driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
 }
 
 @After()
public void closeBrowser()
{
driver.quit();
}

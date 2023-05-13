package project_Test_my_site;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JUnit_Test {

	WebDriver driver;

	@BeforeEach
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA John Bryce\\Java\\Selenium\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("///D:/QA%20John%20Bryce/HTML.CSS.JS/Project/ContactUs.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//=================================================================================
	//=================================================================================
	//fill all fields, check boxes, radio buttons
	@Test
	void tofes() {
		Test_Page test_page = new Test_Page(driver);
		test_page.typeFirstName("Eliya");
		test_page.typelastName("Pitkis");
		test_page.choosekidomet("052");
		test_page.typephone("9942777");
		test_page.typemy_email("eliya.pitkis@gmail.com");
		test_page.clickcheckbox_BNIA();
		test_page.clickcheck_box_gel();
		test_page.clickcheck_box_hish();
		test_page.clicknisaion();
		test_page.chooseADIFUT("קורס ערב");
		test_page.typemessage("Hi. I love your curses!");
		test_page.clicksend();
	}
	//=============================================================================
	//=============================================================================
	//check default in fields
	@Test 
	void dfault_test() {
		Test_Page test_page = new Test_Page(driver);
		assertEquals("", test_page.firstNameValue());
		assertEquals("", test_page.lastNameValue());
		assertEquals("054", test_page.kidometValue());
		assertEquals("", test_page.phoneValue());
		assertEquals("", test_page.my_emailValue());
		assertTrue(test_page.checkbox_BNIAValue());
		assertTrue(test_page.noNicaionValue());
		assertEquals("", test_page.messageValue());
	}
	//==================================================================================================
	//==================================================================================================
	// check how much check boxes there are
	@Test
	void kamut() {
		Test_Page test_page = new Test_Page(driver);
		assertEquals(4, test_page.ch_kamut());
		assertEquals(4, test_page.rdb_kamut());
	}
	//				int ch_kamut = driver.findElements(By.cssSelector("input[type='checkbox']")).size();{
	//		
	//					if (ch_kamut == 4)
	//						System.out.println("Test 'check box kamut' passed. There are "+ ch_kamut + " check boxes." );
	//					else
	//						System.out.println("Test 'check box kamut' failed. There are "+ ch_kamut + " check boxes.");
	//				}
	//				// check how much radio buttons there are
	//				int rdb_kamut = driver.findElements(By.name("nisaion")).size();{
	//		
	//					if (rdb_kamut == 4)
	//						System.out.println("Test 'radio button kamut' passed. There are "+ rdb_kamut + " radio buttons." );
	//					else
	//						System.out.println("Test 'radio button kamut' failed. There are "+ rdb_kamut + " radio buttons.");
	//				}
	//			}
	//====================================================================================================
	//====================================================================================================
	// Go to Curses page, and check 'mishpat'
	@Test
	void Curses() {
		Test_Page test_page = new Test_Page(driver);
		test_page.clickCurses();
		assertEquals("Happiness cannot be bought with money, but with it you can get beautiful nails!", test_page.bdikat_mishpatText());
		System.out.println(test_page.bdikat_mishpatText());
	}
	//====================================================================================================
	//====================================================================================================
	@AfterEach
	void close() {
		driver.close();
	}
}


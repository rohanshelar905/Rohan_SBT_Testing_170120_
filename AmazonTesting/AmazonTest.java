package AmazonTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement product;
		product=driver.findElement(By.id("twotabsearchtextbox"));	
		
		product.sendKeys("bru");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.get("https://www.amazon.in/Bru-Instant-coffee-100g/dp/B00T7GB570/ref=sr_1_1_sspa?keywords=bru&qid=1579256889&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyVDdMNUI5QVFQOEtQJmVuY3J5cHRlZElkPUEwMDA2NDMyMkg3TkdWMUFHUEY3UyZlbmNyeXB0ZWRBZElkPUEwMTU1Mjg0RkE0NVJDVUE2MDA5JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		driver.findElement(By.id("add-to-cart-button")).click();		
		
		driver.get("https://www.amazon.in/");
		product=driver.findElement(By.id("twotabsearchtextbox"));	
		product.clear();
		product.sendKeys("knife");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.get("https://www.amazon.in/Shun-DM0702-Classic-7-Inch-Santoku/dp/B0000Y7KFO/ref=redir_mobile_desktop?_encoding=UTF8&aaxitk=vYV-v51nUhB0uTan3fZtmQ&hsa_cr_id=6995463920902&ref_=sb_s_sparkle_slot");
		driver.findElement(By.id("add-to-cart-button")).click();

		driver.get("https://www.amazon.in/");
		product=driver.findElement(By.id("twotabsearchtextbox"));	
		product.clear();
		product.sendKeys("socks");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.get("https://www.amazon.in/Navy-Sport-Solid-Ankle-Length/dp/B073WX582T/ref=sxin_4_ac_d_rm?ac_md=0-0-c29ja3M%3D-ac_d_rm&cv_ct_cx=socks&keywords=socks&pd_rd_i=B073WX582T&pd_rd_r=251a501d-8a68-4d1d-b51a-833b256a101a&pd_rd_w=QZC53&pd_rd_wg=aSUmY&pf_rd_p=aefb8402-5202-48b1-a69a-2fbb0aa2f3c0&pf_rd_r=FXJ93E7QYM9757KXRV04&psc=1&qid=1579258060");
		driver.findElement(By.id("add-to-cart-button")).click();

		driver.get("https://www.amazon.in/");
		product=driver.findElement(By.id("twotabsearchtextbox"));	
		product.clear();
		product.sendKeys("iphone 11");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.get("https://www.amazon.in/dp/B07XVMDRZY?aaxitk=kfF1VxGwDOSjOq-UuTlMbg&pd_rd_i=B07XVMDRZY&pf_rd_p=2e3653de-1bdf-402d-9355-0b76590c54fe&hsa_cr_id=3389370700402&sb-ci-n=asinImage&sb-ci-v=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FI%2F51kGDXeFZKL.jpg&sb-ci-a=B07XVMDRZY");
		driver.findElement(By.id("add-to-cart-button")).click();

		driver.findElement(By.id("nav-cart")).click();
		
		try
		{
			FileInputStream fi = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Testing\\AmazonTest.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook (fi);
			XSSFSheet sh = wb.getSheetAt(0);

			//int Count = 0;
			WebElement s = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61cKyQznkIL._AC_AA180_.jpg']"));
			System.out.println(s.getAttribute("alt"));
			
			s = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51I-XwhdPaL._AC_AA180_.jpg']"));
			System.out.println(s.getAttribute("alt"));
			
			s = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51kGDXeFZKL._AC_AA180_.jpg']"));
			System.out.println(s.getAttribute("alt"));

			s = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71nTxKhiqrL._AC_AA180_.jpg']"));
			System.out.println(s.getAttribute("alt"));

			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
}

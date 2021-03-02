package com.quinbay.qa.training.test;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
public class FirstSeleniumExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Thread.sleep(3000);
        //WebElement searchBox= driver.findElement(By.xpath("//input[@type='search']"));
        WebElement searchBox= driver.findElement(By.xpath("//input[@type='search']"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        List <WebElement>elements= driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        if(elements.isEmpty())
        {
            System.out.println("/n/n element not found");

        }
        else
        {
            //driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[2]/main[1]/ul[1]/li[2]/a[2]")).click();
            //System.out.println("/n/n element found");
            System.out.println("/n/n  element found");
        }
        //List <WebElement>elements= driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        //driver.findElement(By.cssSelector(".entry-summary button")).click();
        //driver.findElement(By.xpath("//*[contains(text(),'Add to cart')]")).click();
        WebElement button = driver.findElement(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        button.click();
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/a[1]")).click();
        WebElement button1= driver.findElement(By.xpath("//header/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]"));
        ////a[contains(text(),'Proceed to checkout')]
        button1.click();
        WebElement name= driver.findElement(By.cssSelector("#billing_first_name"));
       // name.click();
        name.sendKeys("Priyanka");
        name.sendKeys(Keys.RETURN);


        WebElement secname= driver.findElement(By.xpath("//input[@id='billing_last_name']"));
        //secname.click();
        secname.sendKeys("Kumar");
        secname.sendKeys(Keys.RETURN);


        WebElement comname= driver.findElement(By.xpath("//input[@id='billing_company']"));
        //comname.click();
        comname.sendKeys("quinbay");
        comname.sendKeys(Keys.RETURN);

       //WebElement location= driver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]"));
        //location.click();
        //location.sendKeys("India");

        WebElement address= driver.findElement(By.xpath("//input[@id='billing_address_1']"));
        //address.click();
        address.sendKeys("abcdef");
        address.sendKeys(Keys.RETURN);

        WebElement address1= driver.findElement(By.xpath("//input[@id='billing_city']"));
        //address1.click();
        address1.sendKeys("xyz");
        address1.sendKeys(Keys.RETURN);


       /* WebElement address2= driver.findElement(By.cssSelector(""));
        address2.click();
        WebElement addresss= driver.findElement(By.xpath("//body/span[1]/span[1]/span[1]/input[1]"));
        addresss.sendKeys("Tamil Nadu");
        addresss.sendKeys(Keys.RETURN);

        Select drpCountry = new Select(driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/form[3]/div[1]/div[1]/div[1]/div[1]/p[8]/span[1]/span[1]/span[1]/span[1]")));
        drpCountry.selectByVisibleText("Tamil Nadu");

*/      WebElement State=driver.findElement(By.xpath("//select[@name='billing_state']"));

        Select sel=new Select(State);
        sel.selectByVisibleText("Karnataka");

        WebElement zip= driver.findElement(By.xpath("//input[@id='billing_postcode']"));
        //zip.click();
        zip.sendKeys("641001");
        Thread.sleep(3000);

        WebElement phone= driver.findElement(By.xpath("//input[@id='billing_phone']"));
        //phone.click();
        phone.sendKeys("123456789");

        WebElement email= driver.findElement(By.xpath("//input[@id='billing_email']"));
        //zip.click();
        email.sendKeys("aaaaa@gmail.com");
        Thread.sleep(3000);
        WebElement Place_order=driver.findElement(By.xpath("//button[@id='place_order']"));
        Place_order.click();

        Thread.sleep(3000);
        driver.close();
    }
}

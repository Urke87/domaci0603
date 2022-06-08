
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class BasePage {
    /*Otići na https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login.
Test 1: Logovanje kao Bank Manager
Test 2: Kreiranje Customera
Test 3: Kreiranje Accounta za tog Customera
Test 4: Logovanje kao Customer
Test 5: Uspešan Deposit za nekog Customera
Test 6: Uspešan Withdrawal za nekog Customera
Test 7: Logout za Bank Managera
Test 8: Logout za Customera
Prolaz (ocena 3) - Testovi 1, 2, 4, 5.
Obavezno koristiti POM.*/


        private WebDriver driver;
        private WebDriverWait driverWait;

        public BasePage(WebDriver driver, WebDriverWait driverWait) {
            this.driver = driver;
            this.driverWait = driverWait;
        }

        public WebDriver getDriver() {
            return driver;
        }

        public void setDriver(WebDriver driver) {
            this.driver = driver;
        }

        public WebDriverWait getDriverWait() {
            return driverWait;
        }

        public void setDriverWait(WebDriverWait driverWait) {
            this.driverWait = driverWait;
        }

        public void clearField(By locator) {
            driver.findElement(locator).clear();
        }

        public void threadWait() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


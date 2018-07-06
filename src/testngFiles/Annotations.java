package testngFiles;

import org.testng.annotations.*;

public class Annotations {

    //Before method is a prerequisite
    @BeforeMethod
    public void userIdGeneration(){
        System.out.println("User Id Generation");
    }

    @BeforeTest
    public void cookies(){
        System.out.println("Cookies");
    }

    @Test
    public void openBrowser(){
        System.out.println("test");
    }

    @Test
    public void login(){
        System.out.println("Login");
    }

    //After method is a post requisite
    @AfterTest
    public void starPage(){
        System.out.println("Login Success");
    }

    @AfterMethod
    public void reporting(){
        System.out.println("Reporting");
    }
}

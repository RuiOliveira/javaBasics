package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {

    @BeforeSuite
    public void installSoftware(){
        System.out.println("Iam the first!");
    }

    @AfterSuite
    public void uninstallSoftware(){
        System.out.println("Iam the last!");
    }
}

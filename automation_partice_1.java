package TestCases;

import Page_Object_Model.Base_Page_Object;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class automation_partice_1 {

    WebDriver ram=new ChromeDriver();

    @BeforeTest
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/Chromedriver/chromedriver.exe");
        ram.get("https://www.automationexercise.com");
        ram.manage().window().maximize();

    }

//    @Test
//    public void FirstTest() {
//
////        ram.findElement(By.id("name")).sendKeys("ram Prasad");
////        ram.findElement(By.id("email")).sendKeys("ram123@gmail.com");
////        ram.findElement(By.id("gender")).click();
//
//        ram.findElement (By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")) .click();
//        ram.findElement (By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Ramesh");
//        ram.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("mimo22001@gmail.com");
//        ram.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
//
//        // Enter Account Information
//        ram.findElement(By.id("uniform-id_gender1")).click();
//        ram.findElement(By.id("name")).sendKeys("Ram");
//        ram.findElement(By.id("password")).sendKeys("Ramesh783@@##");
//        ram.findElement(By.id("days")).sendKeys("15");
//        ram.findElement(By.id("months")).sendKeys("12");
//        ram.findElement(By.id("years")).sendKeys("2020");
//        ram.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[6]/label")).click();
//        ram.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[7]/label")).click();
//
//
//        //Address Information
//        ram.findElement(By.id("first_name")).sendKeys("Ram");
//        ram.findElement(By.id("last_name")).sendKeys("Ramesh");
//        ram.findElement(By.id("company")).sendKeys("Trillion Tower ltd");
//        ram.findElement(By.id("address1")).sendKeys("Sanepa");
//        ram.findElement(By.id("address2")).sendKeys("Sanepa");
//        ram.findElement(By.id("country")).sendKeys("Nepal");
//        ram.findElement(By.id("state")).sendKeys("Bagmati");
//        ram.findElement(By.id("city")).sendKeys("Lalitpur");
//        ram.findElement(By.id("zipcode")).sendKeys("12345");
//        ram.findElement(By.id("mobile_number")).sendKeys("+9779865777777");
//        ram.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")) .click();
//        ram.findElement(By.xpath("/html/body/section/div/div/div/div/a")) .click();
//
//
//
//    }


    //Assertion to verify for testcase
    //Verify that home page is visible successfully


    @Test
    public void Homepage() {
        Base_Page_Object Hpage = new Base_Page_Object(ram);
        Hpage.Homepage();

    }





    //Verify 'New User Signup!' is visible
    @Test
    public void New_user_signup() {
        Base_Page_Object Newusersignup = new Base_Page_Object(ram);
        Newusersignup.Click_Signup_navbar();
        Newusersignup.User_signup();

    }





    // Verify that Enter Account Information is Visible
    @Test void Account_Information() {

        Base_Page_Object A_information = new Base_Page_Object(ram);
        A_information.Account_information_page();
        A_information.Enter_username("Ramesh");
        A_information.Enter_gmail("amirkhan22001@gmail.com");
        A_information.Click_Button();
        A_information.Account_information();


    }




    // Verify that detail is visible: product name, category, price, availability, condition, brand
    @Test void Product_detail() {

        Base_Page_Object P_detail = new Base_Page_Object(ram);
        P_detail.Product_detail_page();
        P_detail.Click_on_product();
        P_detail.Product_Bluetop();
        P_detail.Product_Price();
        P_detail.Product_Aviable();
        P_detail.Product_Condition();
        P_detail.Product_Brand();
    }




    //Verify error 'Email Address already exist!' is visible
    @Test void Email_exists_Test() {


        Base_Page_Object E_address_exits = new Base_Page_Object(ram);
        E_address_exits.Email_address_page();
        E_address_exits.Enter_name("Kaliya");
        E_address_exits.Enter_email("mimy22001@gmail.com");
        E_address_exits.click_on_button();
        E_address_exits.Verify_Email_address();




    }









    //Verify that 'ACCOUNT CREATED!' is visible
    @Test
    public void Account_created_visible()

    {
        Base_Page_Object Account_created_visible = new Base_Page_Object(ram);

        Account_created_visible.Click_on_Signup_navbar();
        Account_created_visible.Enter_username_feild("Ramesh");
        Account_created_visible.Enter_useremail_feild("rosee22001@gmail.com");
        Account_created_visible.Click_on_Signup_button();

        Account_created_visible.Enter_account_info_Tittle();
        Account_created_visible.Enterusername("Dogeshvai");
        Account_created_visible.Enter_password_feild("123Dogeshvai");
        Account_created_visible.Enter_days_of_birth("15");
        Account_created_visible.Enter_month_of_birth("12");
        Account_created_visible.Enter_year_of_birth("2020");
        Account_created_visible.Signup_for_news_letter_check();
        Account_created_visible.Recieve_special_partner_check();

        Account_created_visible.Enter_first_name("Ram");
        Account_created_visible.Enter_last_name("Ramesh");
        Account_created_visible.Enter_company("Trillion Tower ltd");
        Account_created_visible.Enter_address1("Sanepa");
        Account_created_visible.Enter_address2("Sanepa");
        Account_created_visible.Select_country("India");
        Account_created_visible.Enter_state("Bagmati");
        Account_created_visible.Enter_city("Lalitpur");
        Account_created_visible.Enter_zip("09931");
        Account_created_visible.Enter_phone("9865772234");
        Account_created_visible.Click_on_create_account();
        Account_created_visible.Account_created();
    }





@Test void LoggedUser(){
        Base_Page_Object LogUser = new Base_Page_Object(ram);
        LogUser.Click_on_Signup_navbar();
        LogUser.Enter_username_feild("Ramesh");
        LogUser.Enter_useremail_feild("bahadur22001@gmail.com");
        LogUser.Click_on_Signup_button();

        LogUser.Enter_account_info_Tittle();
        LogUser.Enterusername("Dogeshvai");
        LogUser.Enter_password_feild("123Dogeshvai");
        LogUser.Enter_days_of_birth("15");
        LogUser.Enter_month_of_birth("12");
        LogUser.Enter_year_of_birth("2020");
        LogUser.Signup_for_news_letter_check();
        LogUser.Recieve_special_partner_check();

        LogUser.Enter_first_name("Ram");
        LogUser.Enter_last_name("Ramesh");
        LogUser.Enter_company("Trillion Tower ltd");
        LogUser.Enter_address1("Sanepa");
        LogUser.Enter_address2("Sanepa");
        LogUser.Select_country("India");
        LogUser.Enter_state("Bagmati");
        LogUser.Enter_city("Lalitpur");
        LogUser.Enter_zip("09931");
        LogUser.Enter_phone("9865772234");
        LogUser.Click_on_create_account();
        LogUser.Click_on_continue();
        LogUser.Verifying_logged_username();

}






    //Verify error 'Your email or password is incorrect!' is visible (Test Case 3: Login User with incorrect email and password)
    @Test void Inccorect_email_password() {
        Base_Page_Object incorrect = new Base_Page_Object(ram);
        incorrect.Click_onSignup_loggin_navbar();
        incorrect.Click_on_username_input("mimy22001@gmail.com");
        incorrect.Click_on_password_input("123@@##Mimy");
        incorrect.Click_on_loggin_button();




    }















  //Verify 'Login to your account' is visible
    @Test void Loggin_account() {

        Base_Page_Object Loggin = new Base_Page_Object(ram);
        Loggin.Click_on_Loggin_navbar();
        Loggin.Loggin_account();



    }







    //Verify that user is navigated to login page(Test Case 4: Logout User)
    @Test void logout() {
        Base_Page_Object loggout = new Base_Page_Object(ram);
        loggout.Click_signupandloggin_navbar();
        loggout.uservalue_mail_loggin("mimy22001@gmail.com");
        loggout.uservalue_password_loggin("Ramesh783@@##");
        loggout.click_loggin_buton();
        loggout.click_on_logout_navbar();
        loggout.verifying_Login_page();



    }



    //Verify success message 'Success! Your details have been submitted successfully.' is visible
    @Test void Detail_Success() {
        Base_Page_Object Success_message = new Base_Page_Object(ram);
        Success_message.Click_on_contact_us_navbar ();
        Success_message.Input_name("Ram");
        Success_message.Enter_usermail("Ramesh1@gmail.com");
        Success_message.Enter_subject("Automation");
        Success_message.Enter_message("Feel free to reach out");
        Success_message.Choose_file("C:\\Users\\ACER\\Downloads\\logo-ismt.png");
        Success_message.click_submission_button();
        //alert message
        Alert alert = ram.switchTo().alert();
        alert.accept();
        Success_message.Verifying_success_message();



    }






@AfterTest public void closeBrowser() {
    ram.close();

}



}



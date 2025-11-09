package TestCases;

import Page_Object_Model.Base_Page_Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class automation_pratice_2 {
    // Automatically manage ChromeDriver
    WebDriver ram = new ChromeDriver();


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/Chromedriver/chromedriver.exe");
        //open default url
        ram.get("https://www.automationexercise.com");
        ram.manage().window().maximize();
    }
   // Verify that product is displayed in cart page with exact quantity
    @Test
    public void Cart_page_Quantity() {
        Base_Page_Object Qantity = new Base_Page_Object(ram);
        Qantity.Product_detail_page();
        Qantity.Click_on_product();
        Qantity.click_on_quantity("5");

        Qantity.add_to_cart();
        Qantity.view_cart();
        Qantity.Verifying_number_0f_qty();


//        WebDriverWait wait = new WebDriverWait(ram, Duration.ofSeconds(5));

    }

    //Verify that product is removed from the cart
    @Test public void Product_Removed(){
        Base_Page_Object removed = new Base_Page_Object(ram);
        removed.Product_detail_page();
        removed.click_on_detail_P();
        removed.add_to_cart();
        removed.view_cart();
        removed.Click_on_cross_button();
        removed.Vyf_product_removed();


    }



   // Verify that user is navigated to that category page
    @Test public void category(){
        Base_Page_Object category = new Base_Page_Object(ram);
        category.click_on_woman_category();
        category.click_on_dress();
        category.click_on_Men();
        category.click_on_shirt();
        category.verifying_men_tshirt_category();
    }

    //Verify that user is navigated to that brand page and can see products
    @Test public void brand_page_and_see_products(){
        Base_Page_Object Bbrand = new Base_Page_Object(ram);
        Bbrand.Product_detail_page();
        Bbrand.Click_on_biba_brand();
        Bbrand.Click_on_babyhug_brand();
        Bbrand.Verifying_babyhug();

    }

    //Verify that those products are visible in cart after login as well
    @Test public void Cart_aft_loggin(){
        Base_Page_Object aft_Loggin = new Base_Page_Object(ram);
        aft_Loggin.Product_detail_page();
        aft_Loggin.In_search_tab__type_Tshirt("Tshirt");
        aft_Loggin.Click_on_search_icon_button();
        aft_Loggin.Click_on_Tshirt_add_to_cart();
        aft_Loggin.Click_on_add_to_cart_view();
        aft_Loggin.Click_onSignup_loggin_navbar();
        aft_Loggin.Click_Loggin_enter_email("rosee22001@gmail.com");
        aft_Loggin.Click_Loggin_enter_pass("123Dogeshvai");
        aft_Loggin.Click_on_loggin_button();
        aft_Loggin.Click_on_cart_navbar();
        aft_Loggin.Verifying_Product_name();


    }








    //Verify success message 'Thank you for your review.'
    @Test public void review(){
        Base_Page_Object review = new Base_Page_Object(ram);
        review.Product_detail_page();
        review.click_on_detail_P();
        review.Click_enter_your_name("Bhala");
        review.Click_enter_your_email("Bhala@gmail.com");
        review.Click_enter_your_review("This product is really amazing." +
                "I want this product as fast as possible so, hurry and contact me");
        review.Click_submit();

        


    }


    //Click 'Download Invoice' button and verify invoice is downloaded successfully.
    @Test public void Download_invoice(){
        Base_Page_Object download = new Base_Page_Object(ram);
        download.Product_detail_page();
        download.click_on_detail_P();
        download.Click_ad_to_cart();
        download.view_cart();
        download.Click_Proceed_cart();
        download.Click_on_Proceed_loggin_for_product();
        download.Click_Loggin_enter_email("rosee22001@gmail.com");
        download.Click_Loggin_enter_pass("123Dogeshvai");
        download.Click_on_loggin_button();
        download.Click_on_cart_navbar();
        download.Click_Proceed_cart();
        download.Click_on_Comment("Please keep my product safe ");
        download.Click_on_place_order();
        download.Click_on_name_of_card("Credit Card");
        download.Click_on_number_of_card("983527893516");
        download.Click_on_cvc("331");
        download.Click_on_expiration_month("10");
        download.Click_on_expiration_year("2021");
        download.Click_on_pay_and_confirm_order();
        download.Click_on_dowload_invoice();




    }


}







package org.example;

import org.example.BaseTest;
import org.example.HomePage;
import org.example.RegestrationPage;
import org.example.RegisterResultPage;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();

    CompareList compareList = new CompareList();
    AppleMcbook appleMcbook = new AppleMcbook();
    EmailAFriend emailAFriend = new EmailAFriend();
    Electronics electronics = new Electronics();
    ShoppingCart shoppingCart = new ShoppingCart();
    UserLogin userLogin = new UserLogin();
    SentAEmail sentAEmail = new SentAEmail();

    RegestrationPage regestrationPage = new RegestrationPage();

    RegisterResultPage registerResultPage = new RegisterResultPage();
    Nike nike = new Nike();
    Adidas adidas = new Adidas();
    NewRelease newRelease = new NewRelease();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    Checkout checkout = new Checkout();
    BillingDetails billingDetails = new BillingDetails();
    ShippingMethod shippingMethod = new ShippingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    PaymentCardDetail paymentCardDetail = new PaymentCardDetail();
    ConformationOfOrder conformationOfOrder = new ConformationOfOrder();
    Facebook facebook = new Facebook();

    @Test
    public void a_toVerifyNonRegisteredUserShouldNotBeAbleToVote() {
        //
        homePage.communityPoll();
        //print error message
        homePage.communityPollErrorMessage();
    }
    @Test
    public void b_toVerifyProductsinComparelist() {
        //add two products for comparison
        homePage.addProductInComparelist();
        compareList.checkProductsInCompareList();
    }
    @Test
    public void c_toVerifyNonRegisteredUserShouldNotAbletoReferaFriend() {
        //click on product
        homePage.clickOnProduct();
        //click email a friend
        appleMcbook.clickonEmailAFriend();
        //add details
        emailAFriend.emailAFriend();
        emailAFriend.printerrorMessage();
    }
    @Test
    public void d_toVerifyProductInShoppingcart() {
        //click on electronics
        homePage.clickOnElectronics();
        //click on add to cart
        electronics.addProductToCart();
        shoppingCart.addProductInShoppingCart();
    }

    @Test

    public void e_verifyUserRegisteredSuccessfullyOrNot() {

        homePage.clickOnRegisterButton();

        regestrationPage.enterRegistrationDetails();

        registerResultPage.verifyUserRegisteredSuccessfullyOrNot();

    }
    @Test
    public void f_toVerifyRegisteredUserShouldAbletoReferAFriend() {
        //click on login button
        homePage.clickOnLoginButton();
        //enter the details
        userLogin.Logindetails();
        //go to the product
        appleMcbook.clickonEmailAFriend();
        emailAFriend.emailAFriend();
        sentAEmail.printEmailSentMessage();
    }
    @Test
    public void g_toVerifyRegisteredUserShouldbeAbletoVote() {
        homePage.clickOnLoginButton();
        userLogin.Logindetails();
        homePage.communityPoll();
        homePage.communitypollVoteMessage();
    }
    @Test
    public void prictproductTitle(){
        homePage.printproducttitle();
    }

    @Test
    public void searchButtonError(){
        homePage.searchButtonError();

    }
    @Test
    public void verifyPriceListedInCurrencySelectedFromCurrencySelector(){
        homePage.verifyProductPriceAreDisplayedAsPerSelectedCurrency();
    }
    @Test
    public void verifyUserShouldBeAbleToSearchProductAccordingly(){
        //search the product
        homePage.searchTheProductAndClikOnSearchButton();
        //verify products are displayed accordingly
        nike.verifyNikeProductAreDisplayed();
        //search another product
        homePage.searchAdidasProductAndClickOnSearchButton();
        adidas.verifyAdidasProductAreDisplayed();
    }
    @Test
    public void verifyGuestUserShouldBeAbleToLeaveComment(){
        homePage.clickOnNewRelease();
        newRelease.typeComment();
        newRelease.verifyCommentAddedSuccessfullyOrNot();
        newRelease.verifyCommentIsDisplayedAtLast();
    }
    @Test
    public void verifyGuestUserShouldBeAbleToCheckoutSuccessfully(){
        homePage.clickOnBuildYourOwnComputer();
        buildYourOwnComputer.selectConfiguration();
        buildYourOwnComputer.addProducttoCart();
        buildYourOwnComputer.ShoppingCart();
        buildYourOwnComputer.addProducttoCart();
        buildYourOwnComputer.ShoppingCart();
        shoppingCart.BuildYourOwnComputerIsAddedToCart();
        shoppingCart.clickOnTermsAndConditionsAndCheckout();
        checkout.clickonCheckoutAsGuest();
        billingDetails.submitBillingDetails();
        billingDetails.handlePopUp();
        paymentMethod.selectPaymentMethod();
        paymentCardDetail.submitCardDetails();
        paymentCardDetail.alertMessage();
        billingDetails.confirmCheckout();
        conformationOfOrder.verifyOrderConformation();


    }
    @Test
    public void b_verifyWhenUserClicksOnFacebookUserShouldBeNavigatedToFacebookPage(){
        homePage.clickOnFacebook();
        facebook.verufyFacebookPage();
    }
    @Test
    public void verifyVoteAlert(){
        homePage.verifyVoteAlert();
    }


}

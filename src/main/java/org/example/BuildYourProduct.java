package org.example;

import org.openqa.selenium.By;

public class BuildYourProduct extends Utils{
    By _processor = By.xpath("//select[@id=\"product_attribute_1\"]/option[2]");
    By _pleaseSelect = By.xpath("//option[@data-attr-value='1']");
    //click on RAM
    By _selectRAM =By.xpath("//select[@id=\"product_attribute_2\"]/option[4]");
    //select HDD 320gb
    By _selectHDD = By.xpath("(//input[@name='product_attribute_3'])[1]");
    //select OS vista home
    By _selectOS = By.xpath("(//input[@name='product_attribute_4'])[1]");

    //select software Acrobat Reader
    By _selectAcrobatReader = By.xpath("(//input[@type='checkbox'])[2]");
    ////select software Total Commander
    By _selectTotalCommander = By.xpath("(//input[@type='checkbox'])[3]");
    //Click on add to cart
    By _addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    LoadProp loadProp = new LoadProp();


    public void enterBuildYourProductDetails(){
        clickOnElements(_processor);
        clickOnElements(_pleaseSelect);
        clickOnElements(_selectRAM);
        clickOnElements(_selectHDD);
        clickOnElements(_selectOS);
        //clickOnElements(_selectMsOffice);
        clickOnElements(_selectAcrobatReader);
        clickOnElements(_selectTotalCommander);
        clickOnElements(_addToCart);

    }
}

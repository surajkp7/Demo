package com.pages.actitime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class PomActiLogin extends BasePage implements AutoConstant
	{

	@FindBy(id="username")
	private WebElement usernameTextbox;
	@FindBy(name="pwd")
	private WebElement pwdTextbox;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginLink;
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotLink;
	@FindBy(linkText="actiTIME Inc.")
	private WebElement incLink;
	
public PomActiLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	public void loginTo() throws Exception {
		usernameTextbox.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 2, 3));
		pwdTextbox.sendKeys(ExcelLibrary.getcellvalue(excelpath, sheetname, 2, 4));
		keepLoggedInCheckBox.click();
		loginLink.click();
	}
}

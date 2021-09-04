package page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory_Page extends TestBase {
	
		
	//Element Library 
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='data']")
	WebElement Add_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[1]")
	WebElement Category_Dropdown_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[2]")
	WebElement DueDate_Day_Dropdown_ELement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]")
	WebElement DueDate_Month_Dropdown_ELement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[4]")
	WebElement DueDate_Year_Dropdown_ELement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]")
	WebElement AddCategory_Dropdown_ELement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[5]")
	WebElement Color_Dropdown_ELement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement Click_Add_Category_Button;
	
	
	// Methods to interact with the elements
	public void enterValueInAddElement(String value) {
		Add_Element.sendKeys(value + randomGenerator(999));
	}
	public void selectCategoryDropdownElement(String value) {
		selectDropdown(Category_Dropdown_Element, value);
	}
	public void selectDueDateDayDropDownElement(String value) {
		selectDropdown(DueDate_Day_Dropdown_ELement, value);
		
	}
	public void selectDueDateMonthDropDownElement(String value) {
		selectDropdown(DueDate_Month_Dropdown_ELement, value);
	}
	public void selectDueDateYearDropDownElement(String value) {
		selectDropdown(DueDate_Year_Dropdown_ELement, value);
	}
//	public void selectAddCategoryDropDownElement(String value) {
//		selectDropdown(AddCategory_Dropdown_ELement, value);
//	}
	public void selectColorDropDownElement(String value) {
		selectDropdown(Color_Dropdown_ELement, value);
	}
	public  void clickAddCategoryButton() {
		Click_Add_Category_Button.click();
	}
	
	}

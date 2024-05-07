package automationtestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automationFrameWork.helper.HelperClass;

public class TestRunnerAll {

	public static void main(String[] args) {

		// Test Login Module

		WebDriver driver;
		driver = HelperClass.callDriver();

		HelperClass.callLogin();

		// Admin
		// Admin button
		driver.findElement(By.xpath("//span[text()='Admin']//parent::a")).click();

		// Admin userManagement DropdownButton
		driver.findElement(By.xpath("//span[text()='User Management ']//child::i")).click();

		// Admin job dropdownButton
		driver.findElement(By.xpath("//span[text()='Job ']//child::i")).click();

		// Admin organization dropdownButton
		driver.findElement(By.xpath("//span[text()='Organization ']//child::i")).click();

		// Admin qualification dropdownButton
		driver.findElement(By.xpath("//span[text()='Qualifications ']//child::i")).click();

		// Admin nationalities button
		driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		
		//Admin moreOptionButton
		driver.findElement(By.xpath("//span[text()='More ']")).click();

		// Admin corporate Branding button
		driver.findElement(By.xpath("//a[text()='Corporate Branding']")).click();

		// Admin configuration dropdownButton
		driver.findElement(By.xpath("//span[text()='Configuration ']//child::i"));
		
		//...................................................................................
		//Admin system users usernameField
		driver.findElement(By.xpath("//label[text()='Username']//parent::div//following::input[@class='oxd-input oxd-input--active']")).sendKeys("Subarna");

		//Admin systemUsers UserRoleDropDown
		driver.findElement(By.xpath("//label[text()='Username']//parent::div//following::input[@class='oxd-input oxd-input--active']")).click();
		

		////label[text()='Status']//parent::div//following::div[text()='-- Select --']     status
		
		// PIM

		// PIM button
		driver.findElement(By.xpath("//span[text()='PIM']/parent::a")).click();

		// PIM EmployeeList button
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();

		// PIM EmployeeList Employee Information arrow
		driver.findElement(By.xpath("//i[@class= 'oxd-icon bi-caret-up-fill']")); // = true
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill']")); // ----> if this is true, elements
																					// will not be visible

		// PIM EmployeeList EmployeeName
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Employee Name')]//parent::div//following-sibling::div//descendant::input[contains(@placeholder, 'Type for hints...')]"));

		// PIM EmployeeList EmployeeID
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Employee Id')]//parent::div//following-sibling::div//descendant::input[contains(@class, 'oxd-input oxd-input--active')]"));

		// PIM EmployeeList EmployeeStatus Arrow
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Employment Status')]//parent::div//following-sibling::div//descendant::i[contains(@class, 'select-text--arrow')]"));

		// PIM EmployeeList Include
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Include')]//parent::div//following-sibling::div//descendant::i[contains(@class, 'select-text--arrow')]"));

		// PIM EmployeeList SupervisorName
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Supervisor Name')]//parent::div//following-sibling::div//descendant::input[contains(@placeholder, 'Type for hints...')]"));

		// PIM EmployeeList JobTitle
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Job Title')]//parent::div//following-sibling::div//descendant::i[contains(@class, 'select-text--arrow')]"));

		// PIM EmployeeList SubUnit
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Sub Unit')]//parent::div//following-sibling::div//descendant::i[contains(@class, 'select-text--arrow')]"));

		// PIM EmployeeList ResetButton
		driver.findElement(By.xpath("//button[@type='reset' and text()=' Reset ']")).click();

		// PIM EmployeeList SubmitButton
		driver.findElement(By.xpath("//button[@type='submit' and text()=' Search ']")).click();

		// PIM EmployeeList AddButton
		driver.findElement(By.xpath("//button[@type='button' and text()=' Add ']")).click();

		// PIM EmployeeList Bottom OrangeHRMLink
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));

		// PIM AddEmployee Button
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

		// PIM AddEmployee FirstName
		driver.findElement(By.xpath("//input[@name='firstName']"));

		// PIM AddEmployee MiddleName
		driver.findElement(By.xpath("//input[@name='middleName']"));

		// PIM AddEmployee LastName
		driver.findElement(By.xpath("//input[@name='lastName']"));

		// PIM AddEmployee EmployeeID
		driver.findElement(By.xpath(
				"//label[text()='Employee Id']//parent::div//following-sibling::div//descendant::input[contains(@class, 'input--active')]"));

		// PIM AddEmployee AddImage
		driver.findElement(By.xpath("//img[@class='employee-image']"));

		// PIM AddEmployee CreateLoginDetails Button
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();;

		// PIM AddEmployee CreateLoginDetails UserName
		driver.findElement(By.xpath(
				"//label[text()='Username']//parent::div//following-sibling::div//descendant::input[contains(@class, 'input--active')]"));

		// PIM AddEmployee CreateLoginDetails Status-Enabled
		driver.findElement(By.xpath("//label[text()='Enabled']"));

		// PIM AddEmployee CreateLoginDetails Status-Disabled
		driver.findElement(By.xpath("//label[text()='Disabled']"));

		// PIM AddEmployee CreateLoginDetails Password
		driver.findElement(By.xpath(
				"//label[text()='Password']//parent::div//following-sibling::div//descendant::input[contains(@type, 'password')]"));

		// PIM AddEmployee CreateLoginDetails ConfirmPassword
		driver.findElement(By.xpath(
				"//label[text()='Confirm Password']//parent::div//following-sibling::div//descendant::input[contains(@type, 'password')]"));

		// PIM AddEmployee CancelButton
		driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();

		// PIM AddEmployee SaveButton
		driver.findElement(By.xpath("//button[@type='submit' and text()=' Save ']")).click();

		// Recruitement

		// MyInfo

		// Dashboard

		// Dashboard Title
		driver.findElement(By.xpath("//h6[text()='Dashboard']"));

		// Dashboard button
		driver.findElement(By.xpath("//span[text()='Dashboard']//parent::a")).click();

		// Dashboard section elements(5)
		driver.findElement(By.xpath("//div[contains(@class, 'white orangehrm-dashboard-widget')]"));

		// Dashboard header userDropdown
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));

		// Dashboard logout
		driver.findElement(By.xpath("//a[text()='Logout']"));

		// Dashboard changePassword
		driver.findElement(By.xpath("//a[text()='Change Password']"));

		// Dashboard Support
		driver.findElement(By.xpath("//a[text()='Support']"));

		// Dashboard About
		driver.findElement(By.xpath("//a[text()='About']"));

		// Dictory

		// Buzz

	}
	
	
	public void work()
	{
		
	}

}

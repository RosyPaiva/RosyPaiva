package br.com.acenture.formulario;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormularioTricentis {

WebDriver driver;
private org.openqa.selenium.support.ui.WebDriverWait novo;
	
	@Before()
	public void acessaFormulario() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Desenvolvimento\\Drives\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	 
	@Test()
	public void prencherFormulario() throws IOException, InterruptedException {	
		
		WebElement selectDaMake = driver.findElement(By.id("make"));
		Select combobox = new Select(selectDaMake);
		combobox.selectByVisibleText("Renault");
		
		WebElement selectDaModel = driver.findElement(By.id("model"));
		Select model = new Select(selectDaModel);
		model.selectByVisibleText("Moped");
    
		WebElement cylinder  = driver.findElement(By.id("cylindercapacity"));
		cylinder.sendKeys("120");
		
		WebElement engine  = driver.findElement(By.id("engineperformance"));
		engine.sendKeys("9");
		
		WebElement dateOfManufacture  = driver.findElement(By.id("dateofmanufacture"));
		dateOfManufacture.sendKeys("09/09/2013");
		
		WebElement numberOfSeats = driver.findElement(By.id("numberofseats"));
		Select seats = new Select(numberOfSeats);
		seats.selectByVisibleText("5");
		
		WebElement righthand  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]/span"));
		righthand.click();
		
		WebElement numberOfSeatsMotorcycle = driver.findElement(By.id("numberofseatsmotorcycle"));
		Select motorcycle = new Select(numberOfSeatsMotorcycle);
		motorcycle.selectByVisibleText("3");
		
		WebElement fuelType = driver.findElement(By.id("fuel"));
		Select fuel = new Select(fuelType);
		fuel.selectByVisibleText("Petrol");
		
		
		WebElement payload  = driver.findElement(By.id("payload"));
		payload.sendKeys("250");
		
		WebElement totalWeight = driver.findElement(By.id("totalweight"));
		totalWeight.sendKeys("700");
		
		WebElement listPrice = driver.findElement(By.id("listprice"));
		listPrice.sendKeys("38000");
		
		WebElement licensePlateNumber = driver.findElement(By.id("licenseplatenumber"));
		licensePlateNumber.sendKeys("4758");
		
		WebElement annualMileage = driver.findElement(By.id("annualmileage"));
		annualMileage.sendKeys("151.356");
		
		WebElement next = driver.findElement(By.id("nextenterinsurantdata"));
		next.click();
		
		WebElement firstName = driver.findElement(By.name("First Name"));
		firstName.sendKeys("Joao");
		
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.sendKeys("Santana");
		
		WebElement dateOfBirth  = driver.findElement(By.id("birthdate"));
		dateOfBirth.sendKeys("06/09/1975");
		
		WebElement Gender  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
		Gender.click();
		
		WebElement streetAddress = driver.findElement(By.id("streetaddress"));
		streetAddress.sendKeys("Rua 23 Casa 06 ");
		
		WebElement country = driver.findElement(By.id("country"));
		Select homecountry = new Select(country);
		homecountry.selectByVisibleText("Brazil");
		
		WebElement zipCode = driver.findElement(By.id("zipcode"));
		zipCode.sendKeys("72430205");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Gama");
		
		WebElement Occupation = driver.findElement(By.id("occupation"));
		Select mainOccupation = new Select(Occupation);
		mainOccupation.selectByVisibleText("Farmer");
		
		WebElement Hobbies  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]/span"));
		Hobbies.click();
		WebElement Hobbies2  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span"));
		Hobbies2.click();
		
		WebElement website = driver.findElement(By.id("website"));
		website.sendKeys("www.tvcriar.com.br");
		
		//Picture 
		String localImagem="C:\\Users\\Rosy\\eclipse\\jee-2021-09\\eclipse\\desafiotecnicoselenium\\target\\Massa\\joao.jpg";
		WebElement picture = driver.findElement(By.id("picture"));
		picture.sendKeys(localImagem);
		
				
		WebElement nextenterproductdata = driver.findElement(By.id("nextenterproductdata"));
		nextenterproductdata.click();
		
		
		WebElement startDate  = driver.findElement(By.id("startdate"));
		startDate.sendKeys("06/24/2022");
		
		WebElement insuranceSum = driver.findElement(By.id("insurancesum"));
		Select insurance = new Select(insuranceSum);
		insurance.selectByVisibleText("35.000.000,00");
		
		WebElement meritRating = driver.findElement(By.id("meritrating"));
		Select merit = new Select(meritRating);
		merit.selectByVisibleText("Malus 10");
		
		WebElement damageInsurance = driver.findElement(By.id("damageinsurance"));
		Select damage = new Select(damageInsurance);
		damage.selectByVisibleText("No Coverage");
		
		WebElement optionalProducts  = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span"));
		optionalProducts.click();
		
		WebElement courtesyCar = driver.findElement(By.id("courtesycar"));
		Select Car = new Select(courtesyCar);
		Car.selectByVisibleText("No");
		
		WebElement nextselectpriceoption = driver.findElement(By.id("nextselectpriceoption"));
		nextselectpriceoption.click();
		
		WebElement selectplatinum = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span"));
		selectplatinum.click();
		
		WebElement nextsendquote = driver.findElement(By.id("nextsendquote"));
		nextsendquote.click();
		
		WebElement eMail = driver.findElement(By.id("email"));
		eMail.sendKeys("joao@pst.com");
		
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("61981114554");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Joaopst");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Jo1234");
		
		WebElement confirmPassword = driver.findElement(By.id("confirmpassword"));
		confirmPassword.sendKeys("Jo1234");
		
		WebElement commentse = driver.findElement(By.id("Comments"));
		commentse.sendKeys("Excelente carro ótimo custo benefício.");
		
		WebElement sendemail = driver.findElement(By.id("sendemail"));
		sendemail.click();
					
		Thread.sleep(10000);
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Rosy\\eclipse\\jee-2021-09\\eclipse\\desafiotecnicoselenium\\target\\Evidencia\\emailSuccess.png"));
    }
	
	private void WebDriverWait(WebDriver driver2, int i) {
		
		
	}

	@After()
	public void fechaNavegador(){
    	driver.close();
    }
    
    
    
    
    }

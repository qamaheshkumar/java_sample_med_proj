package myNewGrpId.myNewArtId;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
//import java.util.Scanner;
//import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class RunNewDeltaStore {

    // Text files folder path
	
	public static String TextFileFolderPath = "Path to text file path";
	// DeltaStore Medcare exe file path
	public static String appPath = "path to .exe file";
	public static int intTextBoxNumber = 0;
	public static String[] inputIds = 
		{ "textbox_srno",
			"textBox_name",
			"textbox_id",
			"textBox_address",
			"textBox_lictype",
			"textBox_licno",
			"textBox_manuname",
			"textBox_manufacturer_id",
			"textBox_manuaddr",
			"textBox_pres1",
			"textBox_pres2",
			"textBox_pres3",
			"textBox_pres4",
			"textBox_pres5",
			"textBox_amountpaid"
		};

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WiniumDriver driver = null;
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath(RunNewDeltaStore.appPath);
        System.out.println(RunNewDeltaStore.appPath);
        option.setDebugConnectToRunningApp(false);
        option.setLaunchDelay(2);
        driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        String parent_window = driver.getWindowHandle();
        Thread.sleep(500);
        if(driver.findElementById("loginbutton").isDisplayed()) {
        	driver.switchTo().window(parent_window);
        	driver.findElementById("username").sendKeys("");
        	driver.findElementById("password").sendKeys("");
        	driver.findElementById("loginbutton").click();
        	Thread.sleep(1000);
        	if(driver.findElementById("textbox_srno").isDisplayed()) {
        		System.out.println("present");
        	}
//        	System.exit(0);
        	File folder = new File(RunNewDeltaStore.TextFileFolderPath);
        	File[] listOfFiles = folder.listFiles();
        	for (File eachFile : listOfFiles) {
        		String EachTxtFilePath = "";
        		String fileContent = "";
        		if (eachFile.getName().toLowerCase().endsWith((".txt"))) {
        			EachTxtFilePath = RunNewDeltaStore.TextFileFolderPath.concat(eachFile.getName().trim());
        			System.out.println(EachTxtFilePath);
        	        //driver.switchTo().window(parent_window);    		
                	try {
    					fileContent = FileUtils.readFileToString(new File(EachTxtFilePath), StandardCharsets.UTF_8);
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
                 	if(!fileContent.trim().isEmpty()) {
                    	String lines[] =  fileContent.toString().split("\\n");
//                		Scanner in = new Scanner(System.in);
//                		Thread.sleep(1000);
//                		String eachLineSting = "";
//                    	for (String eachline : lines) {
//                    		if(in.hasNextInt()) {
//                            	intTextBoxNumber = in.nextInt();
//                            	System.out.println("intTextBoxNumber  "+intTextBoxNumber);
//                    		}
//                        	if(intTextBoxNumber > 0) {
//                        		driver.switchTo().window(parent_window);
//                        		WebElement elmTextBox = driver.findElementById(RunNewDeltaStore.inputIds[intTextBoxNumber-1]);
//                        		elmTextBox.clear();
//                        		eachLineSting = lines[intTextBoxNumber-1].replaceAll("[^a-zA-Z0-9 -(),]+","");
//                        		elmTextBox.sendKeys(eachLineSting);
//                        	}
//    					}
//                    	in.reset();                       	
//                    	driver.switchTo().window(parent_window);
                    	Thread.sleep(25);
                    	
                    	// In case if notepad values are not verified
//                    	driver.findElementById("textbox_srno").sendKeys(lines[0].replaceAll("[^a-zA-Z0-9 -(),]+",""));
//                    	driver.findElementById("textBox_name").sendKeys((lines[1].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i"));
//                    	driver.findElementById("textbox_id").sendKeys(lines[2].replaceAll("[^a-zA-Z0-9 -(),]+",""));
//                    	driver.findElementById("textBox_address").sendKeys(lines[3].replaceAll("[^a-zA-Z0-9 -(),]+",""));
//                    	driver.findElementById("textBox_lictype").sendKeys((lines[4].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i"));
//                    	driver.findElementById("textBox_licno").sendKeys(lines[5].replaceAll("[^a-zA-Z0-9 -(),]+",""));
//                    	driver.findElementById("textBox_manuname").sendKeys(lines[6].replaceAll("[^a-zA-Z0-9 -(),]+",""));
//                    	driver.findElementById("textBox_manufacturer_id").sendKeys((lines[7].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("O", "0"));
//                    	driver.findElementById("textBox_manuaddr").sendKeys(lines[8].replaceAll("[^a-zA-Z0-9 -()]+",""));
//                    	driver.findElementById("textBox_pres1").sendKeys((lines[9].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i"));
//                    	driver.findElementById("textBox_pres2").sendKeys((lines[10].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i"));
//                    	driver.findElementById("textBox_pres3").sendKeys((lines[11].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i"));
//                    	driver.findElementById("textBox_pres4").sendKeys((lines[12].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i"));
//                    	driver.findElementById("textBox_pres5").sendKeys((lines[13].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i"));
//                    	driver.findElementById("textBox_amountpaid").sendKeys(lines[14]);
                    	
                    	//To check the begin time
                        Calendar cal = Calendar.getInstance();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
                        System.out.println( sdf.format(cal.getTime()) );
                    	
                        // In case if notepad values are verified
                        //driver.findElementById("textbox_srno").clear();
                    	driver.findElementById("textbox_srno").sendKeys(lines[0].trim());
                    	
                    	//driver.findElementById("textBox_name").clear();
                    	driver.findElementById("textBox_name").sendKeys(lines[1].trim());
                    	//Thread.sleep(35);
                    	
                    	//driver.findElementById("textbox_id").clear();
                    	driver.findElementById("textbox_id").sendKeys(lines[2].trim());
                    	
                    	//driver.findElementById("textBox_address").clear();
                    	driver.findElementById("textBox_address").sendKeys(lines[3].replace("—", "-").trim());
                    	//Thread.sleep(40);
                    	//driver.findElementById("textBox_lictype").clear();
                    	driver.findElementById("textBox_lictype").sendKeys(lines[4].trim());
                    	
                    	//driver.findElementById("textBox_licno").clear();
                    	driver.findElementById("textBox_licno").sendKeys(lines[5].trim());
                    	
                    	//driver.findElementById("textBox_manuname").clear();
                    	driver.findElementById("textBox_manuname").sendKeys(lines[6].trim());
                    	//Thread.sleep(50);
                    	
                    	//driver.findElementById("textBox_manufacturer_id").clear();
                    	driver.findElementById("textBox_manufacturer_id").sendKeys(lines[7].trim());
                    	
                    	//driver.findElementById("textBox_manuaddr").clear();
                    	driver.findElementById("textBox_manuaddr").sendKeys(lines[8].trim());
                    	//Thread.sleep(35);
                    	
                    	//driver.findElementById("textBox_pres1").clear();
                    	driver.findElementById("textBox_pres1").sendKeys(lines[9].replace("—", "-").trim());
                    	//Thread.sleep(40);
                    	
                    	//driver.findElementById("textBox_pres2").clear();
                    	driver.findElementById("textBox_pres2").sendKeys(lines[10].replace("—", "-").trim());
                    	//Thread.sleep(24);
                    	
                    	//driver.findElementById("textBox_pres3").clear();
                    	driver.findElementById("textBox_pres3").sendKeys(lines[11].replace("—", "-").trim());
                    	//Thread.sleep(37);
                    	
                    	//driver.findElementById("textBox_pres4").clear();
                    	driver.findElementById("textBox_pres4").sendKeys(lines[12].replace("—", "-").trim());
                    	//Thread.sleep(40);
                    	
                    	//driver.findElementById("textBox_pres5").clear();
                    	driver.findElementById("textBox_pres5").sendKeys(lines[13].replace("—", "-").trim());
                    	//Thread.sleep(38);
                    	
                    	//driver.findElementById("textBox_amountpaid").clear();
                    	driver.findElementById("textBox_amountpaid").sendKeys(lines[14].trim());
                    	//  To set the random time for execution                    
                    	Random rand = new Random();
                    	//int timeInSeconds = rand.nextInt(50);
                    	int timeInSeconds = 5;
                    	timeInSeconds = (5 + timeInSeconds) * 2;
                    	System.out.println("timeInSeconds " + timeInSeconds);
                    	try {
    						Thread.sleep(timeInSeconds);
    						//Thread.sleep(1);
    					} catch (InterruptedException e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
                    	
                    	driver.findElementById("button_add_data").click();
                    	WebDriverWait wait = new WebDriverWait(driver, 1000);
                        wait.until(ExpectedConditions.elementToBeClickable(By.name("OK")));
                        WebElement ChildWindow = driver.findElementByClassName("#32770");
                        Thread.sleep(200);
                        ChildWindow.findElement(By.name("OK")).click();
                        //To check the end time
                        Calendar cal1 = Calendar.getInstance();
                        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
                        sdf1.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
                        System.out.println( sdf1.format(cal1.getTime()) + "\n" );
                        Thread.sleep(50);
                	}
        		}
    		}        	
        }
    	//driver.close();
    }

}


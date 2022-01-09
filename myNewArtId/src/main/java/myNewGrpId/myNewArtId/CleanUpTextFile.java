package myNewGrpId.myNewArtId;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;


public class CleanUpTextFile {
	
	public static String TextFileFolderPath = ""
	public static void main(String[] args) {
    	File folder = new File(CleanUpTextFile.TextFileFolderPath);
    	File[] listOfFiles = folder.listFiles();
    	for (File eachFile : listOfFiles) {
    		String EachTxtFilePath = "";
    		String fileContent = "";
    		if (eachFile.getName().toLowerCase().endsWith(("_5.txt"))) {
    			EachTxtFilePath = CleanUpTextFile.TextFileFolderPath.concat(eachFile.getName().trim());
    			System.out.println(EachTxtFilePath);
                BufferedWriter writer = null;    			
            	try {
					fileContent = FileUtils.readFileToString(new File(EachTxtFilePath), StandardCharsets.UTF_8);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             	if(!fileContent.trim().isEmpty()) {
             		String tempLines;
                	String lines[] =  (fileContent.toString().replaceAll("FDR", "FDA")).replaceAll("/?&%!", "").split("\\n");
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    sdf.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
                    System.out.println(sdf.format(cal.getTime()));
                    tempLines = ((lines[0].replaceAll("[^a-zA-Z0-9 -(),]+","")).replaceAll("[1Il\'\"]", "1")).replaceAll("[oO0]", "0")+"\n";
                    tempLines += (lines[1].replaceAll("[^a-zA-Z0-9 -(),]+","")).replaceAll("[1\'\"]", "i")+"\n";
                    tempLines += (lines[2].replaceAll("[^a-zA-Z0-9 -(),]+","").replaceAll("[1Il\'\"]", "1")).replaceAll("[oO0]", "0")+"\n";
                    //tempLines += lines[3].replaceAll("[^a-zA-Z0-9 -(),]+","").replaceAll("[1IloO0\'\"]", "i")+"\n";
                    tempLines += lines[3].replaceAll("[^a-zA-Z0-9 -(),]+","").replaceAll("[1\'\"]", "i")+"\n";
                    tempLines += ((lines[4].replaceAll("[^a-zA-Z0-9 -(),]+",""))).replaceAll("[1IloO0\'\"]", "i")+"\n";
                    tempLines += lines[5].replaceAll("[^a-zA-Z0-9 -(),]+","").replaceAll("[1IloO0\'\"]", "i")+"\n";
                    //tempLines += (lines[6].replaceAll("[^a-zA-Z0-9 -(),]+","")).replaceAll("[1IloO0\'\"]", "i")+"\n";
                    tempLines += (lines[6].replaceAll("[^a-zA-Z0-9 -(),]+","")).replaceAll("[1\'\"]", "i")+"\n";
                    tempLines += ((lines[7].replaceAll("[^a-zA-Z0-9 -(),]+","")).replaceAll("[1Il\'\"]", "1")).replaceAll("[oO0]", "0")+"\n";
                    tempLines += (lines[8].replaceAll("[^a-zA-Z0-9 -()]+","").replaceAll("[1I\'\"]", "i")).replaceAll("[O]", "o")+"\n";
                    tempLines += (((lines[9].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replaceAll("[1\'\"]", "i")).replaceAll("[o0]", "o")).replace("HuTtum", "Multum").replace("MuTTum", "Multum")
                    		.replace("Multun", "Multum").replace("Hultum", "Multum").replace("HuTtun", "Multum").replace("HuTTun", "Multum").replace("MuTtum", "Multum").replace("MuTTum", "Multum").replace("MuTtun", "Multum").replace("MuTTun", "Multum")+"\n";
                    tempLines += (((lines[10].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replaceAll("[1\'\"]", "i")).replaceAll("[o0]", "o")).replace("HuTtum", "Multum").replace("MuTTum", "Multum")
                    		.replace("Multun", "Multum").replace("Hultum", "Multum").replace("HuTtun", "Multum").replace("HuTTun", "Multum").replace("MuTtum", "Multum").replace("MuTTum", "Multum").replace("MuTtun", "Multum").replace("MuTTun", "Multum")+"\n";
                    tempLines += (((lines[11].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replaceAll("[1\'\"]", "i")).replaceAll("[o0]", "o")).replace("HuTtum", "Multum").replace("MuTTum", "Multum")
                    		.replace("Multun", "Multum").replace("Hultum", "Multum").replace("HuTtun", "Multum").replace("HuTTun", "Multum").replace("MuTtum", "Multum").replace("MuTTum", "Multum").replace("MuTtun", "Multum").replace("MuTTun", "Multum")+"\n";
                    tempLines += (((lines[12].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replaceAll("[1\'\"]", "i")).replaceAll("[o0]", "o")).replace("HuTtum", "Multum").replace("MuTTum", "Multum")
                    		.replace("Multun", "Multum").replace("Hultum", "Multum").replace("HuTtun", "Multum").replace("HuTTun", "Multum").replace("MuTtum", "Multum").replace("MuTTum", "Multum").replace("MuTtun", "Multum").replace("MuTTun", "Multum")+"\n";
                    tempLines += (((lines[13].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replaceAll("[1\'\"]", "i")).replaceAll("[o0]", "o")).replace("HuTtum", "Multum").replace("MuTTum", "Multum")
                    		.replace("Multun", "Multum").replace("Hultum", "Multum").replace("HuTtun", "Multum").replace("HuTTun", "Multum").replace("MuTtum", "Multum").replace("MuTTum", "Multum").replace("MuTtun", "Multum").replace("MuTTun", "Multum")+"\n";
                    tempLines += (lines[14].replaceAll("[1Il\'\"]", "1")).replaceAll("[oO0]", "0")+"\n";
//                    tempLines = lines[0].replaceAll("[^a-zA-Z0-9 -(),]+","")+"\n";
//                    tempLines += (lines[1].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i")+"\n";
//                    tempLines += lines[2].replaceAll("[^a-zA-Z0-9 -(),!]+","")+"\n";
//                    tempLines += lines[3].replaceAll("[^a-zA-Z0-9 -(),]+","")+"\n";
//                    tempLines += ((lines[4].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i")).replace("l", "i")+"\n";
//                    tempLines += lines[5].replaceAll("[^a-zA-Z0-9 -(),]+","")+"\n";
//                    tempLines += (lines[6].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("1", "i")+"\n";
//                    tempLines += (lines[7].replaceAll("[^a-zA-Z0-9 -(),]+","")).replace("O", "0")+"\n";
//                    tempLines += lines[8].replaceAll("[^a-zA-Z0-9 -()]+","")+"\n";
//                    tempLines += (((lines[9].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replace("1", "i")).replace("Hultum", "Multum")).replace("Multun", "Multum")+"\n";
//                    tempLines += (((lines[10].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replace("1", "i")).replace("Hultum", "Multum")).replace("Multun", "Multum")+"\n";
//                    tempLines += (((lines[11].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replace("1", "i")).replace("Hultum", "Multum")).replace("Multun", "Multum")+"\n";
//                    tempLines += (((lines[12].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replace("1", "i")).replace("Hultum", "Multum")).replace("Multun", "Multum")+"\n";
//                    tempLines += (((lines[13].replaceAll("[^a-zA-Z0-9 -(),-]+","")).replace("1", "i")).replace("Hultum", "Multum")).replace("Multun", "Multum")+"\n";
//                    tempLines += lines[14]+"\n";
                    String contents = new String(tempLines); 
                    String new_text_path = eachFile.getPath().replace("_5.txt", "_N.txt");
                    File tempFile = new File(new_text_path);
                    try {
						FileUtils.writeStringToFile(tempFile, contents, "UTF-8");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    
//  To set the random time for execution                    
//                	Random rand = new Random();
//                	int timeInSeconds = rand.nextInt(50);
//                	timeInSeconds = (240+ timeInSeconds) * 1000;
//                	System.out.println("timeInSeconds " + timeInSeconds);
//                	try {
//						//Thread.sleep(timeInSeconds);
//						Thread.sleep(1);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
                    //To check the end time
                    Calendar cal1 = Calendar.getInstance();
                    SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
                    sdf1.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
                    System.out.println( sdf1.format(cal1.getTime()) + "\n" );
                    
            	}
    		}
		}

	}

}

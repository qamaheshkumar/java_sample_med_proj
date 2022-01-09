package myNewGrpId.myNewArtId;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class CovertJPGImageToText {

	public static String JpgFileFolderPath = "";
	
	public static void main(String[] args) throws InterruptedException {
    	File folder = new File(CovertJPGImageToText.JpgFileFolderPath);
    	File[] listOfFiles = folder.listFiles();
    	for (File eachFile : listOfFiles) {
    		//if (eachFile.getName().toLowerCase().endsWith(("_5.jpg"))) {
    		System.out.println("me : " + eachFile.getName());
    		if (eachFile.getName().toLowerCase().endsWith((".png"))) {
    			File imageFile = new File(eachFile.getPath());
    			Tesseract instance = new Tesseract();
    			instance.setDatapath("C:\\Program Files (x86)\\Tesseract-OCR\\");
    			String result;
    			try {
    				result = instance.doOCR(imageFile);
    				String textFileName = imageFile.getPath().replace(".png", ".txt");
    				System.out.println("Changing to text : " + textFileName);
    				FileOutputStream out;
					try {
						out = new FileOutputStream(textFileName);
	    				try {
	    					//out.write(result.replaceAll("(?m)^[ \t]*\r?\n", "").getBytes());
							out.write((result.replaceAll("(?m)^[ \t]*\r?\n", "")).replaceAll("[^\\x00-\\x7F]", "").getBytes());
		    				out.close();
		    				System.out.println("executed successfully : ");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			} catch (TesseractException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
		}
	}
}
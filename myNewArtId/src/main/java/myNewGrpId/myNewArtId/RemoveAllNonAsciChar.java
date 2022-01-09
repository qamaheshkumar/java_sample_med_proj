package myNewGrpId.myNewArtId;

import java.io.File;
import java.io.FileOutputStream;

public class RemoveAllNonAsciChar {
	
	public static String JpgFileFolderPath = "C:\\Users\\Admin\\Desktop\\folderName\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	File folder = new File(CovertJPGImageToText.JpgFileFolderPath);
    	File[] listOfFiles = folder.listFiles();
    	for (File eachFile : listOfFiles) {
    		if (eachFile.getName().toLowerCase().endsWith((".doc"))) {
    			FileOutputStream out;
    			//In complete code .. try to complete it
    		}
    	}

	}

}

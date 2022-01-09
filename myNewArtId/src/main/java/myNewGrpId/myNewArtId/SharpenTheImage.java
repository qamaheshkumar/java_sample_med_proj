package myNewGrpId.myNewArtId;

import java.io.File;
import java.io.IOException;

import ch.qos.logback.core.net.SyslogOutputStream;

// Run the following commad in image magick to remove false background and font color
// convert -density 300 D:\path to file\Sample.GIF -fuzz 55% -fill black -opaque "#e1342d" D:\path to file\Sample_1.jpg

public class SharpenTheImage {

	public static String OrigImageFileFolderPath = "";
	
	public static void main(String[] args) throws InterruptedException {
		// absolute path to ImageMagick: Command-line Tools: Convert
		String convert_path = "C:\\Program Files\\ImageMagick-7.0.8-Q16\\magick";
		String size = "175%";
		String sharpen = "0x2";
    	File folder = new File(SharpenTheImage.OrigImageFileFolderPath);
    	File[] listOfImageFiles = folder.listFiles();
    	
    	for (File eachFile : listOfImageFiles) {
    		if (eachFile.getName().toLowerCase().endsWith(("_5.jpg")) == true) {
    			continue;
    		}
    		if (eachFile.getName().toLowerCase().endsWith((".png"))) {
    			String old_img_path = eachFile.getPath();
    			//String new_img_path = eachFile.getPath().replace(".jpg", "_5.jpg");
    			String new_img_path = (eachFile.getPath().replace("338", "")).replace(".png", "_5.jpg");
    			
    		    ProcessBuilder pb = new ProcessBuilder(
    		            convert_path,
    		            old_img_path,
    		            "-density",
    		            "200",
    		            "-normalize",
    		            "-resize",
    		            size,
    		            "-sharpen", 
    		            sharpen,
    		            new_img_path);
    		    Thread.sleep(500);
    		    pb.redirectErrorStream(true);
    		    try {
    				Process p = pb.start();
    				Thread.sleep(500);
    				System.out.println(new_img_path + " -- success");
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}    			
    		}
    	}
	}	

}

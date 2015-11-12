package cn.itcast.ssh.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

/**
 * 生成二维码
 * @author stdt
 *
 */
public class QRCodeGernerator {
	private static final int BLACK = 0xFF000000; 
	   private static final int WHITE = 0xFFFFFFFF; 
	   private QRCodeGernerator() {} 
	   public static BufferedImage toBufferedImage(BitMatrix matrix) { 
	     int width = matrix.getWidth(); 
	     int height = matrix.getHeight(); 
	     BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
	     for (int x = 0; x < width; x++) { 
	       for (int y = 0; y < height; y++) { 
	         image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE); 
	       } 
	     } 
	     return image; 
	   } 
	   public static void writeToFile(BitMatrix matrix, String format, File file) 
	       throws IOException { 
	     BufferedImage image = toBufferedImage(matrix); 
	     if (!ImageIO.write(image, format, file)) { 
	       throw new IOException("Could not write an image of format " + format + " to " + file); 
	     } 
	   } 
	    
	      
	   public static void writeToStream(BitMatrix matrix, String format, OutputStream stream) 
	       throws IOException { 
	     BufferedImage image = toBufferedImage(matrix); 
	     if (!ImageIO.write(image, format, stream)) { 
	       throw new IOException("Could not write an image of format " + format); 
	     } 
	   } 
	   
	   @SuppressWarnings("unchecked")
	public static void createQRCode(String url,String path){
	        int width = 300; 
	        int height = 300; 
	        String format = "gif"; 
	        @SuppressWarnings("rawtypes")
			Hashtable hints = new Hashtable(); 
	        hints.put(EncodeHintType.CHARACTER_SET, "utf-8"); 
	        BitMatrix bitMatrix;
			try {
				bitMatrix = new MultiFormatWriter().encode(url, BarcodeFormat.QR_CODE, width, height, hints);
	        File outputFile = new File(path); 
	        QRCodeGernerator.writeToFile(bitMatrix, format, outputFile);
			} catch (WriterException e1) {
				e1.printStackTrace();
			}  catch (IOException e) {
				e.printStackTrace();
			} 
	   }
	   
	   public static void main(String[] args) throws Exception { 
		   createQRCode("http://www.baidu.com","d:/hello.gif");
	   } 
}

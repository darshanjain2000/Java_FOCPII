package com.ncu.processors;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public  class Download{
    private static final int BUFFER_SIZE = 4096;
    static Scanner in = new Scanner(System.in);
    
    public static void downloadFile(String fileURL, String outputDirectory)
            throws IOException {
        URL url = new URL(fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();
 
        // always check HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String fileName = "";
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();
 
            if (disposition != null) {
                // extracts file name from header field
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10,
                            disposition.length() - 1);
                }
            } else {
                // extracts file name from URL
                fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1,
                        fileURL.length());
            }
 
            System.out.println("Content-Type = " + contentType);
            System.out.println("Content-Length = " + contentLength);
            System.out.println("fileName = " + fileName);
 
            // opens input stream from the HTTP connection
            InputStream inputStream = httpConn.getInputStream();
            String saveFilePath = outputDirectory + File.separator + fileName;
             
            // opens an output stream to save into file
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);
 
            int bytesRead = -1;
            byte[] buffer = new byte[BUFFER_SIZE];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
               outputStream.write(buffer, 0, bytesRead);
                double download = 0.00;
            double percentDownload = 0.00;
            int read=0;
              while ((read = inputStream.read(buffer, 0, BUFFER_SIZE)) >= 0) {
                download += read;
                percentDownload=(download*100)/contentLength;
                String percent = String.format("%.2f",percentDownload);
                System.out.println("Downloaded "+percent+"% of the file.");
            }
            }
 
            outputStream.close();
            inputStream.close();
            System.out.println("File downloaded");
        } else {
                System.out.println("Please enter correct link");
                boolean flag=false;
                try{
                    String newurl = in.nextLine();
                    downloadFile(newurl,outputDirectory);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
        }
        httpConn.disconnect();
    }
}
/*public class Downloader {
 
    public static void main(String[] args) {
        String fileURL = "https://www.tutorialspoint.com/java/java_tutorial.pdf";
        String outputDirectory = "C:\\Users\\Dell\\Desktop\\Download_Manager";
        try {
            Download.downloadFile(fileURL, outputDirectory);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}*/
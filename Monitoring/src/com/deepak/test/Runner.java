package com.deepak.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Runner {

    /**
     * @param args
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        GetDataFromNagios.execute();
        System.out.println("going to execute beautifier command");
        beautifyTempHtml();
        System.out.println("command executed");
        WriteReportToExcel.writeReportToExcel();
    }

    private static void beautifyTempHtml() throws IOException {
        File file = new File("/home/deepak");
        ProcessBuilder processBuilder = new ProcessBuilder("./command.sh");
        processBuilder.directory(file);

        Process process = processBuilder.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

}

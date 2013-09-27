package com.deepak.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class GetDataFromNagios {
    public static void execute() throws IOException, InterruptedException {

        String https_url = "https://122.160.150.198/nagios/cgi-bin/status.cgi?host=all";
        URL cpUrl = new URL(https_url);

        TrustManager[] trustAllCerts = new TrustManager[] { new BusinessIntelligenceX509TrustManager() };
        SSLContext sc;

        try {
            sc = SSLContext.getInstance("SSL");
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return;
        }

        HostnameVerifier hv = new BusinessIntelligenceHostnameVerifier();

        try {
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
        } catch (KeyManagementException keyManagementException) {

            return;
        }

        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
        HttpsURLConnection connection = (HttpsURLConnection) cpUrl.openConnection();
        String encode = "bmFnaW9zYWRtaW46cmVkaGF0";
        connection.setDoInput(true);
        connection.setRequestProperty("Authorization", "Basic " + encode);

        connection.setRequestMethod("GET");
        connection.connect();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String result = response.toString();
        // print result
        System.out.println(result);

        try {

            File file = new File("/home/deepak/temp.html");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(result);
            bw.close();
            System.out.println(file.getAbsolutePath());
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

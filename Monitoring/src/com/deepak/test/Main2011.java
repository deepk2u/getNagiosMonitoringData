package com.deepak.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2011 {

    String isApacheRunning;
    String cpuLoad;
    String freeSpaceRootPartition;
    String swapMemory;
    String totalProcesses;

    public String getIsApacheRunning() {
        return isApacheRunning;
    }

    public void setIsApacheRunning(String isApacheRunning) {
        this.isApacheRunning = isApacheRunning;
    }

    public String getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(String cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public String getFreeSpaceRootPartition() {
        return freeSpaceRootPartition;
    }

    public void setFreeSpaceRootPartition(String freeSpaceRootPartition) {
        this.freeSpaceRootPartition = freeSpaceRootPartition;
    }

    public String getSwapMemory() {
        return swapMemory;
    }

    public void setSwapMemory(String swapMemory) {
        this.swapMemory = swapMemory;
    }

    public String getTotalProcesses() {
        return totalProcesses;
    }

    public void setTotalProcesses(String totalProcesses) {
        this.totalProcesses = totalProcesses;
    }

    public void run() {
        BufferedReader br = null;

        try {

            String sCurrentLine;

            String fileLocation = System.getProperty("user.home") + System.getProperty("file.separator") + "response.html";
            br = new BufferedReader(new FileReader(fileLocation));

            while ((sCurrentLine = br.readLine()) != null) {

                if (sCurrentLine.contains("172.16.20.11")) {
                    System.out.println(sCurrentLine);
                    break;
                }
            }

            for (int i = 1; i < 30; ++i)
                br.readLine();

            System.out.println("172.16.20.11");
            // System.out.println("\n CPU\n");
            for (int i = 0; i < 5; ++i)
                if ((sCurrentLine = br.readLine()) != null && sCurrentLine.contains("<TD CLASS='statusOK'>OK</TD>")) {
                    // System.out.println(sCurrentLine);
                    System.out.println("Is Apached Running : Yes");
                    this.setIsApacheRunning("Yes");
                }

            for (int i = 1; i < 27; ++i)
                br.readLine();
            // System.out.println("\nCurrent Load\n");
            for (int i = 0; i < 5; ++i) {
                if ((sCurrentLine = br.readLine()) != null) {
                    // System.out.println(sCurrentLine);
                }
            }
            String ld = sCurrentLine.substring(sCurrentLine.indexOf("&#46;") - 2, sCurrentLine.indexOf("&#46;") + 7).replace("&#46;", ".");

            System.out.println("CPU (Load Avg):: " + ld);
            this.setCpuLoad(ld);

            for (int i = 1; i < 24; ++i)
                br.readLine();
            // System.out.println("\nNETWORK CONNECTION\n");
            for (int i = 0; i < 5; ++i)
                if ((sCurrentLine = br.readLine()) != null) {
                    // System.out.println(sCurrentLine);
                }

            for (int i = 1; i < 24; ++i)
                br.readLine();
            // System.out.println("\nOPEN FILES\n");
            for (int i = 0; i < 5; ++i)
                if ((sCurrentLine = br.readLine()) != null) {
                    // System.out.println(sCurrentLine);
                }

            for (int i = 1; i < 24; ++i)
                br.readLine();
            // System.out.println("\nRoot Partition\n");
            for (int i = 0; i < 5; ++i)
                if ((sCurrentLine = br.readLine()) != null) {
                    // System.out.println(sCurrentLine);
                }

            String freeSpace = "85126 MB / " + sCurrentLine.substring(sCurrentLine.indexOf("&#40;") + 5, sCurrentLine.indexOf("&#40;") + 7)
                    + "%";
            System.out.println("Free Disk Space (Root Partition) : " + freeSpace);
            this.setFreeSpaceRootPartition(freeSpace);

            for (int i = 1; i < 24; ++i)
                br.readLine();
            // System.out.println("\nSSH\n");
            for (int i = 0; i < 5; ++i)
                if ((sCurrentLine = br.readLine()) != null) {
                    // System.out.println(sCurrentLine);
                }

            for (int i = 1; i < 24; ++i)
                br.readLine();
            // System.out.println("\nSwap\n");
            for (int i = 0; i < 5; ++i)
                if ((sCurrentLine = br.readLine()) != null) {
                    // System.out.println(sCurrentLine);
                }
            String swapUsed = sCurrentLine.substring(sCurrentLine.indexOf("out of") + 7, sCurrentLine.indexOf("&#41;")) + "/"
                    + (100 - Integer.parseInt(sCurrentLine.substring(sCurrentLine.indexOf("&#45;") + 6, sCurrentLine.indexOf("&#37;"))))
                    + "%";

            for (int i = 1; i < 24; ++i)
                br.readLine();
            // System.out.println("\nTotal Processes\n");
            for (int i = 0; i < 5; ++i)
                if ((sCurrentLine = br.readLine()) != null) {
                    // System.out.println(sCurrentLine);
                }
            String totalProcesses = sCurrentLine.substring(sCurrentLine.indexOf("&#58;") + 6, sCurrentLine.indexOf("processes"));
            System.out.println("Total Process : " + totalProcesses);
            this.setTotalProcesses(totalProcesses);
            System.out.println("Swap Memory/Used % : " + swapUsed);
            this.setSwapMemory(swapUsed);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

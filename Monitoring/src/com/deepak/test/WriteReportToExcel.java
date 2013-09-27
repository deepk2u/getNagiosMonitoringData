package com.deepak.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteReportToExcel {

    public static void main(String[] args) {

        Main2011 main2011 = new Main2011();
        main2011.run();

        Main2311 main2311 = new Main2311();
        main2311.run();

        Main2312 main2312 = new Main2312();
        main2312.run();

        Main2317 main2317 = new Main2317();
        main2317.run();

        Main2318 main2318 = new Main2318();
        main2318.run();

        Main2323 main2323 = new Main2323();
        main2323.run();

        Main2324 main2324 = new Main2324();
        main2324.run();

        Main2326 main2326 = new Main2326();
        main2326.run();

        // Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Report");

        // Iterate over data and write to sheet
        int cellnum = 0;
        Row row5 = sheet.createRow(5);
        Cell cell50 = row5.createCell(cellnum);
        cell50.setCellValue(new Date().toString());

        Row row8 = sheet.createRow(8);
        Cell cell80 = row8.createCell(cellnum);
        cell80.setCellValue(main2011.getIsApacheRunning());

        Row row9 = sheet.createRow(9);
        Cell cell90 = row9.createCell(cellnum);
        cell90.setCellValue(main2011.getCpuLoad());

        Row row13 = sheet.createRow(13);
        Cell cell130 = row13.createCell(cellnum);
        cell130.setCellValue(main2011.getFreeSpaceRootPartition());

        Row row14 = sheet.createRow(14);
        Cell cell140 = row14.createCell(cellnum);
        cell140.setCellValue(main2011.getTotalProcesses());

        Row row15 = sheet.createRow(15);
        Cell cell150 = row15.createCell(cellnum);
        cell150.setCellValue("Yes");

        Row row26 = sheet.createRow(26);
        Cell cell260 = row26.createCell(cellnum);
        cell260.setCellValue(main2011.getSwapMemory());

        Row row27 = sheet.createRow(27);
        Cell cell270 = row27.createCell(cellnum);
        cell270.setCellValue(main2011.getIsApacheRunning());

        Row row28 = sheet.createRow(28);
        Cell cell280 = row28.createCell(cellnum);
        cell280.setCellValue(main2011.getCpuLoad());

        Row row29 = sheet.createRow(29);
        Cell cell290 = row29.createCell(cellnum);
        cell290.setCellValue("4 GB");

        Row row30 = sheet.createRow(30);
        Cell cell300 = row30.createCell(cellnum);
        cell300.setCellValue(main2011.getFreeSpaceRootPartition());

        Row row34 = sheet.createRow(34);
        Cell cell340 = row34.createCell(cellnum);
        cell340.setCellValue(main2011.getSwapMemory());

        Row row35 = sheet.createRow(35);
        Cell cell350 = row35.createCell(cellnum);
        cell350.setCellValue(main2011.getIsApacheRunning());

        Row row36 = sheet.createRow(36);
        Cell cell360 = row36.createCell(cellnum);
        cell360.setCellValue(main2011.getCpuLoad());

        Row row37 = sheet.createRow(37);
        Cell cell370 = row37.createCell(cellnum);
        cell370.setCellValue("4 GB");

        Row row38 = sheet.createRow(38);
        Cell cell380 = row38.createCell(cellnum);
        cell380.setCellValue(main2011.getFreeSpaceRootPartition());

        Row row44 = sheet.createRow(44);
        Cell cell440 = row44.createCell(cellnum);
        cell440.setCellValue(main2311.getSwapMemory());

        Row row45 = sheet.createRow(45);
        Cell cell450 = row45.createCell(cellnum);
        cell450.setCellValue(main2311.getIsApacheRunning());

        Row row46 = sheet.createRow(46);
        Cell cell460 = row46.createCell(cellnum);
        cell460.setCellValue(main2311.getCpuLoad());

        Row row47 = sheet.createRow(47);
        Cell cell470 = row47.createCell(cellnum);
        cell470.setCellValue("8 GB");

        Row row48 = sheet.createRow(48);
        Cell cell480 = row48.createCell(cellnum);
        cell480.setCellValue(main2311.getFreeSpaceRootPartition());

        Row row54 = sheet.createRow(54);
        Cell cell540 = row54.createCell(cellnum);
        cell540.setCellValue(main2312.getSwapMemory());

        Row row55 = sheet.createRow(55);
        Cell cell550 = row55.createCell(cellnum);
        cell550.setCellValue(main2312.getIsApacheRunning());

        Row row56 = sheet.createRow(56);
        Cell cell560 = row56.createCell(cellnum);
        cell560.setCellValue(main2312.getCpuLoad());

        Row row57 = sheet.createRow(57);
        Cell cell570 = row57.createCell(cellnum);
        cell570.setCellValue("8 GB");

        Row row58 = sheet.createRow(58);
        Cell cell580 = row58.createCell(cellnum);
        cell580.setCellValue(main2312.getFreeSpaceRootPartition());

        Row row64 = sheet.createRow(64);
        Cell cell640 = row64.createCell(cellnum);
        cell640.setCellValue(main2317.getSwapMemory());

        Row row65 = sheet.createRow(65);
        Cell cell650 = row65.createCell(cellnum);
        cell650.setCellValue(main2317.getIsApacheRunning());

        Row row66 = sheet.createRow(66);
        Cell cell660 = row66.createCell(cellnum);
        cell660.setCellValue(main2317.getCpuLoad());

        Row row67 = sheet.createRow(67);
        Cell cell670 = row67.createCell(cellnum);
        cell670.setCellValue("4 GB");

        Row row68 = sheet.createRow(68);
        Cell cell680 = row68.createCell(cellnum);
        cell680.setCellValue(main2317.getFreeSpaceRootPartition());

        Row row74 = sheet.createRow(74);
        Cell cell740 = row74.createCell(cellnum);
        cell740.setCellValue(main2318.getSwapMemory());

        Row row75 = sheet.createRow(75);
        Cell cell750 = row75.createCell(cellnum);
        cell750.setCellValue(main2318.getIsApacheRunning());

        Row row76 = sheet.createRow(76);
        Cell cell760 = row76.createCell(cellnum);
        cell760.setCellValue(main2318.getCpuLoad());

        Row row77 = sheet.createRow(77);
        Cell cell770 = row77.createCell(cellnum);
        cell770.setCellValue("4 GB");

        Row row78 = sheet.createRow(78);
        Cell cell780 = row78.createCell(cellnum);
        cell780.setCellValue(main2318.getFreeSpaceRootPartition());

        Row row84 = sheet.createRow(84);
        Cell cell840 = row84.createCell(cellnum);
        cell840.setCellValue(main2323.getSwapMemory());

        Row row85 = sheet.createRow(85);
        Cell cell850 = row85.createCell(cellnum);
        cell850.setCellValue(main2323.getIsApacheRunning());

        Row row86 = sheet.createRow(86);
        Cell cell860 = row86.createCell(cellnum);
        cell860.setCellValue(main2323.getCpuLoad());

        Row row87 = sheet.createRow(87);
        Cell cell870 = row87.createCell(cellnum);
        cell870.setCellValue("2 GB");

        Row row88 = sheet.createRow(88);
        Cell cell880 = row88.createCell(cellnum);
        cell880.setCellValue(main2323.getFreeSpaceRootPartition());

        Row row94 = sheet.createRow(94);
        Cell cell940 = row94.createCell(cellnum);
        cell940.setCellValue(main2324.getSwapMemory());

        Row row95 = sheet.createRow(95);
        Cell cell950 = row95.createCell(cellnum);
        cell950.setCellValue(main2324.getIsApacheRunning());

        Row row96 = sheet.createRow(96);
        Cell cell960 = row96.createCell(cellnum);
        cell960.setCellValue(main2324.getCpuLoad());

        Row row97 = sheet.createRow(97);
        Cell cell970 = row97.createCell(cellnum);
        cell970.setCellValue("2 GB");

        Row row98 = sheet.createRow(98);
        Cell cell980 = row98.createCell(cellnum);
        cell980.setCellValue(main2324.getFreeSpaceRootPartition());

        Row row104 = sheet.createRow(104);
        Cell cell1040 = row104.createCell(cellnum);
        cell1040.setCellValue(main2326.getSwapMemory());

        Row row105 = sheet.createRow(105);
        Cell cell1050 = row105.createCell(cellnum);
        cell1050.setCellValue(main2326.getIsApacheRunning());

        Row row106 = sheet.createRow(106);
        Cell cell1060 = row106.createCell(cellnum);
        cell1060.setCellValue(main2326.getCpuLoad());

        Row row107 = sheet.createRow(107);
        Cell cell1070 = row107.createCell(cellnum);
        cell1070.setCellValue("3 GB");

        Row row108 = sheet.createRow(108);
        Cell cell1080 = row108.createCell(cellnum);
        cell1080.setCellValue(main2326.getFreeSpaceRootPartition());

        try {
            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File(new Date().getTime() + ".xlsx"));
            workbook.write(out);
            out.close();

            System.out.println("xlsx written successfully on disk.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

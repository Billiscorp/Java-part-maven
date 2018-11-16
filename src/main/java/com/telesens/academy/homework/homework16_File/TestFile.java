package com.telesens.academy.homework.homework16_File;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Time;
import java.util.Date;

public class TestFile {

    /*2) Написать Java приложение, которое наполнит файл subscribers.xlsx, случайными данными:
            (путь к файлу взять из 'java-part.properties')
    a) Наполнить таблицу абонентов excel(2000 строк):
            - имена фамилии взять в соответстсвующих файлах (см. 'java-part.properties') со списком имен/фамилий (женских/мужских);
		- возраст генерировать случайно от 5 до 90 (можно использовать Гауссово распределение для этого диапазона)
            (диапазон брать из файла 'java-part.properties')
*/

    private static final int COUNT_COLUMNS = 6;

    public static void main(String[] args) {


        File file = new File("d:/demo.xlsx");

        try(
                XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file))) {
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            for (int r = 0; r <= sheet.getLastRowNum(); r++) {
                XSSFRow row = sheet.getRow(r);
                int number = (int)row.getCell(0).getNumericCellValue();
                String text = row.getCell(1).getStringCellValue();
                double dNumber = row.getCell(2).getNumericCellValue();
                Date date = row.getCell(3).getDateCellValue();
                Time time = new Time(row.getCell(4).getDateCellValue().getTime());
                int formula = (int)row.getCell(5).getNumericCellValue();
                System.out.println(String.format("%3d| %9s|%7.2f| %s|%s| %d",
                        number, text, dNumber, date, time, formula));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}

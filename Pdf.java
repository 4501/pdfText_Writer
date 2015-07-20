import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
 import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.util.Scanner;
public class Pdf {
     
      static void exportToPdf(String name,String bcolor,int nantenna,int nlegs,String planet) throws IOException, DocumentException
     {
         Document doc=new Document();
         Scanner scan=new Scanner(System.in);
       String ant=Integer.toString(nantenna);
       String legs=Integer.toString(nlegs);
       PdfWriter.getInstance(doc,new FileOutputStream("helloo.pdf",true));
       doc.open();
       PdfPTable table=new PdfPTable(5);
       table.addCell(name);
       table.addCell(bcolor);
       table.addCell(ant);
       table.addCell(legs);
       table.addCell(planet);
       
      System.out.println("file updated successfully!!");
         System.out.println("wanna register more aliens press 1 else 2");
          int che=scan.nextInt();
          if(che==1)
          {
              String[] args = {};
              main.main(args);
              
          }
       doc.close();
         
       
         
         
     }
    
}

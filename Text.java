import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import static com.itextpdf.text.pdf.XfaXpathConstructor.XdpPackage.Pdf;
import java.io.*;


public class Text 
{
    static void exportToText(String name,String bcolor,int nantenna,int nlegs,String planet) throws IOException, DocumentException
       {
      
          Scanner scan=new Scanner(System.in);
          FileWriter fw=new FileWriter("aliens.txt",true);//"aliens.txt" is text file in wch details of registered aliens is saved
          PrintWriter pw=new PrintWriter(fw);//PrintWriter object is used to print in text file
          pw.println();
          pw.print(name);
          pw.print("    ");
          pw.print(bcolor);
          pw.print("    ");
          pw.print(nantenna);
          pw.print("    ");
          pw.print(nlegs);
          pw.print("    ");
          pw.print(planet);
           pw.print("    ");
         System.out.println("file updated successfully!!");
         System.out.println("wanna register more aliens press 1 else 2");
          int che=scan.nextInt();
          if(che==1)
          {
              String[] args = {};
              main.main(args);
              
          }
         pw.close();
         
      
    }
    
}

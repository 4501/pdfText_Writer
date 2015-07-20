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



public class main {
    public static void main(String[] args) throws IOException, DocumentException
    {
        Pdf pd=new Pdf();
        Text t=new Text();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter code name: \n");
        String name=scan.nextLine();
        System.out.println("enter  blood color: \n");
         String bcolor=scan.nextLine();
        
        System.out.println("enter no. of antennas: \n");
         int nantenna=scan.nextInt();
        System.out.println("enter no. of legs: \n");
         int nlegs=scan.nextInt();
        System.out.println("enter home planet: ");
         String planet=scan.nextLine();
          System.out.println("enter 1 to export in  plain text format ");
          System.out.println("enter 2 to export in  PDF format ");
          System.out.println("enter 3 to export in  foobar format ");
          int check=scan.nextInt();
          if(check==1) 
          {
           t.exportToText(name,bcolor,nantenna,nlegs,planet);
          }
 
          else
          {
          pd.exportToPdf(name,bcolor,nantenna,nlegs,planet);
          }
          }
    
   
    
}
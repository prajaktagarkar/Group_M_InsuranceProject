package com.insurance.pdf.exporter;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;


import com.insurance.model.Task165GeneratePDF;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


public class UserPDFExporter {

	private List<Task165GeneratePDF> listGeneratePDFs;
    
   public UserPDFExporter(List<Task165GeneratePDF> listGeneratePDFs) {
       this.listGeneratePDFs = listGeneratePDFs;
   }

   private void writeTableHeader(PdfPTable table) {
       PdfPCell cell = new PdfPCell();
      
       cell.setPadding(7);
        
       Font font = FontFactory.getFont(FontFactory.HELVETICA);
      
        
       cell.setPhrase(new Phrase(" ID"));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Policy no"));
    table.addCell(cell);
       cell.setPhrase(new Phrase("Policy Name"));
       table.addCell(cell);
       cell.setPhrase(new Phrase("paymentOption"));
       table.addCell(cell);
       cell.setPhrase(new Phrase("TotalAmount"));
       table.addCell(cell);
       cell.setPhrase(new Phrase("Status"));
       table.addCell(cell);
       cell.setPhrase(new Phrase("additionalInfo"));
       table.addCell(cell);
   }
    
   private void writeTableData(PdfPTable table) {
       for (Task165GeneratePDF generatePDF : listGeneratePDFs) {
           table.addCell(String.valueOf(generatePDF.getId()));
         table.addCell(generatePDF.getPolicyNumber());
           table.addCell(generatePDF.getPolicyName());
      table.addCell(generatePDF.getPaymentOption());
      table.addCell(String.valueOf(generatePDF.getTotalAmount()));
      table.addCell(generatePDF.getStatus());
   
       table.addCell(generatePDF.getAdditionalInfo());
     
           
           
       }
   }
    
   public void export(HttpServletResponse response) throws DocumentException, IOException {
       Document document = new Document(PageSize.A4);
       PdfWriter.getInstance(document, response.getOutputStream());
        
       document.open();
       Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
       font.setSize(18);
      
        
       Paragraph p = new Paragraph("List of Policies", font);
       p.setAlignment(Paragraph.ALIGN_CENTER);
        
       document.add(p);
       
       PdfPTable table = new PdfPTable(7);
       table.setWidthPercentage(100f);
       table.setWidths(new float[] {1.5f, 3.5f, 3.0f,3.5f,3.0f,3.0f,3.5f});
       table.setSpacingBefore(10);
        
       writeTableHeader(table);
       writeTableData(table);
        
       document.add(table);
        
       document.close();
        
   }
}

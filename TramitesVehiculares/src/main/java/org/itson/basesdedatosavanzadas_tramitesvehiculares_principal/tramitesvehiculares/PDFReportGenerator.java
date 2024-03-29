/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_principal.tramitesvehiculares;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import java.awt.Desktop;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.properties.HorizontalAlignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion.Fecha;

/**
 *
 * @author Abe
 */
public class PDFReportGenerator {

    public static void generatePDFReport(List<List<String>> dataList) {
        try {
            PdfWriter writer = new PdfWriter("reporte.pdf");
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            //numero de paginas
            pdf.addEventHandler(PdfDocumentEvent.END_PAGE, new PageNumberEventHandler());

            //imagen del logo
            String origen = "src\\main\\resources\\imagenes\\logo.jpg";
            Image logo = new Image(ImageDataFactory.create(origen));
            logo.scaleToFit(80, 80);
            logo.setFixedPosition(450, 750);
            document.add(logo);

            //titulo
            Paragraph titulo = new Paragraph("Reporte de trámites generados").setBold().setFontSize(18f).setTextAlignment(TextAlignment.CENTER);
            document.add(titulo);

            //Fecha del repote
            Fecha fechaa = new Fecha();
            Paragraph fecha = new Paragraph("Fecha del reporte: " + fechaa).setFontSize(12);
            document.add(fecha);

           

            Table table = new Table(UnitValue.createPercentArray(dataList.get(0).size())).useAllAvailableWidth();

            for (List<String> row : dataList) {
                for (String cellData : row) {
                    table.addCell(cellData);
                }
            }

            document.add(table);
            
            int totalPages = pdf.getNumberOfPages();
            Paragraph totalPagesParagraph = new Paragraph("Número total de páginas: " + totalPages).setFontSize(12);
            document.add(totalPagesParagraph);
            
            document.close();
            openPDFFile("reporte.pdf");
            System.out.println("PDF generado correctamente en: " + "reporte.pdf");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo PDF - " + e.getMessage());
        }
    }

    /**
     * Abre automaticamente el pdf
     *
     * @param filePath origen del pdf
     * @throws IOException
     */
    private static void openPDFFile(String filePath) throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            File file = new File(filePath);
            if (file.exists()) {
                desktop.open(file);
            } else {
                throw new FileNotFoundException("El archivo no existe: " + filePath);
            }
        } else {
            throw new UnsupportedOperationException("No es compatible.");
        }
    }

    /**
     * Permite establecer un numero de paginas en la parte superior izquierda
     */
    private static class PageNumberEventHandler implements IEventHandler {

        @Override
        public void handleEvent(Event event) {
            PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
            PdfCanvas canvas = new PdfCanvas(docEvent.getPage());
            int pageNumber = docEvent.getDocument().getPageNumber(docEvent.getPage());
            PdfFont fuente = null;
            try {
                fuente = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
            } catch (IOException ex) {
                Logger.getLogger(PDFReportGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
            canvas.beginText()
                    .setFontAndSize(fuente, 10)
                    .moveText(36, docEvent.getPage().getPageSize().getHeight() - 36)
                    .showText(String.valueOf(pageNumber))
                    .endText();
        }
    }

}

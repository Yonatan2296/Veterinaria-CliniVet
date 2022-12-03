/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ConexionMySql.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author staw
 */
public class ControladorUsuariosReporte extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/pdf");
        // importar el pdf 
        OutputStream out = response.getOutputStream();
        //*****************************************************

        try {

            Conexion cn = new Conexion();

            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "select  * from usuario";

            con = cn.getConnection();

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            //*******************DOCUMENTO PDF***************************************
            Document documento = new Document();

            //************escribimos el contenido del documento pdf ******************
            PdfWriter.getInstance(documento, out);
            //abre el documento
            documento.open();
            //-*-*-*-*-*-*-titulo del reportes *-*-*-*-*-*-*-*-*-*-*-*-*-*

            Paragraph par1 = new Paragraph();
            // dar color al titulo y tamaño letra
            Font fontitulo = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.BLACK);

            // ruta de imagen foto
            /*
               Image imagenes=Image.getInstance("");
            
            imagenes.setAlignment(Element.ALIGN_LEFT);
            imagenes.scaleToFit(40,40);
            documento.add(imagenes);
             */
            //*****************************************************************
            //titulo
            par1.add(new Phrase("Reporte de Usuario", fontitulo));

            par1.setAlignment(Element.ALIGN_CENTER);

            par1.add(new Phrase(Chunk.NEWLINE));
            par1.add(new Phrase(Chunk.NEWLINE));
            par1.add(new Phrase(Chunk.NEWLINE));

            documento.add(par1);

            // TABLA COLUMNAS
            PdfPTable tabla = new PdfPTable(4);

            PdfPCell celda1 = new PdfPCell(new Paragraph("Codigo", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
            PdfPCell celda2 = new PdfPCell(new Paragraph("Usuario", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
            PdfPCell celda3 = new PdfPCell(new Paragraph("Contraseña", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
            PdfPCell celda4 = new PdfPCell(new Paragraph("Nª Cargo ", FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));

            // CELDA  
            tabla.addCell(celda1);
            tabla.addCell(celda2);
            tabla.addCell(celda3);
            tabla.addCell(celda4);

            while (rs.next()) {

                tabla.addCell(rs.getString("codigo"));
                tabla.addCell(rs.getString("usuario"));
                tabla.addCell(rs.getString("contraseña"));
                tabla.addCell(rs.getString("cargo"));

            }

            documento.add(tabla);

            documento.close();

        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println("Error: " + msg);
            e.printStackTrace();

        }
        out.close();

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

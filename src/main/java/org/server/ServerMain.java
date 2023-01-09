package org.server;

import com.mysql.jdbc.Driver;
import noNamespace.MessageDocument;
import org.apache.xmlbeans.XmlException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

//import javax.swing.text.Document;
import org.w3c.dom.Document;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import java.io.*;
import java.net.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ServerMain {
    public static void main(String[] args) throws IOException, XmlException, ParserConfigurationException, SAXException {
        ServerSocket ss = new ServerSocket(4999);
        while (true) {

            Socket s = ss.accept();
            System.out.println("client is connected");
//        System.out.println("/------------------------------------------------------------------/");
            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader bf = new BufferedReader(in);

            File file = new File("xmlFile");
            PrintWriter pw = new PrintWriter(file);

            String line = bf.readLine();

            while (line != null) {
                pw.println(line);
                line = bf.readLine();
            }

            bf.close();
            in.close();
            pw.close();

//        System.out.println("/------------------------------------------------------------------/");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse("xmlFile");

            Element element = doc.getDocumentElement();
            //System.out.println(element.getTextContent());

            doc.getDocumentElement().normalize();
            NodeList layerConfigList = doc.getElementsByTagName("header");
            Node node = layerConfigList.item(0);

            Element elem = (Element)node;

            //System.out.println(elem.getAttribute("time"));

//        System.out.println("/------------------------------------------------------------------/");

            DB db = new DB();
            try {
                db.isConnected();
                db.insertArticle(elem.getAttribute("time"), element.getTextContent());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

//        System.out.println("/------------------------------------------------------------------/");

        }

    }
}

package com.example.rafp;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;

public class Parser {

    public static void parsXml (File fin){

        try{
            DocumentBuilderFactory dbf;
            DocumentBuilder db ;
            Document doc;

            dbf = DocumentBuilderFactory.newInstance();
            db  = dbf.newDocumentBuilder();
            doc = db.parse(fin);

            NodeList docs = doc.getElementsByTagName("Документ");

            NodeList nodeList = doc.getElementsByTagName("АдрИЮЛИнк");
            NodeList fields = doc.getElementsByTagName("СвСостАк");;

            FileWriter csvWriter = new FileWriter(Constans.path + "new.csv");
            csvWriter.append("Страна головной компании");
            csvWriter.append(", ");
            csvWriter.append("Статус филиала");
            csvWriter.append("\n");

            for (int i=0; i < docs.getLength(); i++)
            {
                Node node = nodeList.item(i);
                Node nd = fields.item(i);
                nd.getAttributes().getNamedItem("СвСостАк");

                csvWriter.append(node.getAttributes().getNamedItem("НаимСтр").getNodeValue());
                csvWriter.append(", ");
                csvWriter.append(nd.getAttributes().getNamedItem("СостАк").getNodeValue());
                csvWriter.append("\n");


            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}

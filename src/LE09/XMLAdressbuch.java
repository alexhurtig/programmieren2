package LE09;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class XMLAdressbuch {

    private static Document doc;

    public static void main(String[] args) {

        File xmlDatei = new File("./src/LE09/adressen2.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlDatei);
        } catch (Exception e) {
            e.printStackTrace();
        }
        getAlleNamen();
        getAdressenDaten("Max", "Mustermann");
    }

    public static ArrayList<Kontakt> getAdressenDaten(String vorname, String nachname) {

        ArrayList<Kontakt> kontakte = new ArrayList<>();
        Kontakt kontakt = new Kontakt();

        NodeList vornamen = doc.getElementsByTagName("Vorname");
        NodeList nachnamen = doc.getElementsByTagName("Nachname");
        NodeList strassen = doc.getElementsByTagName("Strasse");
        NodeList plzs = doc.getElementsByTagName("PLZ");
        NodeList orte = doc.getElementsByTagName("Ort");
        NodeList laender = doc.getElementsByTagName("Land");

        for (int i = 0; i < vornamen.getLength(); i++) {
            if (vornamen.item(i).getTextContent().equals(vorname) && nachnamen.item(i).getTextContent().equals(nachname)) {
                kontakt.setVorname(vornamen.item(i).getTextContent());
                kontakt.setNachname(nachnamen.item(i).getTextContent());
                kontakt.setStrasse(strassen.item(i).getTextContent());
                kontakt.setPlz(plzs.item(i).getTextContent());
                kontakt.setOrt(orte.item(i).getTextContent());
                kontakt.setLand(laender.item(i).getTextContent());
                kontakte.add(kontakt);
            }
        }

        return kontakte;
    }

    public static ArrayList<String> getAlleNamen() {
        System.out.println("Get alle Namen!!!!!!!!!!!!!!!!");
        ArrayList names = new ArrayList();
        NodeList vornamen = doc.getElementsByTagName("Vorname");
        NodeList nachnamen = doc.getElementsByTagName("Nachname");

        for (int i = 0; i < vornamen.getLength(); i++) {
            String[] name = new String[2];
            name[0] = vornamen.item(i).getTextContent();
            name[1] = nachnamen.item(i).getTextContent();
            names.add(name);
        }

        return names;
    }
}


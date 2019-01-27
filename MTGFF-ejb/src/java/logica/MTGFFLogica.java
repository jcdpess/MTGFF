/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entidades.Card;
import entidades.CardSet;
import java.io.File;
import javax.persistence.EntityManager;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author jcdpess
 */
public class MTGFFLogica {

    private static final Logger LOG = Logger.getLogger(MTGFFLogica.class.getName());

    private final EntityManager em;

    private final String setsFolder = "/home/jcdpess/Downloads/AllSetFiles";

    public MTGFFLogica(EntityManager unEm) {
        em = unEm;
    }

    public void persistCards() {
        cardParser("/home/jcdpess/Downloads/pruebaCartas.json");
    }

    public void persistSets() {
        File unFolder = new File(this.setsFolder);
        List<String> listaArchivos = listFilesForFolder(unFolder);
        for (String archivo : listaArchivos) {
            setParser(setsFolder + File.separator + archivo);
        }
    }

    private void setParser(String unFilePath) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(unFilePath));
            JSONObject jsonObject = (JSONObject) obj;
//            parseJson(jsonObject);

            CardSet unSet = new CardSet();

            unSet.setCode((String) jsonObject.get("code"));
            unSet.setName((String) jsonObject.get("name"));
            // TODO Cambiar el tipo del campo releaseDate a fecha.
            unSet.setReleaseDate((String) jsonObject.get("releaseDate"));
            unSet.setType((String) jsonObject.get("type"));

            em.persist(unSet);
            System.out.println(unSet.getCode() + "-" + unSet.getName() + " ha sido agregado correctamente");

//            String author = (String) jsonObject.get("Author");
//            JSONArray names = (JSONArray) jsonObject.get("names");
//            JSONArray colorIdentity = (JSONArray) jsonObject.get("coloridentity");
//
//            System.out.println("names: " + names);
//            System.out.println("color identity: " + colorIdentity);
//            System.out.println("names: ");
//            Iterator<String> iterator = names.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//
//            System.out.println("coloridentity: ");
//            Iterator<String> otherIterator = colorIdentity.iterator();
//            while (otherIterator.hasNext()) {
//                System.out.println(otherIterator.next());
//            }
        } catch (IOException | ParseException e) {
            LOG.log(Level.INFO, "UUUOOOPS, something went wrong.");
        }
    }

    private void cardParser(String unFilePath) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(unFilePath));
            JSONObject jsonObject = (JSONObject) obj;
//            parseJson(jsonObject);

            Card unaCarta = new Card();

//            String author = (String) jsonObject.get("Author");
//            JSONArray names = (JSONArray) jsonObject.get("names");
//            JSONArray colorIdentity = (JSONArray) jsonObject.get("coloridentity");
//
//            System.out.println("names: " + names);
//            System.out.println("color identity: " + colorIdentity);
//            System.out.println("names: ");
//            Iterator<String> iterator = names.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//
//            System.out.println("coloridentity: ");
//            Iterator<String> otherIterator = colorIdentity.iterator();
//            while (otherIterator.hasNext()) {
//                System.out.println(otherIterator.next());
//            }
        } catch (IOException | ParseException e) {
            LOG.log(Level.INFO, "UUUOOOPS, something went wrong.");
        }
    }

    private static void parseJson(JSONObject jsonObject) throws ParseException {

        Set<Object> set = jsonObject.keySet();
        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (jsonObject.get(obj) instanceof JSONArray) {
                System.out.println(obj.toString());
                getArray(jsonObject.get(obj));
            } else {
                if (jsonObject.get(obj) instanceof JSONObject) {
                    parseJson((JSONObject) jsonObject.get(obj));
                } else {
                    System.out.println(obj.toString() + "\t"
                            + jsonObject.get(obj));
                }
            }
        }
    }

    private static void getArray(Object object2) throws ParseException {
        JSONArray jsonArr = (JSONArray) object2;
        for (int k = 0; k < jsonArr.size(); k++) {
            if (jsonArr.get(k) instanceof JSONObject) {
                parseJson((JSONObject) jsonArr.get(k));
            } else {
                System.out.println(jsonArr.get(k));
            }
        }
    }

    private List<String> listFilesForFolder(File folder) {
        List<String> listaArchivos = new ArrayList<>();
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
//                listFilesForFolder(fileEntry);
            } else {
                if (fileEntry.getName().contains(".json")) {
                    listaArchivos.add(fileEntry.getName());
                }
            }
        }
        return listaArchivos;
    }
}

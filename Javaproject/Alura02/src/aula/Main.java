package aula;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Fórmula1").get();
        System.out.println(doc.getElementById("o verde para as equipes inglesas,"));
    }
}

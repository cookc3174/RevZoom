import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class dataScraper {

	public static void main(String[] args) throws IOException {

		String url = "https://www.cars.com/vehicledetail/detail/788120102/overview/";


        Document document = Jsoup.connect(url).get();
        //Elements reviews = document.select("div.cui-read-more");

        for (Element review : document.select("article.review")) {
        	System.out.println("review: " + review.text());
        	System.out.println("");
        }
        
        System.out.println("done.....");
		
	}

}

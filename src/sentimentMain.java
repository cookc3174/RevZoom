import java.util.List;
import java.util.ArrayList;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.pipeline.*;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.Scanner;

public class sentimentMain {
	
	public static String reviewHolder = "";
	
	public static void main(String[] args) throws IOException {
		
		// Calling method from class pipeline
		System.out.println("Loading Stanford CoreNLP libraries...");
		StanfordCoreNLP stanfordCoreNLP = pipeline.getPipeline();
		
		String carMake;
		String carModel;
		String carYear;
		String carUrlContainer;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Car Make: ");
		carMake = scan.nextLine();
		System.out.println("Enter Car Model: ");
		carModel = scan.nextLine();
		System.out.println("Enter Car Year: ");
		carYear = scan.nextLine();
		System.out.println("");
		
		
		carUrlContainer = carMake + "-" + carModel + "-" + carYear;
		//System.out.println(carUrlContainer);
		
		// storing url in string variable
		String firstUrl = "https://www.cars.com/research/" + carUrlContainer + "/consumer-reviews/?pg=1&nr=10";
				
		// Getting reviews from url
		Document documentOne = Jsoup.connect(firstUrl).get();
		
		// Code to get review count from each car web page
        Element countSource = documentOne.getElementsByTag("cars-research-cr-sticky").first();
        String revCount = countSource.attr("total-reviews");
        System.out.println("Number of reviews: " + revCount);
		
		// storing url in string variable
		String url = "https://www.cars.com/research/" + carUrlContainer + "/consumer-reviews/?pg=1&nr=" + revCount;
		
		// Getting reviews from url
        Document document = Jsoup.connect(url).get();
        //Elements reviews = document.select("div.cui-read-more");
        
        // Code to get Cars.com star rating from each car web page
        Element carStarSource = document.getElementsByTag("cars-research-cr-sticky").first();
        String carsStarRatingString = carStarSource.attr("rating");
        // Converting string variable to double
        double carsStarRating = Double.parseDouble(carsStarRatingString);
        //System.out.println("Cars.com Star Rating: " + carsStarRating);
        System.out.println(""); 
        
        /*
        // Code to get review count from each car web page
        Element countSource = document.getElementsByTag("cars-research-cr-sticky").first();
        String revCount = countSource.attr("total-reviews");
        System.out.println("Number of reviews: " + revCount);
        System.out.println("");        
        */
        
        // code for getting review data
        ArrayList<String> REVIEWS = new ArrayList<String>();
        // code for getting reviews
        for (Element review : document.select("p.review-card-text")) {
        	//System.out.println("Intial review: " + review.text());
        	//System.out.println("");
        	reviewHolder = review.text();
        	REVIEWS.add(reviewHolder);
        }
        
        System.out.println("Sentiment Analysis of Car reviews...");
		int counter = 1;
		String sentiment;
		
		for(String review : REVIEWS){
			System.out.println("Analyzing Review " + counter + " of " + revCount);
			//System.out.println("Review " + counter + ":");
		    //System.out.println(review);
		    CoreDocument coreDocument = new CoreDocument(review);
			stanfordCoreNLP.annotate(coreDocument);
			
			List<CoreSentence> sentences = coreDocument.sentences();
			
			// for loop that ranks each of the sentences within one review
			for (CoreSentence sentence : sentences) {
				sentiment = sentence.sentiment();
				
				if (sentiment.equals("Positive") || sentiment.equals("Very positive")) {
					rankingReviews.sentenceScore ++;
					//System.out.println(sentiment + " (" + rankingReviews.sentenceScore + ") " + ": " + sentence);
				}
				else if (sentiment.equals("Negative") || sentiment.equals("Very negative")) {
					rankingReviews.sentenceScore --;
					//System.out.println(sentiment + " (" + rankingReviews.sentenceScore + ") " + ": " + sentence);
				}
				else if (sentiment.equals("Neutral")) {
					//System.out.println(sentiment + " (Score of 0) " + ": " + sentence);
				}
				else {
					System.out.println("Null (" + sentiment + ") : " + sentence);
				}
				
			}
			counter++;
			
			// Ranking each individual review after sentence ranking
			if (rankingReviews.sentenceScore >= 1.0) {
				rankingReviews.reviewScore = 1.0;
				rankingReviews.posReviews ++;
				rankingReviews.numReviews ++;
				rankingReviews.sentenceScore = 0.0;
				//System.out.println("Review Score: " + rankingReviews.reviewScore);
			}
			else if (rankingReviews.sentenceScore <= -1.0) {
				rankingReviews.reviewScore = -1;
				rankingReviews.negReviews ++;
				rankingReviews.numReviews ++;
				rankingReviews.sentenceScore = 0.0;
				//System.out.println("Review Score: " + rankingReviews.reviewScore);
			}
			else {
				rankingReviews.reviewScore = 0.0;
				rankingReviews.sentenceScore = 0.0;
				//System.out.println("Review Score: " + rankingReviews.reviewScore);
			}
			//System.out.println("");
			
		}
		
		// Code for finding rating for car
		System.out.println("-----------------------------/RESULTS/-----------------------------");
		System.out.println("Number of (Positive) and (Negative) Reviews: " + rankingReviews.numReviews);
		System.out.println("Number of Positive Reviews: " + rankingReviews.posReviews);
		System.out.println("Number of Negative Reviews: " + rankingReviews.negReviews);
		
		rankingReviews.ratingCar = rankingReviews.posReviews/rankingReviews.numReviews;
		rankingReviews.starRating = rankingReviews.ratingCar * 5;
		
		System.out.println("Rating: " + rankingReviews.ratingCar);
		System.out.println("Star Rating: " + rankingReviews.starRating);
		System.out.println("Cars.com Star Rating: " + carsStarRating);
		Double accuracyOfTool = rankingReviews.starRating/carsStarRating;
		System.out.printf("Accuracy of RevZoom Rating: %.2f %n", accuracyOfTool);
		System.out.println("-------------------------------------------------------------------");
		
	}

}

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
import java.math.BigDecimal;
import java.math.RoundingMode;

public class sentimentMain {
	
	public static String reviewHolder = "";
	
	public static void main(String[] args) throws IOException {
		
		String carMakeEnter;
		String carModelEnter;
		String carYearEnter;
		String status = "yes";
		String userOption;
		String exitOption;
		String outsideStatus = "yes";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("-----/RevZoom/-----");
		while(outsideStatus.equals("yes")) {
		
			System.out.println("Do you want to update the database or see the graphs? ");
			System.out.println("Type (exit) to end program");
			userOption = scan.nextLine();
		
			if (userOption.equals("update")) {
				// While loop for enter car information into database
				while(status.equals("yes")) {
		
					// User input for car information
					System.out.println("Enter Car Make: ");
					carMakeEnter = scan.nextLine();
					System.out.println("Enter Car Model: ");
					carModelEnter = scan.nextLine();
					System.out.println("Enter Car Year: ");
					carYearEnter = scan.nextLine();
					System.out.println("");
		
					// Calling rankingCars method
					rankingCars(carMakeEnter, carModelEnter, carYearEnter);
			
					System.out.println("Do you want to add another car to the database, yes or no? ");
					status = scan.nextLine();
				
					if (status.equals("no")) {
						break;
					}
				}
			}
		
			else if (userOption.equals("graphs")) {
				//System.out.println("Graphs");
				
				// Code for printing out graphs
				graphDriver.driverClass();
				
			}
		
			else if (userOption.equals("exit")){
				System.out.println("Do you want to exit?");
				exitOption = scan.nextLine();
				if (exitOption.equals("yes"))
					break;
				else if (exitOption.equals("no")) {
					System.out.println("One Second...");
				}
				else {
					System.out.println("Enter yes or no");
					exitOption = scan.nextLine();
				}
			}
		
			else {
				System.out.println("Something went wrong...");
			}
			
		}
		System.out.println("Program has been ended...");
		
		
	}
	
	public static void rankingCars(String carMakeStart, String carModelStart, String carYearStart) throws IOException {
		
				// Calling method from class pipeline
				System.out.println("Loading Stanford CoreNLP libraries...");
				StanfordCoreNLP stanfordCoreNLP = pipeline.getPipeline();
		
				String carMake;
				String carModel;
				String carYear;
				String carUrlContainer;
				
				carMake = carMakeStart;
				carModel = carModelStart;
				carYear = carYearStart;
				
				// Code for inserting car information into URL				
				carUrlContainer = carMake + "-" + carModel + "-" + carYear;
				//System.out.println(carUrlContainer);
				
				// storing url in string variable
				String firstUrl = "https://www.cars.com/research/" + carUrlContainer + "/consumer-reviews/?pg=1&nr=10";
						
				// Getting reviews from url
				Document documentOne = Jsoup.connect(firstUrl)
						//.timeout(200000)
						.ignoreHttpErrors(true)
						.ignoreContentType(true)
		        		.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")  
		        		.referrer("http://www.google.com")   
		        		.timeout(15_000) 
		        		.followRedirects(true)
						.get();
				
				// Code to get review count from each car web page
		        Element countSource = documentOne.getElementsByTag("cars-research-cr-sticky").first();
		        
		        //Code for setting review count
		        //String revCount = countSource.attr("total-reviews");
		        int revCount = 50;
		        
		        System.out.println("Number of reviews: " + revCount);
				
				// storing url in string variable
				String url = "https://www.cars.com/research/" + carUrlContainer + "/consumer-reviews/?pg=1&nr=" + revCount;
				
				// Getting reviews from url
		        Document document = Jsoup.connect(url)
		        		//.timeout(200000)
		        		.ignoreHttpErrors(true)
		        		.ignoreContentType(true)
		        		.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")  
		        		.referrer("http://www.google.com")   
		        		.timeout(15_000) 
		        		.followRedirects(true)
		        		.get();
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
				rankingReviews.ratingCar = rankingReviews.posReviews/rankingReviews.numReviews;
				rankingReviews.starRating = rankingReviews.ratingCar * 5;
				double starRating = rankingReviews.starRating;
				BigDecimal bd = new BigDecimal(starRating).setScale(2,RoundingMode.HALF_UP );
				double starRatingNew = bd.doubleValue();
				Double accuracyOfTool = rankingReviews.starRating/carsStarRating;
				
				//Converting String carYear to double
				int carYearNew = Integer.parseInt(carYear);
				
				// Code for displaying results of car
				System.out.println("-----------------------------/RESULTS/-----------------------------");		
				
				System.out.println("Results For: " + carMake + " " + carModel + " " + carYear + " " + starRatingNew + " " + carsStarRating);
				
				// Inserting car data into database
				javaDatabase.setupCarDatabase(carMake, carModel, carYearNew, starRatingNew, carsStarRating, accuracyOfTool);
				
				System.out.println("");
				System.out.println("Number of (Positive) and (Negative) Reviews: " + rankingReviews.numReviews);
				System.out.println("Number of Positive Reviews: " + rankingReviews.posReviews);
				System.out.println("Number of Negative Reviews: " + rankingReviews.negReviews);
				System.out.println("Rating: " + rankingReviews.ratingCar);
				System.out.println("Star Rating: " + rankingReviews.starRating);
				System.out.println("Cars.com Star Rating: " + carsStarRating);
				System.out.printf("Accuracy of RevZoom Rating: %.2f %n", accuracyOfTool);
				System.out.println("-------------------------------------------------------------------");
				
				
			}
		
	}


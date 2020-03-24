import org.jfree.chart.ChartPanel;

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 
public class carGraphs4 extends ApplicationFrame {
    
    public ArrayList<String> makeGraphsMain = new ArrayList<String>();
	public ArrayList<String> modelGraphsMain = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsMain = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsMain = new ArrayList<Double>();
    
    
    // Code for setting up plot frame
    public carGraphs4( String applicationTitle , String chartTitle ) {
        super(applicationTitle);
        
        // Graph 1
        JFreeChart lineChart = ChartFactory.createLineChart(
           chartTitle,
           "Dodge Car Years","Ratings",
           createDataset(),
           PlotOrientation.VERTICAL,
           true,true,false);
           
        ChartPanel chartPanel = new ChartPanel( lineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 850, 500 ) );
        setContentPane( chartPanel );
     }
    
    // Code for inserting data
     public DefaultCategoryDataset createDataset( ) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        
        
        carsExtract CE = new carsExtract();
        CE.mainRun();
        
        // Display content for dodge makes in database
        System.out.println("Makes: " + carsTransfer.arDodge);
        System.out.println("Models: " + carsTransfer.arDodgeModels);
        System.out.println("Years: " + carsTransfer.arDodgeYears);
        System.out.println("RevRating: " + carsTransfer.arDodgeRevRating);
        System.out.println("CarsRating: " + carsTransfer.arDodgeCarsRating);
        System.out.println("Accuracy: " + carsTransfer.arDodgeAccuracy);
        
        ArrayList<String> dodgeTestList = new ArrayList();
        
        while(true) {
        while(true) {
        	for (int models = 0; models < carsTransfer.arDodgeModels.size() ; models++) {
        		if (carsTransfer.arDodgeModels.get(models).equals("challenger")) {
        			dodgeTestList.add(carsTransfer.arDodgeModels.get(models));
        			for(int newDodge = 0; newDodge < dodgeTestList.size(); newDodge++) {
        				for(int rev = 0; rev < dodgeTestList.size(); rev++) {
        						if(rev == 0) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Challenger", "2017");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Challenger", "2017");
        						}
        						else if(rev == 1) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Challenger", "2018");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Challenger", "2018");
        						}
        						else if (rev == 2) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Challenger", "2019");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Challenger", "2019");
        						}
        						else if (rev == 3) { 
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Challenger", "2020");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Challenger", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with challenger makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arDodgeModels.get(models).equals("charger")) {
        			dodgeTestList.add(carsTransfer.arDodgeModels.get(models));
        			for(int newDodge = 0; newDodge < dodgeTestList.size(); newDodge++) {
        				for(int rev = 0; rev < dodgeTestList.size(); rev++) {
        						if(rev == 4) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Charger", "2017");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Charger", "2017");
        						}
        						else if(rev == 5) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Charger", "2018");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Charger", "2018");
        						}
        						else if (rev == 6) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Charger", "2019");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Charger", "2019");
        						}
        						else if (rev == 7) { 
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Charger", "2020");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Charger", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with charger makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arDodgeModels.get(models).equals("journey")) {
        			dodgeTestList.add(carsTransfer.arDodgeModels.get(models));
        			for(int newDodge = 0; newDodge < dodgeTestList.size(); newDodge++) {
        				for(int rev = 0; rev < dodgeTestList.size(); rev++) {
        						if(rev == 8) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Journey", "2017");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Journey", "2017");
        						}
        						else if(rev == 9) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Journey", "2018");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Journey", "2018");
        						}
        						else if (rev == 10) {
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Journey", "2019");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Journey", "2019");
        						}
        						else if (rev == 11){ 
        							dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Journey", "2020");
        							dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Journey", "2020");
        							return dataset;
        						}
        						else {
        							//System.out.println("Done with journey makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else {
        			System.out.println("Done");
        		}
        		
       		}
        	
       	}
        
        // line plot for RevZoom Ratings
        //dataset2.addValue( 3.8 , "RevZoom" , "2017" );
        //dataset2.addValue( 3.9 , "RevZoom" , "2018" );
        //dataset2.addValue( 4.0 , "RevZoom" ,  "2019" );
        //dataset2.addValue( 4.2 , "RevZoom" , "2020" );
        
        // line plot for Cars.com Ratings
        //dataset.addValue( 5.0 , "Cars.com" , "2017" );
        //dataset.addValue( 4.8 , "Cars.com" , "2018" );
        //dataset.addValue( 4.7 , "Cars.com" ,  "2019" );
        //dataset.addValue( 4.5 , "Cars.com" , "2020" );
        
        
        
        }

        
     }
    
    public static void mainTest4() {
        // Code for plots
        carGraphs4 chart = new carGraphs4(
                "RevZoom" ,
                "Dodge Makes - RevZoom Ratings vs Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

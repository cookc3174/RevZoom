import org.jfree.chart.ChartPanel;

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 
public class carGraphs6 extends ApplicationFrame {
    
    public ArrayList<String> makeGraphsMain = new ArrayList<String>();
	public ArrayList<String> modelGraphsMain = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsMain = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsMain = new ArrayList<Double>();
    
    
    // Code for setting up plot frame
    public carGraphs6( String applicationTitle , String chartTitle ) {
        super(applicationTitle);
        
        // Graph 1
        JFreeChart lineChart = ChartFactory.createLineChart(
           chartTitle,
           "Chevy Car Years","Ratings",
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
        
        // Display content for ford makes in database
        System.out.println("Makes: " + carsTransfer.arChevy);
        System.out.println("Models: " + carsTransfer.arChevyModels);
        System.out.println("Years: " + carsTransfer.arChevyYears);
        System.out.println("RevRating: " + carsTransfer.arChevyRevRating);
        System.out.println("CarsRating: " + carsTransfer.arChevyCarsRating);
        System.out.println("Accuracy: " + carsTransfer.arChevyAccuracy);
        
        ArrayList<String> fordTestList = new ArrayList();
        
        while(true) {
        while(true) {
        	for (int models = 0; models < carsTransfer.arChevyModels.size() ; models++) {
        		if (carsTransfer.arChevyModels.get(models).equals("camaro")) {
        			fordTestList.add(carsTransfer.arChevyModels.get(models));
        			for(int newDodge = 0; newDodge < fordTestList.size(); newDodge++) {
        				for(int rev = 0; rev < fordTestList.size(); rev++) {
        						if(rev == 0) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Camaro", "2017");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Camaro", "2017");
        						}
        						else if(rev == 1) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Camaro", "2018");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Camaro", "2018");
        						}
        						else if (rev == 2) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Camaro", "2019");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Camaro", "2019");
        						}
        						else if (rev == 3) { 
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Camaro", "2020");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Camaro", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with camaro makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arChevyModels.get(models).equals("corvette")) {
        			fordTestList.add(carsTransfer.arChevyModels.get(models));
        			for(int newDodge = 0; newDodge < fordTestList.size(); newDodge++) {
        				for(int rev = 0; rev < fordTestList.size(); rev++) {
        						if(rev == 4) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Corvette", "2017");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Corvette", "2017");
        						}
        						else if(rev == 5) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Corvette", "2018");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Corvette", "2018");
        						}
        						else if (rev == 6) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Corvette", "2019");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Corvette", "2019");
        						}
        						else if (rev == 7) { 
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Corvette", "2020");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Corvette", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with corvette makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arChevyModels.get(models).equals("malibu")) {
        			fordTestList.add(carsTransfer.arChevyModels.get(models));
        			for(int newDodge = 0; newDodge < fordTestList.size(); newDodge++) {
        				for(int rev = 0; rev < fordTestList.size(); rev++) {
        						if(rev == 8) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Malibu", "2017");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Malibu", "2017");
        						}
        						else if(rev == 9) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Malibu", "2018");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Malibu", "2018");
        						}
        						else if (rev == 10) {
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Malibu", "2019");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Malibu", "2019");
        						}
        						else if (rev == 11){ 
        							dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Malibu", "2020");
        							dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Malibu", "2020");
        							return dataset;
        						}
        						else {
        							//System.out.println("Done with malibu makes...");
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
    
    public static void mainTest6() {
        // Code for plots
        carGraphs6 chart = new carGraphs6(
                "RevZoom" ,
                "Chevy Makes - RevZoom Ratings vs Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

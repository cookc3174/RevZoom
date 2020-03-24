import org.jfree.chart.ChartPanel;

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 
public class carGraphs5 extends ApplicationFrame {
    
    public ArrayList<String> makeGraphsMain = new ArrayList<String>();
	public ArrayList<String> modelGraphsMain = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsMain = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsMain = new ArrayList<Double>();
    
    
    // Code for setting up plot frame
    public carGraphs5( String applicationTitle , String chartTitle ) {
        super(applicationTitle);
        
        // Graph 1
        JFreeChart lineChart = ChartFactory.createLineChart(
           chartTitle,
           "Ford Car Years","Ratings",
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
        System.out.println("Makes: " + carsTransfer.arFord);
        System.out.println("Models: " + carsTransfer.arFordModels);
        System.out.println("Years: " + carsTransfer.arFordYears);
        System.out.println("RevRating: " + carsTransfer.arFordRevRating);
        System.out.println("CarsRating: " + carsTransfer.arFordCarsRating);
        System.out.println("Accuracy: " + carsTransfer.arFordAccuracy);
        
        ArrayList<String> fordTestList = new ArrayList();
        
        while(true) {
        while(true) {
        	for (int models = 0; models < carsTransfer.arFordModels.size() ; models++) {
        		if (carsTransfer.arFordModels.get(models).equals("fusion")) {
        			fordTestList.add(carsTransfer.arFordModels.get(models));
        			for(int newDodge = 0; newDodge < fordTestList.size(); newDodge++) {
        				for(int rev = 0; rev < fordTestList.size(); rev++) {
        						if(rev == 0) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Fusion", "2017");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Fusion", "2017");
        						}
        						else if(rev == 1) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Fusion", "2018");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Fusion", "2018");
        						}
        						else if (rev == 2) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Fusion", "2019");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Fusion", "2019");
        						}
        						else if (rev == 3) { 
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Fusion", "2020");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Fusion", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with fusion makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arFordModels.get(models).equals("mustang")) {
        			fordTestList.add(carsTransfer.arFordModels.get(models));
        			for(int newDodge = 0; newDodge < fordTestList.size(); newDodge++) {
        				for(int rev = 0; rev < fordTestList.size(); rev++) {
        						if(rev == 4) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Mustang", "2017");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Mustang", "2017");
        						}
        						else if(rev == 5) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Mustang", "2018");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Mustang", "2018");
        						}
        						else if (rev == 6) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Mustang", "2019");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Mustang", "2019");
        						}
        						else if (rev == 7) { 
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Mustang", "2020");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Mustang", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with mustang makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arFordModels.get(models).equals("escape")) {
        			fordTestList.add(carsTransfer.arFordModels.get(models));
        			for(int newDodge = 0; newDodge < fordTestList.size(); newDodge++) {
        				for(int rev = 0; rev < fordTestList.size(); rev++) {
        						if(rev == 8) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Escape", "2017");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Escape", "2017");
        						}
        						else if(rev == 9) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Escape", "2018");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Escape", "2018");
        						}
        						else if (rev == 10) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Escape", "2019");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Escape", "2019");
        						}
        						else if (rev == 11){ 
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Escape", "2020");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Escape", "2020");
        							return dataset;
        						}
        						else {
        							//System.out.println("Done with escape makes...");
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
    
    public static void mainTest5() {
        // Code for plots
        carGraphs5 chart = new carGraphs5(
                "RevZoom" ,
                "Ford Makes - RevZoom Ratings vs Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

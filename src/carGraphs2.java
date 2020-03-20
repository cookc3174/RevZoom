import org.jfree.chart.ChartPanel;

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 
public class carGraphs2 extends ApplicationFrame {
    
    public ArrayList<String> makeGraphsMain = new ArrayList<String>();
	public ArrayList<String> modelGraphsMain = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsMain = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsMain = new ArrayList<Double>();
    
    
    // Code for setting up plot frame
    public carGraphs2( String applicationTitle , String chartTitle ) {
        super(applicationTitle);
        
        // Graph 1
        JFreeChart lineChart = ChartFactory.createLineChart(
           chartTitle,
           "Mustang Car Years","Ratings",
           createDataset(),
           PlotOrientation.VERTICAL,
           true,true,false);
           
        ChartPanel chartPanel = new ChartPanel( lineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
     }
    
    // Code for inserting data
     public DefaultCategoryDataset createDataset( ) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        
        
        carsExtract CE = new carsExtract();
        CE.mainRun();
        
        // Display content for dodge makes in database
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
        		if (carsTransfer.arFordModels.get(models).equals("mustang")) {
        			fordTestList.add(carsTransfer.arFordModels.get(models));
        			for(int newFord = 0; newFord < fordTestList.size(); newFord++) {
        				for(int rev = 0; rev < fordTestList.size(); rev++) {
        						if(rev == 0) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom", "2017");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com", "2017");
        						}
        						else if(rev == 1) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom", "2018");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com", "2018");
        						}
        						else if (rev == 2) {
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom", "2019");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com", "2019");
        						}
        						else if (rev == 3) { 
        							dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom", "2020");
        							dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com", "2020");
        						}
        						
        						else {
        							return dataset;
        						}
      
        					
        				}
        				
        			}
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
    
    public static void mainTest2() {
        // Code for plots
        carGraphs2 chart = new carGraphs2(
                "RevZoom" ,
                "Mustang - RevZoom Ratings vs Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

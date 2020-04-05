import org.jfree.chart.ChartPanel;

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class carGraphs9 extends ApplicationFrame {
    
    public ArrayList<String> makeGraphsMain = new ArrayList<String>();
	public ArrayList<String> modelGraphsMain = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsMain = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsMain = new ArrayList<Double>();
	
    public ArrayList<Double> summaryListFordRev1 = new ArrayList();
    public ArrayList<Double> summaryListFordRev2 = new ArrayList();
    public ArrayList<Double> summaryListFordRev3 = new ArrayList();
    public ArrayList<Double> summaryListFordRev4 = new ArrayList();
    public ArrayList<Double> summaryListFordCar1 = new ArrayList();
    public ArrayList<Double> summaryListFordCar2 = new ArrayList();
    public ArrayList<Double> summaryListFordCar3 = new ArrayList();
    public ArrayList<Double> summaryListFordCar4 = new ArrayList();
    
    public double sumFordR1;
    public double sumFordR2;
    public double sumFordR3;
    public double sumFordR4;
    public double sumFordC1;
    public double sumFordC2;
    public double sumFordC3;
    public double sumFordC4;

    
    
    // Code for setting up plot frame
    public carGraphs9( String applicationTitle , String chartTitle ) {
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
        
        ArrayList<String> TestList1 = new ArrayList();
        ArrayList<String> TestList2 = new ArrayList();
        ArrayList<String> TestList3 = new ArrayList();
        
        //while(true) {
        while(true) {
        	for (int models = 0; models < carsTransfer.arFordModels.size() ; models++) {
        		if (carsTransfer.arFordModels.get(models).equals("fusion")) {
        			TestList1.add(carsTransfer.arFordModels.get(models));
        			for(int newFord = 0; newFord < TestList1.size(); newFord++) {
        				for(int rev = 0; rev < TestList1.size(); rev++) {
        						if(rev == 0) {
        							summaryListFordRev1.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar1.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2017");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2017");
        						}
        						else if(rev == 1) {
        							summaryListFordRev2.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar2.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2018");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2018");
        						}
        						else if (rev == 2) {
        							summaryListFordRev3.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar3.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2019");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2019");
        						}
        						else if (rev == 3) { 
        							summaryListFordRev4.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar4.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2020");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with camaro makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arFordModels.get(models).equals("mustang")) {
        			TestList2.add(carsTransfer.arFordModels.get(models));
        			for(int newFord = 0; newFord < TestList2.size(); newFord++) {
        				for(int rev = 0; rev < TestList2.size(); rev++) {
        						if(rev == 4) {
        							summaryListFordRev1.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar1.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2017");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2017");
        						}
        						else if(rev == 5) {
        							summaryListFordRev2.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar2.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2018");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2018");
        						}
        						else if (rev == 6) {
        							summaryListFordRev3.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar3.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2019");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2019");
        						}
        						else if (rev == 7) { 
        							summaryListFordRev4.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar4.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2020");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with corvette makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arFordModels.get(models).equals("escape")) {
        			TestList3.add(carsTransfer.arFordModels.get(models));
        			for(int newFord = 0; newFord < TestList3.size(); newFord++) {
        				for(int rev = 0; rev < TestList3.size(); rev++) {
        						if(rev == 8) {
        							summaryListFordRev1.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar1.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2017");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2017");
        						}
        						else if(rev == 9) {
        							summaryListFordRev2.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar2.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2018");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2018");
        						}
        						else if (rev == 10) {
        							summaryListFordRev3.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar3.add(carsTransfer.arFordCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arFordRevRating.get(rev), "RevZoom - Ford", "2019");
        							//dataset.addValue(carsTransfer.arFordCarsRating.get(rev), "Cars.com - Ford", "2019");
        						}
        						else if (rev == 11){ 
        							summaryListFordRev4.add(carsTransfer.arFordRevRating.get(rev));
        							summaryListFordCar4.add(carsTransfer.arFordCarsRating.get(rev));
        							
        							for(int i1 = 0; i1 < summaryListFordRev1.size(); i1++) {
        								sumFordR1 += (summaryListFordRev1.get(i1)/2)/84;
        							}
        							for(int i2 = 0; i2 < summaryListFordRev2.size(); i2++) {
        								sumFordR2 += (summaryListFordRev2.get(i2)/2)/84;
        							}
        							for(int i3 = 0; i3 < summaryListFordRev3.size(); i3++) {
        								sumFordR3 += (summaryListFordRev3.get(i3)/2)/84;
        							}
        							for(int i4 = 0; i4 < summaryListFordRev4.size(); i4++) {
        								sumFordR4 += (summaryListFordRev4.get(i4)/2)/84;
        							}
        							for(int i5 = 0; i5 < summaryListFordCar1.size(); i5++) {
        								sumFordC1 += (summaryListFordCar1.get(i5)/2)/84;
        							}
        							for(int i6 = 0; i6 < summaryListFordCar2.size(); i6++) {
        								sumFordC2 += (summaryListFordCar2.get(i6)/2)/84;
        							}
        							for(int i7 = 0; i7 < summaryListFordCar3.size(); i7++) {
        								sumFordC3 += (summaryListFordCar3.get(i7)/2)/84;
        							}
        							for(int i8 = 0; i8 < summaryListFordCar4.size(); i8++) {
        								sumFordC4 += (summaryListFordCar4.get(i8)/2)/84;
        							}
        							
        							dataset.addValue(sumFordR1, "RevZoom - Ford", "2017");
        							dataset.addValue(sumFordR2, "Cars.com - Ford", "2017");
        							dataset.addValue(sumFordR3, "RevZoom - Ford", "2018");
        							dataset.addValue(sumFordR4, "Cars.com - Ford", "2018");
        							dataset.addValue(sumFordC1, "RevZoom - Ford", "2019");
        							dataset.addValue(sumFordC2, "Cars.com - Ford", "2019");
        							dataset.addValue(sumFordC3, "RevZoom - Ford", "2020");
        							dataset.addValue(sumFordC4, "Cars.com - Ford", "2020");
        							
        							
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
        		
       		} // end of outer for-loop
        	
       	} // end of inner while-loop
        
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
        
        
        
        //} // end of outer while-loop

        
     }
    
    public static void mainTest9() {
        // Code for plots
        carGraphs9 chart = new carGraphs9(
                "RevZoom" ,
                "Ford Makes - Average RevZoom Ratings vs Average Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

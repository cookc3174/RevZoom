import org.jfree.chart.ChartPanel;

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class carGraphs7 extends ApplicationFrame {
    
    public ArrayList<String> makeGraphsMain = new ArrayList<String>();
	public ArrayList<String> modelGraphsMain = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsMain = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsMain = new ArrayList<Double>();
	
    public ArrayList<Double> summaryListChevyRev1 = new ArrayList();
    public ArrayList<Double> summaryListChevyRev2 = new ArrayList();
    public ArrayList<Double> summaryListChevyRev3 = new ArrayList();
    public ArrayList<Double> summaryListChevyRev4 = new ArrayList();
    public ArrayList<Double> summaryListChevyCar1 = new ArrayList();
    public ArrayList<Double> summaryListChevyCar2 = new ArrayList();
    public ArrayList<Double> summaryListChevyCar3 = new ArrayList();
    public ArrayList<Double> summaryListChevyCar4 = new ArrayList();
    
    public double sumChevyR1;
    public double sumChevyR2;
    public double sumChevyR3;
    public double sumChevyR4;
    public double sumChevyC1;
    public double sumChevyC2;
    public double sumChevyC3;
    public double sumChevyC4;

    
    
    // Code for setting up plot frame
    public carGraphs7( String applicationTitle , String chartTitle ) {
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
        
        ArrayList<String> TestList1 = new ArrayList();
        ArrayList<String> TestList2 = new ArrayList();
        ArrayList<String> TestList3 = new ArrayList();
        
        //while(true) {
        while(true) {
        	for (int models = 0; models < carsTransfer.arChevyModels.size() ; models++) {
        		if (carsTransfer.arChevyModels.get(models).equals("camaro")) {
        			TestList1.add(carsTransfer.arChevyModels.get(models));
        			for(int newDodge = 0; newDodge < TestList1.size(); newDodge++) {
        				for(int rev = 0; rev < TestList1.size(); rev++) {
        						if(rev == 0) {
        							summaryListChevyRev1.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar1.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2017");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2017");
        						}
        						else if(rev == 1) {
        							summaryListChevyRev2.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar2.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2018");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2018");
        						}
        						else if (rev == 2) {
        							summaryListChevyRev3.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar3.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2019");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2019");
        						}
        						else if (rev == 3) { 
        							summaryListChevyRev4.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar4.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2020");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with camaro makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arChevyModels.get(models).equals("corvette")) {
        			TestList2.add(carsTransfer.arChevyModels.get(models));
        			for(int newDodge = 0; newDodge < TestList2.size(); newDodge++) {
        				for(int rev = 0; rev < TestList2.size(); rev++) {
        						if(rev == 4) {
        							summaryListChevyRev1.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar1.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2017");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2017");
        						}
        						else if(rev == 5) {
        							summaryListChevyRev2.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar2.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2018");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2018");
        						}
        						else if (rev == 6) {
        							summaryListChevyRev3.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar3.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2019");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2019");
        						}
        						else if (rev == 7) { 
        							summaryListChevyRev4.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar4.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2020");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with corvette makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arChevyModels.get(models).equals("malibu")) {
        			TestList3.add(carsTransfer.arChevyModels.get(models));
        			for(int newDodge = 0; newDodge < TestList3.size(); newDodge++) {
        				for(int rev = 0; rev < TestList3.size(); rev++) {
        						if(rev == 8) {
        							summaryListChevyRev1.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar1.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2017");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2017");
        						}
        						else if(rev == 9) {
        							summaryListChevyRev2.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar2.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2018");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2018");
        						}
        						else if (rev == 10) {
        							summaryListChevyRev3.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar3.add(carsTransfer.arChevyCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arChevyRevRating.get(rev), "RevZoom - Chevy", "2019");
        							//dataset.addValue(carsTransfer.arChevyCarsRating.get(rev), "Cars.com - Chevy", "2019");
        						}
        						else if (rev == 11){ 
        							summaryListChevyRev4.add(carsTransfer.arChevyRevRating.get(rev));
        							summaryListChevyCar4.add(carsTransfer.arChevyCarsRating.get(rev));
        							
        							for(int i1 = 0; i1 < summaryListChevyRev1.size(); i1++) {
        								sumChevyR1 += (summaryListChevyRev1.get(i1)/2)/84;
        							}
        							for(int i2 = 0; i2 < summaryListChevyRev2.size(); i2++) {
        								sumChevyR2 += (summaryListChevyRev2.get(i2)/2)/84;
        							}
        							for(int i3 = 0; i3 < summaryListChevyRev3.size(); i3++) {
        								sumChevyR3 += (summaryListChevyRev3.get(i3)/2)/84;
        							}
        							for(int i4 = 0; i4 < summaryListChevyRev4.size(); i4++) {
        								sumChevyR4 += (summaryListChevyRev4.get(i4)/2)/84;
        							}
        							for(int i5 = 0; i5 < summaryListChevyCar1.size(); i5++) {
        								sumChevyC1 += (summaryListChevyCar1.get(i5)/2)/84;
        							}
        							for(int i6 = 0; i6 < summaryListChevyCar2.size(); i6++) {
        								sumChevyC2 += (summaryListChevyCar2.get(i6)/2)/84;
        							}
        							for(int i7 = 0; i7 < summaryListChevyCar3.size(); i7++) {
        								sumChevyC3 += (summaryListChevyCar3.get(i7)/2)/84;
        							}
        							for(int i8 = 0; i8 < summaryListChevyCar4.size(); i8++) {
        								sumChevyC4 += (summaryListChevyCar4.get(i8)/2)/84;
        							}
        							
        							dataset.addValue(sumChevyR1, "RevZoom - Chevy", "2017");
        							dataset.addValue(sumChevyR2, "Cars.com - Chevy", "2017");
        							dataset.addValue(sumChevyR3, "RevZoom - Chevy", "2018");
        							dataset.addValue(sumChevyR4, "Cars.com - Chevy", "2018");
        							dataset.addValue(sumChevyC1, "RevZoom - Chevy", "2019");
        							dataset.addValue(sumChevyC2, "Cars.com - Chevy", "2019");
        							dataset.addValue(sumChevyC3, "RevZoom - Chevy", "2020");
        							dataset.addValue(sumChevyC4, "Cars.com - Chevy", "2020");
        							
        							
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
    
    public static void mainTest7() {
        // Code for plots
        carGraphs7 chart = new carGraphs7(
                "RevZoom" ,
                "Chevy Makes - Average RevZoom Ratings vs Average Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

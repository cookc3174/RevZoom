import org.jfree.chart.ChartPanel;

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class carGraphs8 extends ApplicationFrame {
    
    public ArrayList<String> makeGraphsMain = new ArrayList<String>();
	public ArrayList<String> modelGraphsMain = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsMain = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsMain = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsMain = new ArrayList<Double>();
	
    public ArrayList<Double> summaryListDodgeRev1 = new ArrayList();
    public ArrayList<Double> summaryListDodgeRev2 = new ArrayList();
    public ArrayList<Double> summaryListDodgeRev3 = new ArrayList();
    public ArrayList<Double> summaryListDodgeRev4 = new ArrayList();
    public ArrayList<Double> summaryListDodgeCar1 = new ArrayList();
    public ArrayList<Double> summaryListDodgeCar2 = new ArrayList();
    public ArrayList<Double> summaryListDodgeCar3 = new ArrayList();
    public ArrayList<Double> summaryListDodgeCar4 = new ArrayList();
    
    public double sumDodgeR1;
    public double sumDodgeR2;
    public double sumDodgeR3;
    public double sumDodgeR4;
    public double sumDodgeC1;
    public double sumDodgeC2;
    public double sumDodgeC3;
    public double sumDodgeC4;

    
    
    // Code for setting up plot frame
    public carGraphs8( String applicationTitle , String chartTitle ) {
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
        
        // Display content for ford makes in database
        System.out.println("Makes: " + carsTransfer.arDodge);
        System.out.println("Models: " + carsTransfer.arDodgeModels);
        System.out.println("Years: " + carsTransfer.arDodgeYears);
        System.out.println("RevRating: " + carsTransfer.arDodgeRevRating);
        System.out.println("CarsRating: " + carsTransfer.arDodgeCarsRating);
        System.out.println("Accuracy: " + carsTransfer.arDodgeAccuracy);
        
        ArrayList<String> TestList1 = new ArrayList();
        ArrayList<String> TestList2 = new ArrayList();
        ArrayList<String> TestList3 = new ArrayList();
        
        //while(true) {
        while(true) {
        	for (int models = 0; models < carsTransfer.arDodgeModels.size() ; models++) {
        		if (carsTransfer.arDodgeModels.get(models).equals("challenger")) {
        			TestList1.add(carsTransfer.arDodgeModels.get(models));
        			for(int newDodge = 0; newDodge < TestList1.size(); newDodge++) {
        				for(int rev = 0; rev < TestList1.size(); rev++) {
        						if(rev == 0) {
        							summaryListDodgeRev1.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar1.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2017");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2017");
        						}
        						else if(rev == 1) {
        							summaryListDodgeRev2.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar2.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2018");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2018");
        						}
        						else if (rev == 2) {
        							summaryListDodgeRev3.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar3.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2019");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2019");
        						}
        						else if (rev == 3) { 
        							summaryListDodgeRev4.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar4.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2020");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with camaro makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arDodgeModels.get(models).equals("charger")) {
        			TestList2.add(carsTransfer.arDodgeModels.get(models));
        			for(int newDodge = 0; newDodge < TestList2.size(); newDodge++) {
        				for(int rev = 0; rev < TestList2.size(); rev++) {
        						if(rev == 4) {
        							summaryListDodgeRev1.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar1.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2017");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2017");
        						}
        						else if(rev == 5) {
        							summaryListDodgeRev2.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar2.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2018");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2018");
        						}
        						else if (rev == 6) {
        							summaryListDodgeRev3.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar3.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2019");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2019");
        						}
        						else if (rev == 7) { 
        							summaryListDodgeRev4.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar4.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2020");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2020");
        						}
        						
        						else {
        							//System.out.println("Done with corvette makes...");
        						}
      
        					
        				}
        				
        			}
        		}
        		
        		else if (carsTransfer.arDodgeModels.get(models).equals("journey")) {
        			TestList3.add(carsTransfer.arDodgeModels.get(models));
        			for(int newDodge = 0; newDodge < TestList3.size(); newDodge++) {
        				for(int rev = 0; rev < TestList3.size(); rev++) {
        						if(rev == 8) {
        							summaryListDodgeRev1.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar1.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2017");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2017");
        						}
        						else if(rev == 9) {
        							summaryListDodgeRev2.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar2.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2018");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2018");
        						}
        						else if (rev == 10) {
        							summaryListDodgeRev3.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar3.add(carsTransfer.arDodgeCarsRating.get(rev));
        							//dataset.addValue(carsTransfer.arDodgeRevRating.get(rev), "RevZoom - Dodge", "2019");
        							//dataset.addValue(carsTransfer.arDodgeCarsRating.get(rev), "Cars.com - Dodge", "2019");
        						}
        						else if (rev == 11){ 
        							summaryListDodgeRev4.add(carsTransfer.arDodgeRevRating.get(rev));
        							summaryListDodgeCar4.add(carsTransfer.arDodgeCarsRating.get(rev));
        							
        							for(int i1 = 0; i1 < summaryListDodgeRev1.size(); i1++) {
        								sumDodgeR1 += (summaryListDodgeRev1.get(i1)/2)/84;
        							}
        							for(int i2 = 0; i2 < summaryListDodgeRev2.size(); i2++) {
        								sumDodgeR2 += (summaryListDodgeRev2.get(i2)/2)/84;
        							}
        							for(int i3 = 0; i3 < summaryListDodgeRev3.size(); i3++) {
        								sumDodgeR3 += (summaryListDodgeRev3.get(i3)/2)/84;
        							}
        							for(int i4 = 0; i4 < summaryListDodgeRev4.size(); i4++) {
        								sumDodgeR4 += (summaryListDodgeRev4.get(i4)/2)/84;
        							}
        							for(int i5 = 0; i5 < summaryListDodgeCar1.size(); i5++) {
        								sumDodgeC1 += (summaryListDodgeCar1.get(i5)/2)/84;
        							}
        							for(int i6 = 0; i6 < summaryListDodgeCar2.size(); i6++) {
        								sumDodgeC2 += (summaryListDodgeCar2.get(i6)/2)/84;
        							}
        							for(int i7 = 0; i7 < summaryListDodgeCar3.size(); i7++) {
        								sumDodgeC3 += (summaryListDodgeCar3.get(i7)/2)/84;
        							}
        							for(int i8 = 0; i8 < summaryListDodgeCar4.size(); i8++) {
        								sumDodgeC4 += (summaryListDodgeCar4.get(i8)/2)/84;
        							}
        							
        							dataset.addValue(sumDodgeR1, "RevZoom - Dodge", "2017");
        							dataset.addValue(sumDodgeR2, "Cars.com - Dodge", "2017");
        							dataset.addValue(sumDodgeR3, "RevZoom - Dodge", "2018");
        							dataset.addValue(sumDodgeR4, "Cars.com - Dodge", "2018");
        							dataset.addValue(sumDodgeC1, "RevZoom - Dodge", "2019");
        							dataset.addValue(sumDodgeC2, "Cars.com - Dodge", "2019");
        							dataset.addValue(sumDodgeC3, "RevZoom - Dodge", "2020");
        							dataset.addValue(sumDodgeC4, "Cars.com - Dodge", "2020");
        							
        							
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
    
    public static void mainTest8() {
        // Code for plots
        carGraphs8 chart = new carGraphs8(
                "RevZoom" ,
                "Dodge Makes - Average RevZoom Ratings vs Average Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

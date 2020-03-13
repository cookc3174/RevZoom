import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 
public class carGraphs extends ApplicationFrame {
    
    // Code for setting up plot frame
    public carGraphs( String applicationTitle , String chartTitle ) {
        super(applicationTitle);
        JFreeChart lineChart = ChartFactory.createLineChart(
           chartTitle,
           "Car Years","Ratings",
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
        
        // line plot for RevZoom Ratings
        dataset.addValue( 3.8 , "RevZoom" , "2017" );
        dataset.addValue( 3.9 , "RevZoom" , "2018" );
        dataset.addValue( 4.0 , "RevZoom" ,  "2019" );
        dataset.addValue( 4.2 , "RevZoom" , "2020" );
        
        // line plot for Cars.com Ratings
        dataset.addValue( 5.0 , "Cars.com" , "2017" );
        dataset.addValue( 4.8 , "Cars.com" , "2018" );
        dataset.addValue( 4.7 , "Cars.com" ,  "2019" );
        dataset.addValue( 4.5 , "Cars.com" , "2020" );

        return dataset;
     }
    
    public static void main(String[] args) {
        // Code for plots
        carGraphs chart = new carGraphs(
                "RevZoom" ,
                "RevZoom Ratings vs Cars.com Ratings");

             chart.pack( );
             RefineryUtilities.centerFrameOnScreen( chart );
             chart.setVisible( true );
    }
 
}

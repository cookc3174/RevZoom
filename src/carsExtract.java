import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;



public class carsExtract {
	
	//public int i;
	//public String[] makeCarArr = new String[100];
	//public String[] modelCarArr = new String[100];
	//public int[] yearCarArr = new int[100];
	//public double[] revratingCarArr = new double[100];
	//public double[] carsratingCarArr = new double[100];
	//public double[] accuracyCarArr = new double[100];
	
	public ArrayList<Integer> i = new ArrayList<Integer>();
	public ArrayList<String> makeCarArr = new ArrayList<String>();
	public ArrayList<String> modelCarArr = new ArrayList<String>();
	public ArrayList<Integer> yearCarArr = new ArrayList<Integer>();
	public ArrayList<Double> revratingCarArr = new ArrayList<Double>();
	public ArrayList<Double> carsratingCarArr = new ArrayList<Double>();
	public ArrayList<Double> accuracyCarArr = new ArrayList<Double>();
	
	public ArrayList<String> makeGraphsCEMain1 = new ArrayList<String>();
	public ArrayList<String> modelGraphsCEMain1 = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsCEMain1 = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsCEMain1 = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsCEMain1 = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsCEMain1 = new ArrayList<Double>();
	
	public ArrayList<String> makeGraphsCEMain2 = new ArrayList<String>();
	public ArrayList<String> modelGraphsCEMain2 = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsCEMain2 = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsCEMain2 = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsCEMain2 = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsCEMain2 = new ArrayList<Double>();
	
	public ArrayList<String> makeGraphsCEMain3 = new ArrayList<String>();
	public ArrayList<String> modelGraphsCEMain3 = new ArrayList<String>();
	public ArrayList<Integer> yearGraphsCEMain3 = new ArrayList<Integer>();
	public ArrayList<Double> revratingGraphsCEMain3 = new ArrayList<Double>();
	public ArrayList<Double> carsratingGraphsCEMain3 = new ArrayList<Double>();
	public ArrayList<Double> accuracyGraphsCEMain3 = new ArrayList<Double>();
	
	private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db/carDatabase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
    public void selectAll(){
        String sql = "SELECT id, make, model, year, revrating, carsrating, accuracy FROM Ratings";

		
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                //System.out.println(rs.getInt("id") +  "\t" + 
                                   //rs.getString("make") + "\t" +
                                   //rs.getString("model") + "\t" +
                                   //rs.getInt("year") + "\t" +
                                   //rs.getDouble("revrating") + "\t" +
                                   //rs.getDouble("carsrating") + "\t" +
                                   //rs.getDouble("accuracy"));
            	
            	//rs.getInt("id"); 
                //makeCarArr[i] += rs.getString("make");
                //modelCarArr[i] += rs.getString("model");
                //yearCarArr[i] += rs.getInt("year");
                //revratingCarArr[i] += rs.getDouble("revrating");
                //carsratingCarArr[i] += rs.getDouble("carsrating");
                //accuracyCarArr[i] += rs.getDouble("accuracy");
                //i++;
                
            	makeCarArr.add(rs.getString("make"));
            	modelCarArr.add(rs.getString("model"));
            	yearCarArr.add(rs.getInt("year"));
            	revratingCarArr.add(rs.getDouble("revrating"));
            	carsratingCarArr.add(rs.getDouble("carsrating"));
            	accuracyCarArr.add(rs.getDouble("accuracy"));           
            	
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //----------------------Test Cases for RevZoom----------------------
    
    //String makeGraphs, String modelGraphs, int yearGraphs, Double revratingGraphs, Double carsratingGraphs, Double accuracyGraphs
    
    
    // Code for printing Dodge makes
	//#########################################################################################################################
    public void dodgeTest(ArrayList<String> makeGraphs, ArrayList<String> modelGraphs, ArrayList<Integer> yearGraphs, ArrayList<Double> revratingGraphs, ArrayList<Double> carsratingGraphs, ArrayList<Double> accuracyGraphs) {  	
    	
    	selectAll();
    	
    	for (int j = 0; j < makeCarArr.size(); j++ ) {
    		if(makeCarArr.get(j).equals("dodge")) {
    			carsTransfer.arDodge.add(makeCarArr.get(j));
    			for(String dodgeNames: carsTransfer.arDodge) {
    				//System.out.println(dodgeNames);    				
    				//makeGraphs = carsTransfer.arDodge;
    				makeGraphs.add(dodgeNames);
    			}
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			carsTransfer.arDodgeModels.add(modelCarArr.get(j));
    			for(String dodgeNamesModel: carsTransfer.arDodgeModels) {
    				//System.out.println(dodgeNamesModel);
    			}
    			modelGraphs = carsTransfer.arDodgeModels;
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			carsTransfer.arDodgeYears.add(yearCarArr.get(j));
    			for(Integer dodgeNamesYear: carsTransfer.arDodgeYears) {
    				//System.out.println(dodgeNamesYear);
    			}
    			yearGraphs = carsTransfer.arDodgeYears;
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			carsTransfer.arDodgeRevRating.add(revratingCarArr.get(j));
    			for(Double dodgeNamesRevRating: carsTransfer.arDodgeRevRating) {
    				//System.out.println(dodgeNamesRevRating);
    			}
    			revratingGraphs = carsTransfer.arDodgeRevRating;
    		}
    		if(makeCarArr.get(j).equals("dodge")) {    			
    			carsTransfer.arDodgeCarsRating.add(carsratingCarArr.get(j));
    			for(Double dodgeNamesCarsRating: carsTransfer.arDodgeCarsRating) {
    				//System.out.println(dodgeNamesCarsRating);
    			}
    			carsratingGraphs = carsTransfer.arDodgeCarsRating;
    		}
    		if(makeCarArr.get(j).equals("dodge")) {    			
    			carsTransfer.arDodgeAccuracy.add(accuracyCarArr.get(j));
    			for(Double dodgeNamesAccuracy: carsTransfer.arDodgeAccuracy) {
    				//System.out.println(dodgeNamesAccuracy);
    			}
    			accuracyGraphs = carsTransfer.arDodgeAccuracy;
    		}
    		
    	}
    }
    
    
    // Code for printing ford makes
	//#########################################################################################################################
    public void fordTest(ArrayList<String> makeGraphs, ArrayList<String> modelGraphs, ArrayList<Integer> yearGraphs, ArrayList<Double> revratingGraphs, ArrayList<Double> carsratingGraphs, ArrayList<Double> accuracyGraphs) {
    	
    	selectAll();
    	
    	for (int j = 0; j < makeCarArr.size(); j++ ) {
    		if(makeCarArr.get(j).equals("ford")) {
    			carsTransfer.arFord.add(makeCarArr.get(j));
    			for(String fordNames: carsTransfer.arFord) {
    				//System.out.println(fordNames);    				
    				//makeGraphs = carsTransfer.arFord;
    				makeGraphs.add(fordNames);
    			}
    		}
    		if(makeCarArr.get(j).equals("ford")) {
    			carsTransfer.arFordModels.add(modelCarArr.get(j));
    			for(String fordNamesModel: carsTransfer.arFordModels) {
    				//System.out.println(fordNamesModel);
    			}
    			modelGraphs = carsTransfer.arDodgeModels;
    		}
    		if(makeCarArr.get(j).equals("ford")) {
    			carsTransfer.arFordYears.add(yearCarArr.get(j));
    			for(Integer fordNamesYear: carsTransfer.arFordYears) {
    				//System.out.println(fordNamesYear);
    			}
    			yearGraphs = carsTransfer.arFordYears;
    		}
    		if(makeCarArr.get(j).equals("ford")) {
    			carsTransfer.arFordRevRating.add(revratingCarArr.get(j));
    			for(Double fordNamesRevRating: carsTransfer.arFordRevRating) {
    				//System.out.println(fordNamesRevRating);
    			}
    			revratingGraphs = carsTransfer.arFordRevRating;
    		}
    		if(makeCarArr.get(j).equals("ford")) {    			
    			carsTransfer.arFordCarsRating.add(carsratingCarArr.get(j));
    			for(Double fordNamesCarsRating: carsTransfer.arFordCarsRating) {
    				//System.out.println(fordNamesCarsRating);
    			}
    			carsratingGraphs = carsTransfer.arFordCarsRating;
    		}
    		if(makeCarArr.get(j).equals("ford")) {    			
    			carsTransfer.arFordAccuracy.add(accuracyCarArr.get(j));
    			for(Double FordNamesAccuracy: carsTransfer.arFordAccuracy) {
    				//System.out.println(fordNamesAccuracy);
    			}
    			accuracyGraphs = carsTransfer.arFordAccuracy;
    		}
    		
    	}
    	
    }
    
    
    // Code for printing chevrolet makes
    //#########################################################################################################################   
    public void chevyTest(ArrayList<String> makeGraphs, ArrayList<String> modelGraphs, ArrayList<Integer> yearGraphs, ArrayList<Double> revratingGraphs, ArrayList<Double> carsratingGraphs, ArrayList<Double> accuracyGraphs) {
    	
    	selectAll();
    	
    	for (int j = 0; j < makeCarArr.size(); j++ ) {
    		if(makeCarArr.get(j).equals("chevrolet")) {
    			carsTransfer.arChevy.add(makeCarArr.get(j));
    			for(String chevyNames: carsTransfer.arChevy) {
    				//System.out.println(chevyNames);    				
    				//makeGraphs = carsTransfer.arChevy;
    				makeGraphs.add(chevyNames);
    			}
    		}
    		if(makeCarArr.get(j).equals("chevrolet")) {
    			carsTransfer.arChevyModels.add(modelCarArr.get(j));
    			for(String chevyNamesModel: carsTransfer.arChevyModels) {
    				//System.out.println(chevyNamesModel);
    			}
    			modelGraphs = carsTransfer.arChevyModels;
    		}
    		if(makeCarArr.get(j).equals("chevrolet")) {
    			carsTransfer.arChevyYears.add(yearCarArr.get(j));
    			for(Integer chevyNamesYear: carsTransfer.arChevyYears) {
    				//System.out.println(chevyNamesYear);
    			}
    			yearGraphs = carsTransfer.arChevyYears;
    		}
    		if(makeCarArr.get(j).equals("chevrolet")) {
    			carsTransfer.arChevyRevRating.add(revratingCarArr.get(j));
    			for(Double chevyNamesRevRating: carsTransfer.arChevyRevRating) {
    				//System.out.println(chevyNamesRevRating);
    			}
    			revratingGraphs = carsTransfer.arChevyRevRating;
    		}
    		if(makeCarArr.get(j).equals("chevrolet")) {    			
    			carsTransfer.arChevyCarsRating.add(carsratingCarArr.get(j));
    			for(Double chevyNamesCarsRating: carsTransfer.arChevyCarsRating) {
    				//System.out.println(chevyNamesCarsRating);
    			}
    			carsratingGraphs = carsTransfer.arChevyCarsRating;
    		}
    		if(makeCarArr.get(j).equals("chevrolet")) {    			
    			carsTransfer.arChevyAccuracy.add(accuracyCarArr.get(j));
    			for(Double chevyNamesAccuracy: carsTransfer.arChevyAccuracy) {
    				//System.out.println(chevyNamesAccuracy);
    			}
    			accuracyGraphs = carsTransfer.arChevyAccuracy;
    		}
    		
    	}
    	
    }
    
    
    public void mainRun() {
        carsExtract app = new carsExtract();
        app.selectAll();
        
        
        
        //System.out.println("Commands for graphs are listed below");
        //System.out.println("---------------------------------------------");
        //System.out.println("dodge - plot for dodge cars ");
        //System.out.println("ford - plot for ford cars ");
        //System.out.println("chevy - plot for chevy cars ");
        //System.out.println("all - plot for dodge cars ");
        //System.out.println("---------------------------------------------");
        
        while(true) {
        
        
        graphDriver GD = new graphDriver();
        
        
        	// if statements for present plots to users
        	if (GD.input.equals("graph1")) {
        		dodgeTest(makeGraphsCEMain1, modelGraphsCEMain1, yearGraphsCEMain1, revratingGraphsCEMain1, carsratingGraphsCEMain1, accuracyGraphsCEMain1);
        		break;
        	}
        	else if (GD.input.equals("graph2")) {
        		fordTest(makeGraphsCEMain2, modelGraphsCEMain2, yearGraphsCEMain2, revratingGraphsCEMain2, carsratingGraphsCEMain2, accuracyGraphsCEMain2);
        		break;
        	}
        	else if (GD.input.equals("graph3")) {
        		chevyTest(makeGraphsCEMain3, modelGraphsCEMain3, yearGraphsCEMain3, revratingGraphsCEMain3, carsratingGraphsCEMain3, accuracyGraphsCEMain3);
        		break;
        	}
        	else if (GD.input.equals("graph4")) {
        		dodgeTest(makeGraphsCEMain3, modelGraphsCEMain3, yearGraphsCEMain3, revratingGraphsCEMain3, carsratingGraphsCEMain3, accuracyGraphsCEMain3);
        		break;
        	}
        	else if (GD.input.equals("graph5")) {
        		fordTest(makeGraphsCEMain3, modelGraphsCEMain3, yearGraphsCEMain3, revratingGraphsCEMain3, carsratingGraphsCEMain3, accuracyGraphsCEMain3);
        		break;
        	}
        	else if (GD.input.equals("graph6")) {
        		chevyTest(makeGraphsCEMain3, modelGraphsCEMain3, yearGraphsCEMain3, revratingGraphsCEMain3, carsratingGraphsCEMain3, accuracyGraphsCEMain3);
        		break;
        	}
        	else if (GD.input.equals("graph7")) {
        		dodgeTest(makeGraphsCEMain3, modelGraphsCEMain3, yearGraphsCEMain3, revratingGraphsCEMain3, carsratingGraphsCEMain3, accuracyGraphsCEMain3);
        		fordTest(makeGraphsCEMain3, modelGraphsCEMain3, yearGraphsCEMain3, revratingGraphsCEMain3, carsratingGraphsCEMain3, accuracyGraphsCEMain3);
        		chevyTest(makeGraphsCEMain3, modelGraphsCEMain3, yearGraphsCEMain3, revratingGraphsCEMain3, carsratingGraphsCEMain3, accuracyGraphsCEMain3);
        		break;
        	}
        	else {
        		System.out.println("You did not enter a valid plot command.");
        	
        	}
        }
    }

}

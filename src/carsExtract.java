import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



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
    
    public void dodgeTest() {
    	// Code for printing Dodge makes
    	selectAll();
    	for (int j = 0; j < makeCarArr.size(); j++ ) {
    		if(makeCarArr.get(j).equals("dodge")) {
    			ArrayList<String> arDodge = new ArrayList<String>();
    			arDodge.add(makeCarArr.get(j));
    			for(String dodgeNames: arDodge) {
    				System.out.println(dodgeNames);
    			}
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			ArrayList<String> arDodgeModels = new ArrayList<String>();
    			arDodgeModels.add(modelCarArr.get(j));
    			for(String dodgeNamesModel: arDodgeModels) {
    				System.out.println(dodgeNamesModel);
    			}
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			ArrayList<Integer> arDodgeYears = new ArrayList<Integer>();
    			arDodgeYears.add(yearCarArr.get(j));
    			for(Integer dodgeNamesYear: arDodgeYears) {
    				System.out.println(dodgeNamesYear);
    			}
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			ArrayList<Double> arDodgeRevRating = new ArrayList<Double>();
    			arDodgeRevRating.add(revratingCarArr.get(j));
    			for(Double dodgeNamesRevRating: arDodgeRevRating) {
    				System.out.println(dodgeNamesRevRating);
    			}
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			ArrayList<Double> arDodgeCarsRating = new ArrayList<Double>();
    			arDodgeCarsRating.add(carsratingCarArr.get(j));
    			for(Double dodgeNamesCarsRating: arDodgeCarsRating) {
    				System.out.println(dodgeNamesCarsRating);
    			}
    		}
    		if(makeCarArr.get(j).equals("dodge")) {
    			ArrayList<Double> arDodgeAccuracy = new ArrayList<Double>();
    			arDodgeAccuracy.add(accuracyCarArr.get(j));
    			for(Double dodgeNamesAccuracy: arDodgeAccuracy) {
    				System.out.println(dodgeNamesAccuracy);
    			}
    		}
    		
    	}
    }
    
    public void fordTest() {
    	// Code for printing ford makes
    	
    	selectAll();
    	for (int j = 0; j < makeCarArr.size(); j++ ) {
    		if(makeCarArr.get(j).equals("ford")) {
    			ArrayList<String> arFord = new ArrayList<String>();
    			arFord.add(makeCarArr.get(j));
    			for(String fordNames: arFord) {
    				System.out.println(fordNames);
    			}
    		}
    	}
    }
    
    public void chevyTest() {
    	// Code for printing chevrolet makes
    	
    	selectAll();
    	for (int j = 0; j < makeCarArr.size(); j++ ) {
    		if(makeCarArr.get(j).equals("chevrolet")) {
    			ArrayList<String> arChevy = new ArrayList<String>();
    			arChevy.add(makeCarArr.get(j));
    			for(String chevyNames: arChevy) {
    				System.out.println(chevyNames);
    			}
    		}
    	}
    }
    
    public void mainRun() {
        carsExtract app = new carsExtract();
        app.selectAll();
        
        String plotChoice;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Commands for graphs are listed below");
        System.out.println("---------------------------------------------");
        System.out.println("dodge - plot for dodge cars ");
        System.out.println("ford - plot for ford cars ");
        System.out.println("chevy - plot for chevy cars ");
        System.out.println("all - plot for dodge cars ");
        System.out.println("---------------------------------------------");
        
        while(true) {
        System.out.println("Enter what graphs you want to see: ");
        plotChoice = scan.nextLine();
        
        	// if statements for present plots to users
        	if (plotChoice.equals("dodge")) {
        		dodgeTest();
        		break;
        	}
        	else if (plotChoice.equals("ford")) {
        		fordTest();
        		break;
        	}
        	else if (plotChoice.equals("chevy")) {
        		chevyTest();
        		break;
        	}
        	else {
        		System.out.println("You did not enter a valid plot command.");
        	
        	}
        }
    }

}

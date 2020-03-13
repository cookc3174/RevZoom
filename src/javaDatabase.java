import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
 

public class javaDatabase {
 
	public static void createNewDatabase(String fileName) {
		 
        String url = "jdbc:sqlite:C:/sqlite/db/" + fileName;
 
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
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
    
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db/carDatabase.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Ratings (\n"
                + "    id integer PRIMARY KEY,\n"
                + "    make text NOT NULL,\n"
                + "    model text NOT NULL,\n"
                + "    year integer,\n"
                + "    revrating,\n"
                + "    carsrating,\n"
                + "    accuracy\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public void insert(String make, String model, int year, double revrating, double carsrating, double accuracy) {
        String sql = "INSERT INTO ratings(make, model, year, revrating, carsrating, accuracy) VALUES(?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, make);
            pstmt.setString(2, model);
            pstmt.setInt(3, year);
            pstmt.setDouble(4, revrating);
            pstmt.setDouble(5, carsrating);
            pstmt.setDouble(6, accuracy);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static void setupCarDatabase(String makeInsert, String modelInsert, int yearInsert, double RevRatingInsert, double CarsRatingInsert, double accuracyInsert) {
    	createNewDatabase("carDatabase.db");
    	createNewTable();
        javaDatabase app = new javaDatabase();
        // insert one new row
        
        String Make;
        String Model;
        int year;
        double RevRating;
        double CarsRating;
        double accuracy;
        
        Make = makeInsert;
        Model = modelInsert;
        year = yearInsert;
        RevRating = RevRatingInsert;
        CarsRating = CarsRatingInsert;
        accuracy = accuracyInsert;
        
        app.insert(Make, Model, year, RevRating, CarsRating, accuracy);
    }
 
}

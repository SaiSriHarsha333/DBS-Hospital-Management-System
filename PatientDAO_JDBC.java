import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class PatientDAO_JDBC implements PatientDAO {
																																																																																																																																																																																																																																															Connection dbConnection;

	public PatientDAO_JDBC(Connection dbconn){
		// JDBC driver name and database URL
 		//  Database credentials
		dbConnection = dbconn;
	}

	@Override
	public Patient getPatientByID(int patientID) {
		Patient p = new Patient();
		String sql;
		Statement stmt = null;

		try{
			stmt = dbConnection.createStatement();
			sql = "select pat_id, name, age from patient";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				int patID  = rs.getInt("pat_id");
        String n = rs.getString("name");
				int a = rs.getInt("age");

				if(patientID == patID){
					p.setPatientID(patID);
					p.setName(n);
          p.setAge(a);
					break;
				}
				// Add exception handling here if more than one row is returned
			}
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		// Add exception handling when there is no matching record
		return p;
	}

}

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class DoctorDAO_JDBC implements DoctorDAO {
																																																																																																																																																																																																																																															Connection dbConnection;

	public DoctorDAO_JDBC(Connection dbconn){
		// JDBC driver name and database URL
 		//  Database credentials
		dbConnection = dbconn;
	}

	@Override
	public Doctor getDoctorByID(int DocID) {
		Doctor d = new Doctor();
		String sql;
		Statement stmt = null;

		try{
			stmt = dbConnection.createStatement();
			sql = "select d.doc_id,s.name,d.type from doctor d, staff s where s.sta_id = d.doc_id";
			ResultSet rs = stmt.executeQuery(sql);

			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name
        int docID = rs.getInt("doc_id");
        String n = rs.getString("name");
				String t = rs.getString("type");

				if(DocID == docID){
          d.setDoctorID(docID);
          d.setName(n);
					d.setType(t);
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
		return d;
	}

  @Override
  public Doctor getDoctorByname(String name) {
    Doctor d = new Doctor();
    String sql;
    Statement stmt = null;

    try{
      stmt = dbConnection.createStatement();
      sql = "select d.doc_id,s.name,d.type from doctor d, staff s where s.sta_id = d.doc_id";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
        //Retrieve by column name
        int docID = rs.getInt("doc_id");
        String n = rs.getString("name");
        String t = rs.getString("type");

        if(name.equals(n)){
          d.setDoctorID(docID);
          d.setName(n);
          d.setType(t);
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
    return d;
  }


}

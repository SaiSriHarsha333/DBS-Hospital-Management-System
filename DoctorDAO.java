import java.lang.*;
import java.util.List;

public interface DoctorDAO {
	public Doctor getDoctorByID(int DocID);
  public Doctor getDoctorByname(String name);
}

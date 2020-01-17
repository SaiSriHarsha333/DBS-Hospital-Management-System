import java.lang.*;

public class Doctor{
	int doc_id;
	String name;
  String type;
	public Doctor() { }
	public Doctor (int id,String s,String t){ doc_id = id; name = s; type = t; }
	public int getDoctorID() { return doc_id; }
	public void setDoctorID(int s){ doc_id = s; }
  public String getName() { return name; }
	public void setName(String s){ name = s; }
  public String getType() { return type; }
	public void setType(String s){ type = s; }
	public void print(){
		if (doc_id == 0 && name == null && type == null) {
			System.out.println("No Doctor with provided particulars");
		}
		else {
			System.out.println("Doctor ID = " + doc_id); System.out.println("Name = " + name); System.out.println("Type = " + type);}
		}
};

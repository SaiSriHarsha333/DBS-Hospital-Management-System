import java.lang.*;

public class Consultation{
	int con_id;
	int phy_id;
  int pat_id;
	String symptome;
	public Consultation() { }
	public Consultation (int id,int phy,int pat,String s){ con_id = id; phy_id = phy; pat_id = pat; symptome = s; }
	public int getConsultationID() { return con_id; }
	public void setConsultationID(int s){ con_id = s; }
	public int getphysicianID() { return phy_id; }
	public void setphysicianID(int s){ phy_id = s; }
	public int getpatientID() { return pat_id; }
	public void setpatientID(int s){ pat_id = s; }
	public String getSymptome() { return symptome; }
	public void setSymptome(String s){ symptome = s; }
	public void print(){
		if (con_id == 0 && phy_id ==0 && pat_id == 0 && symptome == null) {
			System.out.println("No record of consultation to display for the Doctor.");
		}
		System.out.println("Consultation ID = " + con_id); System.out.println("Physician = " + phy_id); System.out.println("Patient ID = " + pat_id); System.out.println("Symptome = " + symptome); }
};

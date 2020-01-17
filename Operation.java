import java.lang.*;

public class Operation{
	int ope_id;
	int sur_id;
  int pat_id;
	int bill;
	public Operation() { }
	public Operation (int id,int sur,int pat,int b){ ope_id = id; sur_id = sur; pat_id = pat; bill = b; }
	public int getOperationID() { return ope_id; }
	public void setOperationID(int s){ ope_id = s; }
	public int getSurgeonID() { return sur_id; }
	public void setSurgeonID(int s){ sur_id = s; }
	public int getpatientID() { return pat_id; }
	public void setpatientID(int s){ pat_id = s; }
	public int getbill() { return bill; }
	public void setbill(int s){ bill = s; }
	public void print(){
		if (ope_id == 0 && sur_id == 0 && pat_id == 0 && bill == 0) {
			System.out.println("No record of operation to display for the Doctor.");
		}
		else {
			System.out.println("Operation ID = " + ope_id); System.out.println("Surgeon = " + sur_id); System.out.println("Patient ID = " + pat_id); System.out.println("Bill = " + bill); }
		}
};

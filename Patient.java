import java.lang.*;

public class Patient{
	int pat_id;
	String name;
  int age;
	public Patient() { }
	public Patient (int id,String s,int a){ pat_id = id; name = s; age = a; }
	public int getPatientID() { return pat_id; }
	public void setPatientID(int s){ pat_id = s; }
  public String getName() { return name; }
	public void setName(String s){ name = s; }
  public int getAge() { return age; }
  public void setAge(int s){ age = s; }
	public void print(){
		if (pat_id ==0 && name == null) {
			System.out.println("No Patient with provided particulars");
		}
		else {
				System.out.println(pat_id + " || " + name + " || "  + age);// System.out.println("Name = " + name); System.out.println("Age = " + age);}
		}
	}
};

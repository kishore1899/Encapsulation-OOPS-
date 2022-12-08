package com.palle;

public class Encapsulation {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		System.out.println(d.p_Name);
		System.out.println(d.p_Id);
		System.out.println(d.p_Age);
		System.out.println(d.p_Place);
		System.out.println(d.d_Name);
		System.out.println(d.d_id);
		System.out.println(d.d_age);
		System.out.println(d.d_Place);

	}

}
class Patient{
	public String p_Name = "Kishore";
	public int p_Age = 23;
	public int p_Id = 12385;
	public String p_Place = "Bengaluru";
}
class Doctor extends Patient{
	public String d_Name="Sharon";
	public int d_age=32;
	public int d_id=23556;
	public String d_Place="Coiambatore";
}

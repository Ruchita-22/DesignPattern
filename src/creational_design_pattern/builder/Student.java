package creational_design_pattern.builder;

public class Student {
	String fname;
	String lname;
	String email;
	String phone;
	String address;
	public static class StudentBuilder {
		String fname;
		String lname;
		String email;
		String phone;
		String address;
		public StudentBuilder(String fname, String lname, String email, String phone, String address) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.phone = phone;
			this.address = address;
		}

		public String getFname() {
			return fname;
		}

		public String getLname() {
			return lname;
		}

		public String getEmail() {
			return email;
		}

		public String getPhone() {
			return phone;
		}

		public String getAddress() {
			return address;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		public StudentBuilder build() {
			Student s = new Student();
			
			
		}
	}
	
	
	
}

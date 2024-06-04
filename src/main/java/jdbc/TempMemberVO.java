package jdbc;

public class TempMemberVO {
	private String id;
	private String passwd;
	private String name;
	private String mem_num1;
	private String mem_num2;
	private String e_mail;
	private String phone;
	private String zipcode;
	private String address;
	private String job;
	public TempMemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TempMemberVO(String id, String passwd, String name, String mem_num1, String mem_num2, String e_mail,
			String phone, String zipcode, String address, String job) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.mem_num1 = mem_num1;
		this.mem_num2 = mem_num2;
		this.e_mail = e_mail;
		this.phone = phone;
		this.zipcode = zipcode;
		this.address = address;
		this.job = job;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMem_num1() {
		return mem_num1;
	}
	public void setMem_num1(String mem_num1) {
		this.mem_num1 = mem_num1;
	}
	public String getMem_num2() {
		return mem_num2;
	}
	public void setMem_num2(String mem_num2) {
		this.mem_num2 = mem_num2;
	}
	public String getEmail() {
		return e_mail;
	}
	public void setEmail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "TempMemberVo [id=" + id + ", passwd=" + passwd + ", name=" + name + ", mem_num1=" + mem_num1
				+ ", mem_num2=" + mem_num2 + ", e_mail=" + e_mail + ", phone=" + phone + ", zipcode=" + zipcode
				+ ", address=" + address + ", job=" + job + "]";
	}
	

}

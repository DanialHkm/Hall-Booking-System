package Staff;

public class staff {
	private int staffID;
	private String staffName;
	private String staffEmail;
	private int staffHomeNo;
	private String staffAddress;
	private String staffCity;
	private int staffPostcode;
	private String staffState;
	private String staffPass;
	private int staffTelNum;
	private int adminID;
	
	public staff()
	{
	
	}
	
	public staff(int staffID, String staffName, String staffEmail,int staffHomeNo, String staffAddress, String staffCity, int staffPostcode, String staffState, String staffPass, int staffTelNum, int adminID)
	{
		this.staffID = staffID;
		this.staffName = staffName;
		this.staffEmail = staffEmail;
		this.staffHomeNo = staffHomeNo;
		this.staffAddress = staffAddress;
		this.staffCity = staffCity;
		this.staffPostcode = staffPostcode;
		this.staffState = staffState;
		this.staffPass = staffPass;
		this.staffTelNum = staffTelNum;
		this.adminID = adminID;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public int getStaffHomeNo() {
		return staffHomeNo;
	}

	public void setStaffHomeNo(int staffHomeNo) {
		this.staffHomeNo = staffHomeNo;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public String getStaffCity() {
		return staffCity;
	}

	public void setStaffCity(String staffCity) {
		this.staffCity = staffCity;
	}

	public int getStaffPostcode() {
		return staffPostcode;
	}

	public void setStaffPostcode(int staffPostcode) {
		this.staffPostcode = staffPostcode;
	}

	public String getStaffState() {
		return staffState;
	}

	public void setStaffState(String staffState) {
		this.staffState = staffState;
	}

	public String getStaffPass() {
		return staffPass;
	}

	public void setStaffPass(String staffPass) {
		this.staffPass = staffPass;
	}

	public int getStaffTelNum() {
		return staffTelNum;
	}

	public void setStaffTelNum(int staffTelNum) {
		this.staffTelNum = staffTelNum;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	

}

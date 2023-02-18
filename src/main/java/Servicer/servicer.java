package Servicer;

public class servicer {
	private int servicerID;
	private String servicerName;
	private int servicerTelNo;
	private int servicerHomeNo;
	private String servicerAddress;
	private String servicerCity;
	private int servicerPostcode;
	private String servicerState;
	
	public servicer() {
		
	}
	
	public servicer(int servicerID, String servicerName, int servicerTelNo, int servicerHomeNo, String servicerAddress, String servicerCity, int servicerPostcode, String servicerState)
	{
		this.servicerID=servicerID;
		this.servicerName=servicerName;
		this.servicerTelNo=servicerTelNo;
		this.servicerHomeNo=servicerHomeNo;
		this.servicerAddress=servicerAddress;
		this.servicerCity=servicerCity;
		this.servicerPostcode=servicerPostcode;
		this.servicerState=servicerState;
	}

	public int getServicerID() {
		return servicerID;
	}

	public void setServicerID(int servicerID) {
		this.servicerID = servicerID;
	}

	public String getServicerName() {
		return servicerName;
	}

	public void setServicerName(String servicerName) {
		this.servicerName = servicerName;
	}

	public int getServicerTelNo() {
		return servicerTelNo;
	}

	public void setServicerTelNo(int servicerTelNo) {
		this.servicerTelNo = servicerTelNo;
	}

	public int getServicerHomeNo() {
		return servicerHomeNo;
	}

	public void setServicerHomeNo(int servicerHomeNo) {
		this.servicerHomeNo = servicerHomeNo;
	}

	public String getServicerAddress() {
		return servicerAddress;
	}

	public void setServicerAddress(String servicerAddress) {
		this.servicerAddress = servicerAddress;
	}

	public String getServicerCity() {
		return servicerCity;
	}

	public void setServicerCity(String servicerCity) {
		this.servicerCity = servicerCity;
	}

	public int getServicerPostcode() {
		return servicerPostcode;
	}

	public void setServicerPostcode(int servicerPostcode) {
		this.servicerPostcode = servicerPostcode;
	}

	public String getServicerState() {
		return servicerState;
	}

	public void setServicerState(String servicerState) {
		this.servicerState = servicerState;
	}
	
}

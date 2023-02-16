package model;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;


public class Customer{
	private int custID;
	private int custIC,custTelNum,custPostcode;
	private String custName,custHomeNo,custCity,custState,custEmail,custPass;
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public int getCustIC() {
		return custIC;
	}
	public void setCustIC(int custIC) {
		this.custIC = custIC;
	}
	public int getCustTelNum() {
		return custTelNum;
	}
	public void setCustTelNum(int custTelNum) {
		this.custTelNum = custTelNum;
	}
	public int getCustPostcode() {
		return custPostcode;
	}
	public void setCustPostcode(int custPostcode) {
		this.custPostcode = custPostcode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustHomeNo() {
		return custHomeNo;
	}
	public void setCustHomeNo(String custHomeNo) {
		this.custHomeNo = custHomeNo;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public String getCustState() {
		return custState;
	}
	public void setCustState(String custState) {
		this.custState = custState;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	public void add(Customer c) {
		// TODO Auto-generated method stub
		
	}
}
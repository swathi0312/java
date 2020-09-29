package Demo.com.Exception;

import java.util.Scanner;

public class EmployeeInformation {

	 private int empid;
	    private String name;
	    private float basicSal;
	    public EmployeeInformation(int empid, String name, float basicSal) {
	        super();
	        this.empid = empid;
	        this.name = name;
	        this.basicSal = basicSal;
	    }
	    public EmployeeInformation() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public int getEmpid() {
	        return empid;
	    }
	    public void setEmpid(int empid) {
	        this.empid = empid;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public float getBasicSal() {
	        return basicSal;
	    }
	    public void setBasicSal(float basicSal) {
	        this.basicSal = basicSal;
	    }

	}

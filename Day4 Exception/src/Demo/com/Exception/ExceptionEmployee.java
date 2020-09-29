package Demo.com.Exception;

import java.util.Scanner;

public class  ExceptionEmployee  {
	    public static void showDetails(EmployeeInformation[] emp,int num) throws EmployeeInfonotfound
	    {
	        for(int i=0;i<10;i++)
	        {
	            if(emp[i].getEmpid()==num)
	            {
	                System.out.println("Id:"+emp[i].getEmpid()+" name:"+emp[i].getName()+" salary"+emp[i].getBasicSal());
	                System.exit(0);
	            }
	        }
	        throw new EmployeeInfonotfound("given Employee id not exist.");
	        }
	        
	        
	        
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	    	
	        EmployeeInformation[] emp=new EmployeeInformation[10];
	        
	        emp[0]=new  EmployeeInformation(1,"s",10000);
	        emp[1]=new  EmployeeInformation(2, "w", 1000);
	        emp[3]=new  EmployeeInformation(3, "a",2000);
	        emp[4]=new  EmployeeInformation(4, "t", 2000);
	        emp[5]=new  EmployeeInformation(5, "h", 10000);
	        emp[6]=new  EmployeeInformation(6,"i", 3000);
	        emp[7]=new  EmployeeInformation(7, "t", 8300);
	        emp[8]=new  EmployeeInformation(8, "H", 3550);
	        emp[2]=new  EmployeeInformation(9, "e", 3230);
	        emp[9]=new  EmployeeInformation(10, "J", 2330);
	        
	        System.out.println("Enter emplyee id:");
	        
	        int num=new Scanner(System.in).nextInt(); 
	        try{
	            showDetails(emp,num);
	        }
	        catch(EmployeeInfonotfound enf){
	            enf.printStackTrace();
	        }
	    }

	 

	}
	 


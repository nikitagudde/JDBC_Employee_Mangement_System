package com.start;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.employeeDao.employeeDao;
import com.entity.Employee;

public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("welcome to Employee Management System Application");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 to ADD new Employee");
			System.out.println("press 2 to delete Employee");
			System.out.println("press 3 to display Employee");
			System.out.println("press 4 to update Employee");
			System.out.println("press 5 to exit Application");
			
			int c=Integer.parseInt(br.readLine());
			
			switch (c) 
			{
			case 1: //add employee
				System.out.println("Enter Employee id :");
				int id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Employee name :");
				String name= br.readLine();
				
				System.out.println("Enter Employee department :");
				String department= br.readLine();
				
				System.out.println("Enter Employee salary :");
				 double  salary= Double.parseDouble(br.readLine());
				
				//create student object to store the data 
				 Employee e1 = new Employee(id,name, department,salary);
				
				
				boolean ans = employeeDao.insertEmployee(e1);
				
				if(ans)
				{
					System.out.println("Employee is added successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(e1);
				break;
			//
			
			

			case 2: // delete student
				System.out.println("enter employee id which you want to delete");
				int userId=Integer.parseInt(br.readLine());
				
				boolean f=employeeDao.deleteEmployee(userId);
				if(f)
				{
					System.out.println("Employee deleted successfully");
				}
				else
				{
					System.out.println("Something went wrong...!");
				}
				break;
			
			case 3: // display students 
				employeeDao.showAllEmployees();
break;
			case 4://update student
				System.out.println("enter employee id whose data you want to update");
				int userId2 = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee id :");
				int id2 = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee name :");
				String name2= br.readLine();
				System.out.println("Enter Employee department :");
				String department2= br.readLine();
				
				System.out.println("Enter Employee salary :");
				double  salary2= Double.parseDouble(br.readLine());
				
				Employee e2 = new Employee(id2,name2, department2,salary2);
				boolean ans2 =employeeDao.updateEmployee(e2,userId2);
				if(ans2)
				{
					System.out.println("Employee is updated successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(e2);
				break;
			case 5: // exit
				go=false;
				break;
			default:
				System.out.println("wrong choice try again");
			}
		}
		System.out.println("thankyou for using my application!!");	
		}
}
package com.employeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connectionjdbc.Connectionjdbc;
import com.entity.Employee;

public class employeeDao {

	public static boolean insertEmployee(Employee e1) {

		boolean f = false;
		try {
			// jdbccode
			Connection con = Connectionjdbc.createC();
			String q = "Insert into employee(eid,ename, edepartment, esalary) values(?,?,?,?)";
			PreparedStatement p = con.prepareStatement(q);

			p.setInt(1, e1.getEmpId());
			p.setString(2, e1.getEmpName());
			p.setString(3, e1.getEmpDepartment());
			p.setDouble(4, e1.getEmpSalary());
			// execute
			p.executeUpdate();
			f = true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	public static boolean deleteEmployee(int userId) {

		boolean f = false;
		try {
			// jdbccode
			Connection con = Connectionjdbc.createC();
			String q = "delete from employee where eid=?";
			PreparedStatement p = con.prepareStatement(q);

			p.setInt(1, userId);
			// execute
			p.executeUpdate();
			f = true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static void showAllEmployees() {

		boolean f = false;
		try {
			// jdbccode
			Connection con = Connectionjdbc.createC();
			String q = "select * from employee";
			Statement s = con.createStatement();

			ResultSet set = s.executeQuery(q);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String department = set.getString(3);
				double salary = set.getDouble(4);

				System.out.println("ID:" + id);
				System.out.println("Name:" + name);
				System.out.println("Depertment:" + department);
				System.out.println("Salary:" + salary);

				System.out.println("----------------------------");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean updateEmployee(Employee e2, int userId2) {
		boolean f = false;
		try {
			// jdbccode
			Connection con = Connectionjdbc.createC();
			String q = "update employee set eid=?, ename=?,edepartment=? ,esalary=? where eid=?";
			PreparedStatement p = con.prepareStatement(q);

			p.setInt(1, e2.getEmpId());
			p.setString(2, e2.getEmpName());

			p.setString(3, e2.getEmpDepartment());
			p.setDouble(4, e2.getEmpSalary());
			p.setInt(5, userId2);
			// execute
			p.executeUpdate();
			f = true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
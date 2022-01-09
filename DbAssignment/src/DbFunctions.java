import java.sql.*;

public class DbFunctions {
	void RetriveAllStudentDetails() {
		   try {
			   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dinesh", "root", "root");
			   System.out.println("Connected With the database successfully");
			           PreparedStatement preparedStatement=connection.prepareStatement("select * from student");
			           ResultSet resultSet=preparedStatement.executeQuery();
			           if(resultSet.next()== false)
			           {
			        	   System.out.println("No Record Found");
			           }else {
			        	   do{
				                int std_id=resultSet.getInt("std_id");
				                String std_name=resultSet.getString("std_name");
				                int std_age=resultSet.getInt("std_age");
				                String std_city=resultSet.getString("std_city");
				                String std_phone=resultSet.getString("std_phone");
				                String std_dept=resultSet.getString("std_dept");
				                System.out.println("\n"+std_id+" "+std_name+" "+std_age+" "+std_city+" "+std_phone+" "+std_dept+"\n");
				           }while(resultSet.next());
			           }
			           
			   } catch (SQLException e) {
				   	    System.out.println("Error while connecting to the database");
			   }
	}
	void RetriveStudentDetail(int id) {
		   try {
			   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dinesh", "root", "root");
			   System.out.println("Connected With the database successfully");
			           PreparedStatement preparedStatement=connection.prepareStatement("select * from student where std_id=?");
			           preparedStatement.setInt(1,id);
			           ResultSet resultSet=preparedStatement.executeQuery();
			           if(resultSet.next()== false)
			           {
			        	   System.out.println("No Record Found");
			           }else {
			        	   do{
				                int std_id=resultSet.getInt("std_id");
				                String std_name=resultSet.getString("std_name");
				                int std_age=resultSet.getInt("std_age");
				                String std_city=resultSet.getString("std_city");
				                String std_phone=resultSet.getString("std_phone");
				                String std_dept=resultSet.getString("std_dept");
				                System.out.println("\n"+std_id+" "+std_name+" "+std_age+" "+std_city+" "+std_phone+" "+std_dept+"\n");
				           }while(resultSet.next());
			           }
			           
			   } catch (SQLException e) {
				   	    System.out.println("Error while connecting to the database");
			   }
	}
	
	void InsertStudentDetail(String std_name,int std_age,String std_city,String std_phone,String std_dept)
	{
		  try {
			  			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dinesh", "root", "root");
			  			System.out.println("Connected With the database successfully");
			  			PreparedStatement preparedStatement=connection.prepareStatement("insert into student(std_name,std_age,std_city,std_phone,std_dept) values(?,?,?,?,?)");
			  			preparedStatement.setString(1,std_name);
			  			preparedStatement.setInt(2,std_age);
			  			preparedStatement.setString(3,std_city);
			  			preparedStatement.setNString(4, std_phone);
			  			preparedStatement.setNString(5, std_dept);
			            preparedStatement.executeUpdate();
			            System.out.println("data inserted successfully");
			  } catch (SQLException e) {
				  		System.out.println("Error while connecting to the database");
			  }
	}
	void DeleteStudentDetail(int std_id) {
		  try {
			  		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dinesh", "root", "root");
			  		  System.out.println("Connected With the database successfully");
			          PreparedStatement preparedStatement=connection.prepareStatement("delete from student where std_id=?");
			          preparedStatement.setInt(1,std_id);
			          preparedStatement.executeUpdate();
			          System.out.println("Data deleted Successfully");
			  } catch (SQLException e) {
				  	  System.out.println("Error while connecting to the database");
			  }
	}
	  void UpdateStudentDetail(int std_id,String std_name,int std_age,String std_city,String std_phone,String std_dept)
	  {
		  try {
				Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dinesh", "root", "root");
				System.out.println("Connected With the database successfully");
		        PreparedStatement preparedStatement=connection.prepareStatement("update student set std_name=?,std_age=?,std_city=?,std_phone=?,std_dept=? where std_id=?");
		        preparedStatement.setString(1,std_name);
		        preparedStatement.setInt(2,std_age);
		        preparedStatement.setString(3,std_city);
		        preparedStatement.setString(4,std_phone);
		        preparedStatement.setString(5,std_dept);
		        preparedStatement.setInt(6,std_id);
		        preparedStatement.executeUpdate();
		        System.out.println("data updated successfully");
				
				
			} catch (SQLException e) {
				
				System.out.println("Error while connecting to the database");
			
					}
	  }
}

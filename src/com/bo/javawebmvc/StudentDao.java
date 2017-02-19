/**
 * 
 */
package com.bo.javawebmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * @author zhangbo
 * 2017年2月19日  下午11:02:52
 * 
 */
public class StudentDao {
	public List<Student> getAll(){
		Connection connection = null;
		List<Student> students = new ArrayList<Student>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String driverClass = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverClass);

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			String user = "dql";
			String password = "dql";
			connection = DriverManager.getConnection(url, user, password);
			
			String sql = "select id,studentname,gender from Student ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				int id = resultSet.getInt(1);
				String sutdentName = resultSet.getString(2);
				String gender = resultSet.getString(3);
				Student student = new Student(id,sutdentName,gender);
				students.add(student);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(resultSet != null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(preparedStatement != null){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return students ;
	}
	
	public List<Student> deleteById(Integer id){
		Connection connection = null;
		List<Student> students = new ArrayList<Student>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String driverClass = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverClass);

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			String user = "dql";
			String password = "dql";
			connection = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from Student where id = ? ";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			resultSet = preparedStatement.executeQuery();
			 
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(resultSet != null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(preparedStatement != null){
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return students ;
	}
}

package com.hcl.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {
	Connection connection;
	public List<Library> searchBook(String searchtype,String srchValue) {
		List<Library> lstBooks=new ArrayList<Library>();
		String sql="";
		connection=DaoConnection.getConnection();
		if(searchtype.equals("id")){
			sql = " SELECT * FROM Books WHERE Id = ? " ;
		}			
		else if(searchtype.equals("bookname"))
		{
			sql = " SELECT * FROM Books WHERE Name = ? " ;
		}
		else if(searchtype.equals("authorname")){
			sql = " SELECT * FROM Books WHERE Author = ? " ;
		}
		else if(searchtype.equals("dept")) {
			sql = " SELECT * FROM Books WHERE Dept = ? " ;
		}
		else sql = " SELECT * FROM Books WHERE Name != ? OR 1 = 1 " ;
		Library book=null;
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,srchValue);		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				book=new Library();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setDept(rs.getString("dept"));
				book.setAuthor(rs.getString("author"));
				book.setEdition(rs.getString("edition"));
				book.setTotalBooks(rs.getInt("totalBooks"));
				lstBooks.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstBooks;
	}
	public String issue(int bookId,String username){
		connection=DaoConnection.getConnection();
		String cmd="select count(*) cnt from tranbook where bookid=? AND username=?";
		String result="";
		try {
			PreparedStatement pst=connection.prepareStatement(cmd);
			pst.setInt(1, bookId);
			pst.setString(2, username);
			ResultSet rs=pst.executeQuery();
			rs.next();
			int cnt=rs.getInt("cnt");
			if(cnt==1) {
				result="You already taken the book " +bookId + "<br/>";
			} else {
				cmd="insert into tranbook(username,BookId) values(?,?)";
				pst=connection.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, bookId);
				pst.executeUpdate();
				cmd="Update books set TotalBooks=TotalBooks-1 where id=?";
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, bookId);
				pst.executeUpdate();
				result="Book with Id " +bookId + " Issued Successfully...<br/>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public String Return(int bookId,String username){
		connection=DaoConnection.getConnection();
		String cmd="select count(*) cnt from tranbook where bookid=? AND username=?";
		String result="";
		try {
			PreparedStatement pst=connection.prepareStatement(cmd);
			pst.setInt(1, bookId);
			pst.setString(2, username);
			ResultSet rs=pst.executeQuery();
			rs.next();
			int cnt=rs.getInt("cnt");
			if(cnt==1) {
				result="You already taken the book " +bookId + "<br/>";
			} else {
				cmd="insert into tranbook(username,BookId) values(?,?)";
				pst=connection.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, bookId);
				pst.executeUpdate();
				cmd="Update books set TotalBooks=TotalBooks+1 where id=?";
			
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, bookId);
				pst.executeUpdate();
				result="Book with Id " +bookId + " Issued Successfully...<br/>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public String AccdetailsServlet(String username){
		Connection con=DaoConnection.getConnection();
		String cmd="select BookId,Fromdate from tranbook where username=?";
		String result="";
		try {
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setString(1,username);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
		result +=rs.getInt("BookId");
		result +=rs.getDate("Fromdate");
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return result;	


		}  

}

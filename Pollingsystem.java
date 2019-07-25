package pollingsystem;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
public class Pollingsystem {
	
	public static void pollLogin(){
		Candidateoperation candidateoperation=new Candidateoperation();
		@SuppressWarnings( "resource" )
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n1.VOTER\n2.CANDIDATE\n enter the value");
		
		switch(scanner.nextInt())
		{
		case 1:
			Voteoperation voteoperation=new Voteoperation();
			 voteoperation.voterLogin();
			break;
		case 2:
			candidateoperation.candidateLogin();
			break;
		default:
			System.out.println("Enter the valid key");
		}
	}
	public static void main(String args[]) throws SQLException {
		Dbconnection get=new Dbconnection();
		Connection con=get.connectDb();
		pollLogin();
	
	}
}
package pollingsystem;

import java.sql.*;
import java.util.Scanner;

public class Candidateoperation {
	
	 
	Scanner scanner = new Scanner(System.in);
	
	Candidate candidate=new Candidate();

	public void candidateLogin() {
		try {
			
		System.out.println("enter the candidate id");
		candidate.setVoterId(scanner.nextInt());
		String query="select * from votingsystem where voterid="+candidate.getVoterId();
		Dbconnection get=new Dbconnection();
		Connection con=get.connectDb();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		if(rs.absolute(1))
		{
			System.out.println("You are already voted ");
			con.close();
			return;
		}
		else {
			System.out.println("enter your user name ");
			candidate.setUsername(scanner.next());
			System.out.println("enter the password");
			candidate.setPassword(scanner.next());
			String qry=("select * from candidate where username='"+candidate.getUsername()+"' and password='"+candidate.getPassword()+"'");
			Statement sr=null;
			sr=con.createStatement();
			ResultSet r3=sr.executeQuery(qry);
			while(r3.next())
			{
				String username1=r3.getString(3);
				String password1=r3.getString(4);
				if(username1 !=null && password1 !=null)
				{
					
					
					System.out.println("Welcome to voting\nenter value to poll\\n01.DK\\n02.DMK\\n03.ADMK");
					candidate.setVotingNumber(scanner.nextInt());
					
					System.out.println("candidate name and party name");	
					String sql="insert into votingsystem(voterid,votingNumber,candidatename,partyname)" + "values("+candidate.getVoterId()+"+candidate.getVotingNumber()+";
					int ro=stmt.executeUpdate(sql);
					if(ro==1)
					{
						System.out.println("voted successfully thank you");
					}
					else
					{
						System.out.println("failed to voting");
					}
				}
			}
		}	
	}catch(Exception e) {	System.out.println("no available");	}
	}
	}
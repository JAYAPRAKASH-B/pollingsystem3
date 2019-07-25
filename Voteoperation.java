package pollingsystem;

import java.util.Scanner;
import java.sql.*;

public class Voteoperation {
	static Dbconnection get=new Dbconnection();
	static 
public void voterLogin() {
try {	
		Voter vote=new Voter();
		Connection connect=get.connectDb();
		Statement sr=connect.createStatement();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the voterid");
		vote.setVoterid(scanner.nextInt());
		System.out.println("enter the age");
		vote.setAge(scanner.nextInt());
		String query="select * from voter where "+vote.getAge()+" <= 18";
		Statement stmt=connect.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		if(rs.absolute(1))
		{
			System.out.print("You are not eligible for voting because your age is not above 18 ");
			connect.close();
		}
		else {
			System.out.print("enter your user name ");
			vote.setUsername(scanner.next());
			System.out.print("enter the password");
			vote.setPassword(scanner.next());
			String qry=("select * from voter where username='"+vote.getUsername()+"' and password='"+vote.getPassword()+"'");
			
			ResultSet r3=sr.executeQuery(qry);
			while(r3.next())
			{
				
				String username1=r3.getString(3);
				String password1=r3.getString(4);
				if(username1 !=null && password1 !=null)
				{
					System.out.println("Welcome to voting");
					System.out.println("enter value to poll\n01.DK\n02.DMK\n03.ADMK");
					vote.setVotingNumber(scanner.nextInt());
					System.out.println("enter the candidate id");
					vote.setCandidateId(scanner.nextInt());
					System.out.println("candidate name and party name");	
					vote.setCandidateName(scanner.next());
					vote.setPartyname(scanner.next());
					String sql="insert into votingsystem(voterid,votingNumber,candidateid,candidatename,partyname)"+" values("+vote.getVoterid()+","+vote.getVotingNumber()+","+vote.getCandidateId()+","+vote.getCandidateName()+","+vote.getPartyname()+")";
					ResultSet resultset = sr.executeQuery(sql);
		}
	}
		}	
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	
	}
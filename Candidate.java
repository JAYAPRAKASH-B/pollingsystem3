package pollingsystem;

public class Candidate {
 private int votingnumber,voterid;	
 private String username;
 private String password;
 private String partyname;
 Candidate(){}
 
 
 
 public String getUsername() {
	 return username;
 }
 public int getVoterId() {
	 return voterid;
 }
 public void setVoterId(int voterid) {
	 this.voterid=voterid;
 }
 public String getPassword() {
	 return password;
 }
 public String getPartyname() {
	 return partyname;
 }
 public int getVotingNumber() {
	 return votingnumber;
 }
 public void setVotingNumber(int votingnumber) {
	 this.votingnumber=votingnumber;
 }
 
 public void setUsername(String username) {
	 this.username=username;
 }
 public void setPassword(String password) {
	 this.password=password;
 }
 public void setPartyname(String partyname) {
	 this.partyname=partyname;
 }
 @override
 public Candidate(String username,String password, String partyname,int voterid) {
	 super();
	 
	 this.username=username;
	 this.password=password;
	 this.partyname=partyname;
	 this.voterid=voterid;
 }
}

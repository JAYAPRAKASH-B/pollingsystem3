package pollingsystem;
public class Voter{
	private int voterid,votingNumber,candidateid,age;
	private String username,password,partyname,candidatename;
	public int getVoterid() {
		return voterid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setVoterid(int voterid) {
		this.voterid=voterid;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public int getVotingNumber() {
		return votingNumber;
	}
	public String getPartyname() {
		return partyname;
	}
	public String getCandidateName() {
		return candidatename;
	}
	public void setCandidateName(String candidatename) {
		this.candidatename=candidatename;
	}
	public int getCandidateId() {
		return candidateid;
	}
	public void setCandidateId(int candidateid) {
		this.candidateid =candidateid;
	}
	public void setPartyname(String partyname) {
		this.partyname=partyname;
	}
	public void setVotingNumber(int votingNumber) {
		this.votingNumber=votingNumber;
	}
	Voter(){}
	public Voter(int voterid,int age, String username, String password,int votingNumber,String partyname) {
		super();
		this.voterid=voterid;
		this.age=age;
		this.username=username;
		this.password=password;
		this.votingNumber=votingNumber;
		this.partyname=partyname;
	}
}
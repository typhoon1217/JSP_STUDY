package sampleMember;

public class Member {
	private int no;
	private String memberId;
	private String memberPw;
	private String memberPwPw;
	private String memberName;
	private String memberNickName;
	private String memberEmail;
	private String memberRoute;
	private String memberPhone;
	private String memberBirth;
	
	public Member() {
		super();
	}

	public Member(int no, String memberId, String memberPw, String memberPwPw, String memberName, String memberNickName,
			String memberEmail, String memberRoute, String memberPhone, String memberBirth) {
		super();
		this.no = no;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberPwPw = memberPwPw;
		this.memberName = memberName;
		this.memberNickName = memberNickName;
		this.memberEmail = memberEmail;
		this.memberRoute = memberRoute;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberPwPw() {
		return memberPwPw;
	}

	public void setMemberPwPw(String memberPwPw) {
		this.memberPwPw = memberPwPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNickName() {
		return memberNickName;
	}

	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberRoute() {
		return memberRoute;
	}

	public void setMemberRoute(String memberRoute) {
		this.memberRoute = memberRoute;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	
	
	
	
	
}

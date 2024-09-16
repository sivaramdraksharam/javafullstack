package springpayroll.modal;

public abstract class User {

	private int id;
	private String name;
	private UserTypes userType;
	
	public User(){
		System.out.println("User bean created");
	}

	public User(int id, String name, UserTypes userType) {
		super();
		this.id = id;
		this.name = name;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserTypes getUserType() {
		return userType;
	}

	public void setUserType(UserTypes userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userType=" + userType + "]";
	}
	
	
	
	
	
	
}

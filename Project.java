import java.util.Iterator;

public class Project {

	//here we are initializing all the project details and the people
	int p_num;
	String p_name;
	String building_type;
	String address;
	int ERF_num;
	Double Fee;
	Double paid;
	String deadline;
	Person architect;
	Person contractor;
	Person customer;
	
	//creating a method for the project details
	public Project(int p_num, String p_name, String building_type, String address, int ERF_num, Double Fee, Double paid,String deadline) {

		this.p_num = p_num;
		this.p_name = p_name;
		this.building_type = building_type;
		this.address = address;
		this.ERF_num = ERF_num;
		this.Fee = Fee;
		this.paid = paid;
		this.deadline = deadline;
	
	}	
	public Project(String string) {
		// TODO Auto-generated constructor stub
	}
	//create a setArchitect method so we can use it by calling it in the main poised file
	public void setArchitect(Person arc) {
		architect = arc;
	}
	
	public Person getArchitect() {
		return architect;
	}
	//create a setContractor method so we can use it by calling it in the main poised file
	public void setContractor(Person cont) {
		contractor = cont;
	}

	public Person getContractor() {
		return contractor;
	}
	//create a setCustomer method so we can use it by calling it in the main poised file
	public void setCustomer(Person cust) {
		customer = cust;
	}
	
	public Person getCustomer() {
		return customer;
	}
	
	//Use the getName function to call the names of the project and return p_name which is project name
	public String getName() {
		return p_name;
	}
	//create a toString method
	public String toString() {
		String output = "\nProject number: " + p_num;
		output += "\nProject name: " + p_name;
		output += "\nType of building: " + building_type;
		output += "\nProject address: " + address;
		output += "\nERF number: " + ERF_num;
		output += "\nProject cost: " + Fee;
		output += "\nAmount paid: "+ paid;
		output += "\nProject deadline date : " + deadline;
		return output;
	}
	public void getCompletion(String string) {
		// TODO Auto-generated method stub
		
	}
	public Double get_total_fee() {
		return Fee;
	}
	public Double get_total_paid_amount() {
		// TODO Auto-generated method stub
		return Fee;
	}
	public Double Project() {
		// TODO Auto-generated method stub
		return paid;
	}
	
	public String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
	public void set_deadline_date(String date) {
		deadline = date;
	}
	public void set_total_amount_paid(double nextDouble) {
		paid = nextDouble;
	}
	public  String get_project_name() {
		// TODO Auto-generated method stub
		return p_name;
	}
	/**
	 * @return the p_num
	 */
	public int getP_num() {
		return p_num;
	}
	/**
	 * @param p_num the p_num to set
	 */
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	/**
	 * @return the p_name
	 */
	public String getP_name() {
		return p_name;
	}
	/**
	 * @param p_name the p_name to set
	 */
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	/**
	 * @return the building_type
	 */
	public String getBuilding_type() {
		return building_type;
	}
	/**
	 * @param building_type the building_type to set
	 */
	public void setBuilding_type(String building_type) {
		this.building_type = building_type;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the eRF_num
	 */
	public int getERF_num() {
		return ERF_num;
	}
	/**
	 * @param eRF_num the eRF_num to set
	 */
	public void setERF_num(int eRF_num) {
		ERF_num = eRF_num;
	}
	/**
	 * @return the fee
	 */
	public Double getFee() {
		return Fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		Fee = fee;
	}
	/**
	 * @return the paid
	 */
	public Double getPaid() {
		return paid;
	}
	/**
	 * @param paid the paid to set
	 */
	public void setPaid(Double paid) {
		this.paid = paid;
	}
	/**
	 * @return the deadline
	 */
	public String getDeadline() {
		return deadline;
	}
	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	

	
	
	
}


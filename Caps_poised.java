/*Name: Hamza Asad
 *Date: 2020/09/13
 *Task 24: Capstone project
 */

//import useful functions. 
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * @author hamza
 *
 */

public class Caps_poised {

	public static void main(String[] args) throws IOException, ParseException {


		// TODO Auto-generated method stub

		for (int i = 10; i > 1; i--) {
			Scanner user_request = new Scanner(System.in);

			System.out.println(
					"\n\"What would you like to do today \n AN - add new project (enter 'a' after filling the information) \n VA - view all tasks \n E - exit ");
			System.out
					.println("\n=====================================================================================");
			// make the answer to be a lower case so that it matches command
			String user_req = user_request.nextLine();

			BufferedReader bufReader = new BufferedReader(new FileReader("poised_info.txt"));
			ArrayList<String> listOfLines = new ArrayList<>();
			String line = bufReader.readLine();
			while (line != null) {
				listOfLines.add(line);
				line = bufReader.readLine();

				if (user_req.equalsIgnoreCase("va")) {
					System.out.print(line + "\n");
				}

			}
			bufReader.close();

			if (user_req.equalsIgnoreCase("an")) {

				// We are working out with the architects details here
				System.out.print("ARCHITECTS DETAILS:\n");

				// We are getting the architects name
				Scanner poised_arch = new Scanner(System.in);
				System.out.print("What is the architects name: \n");
				String arch_name = poised_arch.nextLine();

				// Architects surname
				Scanner poised_arch_surname = new Scanner(System.in);
				System.out.print("Architects surname: ");
				String arch_surname = poised_arch_surname.nextLine();

				// Architects cell number
				Scanner poised_arch_num = new Scanner(System.in);
				System.out.print("Architects contact number: \n");
				String arch_num = poised_arch_num.nextLine();

				// Architects email address
				Scanner poised_arch_email = new Scanner(System.in);
				System.out.print("Architects email: \n");
				String arch_email = poised_arch_email.nextLine();

				// Architects physical address
				Scanner poised_arch_address = new Scanner(System.in);
				System.out.print("Architects physical address: \n");
				String arch_address = poised_arch_address.nextLine();

				// ========================================================================
				// here we work with the project information
				System.out.print("\nPROJECT INFORMATION:\n");

				// Project number
				Scanner poised_num = new Scanner(System.in);
				System.out.print("Enter the project number: \n");
				int p_num = poised_num.nextInt();

				// project name
				Scanner poised_name = new Scanner(System.in);
				System.out.print("Enter the project name: \n");
				String p_name = poised_name.nextLine();

				// project building type
				Scanner poised_build = new Scanner(System.in);
				System.out.print("What type of building is it: \n");
				String building_type = poised_build.nextLine();

				// project building address
				Scanner poised_addr = new Scanner(System.in);
				System.out.print("What is the address of the building: \n");
				String address = poised_addr.nextLine();

				// project ERF number
				Scanner poised_ERF = new Scanner(System.in);
				System.out.print("What is the ERF number of the project: \n");
				int ERF_num = poised_ERF.nextInt();

				// project total amount to be paid
				Scanner poised_fee = new Scanner(System.in);
				System.out.print("What is the total fee of the whole project: \n");
				Double fee = poised_fee.nextDouble();

				// the amount paid by customer
				Scanner poised_paid = new Scanner(System.in);
				System.out.print("What is the total amount paid: \n");
				Double paid = poised_paid.nextDouble();

				// the deadline date
				Scanner poised_deadline = new Scanner(System.in);
				System.out.print("When is the deadline: \n");
				String deadline = poised_deadline.nextLine();

				// storing info in a variable to check completion
				String proj_info = p_num + " " + p_name + " " + building_type + " " + address + " " + ERF_num + " "
						+ fee + " " + paid + " " + deadline;

				// =================================================================================
				// Contractors details
				System.out.print("\nCONTRACTORS DETAILS:\n");

				// Getting the contractors name
				Scanner poised_con_name = new Scanner(System.in);
				System.out.print("What is the contractors name: \n");
				String con_name = poised_con_name.nextLine();

				// Contractors surname
				Scanner poised_con_surname = new Scanner(System.in);
				System.out.print("Contractors surname: ");
				String con_surname = poised_con_surname.nextLine();

				// contractors contact number
				Scanner poised_con_num = new Scanner(System.in);
				System.out.print("Contractors contact number: \n");
				String con_num = poised_con_num.nextLine();

				// contractors email
				Scanner poised_con_email = new Scanner(System.in);
				System.out.print("Contractors email: \n");
				String con_email = poised_con_email.nextLine();

				// contractors physical address
				Scanner poised_con_address = new Scanner(System.in);
				System.out.print("Contractors physical address: \n");
				String con_address = poised_con_address.nextLine();

				// ================================================================================
				// Customers details
				System.out.print("\nCUSTOMERS DETAILS:\n");

				// getting the customers name
				Scanner poised_cust_name = new Scanner(System.in);
				System.out.print("What is the Customers name: \n");
				String cust_name = poised_cust_name.nextLine();

				// customers surname
				Scanner poised_cust_surname = new Scanner(System.in);
				System.out.print("Customers surname: ");
				String cust_surname = poised_cust_surname.nextLine();

				// customers contact number
				Scanner poised_cust_num = new Scanner(System.in);
				System.out.print("Customers contact number: \n");
				String cust_num = poised_cust_num.nextLine();

				// customers email address
				Scanner poised_cust_email = new Scanner(System.in);
				System.out.print("Customers email: \n");
				String cust_email = poised_cust_email.nextLine();

				// customers physical address
				Scanner poised_cust_address = new Scanner(System.in);
				System.out.print("Customers physical address: \n");
				String cust_address = poised_cust_address.nextLine();

				// =====================================================================================

				// =====================================================================================

				// This is where we store the project details that we get from the users input
				// in a variable called poised_proj
				Project poised_proj = new Project(p_num, p_name, building_type, address, ERF_num, fee, paid, deadline);

				// Using the setArchitect function to store the architects details
				poised_proj.setArchitect(new Person(arch_name, arch_surname, arch_num, arch_email, arch_address));

				System.out.print("The architects details of this project is: \n");
				// Printing out the architects details
				System.out.print(poised_proj.getArchitect().toString() + "\n");

				// Using the setContractor function to store the contractors details
				poised_proj.setContractor(new Person(con_name, con_surname, con_num, con_email, con_address));

				System.out.print("\nThe contractors details of this project is: \n");
				// printing out the contractors details
				System.out.print(poised_proj.getContractor().toString() + "\n");

				// Using the setCustomers function to store the customers details
				poised_proj.setCustomer(new Person(cust_name, cust_surname, cust_num, cust_email, cust_address));

				System.out.print("\nThe customers details for this project is: \n");
				// printing out the customers details
				System.out.print(poised_proj.getCustomer().toString() + "\n");

//					=============================================================================
				// printing out the project details
				System.out.print(poised_proj + "\n");

				// ================================reader===============================

				try {
					BufferedReader reader = new BufferedReader(new FileReader(new File("poised_info.txt")));

				}

				catch (IOException ex) {
					System.out.println("Error: " + ex);
				}

				// ==============================================================

				// this is where we name the project with the customers surname if they don't
				// add the project name

				if (p_name != null && p_name.length() == 0) {
					System.out.print("\n" + building_type + " " + cust_surname);
				} else {
					System.out.print(p_name);
				}

				// =============================================================================

				// Project Completion
				// set my boolean variable to false so that i am able to display the options
				// after every option the user inputs
				boolean edit = true;

				// created a while loop and set it to true
				while (edit) {

					System.out.print("working");

					// printed a option menu and created a scanner input for it
					Scanner edit_task_in = new Scanner(System.in);
					System.out.println("\nPlease select a option:\n\n" + "ec  - edit contractors details\n"
							+ "ed  - edit deadline date\n" + "ea  - edit amount paid \n"
							+ "f   - finalise task(Invoice)" + "\n" + "a  - add objects\n" + "u - update info\n"
							+ "vm - view update menu\n");
					System.out.println(
							"\n=====================================================================================");
					// make the answer to be a lower case so that it matches command
					String edit_task = edit_task_in.next().toLowerCase();

					try {

						if (edit_task.equals("a")) {
							String filename = "poised_info.txt";
							File f = new File(filename);
							FileWriter fw = new FileWriter(f, true); // the true will append the new data
							BufferedWriter brf = new BufferedWriter(fw);
							// fw.write(fw.toString() + "\n" );// appends the string to the file

							System.out.print("Project info successfully added...");
							brf.write(poised_proj.toString() + "\n\n");
							brf.close();
							fw.close();
						}

					} catch (IOException ioe) {
						System.out.println("IOException: " + ioe.getMessage());
					}

					// Use a try block
					try {
						// create an if statement and see if the user enters "ed" so that they can edit
						// the deadline date
						if (edit_task.equals("ed")) {
							// created a new scanner
							edit_task_in = new Scanner(System.in);
							System.out.println("Please enter the new deadline date.");
							poised_proj.set_deadline_date(poised_proj.nextLine());
							// This is where we edit the task and store it again
							String deadline_date = edit_task_in.nextLine();
							System.out.println(poised_proj.Project());
							System.out.print(poised_proj + "\n");

						}

						// created an else if statement for the different option if the user entered a
						// different option
						else if (edit_task.contentEquals("ec")) {

							// This is where we then change the contractors details
							System.out.println("Changing the contractors details ");
							edit_task_in = new Scanner(System.in);
							System.out.println("What is the name of the contractor? ");
							String cont_name = edit_task_in.nextLine();

							edit_task_in = new Scanner(System.in);
							System.out.println("What is the surname of the contractor? ");
							String cont_surname = edit_task_in.nextLine();

							edit_task_in = new Scanner(System.in);
							System.out.println("What is contractors telephone number? ");
							String cont_tel = edit_task_in.nextLine();

							edit_task_in = new Scanner(System.in);
							System.out.println("What is the contractors email's address? ");
							String cont_email = edit_task_in.nextLine();

							edit_task_in = new Scanner(System.in);
							System.out.println("What is the contractors physical address? ");
							String cont_address = edit_task_in.nextLine();

							// here is where we then store the new details again and then we print it
							Person contractor = new Person(cont_name, cont_surname, cont_tel, cont_email, cont_address);
							poised_proj.setContractor(contractor);
							System.out.println("\nThe contractors details have been updated...");
							System.out.println(poised_proj.getContractor());
						}
						// created an else if statement for the different option if the user entered a
						// different option
						else if (edit_task.equals("ea")) {
							edit_task_in = new Scanner(System.in);
							System.out.println("What is the new amount paid by the customer?");
							poised_proj.set_total_amount_paid(edit_task_in.nextDouble());
							System.out.println("Total paid amount has been changed.\n");
							System.out.println("The new project details are:\n" + poised_proj);
						}
					}

					// using a catch block
					catch (Exception e) {
						System.out.print("An error was occured");

					}

					// use a second try block
					try {
						// created an if statement for the users input
						if (edit_task.equals("f")) {

							// I then created my total amount by subtracting the total fee by the paid
							// amount
							Double total_amount = poised_proj.get_total_fee() - poised_proj.get_total_paid_amount();

							System.out.println("INVOICE:");
							LocalDate time = LocalDate.now();
							System.out.println("-------------------------------------------\n" + "Date:" + time
									+ "\nProject Name:" + poised_proj.get_project_name() + "\n"
									+ "-------------------------------------------\n"
									+ "Total amount paid by the customer  : R" + poised_proj.paid
									+ "\nTotal amount of the project        : R" + poised_proj.get_total_fee()
									+ "\n=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=\n" + "Total amount owed :R"
									+ paid + "\n" + "=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=");
						}

						// Check if the project is already up to date and notify the user that the
						// payment is already done
						if (paid == 0) {
							System.out.print("The project is already paid up");
							break;
						}

						//
						edit = false;
					}

					// use the second catch block with a Exception error
					catch (Exception e) {
						System.out.print("An error was occured");
					}
				}

				// =========================changing
				// details======================================

				// printed a option menu and created a scanner input for it
				Scanner edit_task_in = new Scanner(System.in);
				System.out.println(
						"\n\"What would you like to update: (if nothing - enter 'f' to finalize the project  \n D - due date,\n A - amount paid,\n P - project name, \n F - Finalize project \n Z - check if task is overdue \n Q - Check if tasks are completed");
				System.out.println(
						"\n=====================================================================================");
				// make the answer to be a lower case so that it matches command
				String edit_task = edit_task_in.nextLine();

				if (edit_task.equalsIgnoreCase("U")) {
					edit_task_in = new Scanner(System.in);
					System.out.println(
							"What would you like to update \n d - due date,\n a - amount paid,\n p - project name, \n f - Finalize project ");
					String updates = edit_task_in.nextLine();
				}

				// working with editing date
				else if (edit_task.equalsIgnoreCase("D")) {
					Scanner newDeadline = new Scanner(System.in);
					System.out.print("Please enter the new due date in the form of (dd-MM-yyyy): ");
					String dueDate = edit_task_in.nextLine();
					poised_proj.set_deadline_date(newDeadline.nextLine());
					System.out.print("Date has been changed.\n");
					System.out.print("The new project details are:\n" + poised_proj.getDeadline().toString());
				}

				// working with editing paid amount
				else if (edit_task.equalsIgnoreCase("A")) {
					Scanner newPaidAmount = new Scanner(System.in);
					System.out.print("Please enter the new amount paid ");
					poised_proj.setPaid(newPaidAmount.nextDouble());
					System.out.print("Amount paid has been changed.\n");
					System.out.print("The new project details are:\n" + poised_proj.get_total_paid_amount());

				}

				// working with editing project name
				else if (edit_task.equalsIgnoreCase("P")) {
					Scanner newProjName = new Scanner(System.in);
					System.out.print("Please enter the new projects name: ");
					poised_proj.setP_name(newProjName.nextLine());
					System.out.print("Project name has been changed.\n");
					System.out.print("The new project details are:\n" + poised_proj.get_project_name());
				}

				// created an if statement for the users input
				else if (edit_task.equalsIgnoreCase("F")) {

					// I then created my total amount by subtracting the total fee by the paid
					// amount
					Double total_amount = poised_proj.get_total_fee() - poised_proj.get_total_paid_amount();

					System.out.println("INVOICE:");
					LocalDate time = LocalDate.now();
					System.out.println("-------------------------------------------\n" + "Date:" + time
							+ "\nProject Name:" + poised_proj.get_project_name() + "\n"
							+ "-------------------------------------------\n" + "Total amount paid by the customer  : R"
							+ poised_proj.paid + "\nTotal amount of the project        : R"
							+ poised_proj.get_total_fee() + "\n=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=\n"
							+ "Total amount owed :R" + paid + "\n" + "=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=");
				}

				// Check if the project is already up to date and notify the user that the
				// payment is already done
				if (paid == 0) {
					System.out.print("The project is already paid up");
				}

				// ===============working with project completion===================

				else if (edit_task.equalsIgnoreCase("Q"))

					if (proj_info.length() < 8) {

						// checking if any input is blank
						String s = proj_info;
						String[] data = s.split(" ");
						System.out.println("Project number = " + data[0].isBlank());
						System.out.println("Project Name = " + data[1].isBlank());
						System.out.println("Building type = " + data[2].isBlank());
						System.out.println("Address = " + data[3].isBlank());
						System.out.println("ERF number = " + data[4].isBlank());
						System.out.println("Fee = " + data[5].isBlank());
						System.out.println("Paid amount = " + data[6].isBlank());
						System.out.println("Deadline date = " + data[7].isBlank());
						System.out.print("The tasks are not Completed");
					}

					else {
						System.out.print("The tasks are Completed");
					}

				// =================================================

				// This is where we check if the tasks are overdue or not
				else if (edit_task.equalsIgnoreCase("Z")) {

					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

					// creating a date of object
					// storing the current date
					Date currentDate = new Date();
					String deadline_date = poised_proj.getDeadline();

					Date deadd = dateFormat.parse(deadline_date);

					System.out.print("Did the project pass the due date : ");
					System.out.print(currentDate.after(deadd));
					System.out.print("\n" + deadline_date);
					System.out.print("\n" + currentDate);

				}

				// This is to exit the loop if the user wants to exit the program
			}
			if (user_req.equalsIgnoreCase("e")) {
				System.out.print("EXITING...");
				break;
//					}
			}

		}
	}
}

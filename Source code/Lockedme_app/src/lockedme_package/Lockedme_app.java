package lockedme_package;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

class closeapp{
	
	public static void clearScreen() {  
	    System.out.print("You are sucessfully logged out, click here to login again");  
	    System.out.flush();  
	}
}
public class Lockedme_app {

	
	static final String filespath = "C:\\Users\\raghav\\Desktop\\lockfiles"; //adding the path from where the files are retrieved
	
	public static void main(String[] args) {
		/*Problem statement :
		 * 
		 * Need to develop a application with following features:
		 * 
		 * Display the Menu(Which gives all the below options for user)
		 *  
		 * 1. Retrieving file names in ascending order
		 * 2. Option to add a user specific file
		 * 3. Option to search a user specific file 
		 * 4. Delete a user specific file
		 * 5. Option to go back to  the main Menu(Display's all the options),in other words "BACK" key
		 * 6. Option to close the application.
		 * */
		
		//adding the path from where the files are retrieved
		
		
		displayMenu();
		System.out.println();
		System.out.println();
		addfile();
		System.out.println();
		System.out.println();
		deletefile();
		System.out.println();
		System.out.println();
		searchfile();
		System.out.println();
		System.out.println();
		back();
		System.out.println();
		System.out.println();
		close();
		
		
		
	}
	
	//1.Display
	
	 static void displayMenu() 
	{
		System.out.println("************Welcome to LockedMe*************");
		System.out.println("******************Most Secured file Manager*************");
		System.out.println("*******************************Please select the below options*************"+"\n\n"
		
										 +"1. Retrieving a file names in ascending order" +"\n"
										 +"2. ADD new file" +"\n"
										 +"3. Search file" +"\n"
										 +"4. DELETE file" +"\n"
										 +"5. BACK" +"\n"
										 +"6. Close the application"+"\n");
	}
	//2.ADD
	public static void addfile() 
	{
		File folder = new File(filespath);
		File[] files = folder.listFiles(); // used  list files method to get/ fetch all the files from the directory.
		
		for (var a:files)
		{
			System.out.println(a.getName());// using for each loop, instead of standard for loop
		}
		if(files.length==0)
			System.out.println("No results");
	}
	
	//3.SEARCH
	public static void searchfile() 
	{
	
		String searchfile;
		Scanner obj = new Scanner(System.in);
		System.out.println("please enter the file name to be searched");
		searchfile= obj.nextLine();
		
		File folder = new File(filespath);
		File[] files = folder.listFiles();
		
		LinkedList<String> filenames= new LinkedList<String>();
		
		for(var a:files) 
		filenames.add(a.getName());// please note, if you put a {} bracket for this for loop, it will run it 4 times , as many files it has 
		
		if(filenames.contains(searchfile)) {
			System.out.println("This is your file "+ "=====>"+ searchfile);
		}
		else
			System.out.println("No results");
			
	

}
	//4.Delete
	public static void deletefile() {
		
		String deletefile;
		Scanner obj = new Scanner(System.in);
		System.out.println("please enter the file name to be deleted");
		deletefile= obj.nextLine();
		
		File file= new File("C:\\Users\\raghav\\Desktop\\lockfiles"+"\\"+ deletefile);

    if (file.exists()) {
    	file.delete();
        System.out.println("File deleted successfully");
    }
    else {
        System.out.println("no results");
    }
	}

	//5. BACK
	public static void back() 
	{
		String back;
		Scanner obj = new Scanner(System.in);
		System.out.println("Please type 'back' in lowercase to go to main menu");
		back= obj.nextLine();
		
		
		if(back.contains("back")) {
			Lockedme_app L = new Lockedme_app();
			L.displayMenu();
		}
		else
			System.out.println("type 'back' in lowercase again");
			
		}
		
	
	
	//6.Close
		public static void close() 
		{
			
			
			String close;
			Scanner obj = new Scanner(System.in);
			System.out.println("Please type 'close' in lowercase to go to main menu");
			close= obj.nextLine();
			
			
			if(close.contains("close")) {
				closeapp C=new closeapp();
				C.clearScreen();
			}
			else
				System.out.println("Please type 'close' in lowercase again");
				
			}
			
			
	}


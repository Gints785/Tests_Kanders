package swing.demo.dialogBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException;

public class Programma {

	public static void main(String[] args) {
		
		int p = 0,n = 0,a=0;
		
		
		try {
		      File myObj = new File("Atbildes.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("Fails izveidots: " + myObj.getName());
		      } else {
		        System.out.println("Fails jau past?v.");
		      }
		    } catch (IOException e) {
		      System.out.println("K?ume.");
		      e.printStackTrace();
		    }
		
		JOptionPane.showMessageDialog( null, "Tests par teksta datn?m","Zi?a", JOptionPane.INFORMATION_MESSAGE);
		
		String[] options0 = {"OK"};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel("Ievadi savu v?rdu: ");
		JTextField txt = new JTextField(10);
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, "Zi?a", JOptionPane.NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options0 , options0[0]);

		if(selectedOption == JOptionPane.CLOSED_OPTION) {
			System. exit(1);
		}
		if(selectedOption == 0)
			
		{
		    String atbilde = txt.getText();
		    try {
			      FileWriter myObj = new FileWriter("Atbildes.txt",true);
			      myObj.write("\n============================");
			      myObj.write("\n"+atbilde+"\r\n");
			      myObj.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
	
		
		
		  

	
		
		
		
		
		 String[] options = new String[] {"canExecute()", "canRead()", "canWrite()", "getName()"};
		    int response = JOptionPane.showOptionDialog(null, "Ar k?du metodi var p?rbaud?t, vai lietojumprogramma var nolas?t failu, kas apz?m?ts ar ?o abstrakto ce?a nosaukumu?", "1)Jaut?jums",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		        null, options, options[0]);
		    if (response == JOptionPane.CLOSED_OPTION) {
		    	
		    	 System. exit(1);
	        } 
		    
		    if(response == 1) {
		    	JOptionPane.showMessageDialog( null, "Pareizi");
		    	p=p+1;
		    	a=a+1;
		    }
		    else {
		    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
		    	n=n+1;
		    	a=a+1;
		    }
		   
		 String[] options1 = new String[] {"getPath()", "canExecute()", "canWrite()", "list()"};
			 int response1 = JOptionPane.showOptionDialog(null, "Ar k?du metodi var atgriezt virk?u mas?vu, kas nosauc direktorij? eso?os failus un direktorijus.", "2)Jaut?jums",
			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			        null, options1, options1[0]);
			 if (response1 == JOptionPane.CLOSED_OPTION) {
		    	 JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);

		 		try {
		 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
		 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
		 		      myObj.close();
		 		      System.out.println("Successfully wrote to the file.");
		 		    } catch (IOException e) {
		 		      System.out.println("An error occurred.");
		 		      e.printStackTrace();
		 		    }
		    	 System. exit(1);
	        }
			    if(response1 == 3) {
			    	JOptionPane.showMessageDialog( null, "Pareizi");
			    	p=p+1;
			    	a=a+1;
			    }
			    else {
			    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
			    	n=n+1;
			    	a=a+1;
			    }
			    
			    
			    String[] options2 = new String[] {"File myObj = new File(\"file.txt\");", "new File = File myObj(\"file.txt\");", "File myObj = (\"file.txt\");", "new File = myObj (\"file.txt\");"};
				 int response2 = JOptionPane.showOptionDialog(null, "Java kods, lai izveidotu failu \"file.txt\", ir ...", "3)Jaut?jums",
				        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				        null, options2, options2[0]);
				 if (response2 == JOptionPane.CLOSED_OPTION) {
					 JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
					 try {
			 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
			 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
			 		      myObj.close();
			 		      System.out.println("Successfully wrote to the file.");
			 		    } catch (IOException e) {
			 		      System.out.println("An error occurred.");
			 		      e.printStackTrace();
			 		    }
			    	 System. exit(1);
		        } 
				    if(response2 == 0) {
				    	JOptionPane.showMessageDialog( null, "Pareizi");
				    	p=p+1;
				    	a=a+1;
				    }
				    else {
				    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
				    	n=n+1;
				    	a=a+1;
				    }
				    
				    String[] options3 = new String[] {" FileWriter Writer = new FileWriter(\"name.txt\");\r\n"+ "",
				    								  " FileWriter myWriter = new FileWrter(\"filename.txt\");\r\n"+ "",
				    		                          " FileWriter File = new FileWriter(\"name.txt\");\r\n"+ "",
				    		                          " FileWriter myWriter = new FileWriter(\"File.txt\");\r\n"+ ""};
					 int response3 = JOptionPane.showOptionDialog(null, "Kur? no dotajiem variantiem nav pareizs?", "4)Jaut?jums",
					        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					        null, options3, options3[0]);
					 if (response3 == JOptionPane.CLOSED_OPTION) {
						 JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
						 try {
				 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
				 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
				 		      myObj.close();
				 		      System.out.println("Successfully wrote to the file.");
				 		    } catch (IOException e) {
				 		      System.out.println("An error occurred.");
				 		      e.printStackTrace();
				 		    }
				    	 System. exit(1);
			        } 
					    if(response3  == 1) {
					    	JOptionPane.showMessageDialog( null, "Pareizi");
					    	p=p+1;
					    	a=a+1;
					    }
					    else {
					    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
					    	n=n+1;
					    	a=a+1;
					    }
					    
					    
					    
					    
					    String[] options4 = new String[] {"canWrite()", "getName()", "createNewFile()", "mkdir()"};
					    int response4 = JOptionPane.showOptionDialog(null, "Ar k?du metodi var izveidot direktoriju?", "5)Jaut?jums",
					        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					        null, options4, options4[0]);
					    if (response4 == JOptionPane.CLOSED_OPTION) {
					    	JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
					    	try {
					 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
					 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
					 		      myObj.close();
					 		      System.out.println("Successfully wrote to the file.");
					 		    } catch (IOException e) {
					 		      System.out.println("An error occurred.");
					 		      e.printStackTrace();
					 		    }
					    	 System. exit(1);
				        } 
					    if(response4 == 3) {
					    	JOptionPane.showMessageDialog( null, "Pareizi");
					    	p=p+1;
					    	a=a+1;
					    }
					    else {
					    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
					    	n=n+1;
					    	a=a+1;
					    }
					    
					    
					    String[] options5 = new String[] {"string", "long", "boolean", "int"};
					    int response5 = JOptionPane.showOptionDialog(null, "Kads tips ir metodei canWrite?", "6)Jaut?jums",
					        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					        null, options5, options5[0]);
					    if (response5 == JOptionPane.CLOSED_OPTION) {
					    	JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
					    	try {
					 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
					 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
					 		      myObj.close();
					 		      System.out.println("Successfully wrote to the file.");
					 		    } catch (IOException e) {
					 		      System.out.println("An error occurred.");
					 		      e.printStackTrace();
					 		    }
					    	 System. exit(1);
				        } 
					    if(response5 == 2) {
					    	JOptionPane.showMessageDialog( null, "Pareizi");
					    	p=p+1;
					    	a=a+1;
					    }
					    else {
					    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
					    	n=n+1;
					    	a=a+1;
					    }
					    
					    
					    
					    String[] options6 = new String[] {"length()", "getName()", "getAbsolutePath()", "list()"};
					    int response6 = JOptionPane.showOptionDialog(null, "Ar kuru metodi var uzzin?t faila lielumu baitos?", "7)Jaut?jums",
					        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					        null, options6, options6[0]);
					    if (response6 == JOptionPane.CLOSED_OPTION) {
					    	JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
					    	try {
					 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
					 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
					 		      myObj.close();
					 		      System.out.println("Successfully wrote to the file.");
					 		    } catch (IOException e) {
					 		      System.out.println("An error occurred.");
					 		      e.printStackTrace();
					 		    }
					    	 System. exit(1);
				        } 
					    if(response6 == 0) {
					    	JOptionPane.showMessageDialog( null, "Pareizi");
					    	p=p+1;
					    	a=a+1;
					    }
					    else {
					    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
					    	n=n+1;
					    	a=a+1;
					    }
					    
					    
					    
					    
					    String[] options7 = new String[] {"integer", "Float", "Tikai tekstu", "String"};
					    int response7 = JOptionPane.showOptionDialog(null, "Ko var ierakst?t failos?", "8)Jaut?jums",
					        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					        null, options7, options7[0]);
					    if (response7 == JOptionPane.CLOSED_OPTION) {
					    	JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
					    	try {
					 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
					 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
					 		      myObj.close();
					 		      System.out.println("Successfully wrote to the file.");
					 		    } catch (IOException e) {
					 		      System.out.println("An error occurred.");
					 		      e.printStackTrace();
					 		    }
					    	 System. exit(1);
				        } 
					    if(response7 == 3) {
					    	JOptionPane.showMessageDialog( null, "Pareizi");
					    	p=p+1;
					    	a=a+1;
					    }
					    else {
					    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
					    	n=n+1;
					    	a=a+1;
					    }
					    
					    
					    String[] options8 = new String[] {"ieraksta datn?", "Format? izvad?mo datu pl?smu", "nolasa datus no datnes", "Pa?trina datu ielas??anu"};
					    int response8 = JOptionPane.showOptionDialog(null, "Ko dara klase Bufferedreader?", "9)Jaut?jums",
					        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					        null, options8, options8[0]);
					    if (response8 == JOptionPane.CLOSED_OPTION) {
					    	JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
					    	try {
					 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
					 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
					 		      myObj.close();
					 		      System.out.println("Successfully wrote to the file.");
					 		    } catch (IOException e) {
					 		      System.out.println("An error occurred.");
					 		      e.printStackTrace();
					 		    }
					    	 System. exit(1);
				        } 
					    if(response8 == 3) {
					    	JOptionPane.showMessageDialog( null, "Pareizi");
					    	p=p+1;
					    	a=a+1;
					    }
					    else {
					    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
					    	n=n+1;
					    	a=a+1;
					    }
					    
					    String[] options9 = new String[] {"Pa?trina datu ielas??anu", "nolasa datus no datnes", "Format? izvad?mo datu pl?smu", "ieraksta datn?"};
					    int response9 = JOptionPane.showOptionDialog(null, "Ko dara klase PrintWriter?", "10)Jaut?jums",
					        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					        null, options9, options9[0]);
					    if (response9 == JOptionPane.CLOSED_OPTION) {
					    	JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no "+a+" jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
					    	try {
					 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
					 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
					 		      myObj.close();
					 		      System.out.println("Successfully wrote to the file.");
					 		    } catch (IOException e) {
					 		      System.out.println("An error occurred.");
					 		      e.printStackTrace();
					 		    }
					    	 System. exit(1);
				        } 
					    if(response9 == 2) {
					    	JOptionPane.showMessageDialog( null, "Pareizi");
					    	p=p+1;
					    	a=a+1;
					    }
					    else {
					    	JOptionPane.showMessageDialog( null, "Nepareizi","Zi?a",JOptionPane.ERROR_MESSAGE);
					    	n=n+1;
					    	a=a+1;
					    }
					    try {
				 		      FileWriter myObj = new FileWriter("Atbildes.txt",true);
				 		      myObj.write("Pareizi atbild?ti - "+p+"\nNepareizi atbild?ti - "+n+"\nNo "+a+" jaut?jumiem");
				 		      myObj.close();
				 		      System.out.println("Successfully wrote to the file.");
				 		    } catch (IOException e) {
				 		      System.out.println("An error occurred.");
				 		      e.printStackTrace();
				 		    }
			    
			    
			    
			    
			    JOptionPane.showMessageDialog( null,"Pareizi atbild?ti - "+p+" no 10 jaut?jumiem - ","Rezult?ts",JOptionPane.INFORMATION_MESSAGE);
			    
			    
			    
			    
			    
			    
			    
			    
			    
		
	}

}

package swing.demo.dialogBox;
import javax.swing.JOptionPane;
import java.io.File; 
import java.io.IOException;

public class Programma {

	public static void main(String[] args) {
		try {
		      File myObj = new File("Atbildes.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("Fails izveidots: " + myObj.getName());
		      } else {
		        System.out.println("Fails jau pastâv.");
		      }
		    } catch (IOException e) {
		      System.out.println("Kïume.");
		      e.printStackTrace();
		    }
		JOptionPane.showMessageDialog( null, "Tests par teksta datnçm");
		
		
		 String[] options = new String[] {"canExecute()", "canRead()", "canWrite()", "getName()"};
		    int response = JOptionPane.showOptionDialog(null, "Ar kâdu metodi var pârbaudît, vai lietojumprogramma var nolasît failu, kas apzîmçts ar ðo abstrakto ceïa nosaukumu?", "1)Jautâjums",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		        null, options, options[0]);
		    if(response == 1) {
		    	JOptionPane.showMessageDialog( null, "Pareizi");
		    }
		    else {
		    	JOptionPane.showMessageDialog( null, "Nepareizi");
		    }
		    
		 String[] options1 = new String[] {"getPath()", "canExecute()", "canWrite()", "list()"};
			 int response1 = JOptionPane.showOptionDialog(null, "Ar kâdu metodi var atgriezt virkòu masîvu, kas nosauc direktorijâ esoðos failus un direktorijus.", "2)Jautâjums",
			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			        null, options1, options1[0]);
			    if(response1 == 3) {
			    	JOptionPane.showMessageDialog( null, "Pareizi");
			    }
			    else {
			    	JOptionPane.showMessageDialog( null, "Nepareizi");
			    }
		
	}

}

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
		        System.out.println("Fails jau past�v.");
		      }
		    } catch (IOException e) {
		      System.out.println("K�ume.");
		      e.printStackTrace();
		    }
		JOptionPane.showMessageDialog( null, "Tests par teksta datn�m");
		
		
		 String[] options = new String[] {"canExecute()", "canRead()", "canWrite()", "getName()"};
		    int response = JOptionPane.showOptionDialog(null, "Ar k�du metodi var p�rbaud�t, vai lietojumprogramma var nolas�t failu, kas apz�m�ts ar �o abstrakto ce�a nosaukumu?", "1)Jaut�jums",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		        null, options, options[0]);
		    if(response == 1) {
		    	JOptionPane.showMessageDialog( null, "Pareizi");
		    }
		    else {
		    	JOptionPane.showMessageDialog( null, "Nepareizi");
		    }
		    
		 String[] options1 = new String[] {"getPath()", "canExecute()", "canWrite()", "list()"};
			 int response1 = JOptionPane.showOptionDialog(null, "Ar k�du metodi var atgriezt virk�u mas�vu, kas nosauc direktorij� eso�os failus un direktorijus.", "2)Jaut�jums",
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

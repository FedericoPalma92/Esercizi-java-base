import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class InvertiRigheFile {

	public static void main(String[] args) {
		String fileName ="";
		File file = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il nome del file: ");
		fileName = scan.nextLine();
		
		if (fileName.equals("")) {
			System.out.println("Nome del file non valido");
			return;
		}
		else {
			file = new File(fileName);
            if (!file.exists()) {
            	WriteFile(file);
            }
            
            try {
            	Scanner fileScan = new Scanner(file);
				if (!fileScan.hasNextLine()) {
					WriteFile(file);
					fileScan = new Scanner(file);
				}
            	
            	ArrayList righe = new ArrayList<String>();
				while (fileScan.hasNextLine()) {
					String line = fileScan.nextLine();
					righe.add(line);
				}
				
				FileWriter fileWriter = new FileWriter(file);
				
				for (int i =0; i<righe.size(); i++) {
					String line = (String) righe.get(i);
					String reverseLine = "";
					for (int j = line.length() - 1; j >= 0; j--) {
						reverseLine += line.charAt(j);
					}
					fileWriter.write(reverseLine + (i!=(righe.size()-1) ?"\n":""));
				}
				fileWriter.close();
				
            }
			catch (Exception e) {
				System.out.println("Errore nella lettura del file");
				return;
			}
		}
		
		

	}
	
	public static void WriteFile(File file) {
		try {
        	FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("La nebbia a gl'irti colli\n"
                            + "piovigginando sale\n"
                            + "e sotto il maestrale\n"
                            + "urla e biancheggia il mare");

            fileWriter.close();
            System.out.println("File creato");
            System.out.println();
		} catch (Exception e) {
			System.out.println("Errore nella creazione del file");
			return;
		}
	}

}

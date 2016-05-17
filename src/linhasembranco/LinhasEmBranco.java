package linhasembranco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class LinhasEmBranco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File dir = new File("/home/clayton/Área de Trabalho/UniFi/Arquivos Com Ajuste/SPED 03-15");

        FileFilter filtro = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".pdf");
            }
        };

        for (File arquivo : dir.listFiles(filtro)) {
                   
            System.out.println(arquivo.getPath());
            FileReader leitor = new FileReader(arquivo);
            BufferedReader leitorImp = new BufferedReader(leitor);
                        
            
            String linha = "";
            
            int cont=0;
            while ((linha = leitorImp.readLine()) != null) {
                cont++;
                
                if (linha.isEmpty()){
                    System.out.println("LINHA: " + cont);
                }
            }                        

            Scanner s = new Scanner(System.in);
            String a = s.next();
            
        }

    }

}

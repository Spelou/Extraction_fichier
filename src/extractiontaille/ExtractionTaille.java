/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractiontaille;

import java.io.File;

/**
 *
 * @author Quentin
 */
public class ExtractionTaille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       FileTreatment monTraitement=new FileTreatment("C:\\Users\\Quentin\\Documents\\Centrale Nantes\\ei2\\Info\\PAPPLDataBase\\Datas\\Achat ville de Nantes");
       monTraitement.SubFilesSize();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extractiontaille;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Quentin
 */
public class FileTreatment {

    private File directory;
    private File[] subfiles;
    private int nombreFichiers;

    public void SubFilesSize() {
        long size;
        for (int i = 0; i < nombreFichiers; i++) {
            size = subfiles[i].length();
            System.out.println(size);
        }
    }

    public FileTreatment(String directoryPath) {
        File directory = new File(directoryPath);
        File[] subfiles = new File[directory.listFiles().length];
        for(int i = 0; i < (subfiles.length-1);i++){
            subfiles[i]=directory.listFiles()[i];
        } 
        System.out.println("Le répertoire existe, et n'est pas un fichier");
        nombreFichiers = subfiles.length;
        System.out.println("Il y a: " + nombreFichiers + " fichier(s) dans le dossier");

    }

    public File getDirectory() {
        return directory;
    }

    public File[] getSubfiles() {
        return subfiles;
    }

    public int getNombreFichiers() {
        return nombreFichiers;
    }

    public void setDirectory(File directory) {
        this.directory = directory;
    }

    public void setSubfiles(File[] subfiles) {
        this.subfiles = subfiles;
    }

    public void setNombreFichiers(int nombreFichiers) {
        this.nombreFichiers = nombreFichiers;
    }

}

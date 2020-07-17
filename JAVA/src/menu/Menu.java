/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author ThinkPad
 */

import javax.swing.*;//Déclaration de variable string
import java.awt.*;
import java.awt.event.ActionEvent; //Déclaration de evenement
import java.awt.event.ActionListener;//Déclaration de variable action
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        JFrame fen=new JFrame("Menu");
        fen.setSize(1200,750);
        JPanel panel=new JPanel();
        fen.setContentPane(panel);
        panel.setLayout(null);
        JMenuBar MyMenuBar=new JMenuBar();
        panel.add(MyMenuBar);
        MyMenuBar.setBounds(0,0,1200,30);
        JMenu MenuFichier=new JMenu("Fichier");
        MyMenuBar.add(MenuFichier);
        JMenu MenuEditer=new JMenu("Editer");
        MyMenuBar.add(MenuEditer);
        JMenu MenuConsultation=new JMenu("Consultation");
        MyMenuBar.add(MenuConsultation);
        JMenu MenuStatistique=new JMenu("Statistique");
        MyMenuBar.add(MenuStatistique);
        JMenu MenuAide=new JMenu("?");
        MyMenuBar.add(MenuAide);
    //Insertion de pop-menu dans le menu fichier
        JMenuItem MenuNouveau=new JMenuItem("Nouveau Film");
        MenuFichier.add(MenuNouveau);
        JMenuItem MenuClient=new JMenuItem("Nouveau Client");
        MenuFichier.add(MenuClient);
        JMenuItem MenuQuitter=new JMenuItem("Quitter");
        MenuFichier.add(MenuQuitter);                       
    //Insertion de pop-menu dans le menu Editer
        JMenuItem MenuFilm=new JMenuItem("Film");
        MenuEditer.add(MenuFilm);
        JMenuItem MenuClien=new JMenuItem("Client");
        MenuEditer.add(MenuClien);
        JMenuItem MenuCode=new JMenuItem("Sécurité");
        MenuEditer.add(MenuCode);
    //Insertion de pop-menu dans le menu Consultation
        JMenuItem MenumaFilm=new JMenuItem("Film");
        MenuConsultation.add(MenumaFilm);
        JMenuItem MenumaClien=new JMenuItem("Client");
        MenuConsultation.add(MenumaClien);
    //Insertion de pop-menu dans le menu Statistique
        JMenuItem MenuChiffre=new JMenuItem("Genre");
        MenuStatistique.add(MenuChiffre);
    //Insertion de pop-menu dans le menu ?
        JMenuItem MenuAid=new JMenuItem("Aide");
        MenuAide.add(MenuAid);
        JMenuItem Menupropos=new JMenuItem("A Propos");
        MenuAide.add(Menupropos);
    //Ouvrir fenêtre Ajout nouveau film
    //Ouvrir fenêtre Ajout nouveau Client
    //Ouvrir fenêtre Editer Film
    //Ouvrir fenêtre Editer Client
    //Ouvrir fenêtre Editer Sécurité
    //Ouvrir fenêtre Consultation Film
    //Ouvrir fenêtre Consultation 
    //Ouvrir Aide
    //Ouvrir A propos
    //Quitter la fenêtre principal
        MenuQuitter.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          //public class BoiteConf{
          //    public staticc void main(String args[]){
            //      JFrame fen=new MaFenetre();
            //      fen.set
              //}
          //}

fen.dispose();
        }
    });
       // class MaFenetre extends JFrame{
       //     public MaFenetre(){
         //       super("Une Fenetre");setSize(300,200);}
       // }
       // public class BoiteConf{
         //   public static void main(String args[]){
           //     JFrame fen =new MaFenetre();
             //   fen.setVisible(true);
               // JOptionPane.showConfirmDialog(fen,"Voulez-vous continuer ?");
        //}
        //}
        fen.setVisible(true);
    }
    
}

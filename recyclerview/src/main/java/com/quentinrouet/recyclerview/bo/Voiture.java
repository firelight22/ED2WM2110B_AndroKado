package com.quentinrouet.recyclerview.bo;

/**
 * Created by quentin for AndroKado on 30/03/2022.
 */
public class Voiture {
   String marque, modele;
   int puissanceCV;
   int anneeSortie;
   String energie;

   public Voiture(String marque, String modele, int puissanceCV, int anneeSortie, String energie) {
      this.marque = marque;
      this.modele = modele;
      this.puissanceCV = puissanceCV;
      this.anneeSortie = anneeSortie;
      this.energie = energie;
   }

   public String getMarque() {
      return marque;
   }

   public void setMarque(String marque) {
      this.marque = marque;
   }

   public String getModele() {
      return modele;
   }

   public void setModele(String modele) {
      this.modele = modele;
   }

   public int getPuissanceCV() {
      return puissanceCV;
   }

   public void setPuissanceCV(int puissanceCV) {
      this.puissanceCV = puissanceCV;
   }

   public int getAnneeSortie() {
      return anneeSortie;
   }

   public void setAnneeSortie(int anneeSortie) {
      this.anneeSortie = anneeSortie;
   }

   public String getEnergie() {
      return energie;
   }

   public void setEnergie(String energie) {
      this.energie = energie;
   }
}

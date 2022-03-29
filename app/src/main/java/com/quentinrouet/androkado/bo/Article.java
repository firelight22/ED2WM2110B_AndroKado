package com.quentinrouet.androkado.bo;

/**
 * Created by quentin for AndroKado on 29/03/2022.
 */
public class Article {
   String titre, description, url;
   float prix, degreEnvie;
   boolean isAchete;

   public Article(String titre, String description, String url, float prix, float degreEnvie, boolean isAchete) {
      this.titre = titre;
      this.description = description;
      this.url = url;
      this.prix = prix;
      this.degreEnvie = degreEnvie;
      this.isAchete = isAchete;
   }

   public String getTitre() {
      return titre;
   }

   public void setTitre(String titre) {
      this.titre = titre;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public float getPrix() {
      return prix;
   }

   public void setPrix(float prix) {
      this.prix = prix;
   }

   public float getDegreEnvie() {
      return degreEnvie;
   }

   public void setDegreEnvie(float degreEnvie) {
      this.degreEnvie = degreEnvie;
   }

   public boolean isAchete() {
      return isAchete;
   }

   public void setAchete(boolean achete) {
      isAchete = achete;
   }
}

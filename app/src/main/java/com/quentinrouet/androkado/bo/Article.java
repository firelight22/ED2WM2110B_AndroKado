package com.quentinrouet.androkado.bo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by quentin for AndroKado on 29/03/2022.
 */
public class Article implements Parcelable {
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

   protected Article(Parcel in) {
      titre = in.readString();
      description = in.readString();
      url = in.readString();
      prix = in.readFloat();
      degreEnvie = in.readFloat();
      isAchete = in.readByte() != 0;
   }

   @Override
   public void writeToParcel(Parcel dest, int flags) {
      dest.writeString(titre);
      dest.writeString(description);
      dest.writeString(url);
      dest.writeFloat(prix);
      dest.writeFloat(degreEnvie);
      dest.writeByte((byte) (isAchete ? 1 : 0));
   }

   @Override
   public int describeContents() {
      return 0;
   }

   public static final Creator<Article> CREATOR = new Creator<Article>() {
      @Override
      public Article createFromParcel(Parcel in) {
         return new Article(in);
      }

      @Override
      public Article[] newArray(int size) {
         return new Article[size];
      }
   };

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

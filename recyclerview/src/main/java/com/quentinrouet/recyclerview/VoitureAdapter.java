package com.quentinrouet.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.quentinrouet.recyclerview.bo.Voiture;
import com.quentinrouet.recyclerview.databinding.LayoutLineVoitureBinding;

import java.util.ArrayList;

/**
 * Created by quentin for AndroKado on 30/03/2022.
 */
public class VoitureAdapter extends RecyclerView.Adapter<VoitureViewHolder> {
   ArrayList<Voiture> dataVoitures;

   public VoitureAdapter(ArrayList<Voiture> dataVoitures) {
      this.dataVoitures = dataVoitures;
   }

   @NonNull
   @Override
   public VoitureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutLineVoitureBinding binding = DataBindingUtil.inflate(
              LayoutInflater.from(parent.getContext()),
              R.layout.layout_line_voiture,
              parent,
              false
      );
      return new VoitureViewHolder(binding);
   }

   @Override
   public void onBindViewHolder(@NonNull VoitureViewHolder holder, int position) {
      holder.binding.setV(dataVoitures.get(position));
   }

   @Override
   public int getItemCount() {
      return dataVoitures.size();
   }
}

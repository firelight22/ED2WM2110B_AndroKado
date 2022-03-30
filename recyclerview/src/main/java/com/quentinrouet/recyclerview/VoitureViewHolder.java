package com.quentinrouet.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.quentinrouet.recyclerview.databinding.LayoutLineVoitureBinding;

/**
 * Created by quentin for AndroKado on 30/03/2022.
 */

public class VoitureViewHolder extends RecyclerView.ViewHolder {
    LayoutLineVoitureBinding binding;
    public VoitureViewHolder(@NonNull LayoutLineVoitureBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}

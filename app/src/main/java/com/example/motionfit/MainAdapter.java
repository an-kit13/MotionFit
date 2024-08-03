package com.example.motionfit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel,MainAdapter.myViewhilder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewhilder holder, int position, @NonNull MainModel model) {
       holder.desc.setText(model.getDescription());
       holder.nofsets.setText(Long.toString(model.getNofsets()));
       holder.weight.setText(Long.toString(model.getWgtpset()));
    }

    @NonNull
    @Override
    public myViewhilder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);
        return new myViewhilder(view);
    }

    class myViewhilder extends RecyclerView.ViewHolder {


    TextView desc, nofsets, weight;

    public myViewhilder(@NonNull View itemView) {
        super(itemView);
        desc = (TextView) itemView.findViewById(R.id.desc);
        nofsets = (TextView) itemView.findViewById(R.id.nofset);
        weight = (TextView) itemView.findViewById(R.id.weight);

    }
 }
}

package com.example.piyushproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
      private List<RecyclerClass> userList;
      public Adapter (List<RecyclerClass>userList){this.userList=userList;}

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String comptext1 = userList.get(position).getComptext();
        String titletext1 = userList.get(position).getTitletext();
        String lastdatehint1 = userList.get(position).getLastdatehint();
        String branchhint1 = userList.get(position).getBranchhint();
        holder.setData(comptext1,titletext1,lastdatehint1,branchhint1);

    }

    @Override
    public int getItemCount() {
          return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView comp;
        private TextView comptext;
        private TextView title;
        private TextView titletext;
        private TextView lastdate;
        private TextView lastdatehint;
        private TextView branch;
        private TextView branchhint;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            comp = itemView.findViewById(R.id.comp);
            comptext = itemView.findViewById(R.id.comptext);
            title = itemView.findViewById(R.id.title);
            titletext = itemView.findViewById(R.id.titletext);
            lastdate = itemView.findViewById(R.id.lastdate);
            lastdatehint = itemView.findViewById(R.id.lastdatehint);
            branch = itemView.findViewById(R.id.branch);
            branchhint = itemView.findViewById(R.id.branchhint);

        }

        public void setData(String comptext1, String titletext1, String lastdatehint1, String branchhint1) {

          comptext.setText(comptext1);

          titletext.setText(titletext1);
          lastdatehint.setText(lastdatehint1);
          branchhint.setText(branchhint1);

        }
    }
}

package com.example.portfolio.sidemenu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolio.R;

import java.util.List;

public class MenuAdapter  extends RecyclerView.Adapter<MenuAdapter.MenuViewAdapter> {

  List<MenuItem> mData;
Callback listener;

    public MenuAdapter(List<MenuItem> mData,Callback listener) {
        this.mData = mData;
        this.listener = listener;
    }


    @NonNull
    @Override
    public MenuViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false);
        return new MenuViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewAdapter holder, int position) {

        holder.icon.setImageResource(mData.get(position).getIcon());
        if (mData.get(position).isSelected()) {
            holder.isSelected.setVisibility(View.VISIBLE);
        }
        else
            holder.isSelected.setVisibility(View.GONE);
    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MenuViewAdapter extends RecyclerView.ViewHolder{

        ImageView icon,isSelected;

        public MenuViewAdapter(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.item_menu_icon);
            isSelected = itemView.findViewById(R.id.item_menu_selected);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onSideMenuItemClick(getAdapterPosition());
                }
            });


        }
    }
}

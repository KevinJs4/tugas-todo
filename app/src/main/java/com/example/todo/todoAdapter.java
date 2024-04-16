package com.example.todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class todoAdapter extends RecyclerView.Adapter<todoAdapter.ViewHolder> {
    private List<todoItem> todoItems;

    public todoAdapter(List<todoItem> todoItems) {
        this.todoItems = todoItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        todoItem todoItem = todoItems.get(position);
        holder.tvWhat.setText(todoItem.getWhat());
        holder.tvTime.setText(todoItem.getTime());
    }

    @Override
    public int getItemCount() {
        return todoItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvWhat;
        TextView tvTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvWhat = itemView.findViewById(R.id.tvWhat);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }
}


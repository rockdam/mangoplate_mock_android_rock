package com.example.mangoplate.src.home.search_restaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mangoplate.R;
import com.example.mangoplate.src.home.search_restaurant.searchTab_layout.models.RestaurantRecyclerData;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantRecyclerAdapter extends RecyclerView.Adapter<RestaurantRecyclerAdapter.ItemViewHolder> {

    // adapter에 들어갈 list 입니다.
    private ArrayList<RestaurantRecyclerData> listData = new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // LayoutInflater를 이용하여 전 단계에서 만들었던 item.xml을 inflate 시킵니다.
        // return 인자는 ViewHolder 입니다.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_recyclerview_restaurantlist, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        // Item을 하나, 하나 보여주는(bind 되는) 함수입니다.
        holder.onBind(listData.get(position));
    }

    @Override
    public int getItemCount() {
        // RecyclerView의 총 개수 입니다.
        return listData.size();
    }

    public void addItem(RestaurantRecyclerData data) {
        // 외부에서 item을 추가시킬 함수입니다.
//        listData.add(data);
        listData.add(data);
    }

    // RecyclerView의 핵심인 ViewHolder 입니다.
    // 여기서 subView를 setting 해줍니다.
    class ItemViewHolder extends RecyclerView.ViewHolder {

//        private TextView textView1;
//        private TextView textView2;
//        private ImageView imageView;

        ItemViewHolder(View itemView) {
            super(itemView);

//            textView1 = itemView.findViewById(R.id.textView1);
//            textView2 = itemView.findViewById(R.id.textView2);
//            imageView = itemView.findViewById(R.id.imageView);
        }

        void onBind(RestaurantRecyclerData data) {
//            textView1.setText(data.getTitle());
//            textView2.setText(data.getContent());
//            imageView.setImageResource(data.getResId());
        }
    }
}
package com.example.gpcorser.bitsandpizzas;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ItemMaterialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView pizzaRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_pizza_material, container, false);

        String[] pizzaNames = new String[Item.pizzas.length];
        for (int i = 0; i < pizzaNames.length; i++) {
            pizzaNames[i] = Item.pizzas[i].getName();
        }

        int[] pizzaImages = new int[Item.pizzas.length];
        for (int i = 0; i < pizzaImages.length; i++) {
            pizzaImages[i] = Item.pizzas[i].getImageResourceId();
        }

        CaptionedImageAdapter adapter = new CaptionedImageAdapter(pizzaNames, pizzaImages);
        pizzaRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager (getActivity());
        pizzaRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImageAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), ItemDetailActivity.class);
                intent.putExtra(ItemDetailActivity.EXTRA_PIZZANO, position);
                getActivity().startActivity(intent);
            }

        });


        return pizzaRecycler;
    }


}

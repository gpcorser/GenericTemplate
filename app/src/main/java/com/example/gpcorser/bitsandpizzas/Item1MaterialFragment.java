package com.example.gpcorser.bitsandpizzas;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Item1MaterialFragment extends Fragment {

    public static final String[] items = {"Overview","Year 1","Year 2","Year 3","Year 4",};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView pizzaRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_iem1_material, container, false);

        String[] Categories = new String[items.length];
        for (int i = 0; i < Categories.length; i++) {
            Categories[i] = items[i];
        }

        //CaptionedImageAdapter adapter = new CaptionedImageAdapter(Categories, );
       // pizzaRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        pizzaRecycler.setLayoutManager(layoutManager);

       // adapter.setListener(new CaptionedImageAdapter.Listener() {
       //     public void onClick(int position) {
        //        Intent intent = new Intent(getActivity(), ItemDetailActivity.class);
        //        intent.putExtra(ItemDetailActivity.EXTRA_PIZZANO, position);
        //        getActivity().startActivity(intent);
        //    }

     //   });


        return pizzaRecycler;
    }


}

package com.example.gpcorser.bitsandpizzas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class Item1DetailActivity extends Activity {

    private ShareActionProvider shareActionProvider;
    public static final String EXTRA_PIZZANO = "pizzaNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_item1_detail);

        // enable UP button
        getActionBar().setDisplayHomeAsUpEnabled(true);

        // display details of the pizza
        int pizzaNo = (Integer)getIntent().getExtras().get(EXTRA_PIZZANO);
        String pizzaName = Item.pizzas[pizzaNo].getName();
        TextView textView = (TextView)findViewById(R.id.item_text);
        textView.setText(pizzaName);
       // int pizzaImage = Item.pizzas[pizzaNo].getImageResourceId();
       // ImageView imageView = (ImageView)findViewById(R.id.item_image);
       // imageView.setImageDrawable(getResources().getDrawable(pizzaImage));
       // imageView.setContentDescription(pizzaName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // share the name of the pizza
        TextView textView = (TextView)findViewById(R.id.item_text);
        CharSequence pizzaName = textView.getText();
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider)menuItem.getActionProvider();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, pizzaName);
        shareActionProvider.setShareIntent(intent);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                // start OrderActivity when user clicks on it in action bar
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

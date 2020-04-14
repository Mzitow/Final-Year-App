package com.example.appdevelopment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout main_menu_drawer;
    private LinearLayout menu_bar;
    private ImageView btn_menu;
    NavigationView mynavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mynavigation = findViewById(R.id.nav_view);
        btn_menu = findViewById(R.id.main_menu);
        menu_bar = findViewById(R.id.menu_bar);
        main_menu_drawer = findViewById(R.id.drawer_layout);



        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_menu_drawer.openDrawer(Gravity.LEFT);
            }
        });



        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this::onOptionsItemSelected);



    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.main_menu_items, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.notification_menu:
                Toast.makeText(this,"Notifications clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.my_dashboad_menu:
                Toast.makeText(this,"My Dashboard clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.all_lectures_menu:
                Toast.makeText(this,"All Lectures clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.all_sheikhs_menu:
                Toast.makeText(this,"All sheikhs clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings_menu:
                Toast.makeText(this,"Settings clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ask_fatwa_menu:
                Toast.makeText(this,"Ask fatwa clicked",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
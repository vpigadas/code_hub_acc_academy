package com.codehub.academy.shared_preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.room.Room;

import com.bumptech.glide.Glide;
import com.codehub.academy.R;

import java.util.List;

public class SharedPreferenceActivity extends AppCompatActivity {

    private SharedPreferences preferences;
    UserDatabase userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        setSupportActionBar(findViewById(R.id.toolbar));

        preferences = this.getSharedPreferences("codehub-sharedpreferens", MODE_PRIVATE);
        //preferences = this.getPreferences(MODE_PRIVATE);
        userDatabase = Room.databaseBuilder(this, UserDatabase.class, "codehub-db").build();

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        int counter = preferences.getInt("counter", 0);

        TextView textView = findViewById(R.id.text_counter);
        textView.setText(String.valueOf(counter));

        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("counter", ++counter);
        editor.apply();


        ImageView imageView = findViewById(R.id.image);

        Glide.with(this).load("https://www.archaiologia.gr/wp-content/uploads/2018/03/Picasso_femme_au_Beret.jpg").into(imageView);
//        Picasso.get().load("https://www.archaiologia.gr/wp-content/uploads/2018/03/Picasso_femme_au_Beret.jpg").into(imageView);

        userDatabase.getUserDao().getEntityAsync().observe(this, new Observer<List<UserEntity>>() {
            @Override
            public void onChanged(List<UserEntity> userEntities) {
                Log.d("Database", String.valueOf(userEntities));
            }
        });

        handleDatabase(counter);
    }

    private void handleDatabase(int counter) {

        UserEntity entity = new UserEntity(counter, "Vassilis", 100, "blablabla");
        new UserEntityAsyncTask(getApplicationContext(),userDatabase).execute(entity);
//        new UserGetEntityAsyncTask(getApplicationContext(), new UserEntityListener() {
//            @Override
//            public void onSuccessResult(List<UserEntity> array) {
//                Log.d("Database", String.valueOf(array));
//            }
//        }).execute();
        Log.d("Database", String.valueOf(entity));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.shared_preferences_menu, menu);
        // return true so that the menu pop up is opened
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_search) {
            Toast.makeText(this, "Search Button", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
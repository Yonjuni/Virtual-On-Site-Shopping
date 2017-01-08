package de.pinyto.virtualon_siteshopping;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_categories);

        Button button = (Button) findViewById(R.id.category_button);
        Button button2 = (Button) findViewById(R.id.category2_button);
        Button button3 = (Button) findViewById(R.id.category3_button);
        Button button4 = (Button) findViewById(R.id.category4_button);
        Button button5 = (Button) findViewById(R.id.category5_button);
        Button button6 = (Button) findViewById(R.id.category6_button);

        Button[] categories = new Button[]{button2, button3, button4, button5, button6};

        for (int i = 0; i < categories.length; i++) {
            categories[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getBaseContext(), "Not available in Protopype", Toast.LENGTH_SHORT).show();
                }
            });
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.fromFile(new File("storage/emulated/0/Download/prototype/virtualshelf.html"));
                Intent in = new Intent(Intent.ACTION_VIEW);
                in.setDataAndType(uri, "text/html");
                startActivity(in);
            }
        });

    }
}

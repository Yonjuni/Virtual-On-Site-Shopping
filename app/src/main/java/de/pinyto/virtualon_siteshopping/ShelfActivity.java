package de.pinyto.virtualon_siteshopping;

/**
 * Created by yonjuni on 08.01.17.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.io.File;

public class ShelfActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri uri = Uri.fromFile(new File("storage/emulated/0/Download/prototype/virtualshelf.html"));
        Intent in = new Intent(Intent.ACTION_VIEW);
        in.setDataAndType(uri, "text/html");
        startActivity(in);

    }
}

package au.edu.federation.itech3107.fedunimillionaire30393073;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class His extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_his);
    }
    public static Intent StartIntent(Context context){
        Intent intent = new Intent(context,His.class);
        return intent;
    }
}
package au.edu.federation.itech3107.fedunimillionaire30393073;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import au.edu.federation.itech3107.fedunimillionaire30393073.Json.GetText;

public class MainActivity extends AppCompatActivity {

    private Button bt_start,bt_ques,bt_his;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i("json",new GetText().readAssetsTxt(getApplicationContext(),"questions_easy"));
        bt_start = findViewById(R.id.game_start);
        bt_his = findViewById(R.id.history);
        bt_ques = findViewById(R.id.questions);
    }
    public void StartClick(View view){
        startActivity(start.StartIntent(MainActivity.this));
    }
    public void HisClick(View view){
        startActivity(His.StartIntent(MainActivity.this));
    }
    public void QuesClick(View view){

    }
}
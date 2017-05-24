package quizme.quizmee;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {

    private TextView mName;
    private TextView mName1;
    private TextView mName2;
    private TextView mName3;
    private TextView mName4;
    private String PlayerName;

    @Override
    public void onBackPressed() {


        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//wymusza pełny ekran w aktywnośći
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//wymusza pełny ekran w aktywnośći
        super.onCreate(savedInstanceState);//wymusza pełny ekran w aktywnośći
        setContentView(R.layout.activity_score);

        super.onResume();

        SharedPreferences myPreferences = PreferenceManager.getDefaultSharedPreferences(Score.this);
        String name1 = myPreferences.getString("Name1", "unknown");
        int pkt1 = myPreferences.getInt("Score1", 0);
        String name2 = myPreferences.getString("Name2", "unknown");
        int pkt2 = myPreferences.getInt("Score2", 0);
        String name3 = myPreferences.getString("Name3", "unknown");
        int pkt3 = myPreferences.getInt("Score3", 0);
        String name4 = myPreferences.getString("Name4", "unknown");
        int pkt4 = myPreferences.getInt("Score4", 0);
        String name5 = myPreferences.getString("Name5", "unknown");
        int pkt5 = myPreferences.getInt("Score5", 0);

        mName = (TextView)findViewById(R.id.Gold);
        mName1 = (TextView)findViewById(R.id.Silver);
        mName2 = (TextView)findViewById(R.id.Bronze);
        mName3 = (TextView)findViewById(R.id.Four);
        mName4 = (TextView)findViewById(R.id.Five);


        mName.setText(name1 + " - " + pkt1 + " pkt");
        mName1.setText(name2 + " - " + pkt2 + " pkt");
        mName2.setText(name3 + " - " + pkt3 + " pkt");
        mName3.setText(name4 + " - " + pkt4 + " pkt");
        mName4.setText(name5 + " - " + pkt5 + " pkt");




    }
    public void menu (View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}

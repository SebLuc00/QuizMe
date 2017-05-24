package quizme.quizmee;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Piotr on 01.04.2017.
 */

public  class Pop extends Activity {


    private TextView mScoreEndView;
    private EditText mNickname;


    @Override
    public void onBackPressed() {

        Toast.makeText(Pop.this, "Naciśnij ZATWIERDŹ aby kontynuuować.", Toast.LENGTH_SHORT).show();


    }



    @Override
    protected void onCreate(Bundle savedInstanceState){
        requestWindowFeature(Window.FEATURE_NO_TITLE);//wymusza pełny ekran w aktywnośći
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//wymusza pełny ekran w aktywnośći
        super.onCreate(savedInstanceState);//wymusza pełny ekran w aktywnośći
        setContentView(R.layout.popup);

        mNickname = (EditText) findViewById(R.id.nickname);
        int message = getIntent().getIntExtra("name", 0);

        mScoreEndView = (TextView)findViewById(R.id.endscore);
        mScoreEndView.setText("" + message );



        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.6));



    }
    public void ok (View view) {


        int message = getIntent().getIntExtra("name", 0);
        String str = mNickname.getText().toString();
        int BestScore = getIntent().getIntExtra("name", 0);

        Intent intent = new Intent(Pop.this, Score.class);
        intent.putExtra("pkt", message);
        intent.putExtra("pkgName", str);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);



        SharedPreferences myPreferences = PreferenceManager.getDefaultSharedPreferences(Pop.this);
        SharedPreferences.Editor myEditor = myPreferences.edit();
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
        if(BestScore<pkt1 && BestScore>=pkt2){
            myEditor.putString("Name2", str);
            myEditor.putInt("Score2", BestScore);
            myEditor.putString("Name3", name2);
            myEditor.putInt("Score3", pkt2);
            myEditor.putString("Name4", name3);
            myEditor.putInt("Score4", pkt3);
            myEditor.putString("Name5", name4);
            myEditor.putInt("Score5", pkt4);
            myEditor.commit();
        }
        else if(BestScore>=pkt1) {
            myEditor.putString("Name1", str);
            myEditor.putInt("Score1", BestScore);
            myEditor.putString("Name2", name1);
            myEditor.putInt("Score2", pkt1);
            myEditor.putString("Name3", name2);
            myEditor.putInt("Score3", pkt2);
            myEditor.putString("Name4", name3);
            myEditor.putInt("Score4", pkt3);
            myEditor.putString("Name5", name4);
            myEditor.putInt("Score5", pkt4);
            myEditor.commit();
        }
        else if(BestScore<pkt2 && BestScore>=pkt3) {
            myEditor.putString("Name3", str);
            myEditor.putInt("Score3", BestScore);
            myEditor.putString("Name4", name3);
            myEditor.putInt("Score4", pkt3);
            myEditor.putString("Name5", name4);
            myEditor.putInt("Score5", pkt4);
            myEditor.commit();
        }
        else if(BestScore<pkt3 && BestScore>=pkt4) {
            myEditor.putString("Name4", str);
            myEditor.putInt("Score4", BestScore);
            myEditor.putString("Name5", name4);
            myEditor.putInt("Score5", pkt4);
            myEditor.commit();
        }
        else if(BestScore<pkt4 && BestScore>=pkt5) {
            myEditor.putString("Name4", str);
            myEditor.putInt("Score4", BestScore);
            myEditor.commit();
        }

        startActivity(intent);
        finish();

    }



}

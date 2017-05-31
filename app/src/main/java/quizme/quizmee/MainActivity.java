package quizme.quizmee;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.io.File;


public class MainActivity extends AppCompatActivity {


    File plik = new File("Score.txt");

    @Override
    public void onBackPressed() {
        final Dialog  potwierdz_wyjscie = new Dialog(MainActivity.this);
        potwierdz_wyjscie.requestWindowFeature(Window.FEATURE_NO_TITLE);
        potwierdz_wyjscie.setContentView(R.layout.potwierdz_wyjscie);
        potwierdz_wyjscie.show();

        Button Tak= (Button)potwierdz_wyjscie.findViewById(R.id.potwierdz_wyjscie_tak);
        Tak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potwierdz_wyjscie.cancel();
                finish();
            }
        });


        Button Nie = (Button) potwierdz_wyjscie.findViewById(R.id.potwierdz_wyjscie_nie);
        Nie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potwierdz_wyjscie.cancel();
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);//wymusza pełny ekran w aktywnośći
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//wymusza pełny ekran w aktywnośći
        super.onCreate(savedInstanceState);//wymusza pełny ekran w aktywnośći

        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();




        return super.onOptionsItemSelected(item);
    }

    public void game(View view) {
        Intent intent = new Intent(this, Game.class);
        onPause();
        startActivity(intent);
    }

    public void score(View view) {
        Intent intent = new Intent(this, Score.class);
        onPause();
        startActivity(intent);
    }

    public void options(View view) {
        Intent intent = new Intent(this, Options.class);
        onPause();
        startActivity(intent);
    }

    public void conti(View view) {


        {
            final Dialog oProgramie = new Dialog(MainActivity.this);
            oProgramie.requestWindowFeature(Window.FEATURE_NO_TITLE);
            oProgramie.setContentView(R.layout.o_programie);
            oProgramie.show();

            Button Kontynuuj= (Button)oProgramie.findViewById(R.id.button_kontynuuj);
            Kontynuuj.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    oProgramie.cancel();

                }
            });


        }
    }

    public void exit(View view) {
        final Dialog potwierdz_wyjscie = new Dialog(MainActivity.this);
        potwierdz_wyjscie.requestWindowFeature(Window.FEATURE_NO_TITLE);
        potwierdz_wyjscie.setContentView(R.layout.potwierdz_wyjscie);
        potwierdz_wyjscie.show();

        Button Tak= (Button)potwierdz_wyjscie.findViewById(R.id.potwierdz_wyjscie_tak);
        Tak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potwierdz_wyjscie.cancel();
                finish();
                System.exit(0);


            }
        });


        Button Nie = (Button) potwierdz_wyjscie.findViewById(R.id.potwierdz_wyjscie_nie);
        Nie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potwierdz_wyjscie.cancel();
            }
        });
    }


}

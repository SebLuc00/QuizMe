package quizme.quizmee;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Options extends AppCompatActivity {

    MediaPlayer podklad;
    SeekBar sb;
    MediaPlayer mp;
    AudioManager am;
    private SeekBar volumeSeekBar;
    private AudioManager audioManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setVolumeControlStream(AudioManager.STREAM_MUSIC);


        requestWindowFeature(Window.FEATURE_NO_TITLE);//wymusza pełny ekran w aktywnośći
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //wymusza pełny ekran w aktywnośći
        super.onCreate(savedInstanceState);//wymusza pełny ekran w aktywnośći

        setContentView(R.layout.activity_options);



    }

    public void wibracjeON (View view){

        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(1000);


    }

    public void wibracjeOFF (View view){

        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(200);
        Toast.makeText(Options.this, "Wibracje wyłączone", Toast.LENGTH_SHORT).show();

    }




    public void menu (View view) {
        onBackPressed();
    }

    public void oProgramie(View view)

    {

    }


    //RESET WYNIKÓW
    public void Reset_wynikow(View view) {


        final Dialog  Reset_wynikow = new Dialog(Options.this);
        Reset_wynikow.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Reset_wynikow.setContentView(R.layout.potwierdz_reset);
        Reset_wynikow.show();

        Button Tak= (Button)Reset_wynikow.findViewById(R.id.potwierdz_reset_tak);
        Tak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences myPreferences = PreferenceManager.getDefaultSharedPreferences(Options.this);
                SharedPreferences.Editor myEditor = myPreferences.edit();
                myEditor.putString("Name1", "Gracz1");
                myEditor.putInt("Score1", 0);
                myEditor.putString("Name2", "Gracz2");
                myEditor.putInt("Score2", 0);
                myEditor.putString("Name3", "Gracz3");
                myEditor.putInt("Score3", 0);
                myEditor.putString("Name4", "Gracz4");
                myEditor.putInt("Score4", 0);
                myEditor.putString("Name5", "Gracz5");
                myEditor.putInt("Score5", 0);
                myEditor.commit();

                Toast.makeText(Options.this, "Zresetowano", Toast.LENGTH_SHORT).show();
                Reset_wynikow.cancel();

            }
        });

        Button Nie = (Button) Reset_wynikow.findViewById(R.id.potwierdz_reset_nie);
        Nie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset_wynikow.cancel();
            }
        });}



    //################# STEROWANIE MUZYKĄ ####################################

    public void MuzykaON(View view) {



        if (podklad == null) {

            podklad = MediaPlayer.create(this, R.raw.podklad);
            podklad.start();
            podklad.setLooping(true);
        }


    }


    public void MuzykaOFF(View view) {

        if (podklad==null){
            return ;
        }else {

            podklad.stop();
            podklad=null;

        }
    }

    //############################################################################


};
/*
public void oProgramie (View view) {
        AlertDialog.Builder oProgramie =new AlertDialog.Builder(this);
        oProgramie.setMessage("\t\t\t\t\t\tQUIZME\n■■■■■■■■■■■■■■■■■■■■■■■■■\n\nWersja: 1.0\nAutorzy:\n▪Piotr Skorupski\n▪Sebastian Łuczak\n▪Wojciech Domański\n\nQuizMe to pełna emocji aplikacja" +
        " w której osoba grająca bedzie mogła przetestować swoją wiedzę.\n");
        oProgramie.setPositiveButton("▪ KONTYNUUJ ▪", new DialogInterface.OnClickListener()
        {
@Override
public void onClick(DialogInterface dialog, int which) {
        dialog.cancel();
        }
        });
        oProgramie.create();
        oProgramie.show();
        }
*/
package android.myapp.app.backbutton;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean doubletap = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void Gonext(View view)
   {
       startActivity(new Intent(MainActivity.this,Main2Activity.class));
   }

//    public void onBackPressed(){
//
//        if(doubletap){
//            super.onBackPressed();
//        }
//        else {
//            doubletap = true;
//            Toast.makeText(getApplicationContext(), "Press again to exit from the app", Toast.LENGTH_SHORT).show();
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    finish();
//                }
//            }, 2000);
//
//
//        }
//    }

}

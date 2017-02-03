package bballesteros.com.testbutton;

import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class Android_Button extends AppCompatActivity {


    TextView textViewCurrentTime;
    Button buttonGetTime;
    DateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android__button);
        textViewCurrentTime = (TextView)findViewById(R.id.text_Time);
        buttonGetTime = (Button)findViewById(R.id.button_getTime);

        View.OnClickListener buttonListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                simpleDateFormat = new DateFormat();
                String time = (String) simpleDateFormat.format(
                        "HH:mm:ss",Calendar.getInstance().getTime());
                textViewCurrentTime.setText(time);
                System.out.println("Current Time: " + time);
            }
        };

        buttonGetTime.setOnClickListener(buttonListener);
    }
}

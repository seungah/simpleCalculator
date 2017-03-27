package test.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_first, edit_second;
    TextView text_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_first=(EditText)findViewById(R.id.edit_first);
        edit_second=(EditText)findViewById(R.id.edit_second);

        Button but_plus=(Button)findViewById(R.id.but_plus);
        Button but_minus=(Button)findViewById(R.id.but_minus);
        Button but_multiply=(Button)findViewById(R.id.but_multiply);
        Button but_division=(Button)findViewById(R.id.but_division);
        text_Result=(TextView)findViewById(R.id.text_result);

        but_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(edit_first.getText().toString());
                int num2=Integer.parseInt(edit_second.getText().toString());
                text_Result.setText(num1 + num2+""); //문자열이 아니기 때문에 실행하면 오류가 남.
            }
        });

    }
}

package appsanalyze.jquiz.com.appsanalyze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //New comment
        int x =3;
        x=x+2;
        int s;
        s=3;
        s=5;
        e1 = (EditText)findViewById(R.id.editText);
    }

    public void doSomeThing(View view) {
        Intent it = new Intent(this, Second.class);
        it.putExtra("key1",e1.getText().toString());
        startActivity(it);
    }
}

package com.example.konyateknikapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view) {
        EditText myPass = (EditText) findViewById(R.id.pass);
        EditText myUserName = (EditText) findViewById(R.id.userName);
        String[] s1 = {myPass.getText().toString(), myUserName.getText().toString()};
        String[] UserNames = {"171220070", "171220071", "171220072", "171220073", "171220074"};
        String[] Passwords = {"12345", "Password", "Password1", "Password2", "Password3"};

        for (int i = 0; i < UserNames.length; i++) {
            if (s1[0].equals(Passwords[i]) || s1[1].equals(UserNames[i])) {
                Toast.makeText(MainActivity.this, "Giriş Başarılı!", Toast.LENGTH_LONG).show();
                //İntent gelicek
                Intent in = new Intent(MainActivity.this,IntentActivity.class);
                startActivity(in);
                break;
            } else if(s1[0].equals("") || s1[1].equals("")){
                Toast.makeText(MainActivity.this,  "Kullanıcı adı ve Parola giriniz!", Toast.LENGTH_SHORT).show();
		break;
            }else{
		   Toast.makeText(MainActivity.this, "Yanlış Kullanıcı adı ve ya Parola!", Toast.LENGTH_SHORT).show();
		   break;
		}
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

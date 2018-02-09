package com.example.tahmid.wordmatchinggame;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VictoryPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory_page);
        GlobalElements.getInstance().levelUp();
        updateScore();
        updateLevel();
        if(GlobalElements.getInstance().getLevel()==21){
            Intent intent = new Intent(this,EndGame.class);
            startActivity(intent);
        }
    }
    public void goToKeys(View view){
        Intent intent = new Intent(this,KeysPage.class);
        startActivity(intent);
    }
    public void updateScore(){
        String update = "";
        update+=String.valueOf(GlobalElements.getInstance().getScore());
        update+="(+";
        update+=String.valueOf(GlobalElements.getInstance().getScoreDifference());
        update+=")";
        TextView view = (TextView) findViewById(R.id.scoreUpdate);
        view.setText(update);
    }
    public void updateLevel(){
        String level = String.valueOf(GlobalElements.getInstance().getLevel());
        TextView view = (TextView) findViewById(R.id.levelUpdate);
        view.setText(level);
    }
}

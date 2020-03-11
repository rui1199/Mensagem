package pt.ipg.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviaMensagem(View view) {
        Intent intent = new Intent(this, MostraMensagemActivity.class);

        String mensagem = "Ola Mundo";
        intent.putExtra("Mensagem", mensagem);
        //todo: enviar mensagem

        startActivity(intent);
    }
}

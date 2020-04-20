package br.com.marcelocezario.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = findViewById(R.id.edit_Value);
        this.mViewHolder.textDolar = findViewById(R.id.text_Dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_Euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_Calculate);

        this.mViewHolder.buttonCalculate.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_Calculate) {
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value)){
                // Mostra mensagem pro usuário
                Toast.makeText(this, R.string.informe_um_valor, Toast.LENGTH_LONG).show();
            } else {
                Double mReal = Double.valueOf(value);

                Double mDolar = mReal / 5.24;
                Double mEuro = mReal / 5.69;

                this.mViewHolder.textDolar.setText(String.format("%.2f", (mDolar)));
                this.mViewHolder.textEuro.setText(String.format("%.2f", (mEuro)));
            }
        }
    }

    public void clearValues() {
        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;
    }
}

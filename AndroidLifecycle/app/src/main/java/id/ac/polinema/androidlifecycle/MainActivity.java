package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple);
	}

	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "Memulai App", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, "App dihentikan", Toast.LENGTH_SHORT).show();
	}

	// TODO: tambahkan callback onStart() di sini


	// TODO: tambahkan callback onStop() di sini

	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart App", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "App ON Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "App Paused", Toast.LENGTH_SHORT).show();
	}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App Destroy", Toast.LENGTH_SHORT).show();
	}
}

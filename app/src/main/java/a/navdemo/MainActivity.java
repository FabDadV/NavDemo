package a.navdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        navController = Navigation.findNavController(this, R.id.nav_host);
    }

    public void onFragment1NextClick() {
        navController.navigate(R.id.fragment2);
    }

    public void onFragment1BackClick() {}

    public void onFragment2NextClick() {
        navController.navigate(R.id.fragment3);
    }

    public void onFragment2BackClick() {
        navController.popBackStack();
    }

    public void onFragment3NextClick() {}

    public void onFragment3BackClick() {
        navController.popBackStack();
    }

}
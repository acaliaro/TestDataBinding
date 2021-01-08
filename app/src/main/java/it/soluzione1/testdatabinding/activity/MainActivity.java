package it.soluzione1.testdatabinding.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import it.soluzione1.testdatabinding.R;
import it.soluzione1.testdatabinding.databinding.ActivityMainBinding;
import it.soluzione1.testdatabinding.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    MainViewModel _viewModel;
    Context _context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        _context = this;

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        _viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewModel(_viewModel);
        binding.setLifecycleOwner(this);

        _viewModel.getShowClassica().observe(this, aBoolean -> {
            if(aBoolean){
                startActivity(new Intent(_context, CounterClassicActivity.class));
            }
        });

        _viewModel.getShowViewModel().observe(this, aBoolean -> {
            if(aBoolean){
                startActivity(new Intent(_context, CounterViewModelActivity.class));
            }
        });
    }
}

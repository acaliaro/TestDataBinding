package it.soluzione1.testdatabinding.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import it.soluzione1.testdatabinding.R;
import it.soluzione1.testdatabinding.databinding.ActivityCounterViewModelBinding;
import it.soluzione1.testdatabinding.viewmodel.CounterViewModelViewModel;

public class CounterViewModelActivity extends AppCompatActivity {

    CounterViewModelViewModel _viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ActivityCounterViewModelBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_counter_view_model);
        _viewModel = new ViewModelProvider(this).get(CounterViewModelViewModel.class);
        binding.setViewModel(_viewModel);
        binding.setLifecycleOwner(this);
    }
}

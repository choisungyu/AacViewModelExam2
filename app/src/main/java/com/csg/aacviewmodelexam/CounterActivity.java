package com.csg.aacviewmodelexam;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.csg.aacviewmodelexam.databinding.ActivityCounterBinding;

public class CounterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityCounterBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_counter);
        binding.setLifecycleOwner(this);

        final CounterViewModel viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);

        binding.setViewModel(viewModel);




    }
}

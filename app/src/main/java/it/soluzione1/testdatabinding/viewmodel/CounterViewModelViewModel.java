package it.soluzione1.testdatabinding.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import lombok.Getter;

@Getter
public class CounterViewModelViewModel extends ViewModel {

    private MutableLiveData<Integer> incrementValue = new MutableLiveData<>();

    public CounterViewModelViewModel() {
        incrementValue.postValue(0);
    }

    public void onIncrementClicked() {
        if (incrementValue.getValue() != null) {
            incrementValue.postValue(incrementValue.getValue() + 1);
        }
    }
}

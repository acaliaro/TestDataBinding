package it.soluzione1.testdatabinding.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import lombok.Getter;

@Getter
public class MainViewModel extends ViewModel {

    private MutableLiveData<Boolean> showClassica = new MutableLiveData<>();
    private MutableLiveData<Boolean> showViewModel = new MutableLiveData<>();

    public void onClassicaClicked(){
        showClassica.postValue(true);
    }

    public void onViewModelClicked(){
        showViewModel.postValue(true);
    }
}

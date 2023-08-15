package salles.cardoso.davi.galeriapublica;

import android.app.Application;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainViewModel extends AndroidViewModel {

    int navigationOpSelected = R.id.gridViewOp;


    public MainViewModel(@NonNull Application application){
        super(application);
    }
    public int getNavigationOpSelected(){
        return navigationOpSelected;
    }
    public void setNavigationOpSelected(int navigationOpSelected){
        this.navigationOpSelected = navigationOpSelected;
    }

}

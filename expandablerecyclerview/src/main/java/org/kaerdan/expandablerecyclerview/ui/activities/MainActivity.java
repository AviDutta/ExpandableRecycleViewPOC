package org.kaerdan.expandablerecyclerview.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.kaerdan.expandablerecyclerview.R;
import org.kaerdan.expandablerecyclerview.model.CountryModel;
import org.kaerdan.expandablerecyclerview.ui.adapters.CityAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mainList = (RecyclerView) findViewById(R.id.main_list);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainList.setLayoutManager(mLayoutManager);
        mainList.setAdapter(new CityAdapter(getCountryList()));

    }

    private static List<CountryModel> getCountryList() {
        List<CountryModel> countries = new ArrayList<>();
        List<String> usaCities = Arrays.asList("New York", "Los Angeles", "Boston");
        List<String> subCities=Arrays.asList("A", "B", "C");;
        countries.add(new CountryModel("USA",usaCities, subCities));


        List<String> frenchCities = Arrays.asList("Paris", "Nantes", "Lyon", "Toulouse");
        countries.add(new CountryModel("France", frenchCities, subCities));


        List<String> germanCities = Arrays.asList("Berlin", "Hamburg", "Frankfurt", "Munich",
                "Brunswick");
        countries.add(new CountryModel("Germany ", germanCities, subCities));

        return countries;
    }
}

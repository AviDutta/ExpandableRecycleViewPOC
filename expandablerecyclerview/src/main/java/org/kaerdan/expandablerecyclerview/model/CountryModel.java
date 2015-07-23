package org.kaerdan.expandablerecyclerview.model;

import org.kaerdan.expandablerecyclerview.util.ExpandableRecyclerAdapter;

import java.util.List;

/**
 *
 */
public class CountryModel implements ExpandableRecyclerAdapter.DataSet<String, String,String> {

    private final String name;
    private final List<String> cities;
    private final List<String> subCities;

    public CountryModel(String name, List<String> cities, List<String> subCities) {
        this.name = name;
        this.cities = cities;
        this.subCities = subCities;
    }

    @Override
    public String getData() {
        return name;
    }

    @Override
    public List<String> getChildren() {
        return cities;
    }

    @Override
    public List<String> getSubChildren() {
        return subCities;
    }
}

package org.kaerdan.expandablerecyclerview.ui.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.kaerdan.expandablerecyclerview.R;
import org.kaerdan.expandablerecyclerview.model.CountryModel;
import org.kaerdan.expandablerecyclerview.ui.view_holders.CityViewHolder;
import org.kaerdan.expandablerecyclerview.ui.view_holders.CountryViewHolder;
import org.kaerdan.expandablerecyclerview.util.ExpandableRecyclerAdapter;
import org.kaerdan.expandablerecyclerview.util.ViewHolderWithSetter;

import java.util.List;

/**
 *
 */
public class CityAdapter extends ExpandableRecyclerAdapter<CountryModel> {

    public CityAdapter(List<CountryModel> data) {
        super(data);
    }

    @Override
    public ViewHolderWithSetter getThirdLevelViewHolder(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        return new CityViewHolder(inflater.inflate(R.layout.list_item_city, parent, false));
    }

    @Override
    public ViewHolderWithSetter getSecondLevelViewHolder(ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        return new CityViewHolder(inflater.inflate(R.layout.list_item_city, parent, false));
    }

    @Override
    public ViewHolderWithSetter getTopLevelViewHolder(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        return new CountryViewHolder(inflater.inflate(R.layout.list_item_country, parent, false));
    }
}

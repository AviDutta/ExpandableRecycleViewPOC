package org.kaerdan.expandablerecyclerview.ui.view_holders;

import android.view.View;
import android.widget.TextView;

import org.kaerdan.expandablerecyclerview.R;
import org.kaerdan.expandablerecyclerview.util.ViewHolderWithSetter;

/**
 *
 */
public class CountryViewHolder extends ViewHolderWithSetter<String> {

    TextView countryText;

    public CountryViewHolder(View itemView) {
        super(itemView);
        countryText = (TextView) itemView.findViewById(R.id.country_text);
    }

    @Override
    public void setItem(String item) {
        countryText.setText(item);

    }
}

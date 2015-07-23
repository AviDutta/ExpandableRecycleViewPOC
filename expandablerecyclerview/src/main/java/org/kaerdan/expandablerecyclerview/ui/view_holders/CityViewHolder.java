package org.kaerdan.expandablerecyclerview.ui.view_holders;

import android.view.View;
import android.widget.TextView;

import org.kaerdan.expandablerecyclerview.R;
import org.kaerdan.expandablerecyclerview.util.ViewHolderWithSetter;

/**
 *
 */
public class CityViewHolder extends ViewHolderWithSetter<String> {

    TextView cityText;

    public CityViewHolder(View itemView) {
        super(itemView);
        cityText = (TextView) itemView.findViewById(R.id.city_text);

    }

    @Override
    public void setItem(String item) {
        cityText.setText(item);
        // ((TextView) itemView).setText(item);

    }
}

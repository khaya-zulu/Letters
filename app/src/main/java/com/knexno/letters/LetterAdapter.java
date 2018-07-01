package com.knexno.letters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LetterAdapter extends ArrayAdapter<Letter> {


    public LetterAdapter(@NonNull Context context, ArrayList<Letter> letters) {
        super(context, R.layout.list_item, letters);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        if (convertView == null){
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        Letter letter = getItem(position);

        TextView textFrom = (TextView) convertView.findViewById(R.id.text_from);
        TextView textText = (TextView) convertView.findViewById(R.id.text_text);

        textFrom.setText(letter.getFrom());
        textText.setText(letter.getText());

        return convertView;
    }
}

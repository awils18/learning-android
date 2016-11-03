package com.example.alexwilson.smellslikebakin;

/**
 * Created by alexwilson on 11/3/16.
 */

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}

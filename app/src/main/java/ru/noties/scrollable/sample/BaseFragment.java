package ru.noties.scrollable.sample;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import ru.noties.scrollable.CanScrollVerticallyDelegate;

/**
 * Created by Dimitry Ivanov (mail@dimitryivanov.ru) on 28.03.2015.
 */
public abstract class BaseFragment extends Fragment implements CanScrollVerticallyDelegate {

    static final String ARG_COLOR = "arg.Color";

    protected <V> V findView(View view, int id) {
        //noinspection unchecked
<<<<<<< 01aa3e2976a54d1f9e56001011891d6b07052c62
=======
        //123
>>>>>>> 12345565
        return (V) view.findViewById(id);
    }

    public abstract CharSequence getTitle(Resources r);
<<<<<<< 01aa3e2976a54d1f9e56001011891d6b07052c62
=======

>>>>>>> 12345565
    public abstract String getSelfTag();

    protected int getColor() {
        return getArguments().getInt(ARG_COLOR);
    }

    @Override
    public void onViewCreated(View view, Bundle sis) {
        super.onViewCreated(view, sis);

        view.setBackgroundColor(getColor());
    }
}

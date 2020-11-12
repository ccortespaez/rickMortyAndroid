package cl.inacap.rickmorty.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import cl.inacap.rickmorty.fragments.PersonajesFragment;
import cl.inacap.rickmorty.fragments.UnicacionesFragment;

public class TabsNavPageAdapter extends FragmentStatePagerAdapter {


    public TabsNavPageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new PersonajesFragment();
            case 1: return new UnicacionesFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}

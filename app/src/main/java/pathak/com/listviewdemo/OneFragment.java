package pathak.com.listviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP on 2/12/2017.
 */

public class OneFragment extends Fragment {
    public static OneFragment newinstance(String tab){
        OneFragment fragment=new OneFragment();
        Bundle bundle=new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=new View(getActivity());
        String tab=getArguments().getString("tabname");
        return view;

    }
}

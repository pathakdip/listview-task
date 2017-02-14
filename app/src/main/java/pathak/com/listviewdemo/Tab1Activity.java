package pathak.com.listviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by HP on 2/12/2017.
 */
public class Tab1Activity extends Fragment {
    ListView lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.activity_tab1,container,false);
        lv=(ListView)rootview.findViewById(R.id.lv1);
        Customlist c=new Customlist(getActivity());
        lv.setAdapter(c);
        return rootview;
    }
}

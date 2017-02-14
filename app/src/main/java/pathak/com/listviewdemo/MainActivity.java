package pathak.com.listviewdemo;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TableLayout tabLayout;
    private ViewPager viewPager;
    private String[] tabsadmin = {"Case", "Officer"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewpageradmin);
        viewPager.setAdapter(new pageadapter(getSupportFragmentManager(), tabsadmin));
        tabLayout = (TableLayout) findViewById(R.id.tablayoutadmin);
       // tabLayout.setupWithViewPager(viewPager);
    }

    class pageadapter extends FragmentPagerAdapter {
        public final String[] tabsadmin;

        public pageadapter(FragmentManager fm, String[] tab) {
            super(fm);
            this.tabsadmin = tab;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new Fragment();
            if (tabsadmin[position].equalsIgnoreCase("Case")) {
                return new Tab1Activity();
            } else if (tabsadmin[position].equalsIgnoreCase("Officer")) {
                return new Tab2Activity();
            }
            return fragment;

        }

        @Override
        public int getCount() {
            return tabsadmin.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabsadmin[position];
        }
    }

}

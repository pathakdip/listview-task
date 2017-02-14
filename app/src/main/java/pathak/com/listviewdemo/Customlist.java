package pathak.com.listviewdemo;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by HP on 2/12/2017.
 */
public class Customlist extends BaseAdapter {
    String[] tv1={"dsgsd","dsv","sdvs"};
    String[] tv2={"2dsgsd","2dsv","2sdvs"};
    private Context context;

    private static LayoutInflater inflater=null;
    View listViewItem;

    public Customlist(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return tv1.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder{

        TextView textViewName;
        TextView textViewnum;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder holder=new ViewHolder();
        listViewItem = inflater.inflate(R.layout.listitem, null);
        holder.textViewName = (TextView) listViewItem.findViewById(R.id.tv1);
        holder.textViewnum = (TextView) listViewItem.findViewById(R.id.tv2);
        holder.textViewName.setText(tv1[position]);
        holder.textViewnum.setText(tv2[position]);
        return listViewItem;
    }
}

package helpinghand.menwomenwear;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rasil10 on 2017-11-20.
 */

public class DressAdapter extends BaseAdapter {
    Context context;
    ArrayList<DressInfo> dressInfos;

    public DressAdapter(Context context, ArrayList<DressInfo> dressInfos) {
        context = context;
        this.dressInfos = dressInfos;
    }

    @Override
    public int getCount() {
        return dressInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return dressInfos.get(i).getTitle();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        DressInfo currentDressInfo = dressInfos.get(i);

        if (view == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.grid_view_item, null);
        }

        final ImageView imageView = (ImageView) view.findViewById(R.id.dressImageView);
        final TextView textView = (TextView) view.findViewById(R.id.dressNameTextView);


        imageView.setImageResource(currentDressInfo.getImage_url());
        textView.setText(currentDressInfo.getTitle());

        return view;
    }
}

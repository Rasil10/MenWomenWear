package helpinghand.menwomenwear;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DressInfosFragment extends Fragment {

    GridView gridView;
    DressAdapter adapter;


    public DressInfosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView= inflater.inflate(R.layout.fragment_dress_infos, container, false);

        ArrayList<DressInfo> obj=new ArrayList<>();
        obj= (ArrayList<DressInfo>) getArguments().getSerializable("dresses");

        Log.d("lskjdnflas--",obj.get(5).getTitle());

        gridView=(GridView)rootView.findViewById(R.id.gridView);
        adapter=new DressAdapter(getActivity(),obj);
        gridView.setAdapter(adapter);

        return rootView;
    }

}

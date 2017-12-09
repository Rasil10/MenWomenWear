package helpinghand.menwomenwear;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class MainFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button menButton = (Button) rootView.findViewById(R.id.menButton);
        Button womenButton = (Button) rootView.findViewById(R.id.womenmenButton);

        menButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<DressInfo> dressData=new ArrayList<>();
                dressData=getMenDresses();
                FragmentManager fm = getFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putSerializable("dresses",dressData);
                DressInfosFragment dressInfosFragment=new DressInfosFragment();
                dressInfosFragment.setArguments(bundle);
                fm.beginTransaction().replace(R.id.mainFrame, dressInfosFragment).commit();
            }
        });

        womenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<DressInfo> dressData=new ArrayList<>();
                dressData=getWomenDresses();
                FragmentManager fm = getFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putSerializable("dresses",dressData);
                DressInfosFragment dressInfosFragment=new DressInfosFragment();
                dressInfosFragment.setArguments(bundle);
                fm.beginTransaction().replace(R.id.mainFrame, dressInfosFragment).commit();
            }
        });

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    public ArrayList<DressInfo> getWomenDresses() {
        ArrayList<DressInfo> dressInfos = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            dressInfos.add(new DressInfo("Women Dress" + i, String.valueOf(i), R.drawable.shopping_bag));

        }
        return dressInfos;
    }

    public ArrayList<DressInfo> getMenDresses() {
        ArrayList<DressInfo> dressInfos = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            dressInfos.add(new DressInfo("Men Dress" + i, String.valueOf(i * i), R.drawable.shopping_bag));

        }
        return dressInfos;
    }


}

package Fragments.SMFrags;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.badgr.R;
import com.badgr.data.LoginRepository;
import com.badgr.scoutClasses.scoutMaster;
import com.badgr.scoutClasses.scoutPerson;

public class SMMyScoutsFragment extends Fragment {


    private final scoutMaster u = (scoutMaster) LoginRepository.getUser();
    private final String[] sNames = new String[u.getTroop().size()];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.scoutmaster_fragment_my_scouts, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView scoutsList = view.findViewById(R.id.scoutsList);

        setsNames();

        SMMyScoutsListAdapter adapter = new SMMyScoutsListAdapter(getActivity(), u, sNames);
        scoutsList.setAdapter(adapter);




    }


    private void setsNames()
    {
        int c = 0;
        for (scoutPerson p : u.getTroop())
        {
            String name = p.getFName() + " " + p.getLName();
            sNames[c] = name;
            c++;
        }
    }


}

package com.example.nhdangdh.viewpagerdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.nhdangdh.viewpagerdemo.R;

import java.util.ArrayList;

/**
 * Created by nhdangdh on 7/19/2017.
 */

public class AndroidFragment extends Fragment {

    Button btnAdd;
    EditText edtAdd;
    ListView lv;

    ArrayAdapter<String> adapter;
    ArrayList<String> arrData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_android, container, false);
        lv = (ListView) rootView.findViewById(R.id.lv);
        arrData = new ArrayList<String>();
        arrData.add("Android");
        arrData.add("IOS");
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, arrData);
        lv.setAdapter(adapter);

        edtAdd = (EditText) rootView.findViewById(R.id.edtAdd);
        btnAdd = (Button) rootView.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrData.add(edtAdd.getText()+"");
                adapter.notifyDataSetChanged();
            }
        });

        return rootView;
    }
}

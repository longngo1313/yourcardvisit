package com.example.vanthanh.yourcardvisit.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.vanthanh.yourcardvisit.R;
import com.example.vanthanh.yourcardvisit.controls.FirebaseData;
import com.example.vanthanh.yourcardvisit.customcard.Custom_InfoCard;
import com.example.vanthanh.yourcardvisit.model.Full_Info_Card;
import com.example.vanthanh.yourcardvisit.staticvalues.StaticValues;
import com.firebase.client.Firebase;

import java.util.ArrayList;

/**
 * Created by Van Thanh on 7/12/2016.
 */
public class Fragment_Mycard extends Fragment {
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_mycard,null);
        Firebase.setAndroidContext(getActivity());
        ArrayList<Full_Info_Card> list=new ArrayList<>();
        Custom_InfoCard custom_infoCard=new Custom_InfoCard(getActivity(),android.R.layout.simple_list_item_1,list);
        GridView gridView=(GridView)v.findViewById(R.id.gridView2);
        gridView.setAdapter(custom_infoCard);
        FirebaseData.get_Card_From_Firebase(StaticValues.idfacebook,list,custom_infoCard,gridView);
        return v;
    }
}

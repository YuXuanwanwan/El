package com.example.enlargeactivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

public class Fragment_ControlTable extends Fragment {
    private Button btnpop;
    private PopupWindow popmap;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.control_table,container,false);
        btnpop=(Button)view.findViewById(R.id.btn_map);
        btnpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View viewmap=getLayoutInflater().inflate(R.layout.popupwindow_map,null);
                popmap=new PopupWindow(viewmap,btnpop.getWidth(),ViewGroup.LayoutParams.WRAP_CONTENT);
                popmap.showAsDropDown(view,50,50);
            }
        });
        return view;
        
    }
}

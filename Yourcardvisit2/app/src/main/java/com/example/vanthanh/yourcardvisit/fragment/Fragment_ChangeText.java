package com.example.vanthanh.yourcardvisit.fragment;


import android.app.AlertDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.vanthanh.yourcardvisit.R;
import com.example.vanthanh.yourcardvisit.customcard.customAdaptor;
import com.example.vanthanh.yourcardvisit.model.textDisplay;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ChangeText extends Fragment {
    TextView colorunderA;
    TextView txt_test;
    Button changeColor;
    String arr[]={"14","8","10","12","14","16","18","20","22","24","26","28","30","32","34"};
    ArrayList<textDisplay> arrayList=new ArrayList<>();



    public Fragment_ChangeText() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v=inflater.inflate(R.layout.fragment_change_text,null);

        Spinner spn_textfont=(Spinner)v.findViewById(R.id.textfont_spinner);
        Spinner spn=(Spinner)v.findViewById(R.id.textsize_spinner);
        colorunderA=(TextView)v.findViewById(R.id.color_underA);
        txt_test=(TextView)v.findViewById(R.id.text_modify);
        changeColor=(Button)v.findViewById(R.id.button_changeColor);

        arrayList.add(new textDisplay("atmostsphere"));
        arrayList.add(new textDisplay("bunga belati putih"));
        arrayList.add(new textDisplay("CROCHET PATTERN"));
        arrayList.add(new textDisplay("croissant sandwich"));
        arrayList.add(new textDisplay("DroidSerif-Bold"));
        arrayList.add(new textDisplay("DroidSerif-Boldltalic"));
        arrayList.add(new textDisplay("DroidSerif-ltalic"));
        arrayList.add(new textDisplay("DroidSerif-Regular"));
        arrayList.add(new textDisplay("FallingSky"));
        arrayList.add(new textDisplay("FallingSkyBd"));

        customAdaptor adaptor2=new customAdaptor(getActivity(),arrayList);
        adaptor2.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spn_textfont.setAdapter(adaptor2);

        spn_textfont.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arr);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    txt_test.setTextSize(14);
                }
                else
                    txt_test.setTextSize((position+3)*2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
                builder.setTitle("change color");

                View v2=inflater.inflate(R.layout.alertcolor_layout, null);
                builder.setView(v2);
                final AlertDialog a=builder.create();
                Button btn_black=(Button)v2.findViewById(R.id.color_automatic);

                Button btn_color1=(Button)v2.findViewById(R.id.color_btn1);
                btn_color1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn1));
                        txt_test.setTextColor(getResources().getColor(R.color.btn1));
                        a.cancel();
                    }
                });
                Button btn_color11=(Button)v2.findViewById(R.id.color_btn11);
                btn_color11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn11));
                        txt_test.setTextColor(getResources().getColor(R.color.btn11));
                        a.cancel();
                    }
                });
                Button btn_color12=(Button)v2.findViewById(R.id.color_btn12);
                btn_color12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn12));
                        txt_test.setTextColor(getResources().getColor(R.color.btn12));
                        a.cancel();
                    }
                });
                Button btn_color13=(Button)v2.findViewById(R.id.color_btn13);
                btn_color13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn13));
                        txt_test.setTextColor(getResources().getColor(R.color.btn13));
                        a.cancel();
                    }
                });
                Button btn_color14=(Button)v2.findViewById(R.id.color_btn14);
                btn_color14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn14));
                        txt_test.setTextColor(getResources().getColor(R.color.btn14));
                        a.cancel();
                    }
                });
                Button btn_color15=(Button)v2.findViewById(R.id.color_btn15);
                btn_color15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn15));
                        txt_test.setTextColor(getResources().getColor(R.color.btn15));
                        a.cancel();
                    }
                });

                Button btn_color2=(Button)v2.findViewById(R.id.color_btn2);
                btn_color2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn2));
                        txt_test.setTextColor(getResources().getColor(R.color.btn2));
                        a.cancel();
                    }
                });
                Button btn_color21=(Button)v2.findViewById(R.id.color_btn21);
                btn_color21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn21));
                        txt_test.setTextColor(getResources().getColor(R.color.btn21));
                        a.cancel();
                    }
                });
                Button btn_color22=(Button)v2.findViewById(R.id.color_btn22);
                btn_color22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn22));
                        txt_test.setTextColor(getResources().getColor(R.color.btn22));
                        a.cancel();
                    }
                });
                Button btn_color23=(Button)v2.findViewById(R.id.color_btn23);
                btn_color23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn23));
                        txt_test.setTextColor(getResources().getColor(R.color.btn23));
                        a.cancel();
                    }
                });
                Button btn_color24=(Button)v2.findViewById(R.id.color_btn24);
                btn_color24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn24));
                        txt_test.setTextColor(getResources().getColor(R.color.btn24));
                        a.cancel();
                    }
                });
                Button btn_color25=(Button)v2.findViewById(R.id.color_btn25);
                btn_color25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn25));
                        txt_test.setTextColor(getResources().getColor(R.color.btn25));
                        a.cancel();
                    }
                });

                Button btn_color3=(Button)v2.findViewById(R.id.color_btn3);
                btn_color3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn3));
                        txt_test.setTextColor(getResources().getColor(R.color.btn3));
                        a.cancel();
                    }
                });
                Button btn_color31=(Button)v2.findViewById(R.id.color_btn31);
                btn_color31.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn31));
                        txt_test.setTextColor(getResources().getColor(R.color.btn31));
                        a.cancel();
                    }
                });
                Button btn_color32=(Button)v2.findViewById(R.id.color_btn32);
                btn_color32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn32));
                        txt_test.setTextColor(getResources().getColor(R.color.btn32));
                        a.cancel();
                    }
                });
                Button btn_color33=(Button)v2.findViewById(R.id.color_btn33);
                btn_color33.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn33));
                        txt_test.setTextColor(getResources().getColor(R.color.btn33));
                        a.cancel();
                    }
                });
                Button btn_color34=(Button)v2.findViewById(R.id.color_btn34);
                btn_color34.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn34));
                        txt_test.setTextColor(getResources().getColor(R.color.btn34));
                        a.cancel();
                    }
                });
                Button btn_color35=(Button)v2.findViewById(R.id.color_btn35);
                btn_color35.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn35));
                        txt_test.setTextColor(getResources().getColor(R.color.btn35));
                        a.cancel();
                    }
                });

                Button btn_color4=(Button)v2.findViewById(R.id.color_btn4);
                btn_color4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn4));
                        txt_test.setTextColor(getResources().getColor(R.color.btn4));
                        a.cancel();
                    }
                });
                Button btn_color41=(Button)v2.findViewById(R.id.color_btn41);
                btn_color41.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn41));
                        txt_test.setTextColor(getResources().getColor(R.color.btn41));
                        a.cancel();
                    }
                });
                Button btn_color42=(Button)v2.findViewById(R.id.color_btn42);
                btn_color42.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn42));
                        txt_test.setTextColor(getResources().getColor(R.color.btn42));
                        a.cancel();
                    }
                });
                Button btn_color43=(Button)v2.findViewById(R.id.color_btn43);
                btn_color43.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn43));
                        txt_test.setTextColor(getResources().getColor(R.color.btn43));
                        a.cancel();
                    }
                });
                Button btn_color44=(Button)v2.findViewById(R.id.color_btn44);
                btn_color44.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn44));
                        txt_test.setTextColor(getResources().getColor(R.color.btn44));
                        a.cancel();
                    }
                });
                Button btn_color45=(Button)v2.findViewById(R.id.color_btn45);
                btn_color45.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn45));
                        txt_test.setTextColor(getResources().getColor(R.color.btn45));
                        a.cancel();
                    }
                });

                Button btn_color5=(Button)v2.findViewById(R.id.color_btn5);
                btn_color5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn5));
                        txt_test.setTextColor(getResources().getColor(R.color.btn5));
                        a.cancel();
                    }
                });
                Button btn_color51=(Button)v2.findViewById(R.id.color_btn51);
                btn_color51.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn51));
                        txt_test.setTextColor(getResources().getColor(R.color.btn51));
                        a.cancel();
                    }
                });
                Button btn_color52=(Button)v2.findViewById(R.id.color_btn52);
                btn_color52.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn52));
                        txt_test.setTextColor(getResources().getColor(R.color.btn52));
                        a.cancel();
                    }
                });
                Button btn_color53=(Button)v2.findViewById(R.id.color_btn53);
                btn_color53.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn53));
                        txt_test.setTextColor(getResources().getColor(R.color.btn53));
                        a.cancel();
                    }
                });
                Button btn_color54=(Button)v2.findViewById(R.id.color_btn54);
                btn_color54.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn54));
                        txt_test.setTextColor(getResources().getColor(R.color.btn54));
                        a.cancel();
                    }
                });
                Button btn_color55=(Button)v2.findViewById(R.id.color_btn55);
                btn_color55.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.btn55));
                        txt_test.setTextColor(getResources().getColor(R.color.btn55));
                        a.cancel();
                    }
                });



                btn_black.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        colorunderA.setBackgroundColor(getResources().getColor(R.color.automatic));
                        txt_test.setTextColor(getResources().getColor(R.color.automatic));
                        a.cancel();
                    }
                });

                a.show();

            }
        });
        return v;
    }

}

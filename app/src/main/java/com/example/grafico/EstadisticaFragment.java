package com.example.grafico;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EstadisticaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EstadisticaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EstadisticaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EstadisticaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EstadisticaFragment newInstance(String param1, String param2) {
        EstadisticaFragment fragment = new EstadisticaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_estadistica, container, false);
    }
    public class MiPropiaVista extends View {
        public MiPropiaVista(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            Paint miPincel=new Paint();
            Paint miPincel2=new Paint();
            miPincel.setColor(Color.BLUE);
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.FILL);
            miPincel2.setColor(Color.RED);
            miPincel2.setStrokeWidth(300);
            miPincel2.setElegantTextHeight(true);
            miPincel2.setStyle(Paint.Style.FILL);
            canvas.drawText("Progreso",350,600,miPincel2);
            canvas.drawLine(100,300,200,400,miPincel);
            canvas.drawLine(200,400,300,100,miPincel);
            canvas.drawLine(300,100,400,200,miPincel);
            canvas.drawLine(400,200,500,0,miPincel);
            canvas.drawLine(500,0,600,200,miPincel);
            canvas.drawLine(600,200,700,300,miPincel);

            /*Path miTrazo=new Path();
            miTrazo.addPath(new Path(), 1,3);
            Paint miPincel=new Paint();
            miPincel.setColor(Color.RED);
            miPincel.setStrokeWidth(8);
            miPincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(miTrazo,miPincel);*/
        }
    }
}
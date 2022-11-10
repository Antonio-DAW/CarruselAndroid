package com.example.carruselimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider =findViewById(R.id.imageSlider);

        //Lista de imagenes
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2022/11/08/21/15/cliffs-7579330_960_720.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2022/10/23/22/45/highway-7542272_960_720.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2022/11/05/17/38/spider-web-7572415_960_720.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2022/11/06/13/36/architecture-7574031_960_720.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2022/11/05/09/47/sea-7571473_960_720.jpg", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels,ScaleTypes.FIT);


    }
}
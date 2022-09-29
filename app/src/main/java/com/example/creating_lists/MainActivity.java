package com.example.creating_lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Car> products = new ArrayList<Car>();
        if(products.size()== 0){
            products.add(new Car("Lamborghini Aventador", "Lamborghini Aventador — суперкар, выпускавшийся компанией Lamborghini с 2011 по 2021 год[1]. Aventador пришёл на смену Lamborghini Murciélago и оснащался 6,5-литровым V-образным 12-цилиндровым двигателем мощностью от 700 до 780 л. с. в зависимости от модификации. Дизайн был разработан Фелиппо Перини.", 4, R.drawable.lamb));
            products.add(new Car("Bugatti Chiron", "Bugatti Chiron — гиперкар компании Bugatti (входит в концерн Volkswagen AG), официально представлен публике в 2016 году. Модель получила название в честь автогонщика Луи-Александра Широна, который выступал за марку с 1928 по 1958 год[7].", 12, R.drawable.bugch));
            products.add(new Car("Ford Mustang", "Ford Mustang — культовый автомобиль класса Pony Car производства Ford Motor Company. На автомобиле размещается не эмблема Ford, а специальная эмблема Mustang.", 22, R.drawable.ford));
            products.add(new Car("Nissan Skyline", "Nissan Skyline — автомобиль, выпускаемый в Японии с 1957 года, сначала фирмой Prince Motor Company[en]*, а затем концерном Nissan Motor, купившим Prince в 1966 году. К настоящему времени выпущено 13 поколений этого автомобиля.", 6, R.drawable.nissan));
            products.add(new Car("BMW X6", "BMW X6 — среднеразмерный кроссовер, выпускаемый компанией BMW. Он сочетает в себе как признаки внедорожника (полный привод, большой дорожный просвет, большие колёса, тяговитый двигатель), так и признаки купе (сильный скос крыши в задней части автомобиля).",11, R.drawable.bmw));
        }
        ListView productList = findViewById(R.id.productList);
        CartAdapter adapter = new CartAdapter(this, R.layout.list_item, products);
        productList.setAdapter(adapter);
    }
}
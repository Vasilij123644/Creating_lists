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
            products.add(new Car("Lamborghini Diablo", "Суперкар, выпускавшийся итальянской компанией Lamborghini в период с 1990 года по 2001 год. Официальная презентация автомобиля состоялась 21 января 1990 года в городе Монте-Карло. Название Diablo, означающее Дьявол в переводе с испанского языка, принадлежало свирепому быку герцога Верагуа.", 4, R.drawable.car1));
            products.add(new Car("Bugatti Chiron", "Гиперкар компании Bugatti, официально представлен публике в 2016 году. Модель получила название в честь автогонщика Луи-Александра Широна, который выступал за марку с 1928 по 1958 год", 12, R.drawable.car2));
            products.add(new Car("Ford Mustang 1969", "Культовый автомобиль класса Pony Car производства Ford Motor Company. На автомобиле размещается не эмблема Ford, а специальная эмблема Mustang. Изначальный вариант 11233 был создан на базе агрегатов семейного седана Ford Falcon.", 22, R.drawable.car3));
            products.add(new Car("Nissan 180SX", "Выпускался в кузове фастбэк, базировался на шасси S13 платформы S и продавался только в Японии. Модель продавалась как родственная модель Nissan Silvia с 1989 по 1998 год. Silvia S13 была снята с производства в 1993 году, в то время как 180SX продолжал производиться, и компания Nissan продолжала продавать его еще довольно долго, вплоть до появления следующего поколения Silvia.", 6, R.drawable.car4));
            products.add(new Car("BMW X6", "Среднеразмерный кроссовер, выпускаемый компанией BMW. Он сочетает в себе как признаки внедорожника, так и признаки купе. Сама компания классифицирует данный автомобиль как Sports Activity Coupe - спортивное купе для активного отдыха.",11, R.drawable.car5));
        }
        ListView productList = findViewById(R.id.productList);
        CartAdapter adapter = new CartAdapter(this, R.layout.list_item, products);
        productList.setAdapter(adapter);
    }
}
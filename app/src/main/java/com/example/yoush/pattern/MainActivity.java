package com.example.yoush.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yoush.pattern.adapter.ducks.DuckAdapter;
import com.example.yoush.pattern.adapter.ducks.Turkey;
import com.example.yoush.pattern.adapter.ducks.TurkeyAdapter;
import com.example.yoush.pattern.adapter.ducks.WildTurkey;
import com.example.yoush.pattern.observer.observerpattern.CurrentConditionsDisplay;
import com.example.yoush.pattern.observer.observerpattern.ForecastDisplay;
import com.example.yoush.pattern.observer.observerpattern.HeatIndexDisplay;
import com.example.yoush.pattern.observer.observerpattern.StatisticsDisplay;
import com.example.yoush.pattern.observer.observerpattern.WeatherData;
import com.example.yoush.pattern.singleton.chocolate.ChocolateBoiler;
import com.example.yoush.pattern.singleton.classic.Singleton;
import com.example.yoush.pattern.singleton.subclass.CoolerSingleton;
import com.example.yoush.pattern.singleton.subclass.HotterSingleton;
import com.example.yoush.pattern.strategy.Duck;
import com.example.yoush.pattern.strategy.FlyRocketPowered;
import com.example.yoush.pattern.strategy.MallardDuck;
import com.example.yoush.pattern.strategy.ModelDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        // 策略模式
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        // 观察者模式
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        Singleton singleton = Singleton.getInstance();
        System.out.print(singleton.getDescription());

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();

        com.example.yoush.pattern.singleton.subclass.Singleton foo = CoolerSingleton.getInstance();
        com.example.yoush.pattern.singleton.subclass.Singleton bar = HotterSingleton.getInstance();
        System.out.print(foo);
        System.out.print(bar);
*/

        com.example.yoush.pattern.adapter.ducks.MallardDuck duck = new com.example.yoush.pattern.adapter.ducks.MallardDuck();
        WildTurkey turkey = new WildTurkey();
        com.example.yoush.pattern.adapter.ducks.Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says");
        testDuck(duck);

        System.out.println("The TurkeyAdapter syas...");
        testDuck(turkeyAdapter);

        com.example.yoush.pattern.adapter.ducks.MallardDuck duck1 = new com.example.yoush.pattern.adapter.ducks.MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck1);
        for (int i = 0; i < 10; i++){
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }

    static void testDuck(com.example.yoush.pattern.adapter.ducks.Duck duck){
        duck.quack();
        duck.fly();
    }
}


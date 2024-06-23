package com.demo.Interview_Questions.Json_to_java_obj;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    /**
     * 1. Create pojo classes. In our case we have player.json and it contains players list.
     *    So we need Players class. Each player contains name, id, sport, lastScores. (Player class)
     * 2. Use FileReader class to read json file
     * 3. Then create jsonReader using JsonReader class
     * 4. Finally use Gson class to convert json to pojo
     */
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("player.json");
            JsonReader jsonReader = new JsonReader(fileReader);
            Players players = new Gson().fromJson(jsonReader, Players.class);

            players.getPlayers().forEach(System.out::println);

            Player p1 = new Player("Kobe", "basketball", 24,1, new ArrayList<Integer>(Arrays.asList(1,2,4)));
            Player p2 = new Player("Jidane", "football", 19,2, new ArrayList<Integer>(Arrays.asList(1,2,4)));
            Player p3 = new Player("Kobe", "basketball", 30,3, new ArrayList<Integer>(Arrays.asList(1,2,4)));
            Player p4 = new Player("Kobe", "basketball", 24,4, new ArrayList<Integer>(Arrays.asList(1,2,4)));
            Players p = new Players(List.of(p1,p2,p3,p4));


            //to convert pojo to json string (Serialization)
            System.out.println(new Gson().toJson(p, Players.class));

        } catch (FileNotFoundException e) { }

    }

    public static Object jsonFileToPOJO(String path, @SuppressWarnings("rawtypes") Class c){
        try {
            FileReader fileReader = new FileReader(path);
            JsonReader jsonReader = new JsonReader(fileReader);
            return new Gson().fromJson(jsonReader, c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

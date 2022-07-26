/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102_project2_part1;


import java.util.ArrayList;

public class SongInList {
    Songs s1 = new Songs("Lover","TaylorSwift",5,"Pop",2019);
    Songs s2 = new Songs("Akşamustu","YaslıAmca",4,"Rock",2017);
    Songs s3 = new Songs("Gooddays","Sza",7,"Rap",2020);
    Songs s4 = new Songs("Tutuklu","SezenAksu",8,"Pop",1990);
    Songs s5 = new Songs("Mey","Model",6,"Rock",2016);
    Songs s6 = new Songs("Puppe","Rammstein",14,"Metal",2019);
    Songs s7 = new Songs("Lethe","DarkTranquillity",13,"Metal",1995);
    Songs s8 = new Songs("WakeUpInTheSky","BrunoMars",16,"Hip-Hop",2018);
    Songs s9 = new Songs("Hot","TravisScott",2,"Hip-Hop",2020);
    Songs s10 = new Songs("MountEverest","Labrinth",10,"Pop",2019);
    Songs s11 = new Songs("SummertimeSadness","LanaDelRey",12,"Pop",2012);
    Songs s12 = new Songs("WithoutMe","Eminem",1,"Rap",2002);
    Songs s13 = new Songs("Sigara","ŞebnemFerah",19,"Rock",2001);
    Songs s14 = new Songs("Dansöz","SerdarOrtaç",17,"Pop",2006);
    Songs s15 = new Songs("ShapeOfYou","EdSheeran",11,"Pop",2017);
    Songs s16 = new Songs("FürElise","Beethoven",15,"Classical",1990);
    Songs s17 = new Songs("Bolera","Ravel",18,"Classical",1928);
    Songs s18 = new Songs("Requem","Mozart",9,"Classical",1791);
    Songs s19 = new Songs("Gangsta'sParadise","Coolio",3,"Rap",2010);
    Songs s20 = new Songs("CanYouFeelMyHeart","BringMeTheHorizon",20,"Rock",2019);
   public ArrayList<Songs> listofSongs = new ArrayList<>();
   public SongInList(){
       listofSongs.add(s1);
       listofSongs.add(s2);
       listofSongs.add(s3);
       listofSongs.add(s4);
       listofSongs.add(s5);
       listofSongs.add(s6);
       listofSongs.add(s7);
       listofSongs.add(s8);
       listofSongs.add(s9);
       listofSongs.add(s10);
       listofSongs.add(s11);
       listofSongs.add(s12);
       listofSongs.add(s13);
       listofSongs.add(s14);
       listofSongs.add(s15);
       listofSongs.add(s16);
       listofSongs.add(s17);
       listofSongs.add(s18);
       listofSongs.add(s19);
       listofSongs.add(s20);
   }

   public void deletingFromList(int id){

       for (int i =0; i< listofSongs.size(); i++){
           if (listofSongs.get(i).ID ==id) {
               listofSongs.remove(i);
           }
       }
   }

   public void addingToList(String songName, String artist, int ID, String genre, int year){
       Songs newSong = new Songs(songName,artist,ID,genre,year);
       listofSongs.add(newSong);
   }
}

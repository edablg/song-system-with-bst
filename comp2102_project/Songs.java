/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102_project2_part1;


import java.io.Serializable;

public class Songs implements Serializable {
    private static final long serialVersionUID = 4801633306273802062L;
    public int ID;
    public String songName;
    public int year;
    public String artist;
    public String genre;
    Songs left;
    Songs right;

    public Songs(String songName,String artist,int ID,String genre,int year){// tüm datayı alan const
        this.songName=songName;
        this.artist=artist;
        this.genre=genre;
        this.year=year;
        this.ID= ID;

    }

    public Songs(int ID){
        this.ID=ID;
    } // ID ağacı için oluşturduğumuz const

    public Songs(int ID, String songName) { // song Name için kullanacağımız constructor;
        this.ID = ID;
        this.songName =songName;
    }

    public Songs(int ID, String artist,int year) { // artist için kullanacağımız constructor;
        this.ID = ID;
        this.artist=artist;
        this.year=year;
    }

    @Override
    public String toString() {
        return songName+"; "+artist+"; "+ID+"; "+genre+"; "+year+"\n";
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102_project2_part1;

import java.io.*;
import java.util.Scanner;

public class Trial {
    SongInList songInList= new SongInList();
    Songs_BST IDtree = new Songs_BST();
    Songs_BST songNametree = new Songs_BST();
    Songs_BST artistree = new Songs_BST();

    public void writeObject(){
        //nesnenin toStringini alıp yazıyoruz
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("songs.txt"))){
            for ( int i =0; i< songInList.listofSongs.size(); i++){
                writer.write(songInList.listofSongs.get(i).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writebyUser(String songName, String artist, int ID, String genre, int year) {
        songInList.addingToList(songName, artist, ID, genre, year);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("songs.txt"))) {
            for (int i = 0; i < songInList.listofSongs.size(); i++) {
                writer.write(songInList.listofSongs.get(i).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deletebyUser(int id){
        songInList.deletingFromList(id);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("songs.txt"))){
            for ( int i =0; i< songInList.listofSongs.size(); i++){
                writer.write(songInList.listofSongs.get(i).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printGenre(String gen){
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("songs.txt")))) {
            int i=0;
            while (scanner.hasNextLine()){
                String songs= scanner.nextLine();
                String [] array = songs.split("; ");
                if(array[3].equals(gen)){
                    System.out.println((i+1)+": "+songs);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readObject(){
        // nesnenin tostringini okuyoruz
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("songs.txt")))) {
            while (scanner.hasNextLine()){
                String songs= scanner.nextLine();
                System.out.println(songs);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addIdBST() { // ID ekleme
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("songs.txt")))) {
            while (scanner.hasNextLine()) {
                String songs = scanner.nextLine();
                String[] SongArray = songs.split("; ");
                int iD = Integer.parseInt(SongArray[2]);
                IDtree.addIdBst(iD);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void searchingWithID(int ID){
        int songID = IDtree.searchWId(IDtree.IDroot, ID).ID;
        for(int i =0; i<songInList.listofSongs.size(); i++){
            if(songInList.listofSongs.get(i).ID == songID){
                System.out.println("Song: "+ songInList.listofSongs.get(i).toString());
            }
        }
    }

    public void searchingWithTwoID(int lower, int upper){
        int low = IDtree.searchWId(IDtree.IDroot, lower).ID;
        int up = IDtree.searchWId(IDtree.IDroot, upper).ID;
        int c=0;
        for (int i =low; i<=up; i++){
            c = IDtree.searchWId(IDtree.IDroot,i).ID;
            for(int j =0; j<songInList.listofSongs.size(); j++){
                if(songInList.listofSongs.get(j).ID==c){
                    System.out.println("Song: "+songInList.listofSongs.get(j).toString());
                }
            }
        }
    }

    public void addSongNameBST(){ // song name ağacı oluşturma
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("songs.txt")))) {
            while (scanner.hasNextLine()) {
                String songs = scanner.nextLine();
                String[] SongArray = songs.split("; ");
                int iD = Integer.parseInt(SongArray[2]);
                String songName = SongArray[0];
                songNametree.addSongNameBst(iD,songName);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void searchingWithSongName(String songNa){
        int id =0;

        for (int i =0; i< songInList.listofSongs.size(); i++){
            if(songInList.listofSongs.get(i).songName.equals(songNa)){
                 id= songInList.listofSongs.get(i).ID;
            }
            }
        String s = songNametree.searchWSongName(songNametree.songNameORartistRoot, id).songName;
        for(int i =0; i<songInList.listofSongs.size(); i++){
            if(songInList.listofSongs.get(i).songName.equals(s)){
                System.out.println("Song: "+ songInList.listofSongs.get(i).toString());
            }
        }
        }

    public void addArtistBST(){ // artist// ağacı oluşturma
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("songs.txt")))) {
            while (scanner.hasNextLine()) {
                String songs = scanner.nextLine();
                String[] SongArray = songs.split("; "); // songArray= {"Lover","TaylorSwift","3",...}
                int iD = Integer.parseInt(SongArray[2]);
                int year = Integer.parseInt(SongArray[4]);
                String artist = SongArray[1];
                artistree.addArtistBst(iD,artist,year);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void searchingWithArtist(String ars){
        int id =0;
        for (int i =0; i< songInList.listofSongs.size(); i++){
            if(songInList.listofSongs.get(i).artist.equals(ars)){
                id= songInList.listofSongs.get(i).ID;
            }
        }
        String s = artistree.searchWSongName(artistree.songNameORartistRoot, id).artist;
        for(int i =0; i<songInList.listofSongs.size(); i++){
            if(songInList.listofSongs.get(i).artist.equals(s)){
                System.out.println("Song: "+ songInList.listofSongs.get(i).toString());
            }
        }
    }
}


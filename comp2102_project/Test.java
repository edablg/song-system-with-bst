/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102_project2_part1;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Writing file...");
        System.out.println("Reading file...");
        Trial trial = new Trial();
        trial.writeObject();
        trial.readObject();
        trial.addIdBST();
        trial.addSongNameBST();
        trial.addArtistBST();
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("Welcome...");
        System.out.println("Enter 1 to print songs by genre ");
        System.out.println("Enter 2 for searching for song with ID ");
        System.out.println("Enter 3 to search songs in two ID ranges ");
        System.out.println("Enter 4 to searching with song name ");
        System.out.println("Enter 5 to searching with artist name ");
        System.out.println("Enter 6 for add song to the song list ");
        System.out.println("Enter 7 for delete song with ID ");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.print("Enter option: ");
        int select = input.nextInt();

            switch (select) {

                case 1:
                    System.out.print("Enter genre: ");
                    String genre = input.next();
                    trial.printGenre(genre);
                    break;

                case 2:
                    System.out.print("Enter ID:");
                    int iD = input.nextInt();
                    trial.searchingWithID(iD);
                    break;

                case 3:
                    System.out.print("Enter value for lower ID: ");
                    int x = input.nextInt();
                    System.out.print("Enter value for upper ID: ");
                    int y = input.nextInt();
                    trial.searchingWithTwoID(x, y);
                    break;

                case 4:
                    System.out.print("Enter song name: ");
                    String SngName = input.next();
                    trial.searchingWithSongName(SngName);
                    break;

                case 5:
                    System.out.print("Enter artist name: ");
                    String ArsName = input.next();
                    trial.searchingWithArtist(ArsName);
                    break;

                case 6:
                    System.out.print("Enter song name: ");
                    String name = input.next();
                    System.out.print("Enter artist name: ");
                    String artstName = input.next();
                    System.out.print("Enter ID: ");
                    int Id = input.nextInt();
                    System.out.print("Enter genre:");
                    String gnre = input.next();
                    System.out.print("Enter year: ");
                    int year = input.nextInt();
                    trial.writebyUser(name, artstName, Id, gnre, year);
                    System.out.println("Reading file again...");
                    trial.readObject();
                    break;

                case 7:
                    System.out.print("Enter ID for delete song from list: ");
                    int ID = input.nextInt();
                    trial.deletebyUser(ID);
                    System.out.println("Deleting complete");
                    System.out.println("New List: ");
                    trial.readObject();
                    break;
            }
        }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2102_project2_part1;

public class Songs_BST {
    Songs IDroot;
    Songs songNameORartistRoot;

    public void addIdBst(int ID) {
        Songs newSong = new Songs(ID);
        if (IDroot == null) {
            IDroot = newSong;
        } else {
            Songs temp = IDroot;
            Songs parent = IDroot;
            while (temp != null) {
                parent = temp;
                if (ID < temp.ID) {
                    temp = temp.left;
                } else if (ID > temp.ID) {
                    temp = temp.right;
                }
            }

            if (ID < parent.ID) {
                parent.left = newSong;
            } else {
                parent.right = newSong;
            }
        }
    }

    public void addSongNameBst(int ID, String songName) {
        Songs newSong = new Songs(ID, songName);
        if (songNameORartistRoot != null) {
            songNameORartistRoot.songName = songName;
        }
        if (songNameORartistRoot == null) {
            songNameORartistRoot = newSong;

        } else {
            Songs temp = songNameORartistRoot;
            Songs parent = songNameORartistRoot;
            while (temp != null) {
                parent = temp;
                if (ID < temp.ID) {
                    temp = temp.left;
                } else if (ID > temp.ID) {
                    temp = temp.right;
                }
            }
            if (ID < parent.ID) {
                parent.left = newSong;
            } else {
                parent.right = newSong;
            }
        }
    }
        public void addArtistBst ( int ID, String artist, int year){
            Songs newSong = new Songs(ID,artist,year);
            if (songNameORartistRoot != null) {
                songNameORartistRoot.artist = artist;
            }
            if (songNameORartistRoot == null) {
                songNameORartistRoot = newSong;

            } else {
                Songs temp = songNameORartistRoot;
                Songs parent = songNameORartistRoot;
                while (temp != null) {
                    parent = temp;
                    if (ID < temp.ID) {
                        temp = temp.left;
                    } else if (ID > temp.ID) {
                        temp = temp.right;
                    }
                }
                if (ID < parent.ID) {
                    parent.left = newSong;
                } else {
                    parent.right = newSong;
                }
            }
        }

        public Songs searchWId (Songs Iroot,int ID){
            if (Iroot == null || Iroot.ID == ID) {
                return Iroot;
            }
            if (Iroot.ID < ID) {
                return searchWId(Iroot.right, ID);
            }

            return searchWId(Iroot.left, ID);
        }

        public Songs searchWSongName (Songs SRoot,int ID){
            if (SRoot == null) {
                return null;
            }
            if (SRoot.ID == ID)
            {
                return SRoot;

            } else if (ID < SRoot.ID)
            {
                return searchWSongName(SRoot.left, ID);
            } else
            {
                return searchWSongName(SRoot.right, ID);
            }
        }
    }


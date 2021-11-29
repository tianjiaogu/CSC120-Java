import java.util.*;
import java.io.*;

public class SongCollection{
  
  private Song[] theSongs;
   public SongCollection(){
    theSongs = new Song[0];
   }

     public int size(){
           return theSongs.length;
      }
     public void addFromFile( File f ){

      try{
       Scanner myFile = new Scanner(f);
      int num = Integer.parseInt(myFile.nextLine());
      Song[] merged = Arrays.copyOf( theSongs, theSongs.length + num);
    
      for(int i = 0; i< num; i++){
        String title = myFile.nextLine();
        String artist = myFile.nextLine();
        Song newSong = new Song(title, artist);
        merged[i+theSongs.length] = newSong;
        } 
        theSongs = merged;
      myFile.close();
       }catch(FileNotFoundException e) {
        System.out.println("File not Found.");}
     
      
     }
     public void writeToFile( File f ) {
     try {
     PrintStream p = new PrintStream(f);
      p.println( theSongs.length );
      for(int i = 0; i < theSongs.length; i++){
      p.println(theSongs[i].getTitle());
      p.println(theSongs[i].getArtist());
     }
     p.flush();
     p.close();
     } catch( FileNotFoundException e ) {
      System.out.println("File not Found.");}
     }

     public void addOneSong( String t, String a ){
        Song newSong = new Song(t,a);
        Song[] bigger = Arrays.copyOf( theSongs, theSongs.length + 1);
        bigger[bigger.length-1] = newSong;
        theSongs = bigger;
     }
     public void delete( int pos ){
      Song[] deleted = new Song[theSongs.length-1];
      for(int i = 0; i < pos; i++){
           deleted[i] = theSongs[i];
      }
      for(int i = pos+1; i < theSongs.length; i++){
      deleted[i-1] = theSongs[i];
      }
        theSongs = deleted;
     }
     public void searchByTitle( String key ){
     for(int i = 0; i < theSongs.length; i++){
      String title = theSongs[i].getTitle();
      String artist = theSongs[i].getArtist();
       if(title.indexOf(key) != -1){
        System.out.println(i + ": "+title+ ", "+artist);
        }
     }
     }
     public void searchByArtist( String key ){
      for(int i = 0; i < theSongs.length; i++){
      String title = theSongs[i].getTitle();
      String artist = theSongs[i].getArtist();
       if(title.indexOf(key) != -1){
        System.out.println(i + ": "+title+ ", "+artist);
        }
     }
     }
     public void show( int start, int end ){
      for(int i = start; i < end; i++){
      System.out.println(theSongs[i].getTitle());
      System.out.println(theSongs[i].getArtist());
        }
     }
   }


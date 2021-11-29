import java.util.*;
import java.io.*;

public class Song{

  private String artist, title;
   public Song(  String t, String a ){
     artist = a;
     title = t;
   }


      public String getTitle(){
         return title;
      }

       public String getArtist(){
          return artist;
       }
  }    

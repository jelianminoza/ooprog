public class AlwaysLyrics {

    public static void lyricDisplay(String songtitle){

        String[] lyrics = {
         "                                                   ",
         "                                                  ",
            "   Baby, baby",
            "   There will always be a space for you and me",
            "   Right where you left it",
            "   And just maybe",
            "   Enough time will pass",
            "   We'll look back and laugh",
            "   Just don't forget it",
            "   And maybe I'm wrong",
            "   For writing this song",
            "   Losing my head over you",
            "          ",
            "   And I'll be here",
            "   Cause we both know how it goes",
            "   I don't want things to change",
            "   I pray they stay the same always",
            "   And I don't care, If you're with somebody else",
            "   I'll give you time and space",
            "   Just know I'm not a phase, I'm always, ways, ways",
            "   Always, ways, ways",
            "   I'm always, ways, ways",
            "   Pretty lady, used to walk with me",
            "   Down Bloor street, oh, what a time",
            "   And I still remember the fussin', the fightin', the fuckin', the lyin",
            "   It's all fine, you'll always be mine",
            "   And maybe I'm wrong (hey, babe, you could)",
            "   For writing this song (write me a song)",
            "   Losing my head over you",
            "   And I'll be here",
            "   Cause we both know how it goes",
            "   I don't want things to change",
            "   I pray they stay the same always",
            "   And I don't care",
            "   If you're with somebody else",
            "   I'll give you time and space",
            "   Just know I'm not a phase, I'm always, ways, ways",
            "   I'm always, ways, ways",
            "   Always, ways, ways",
            "   I'm always, ways, ways",
            "   Always, can count on it sure as the stars in the sky",
            "   Always, you can count on it as sure as the sun will rise",
            "   Always, my love for you ain't goin' nowhere",
            "   Always, I will be here",
        };

        int characterdelay = 75; // milliseconds delay
        int linedelay = 2000; // 2 seconds delay before the line
       
        System.out.println("");
        System.out.println("");
        System.out.println("Always - Daniel Caesar");
        lyricsThread(lyrics, characterdelay, linedelay);
        System.out.println("");
        System.out.println("");
        System.out.println("");
     }
     
     
     private static void lyricsThread(String[] lyrics, int characterdelay, int linedelay){
     
        try{
           for(String line: lyrics){
              System.out.println("\r");
              
              for(char c: line.toCharArray()){
                 System.out.print(c);
                 
                 Thread.sleep(characterdelay);
              }
              Thread.sleep(linedelay);
           }
        } catch(InterruptedException e){
           e.printStackTrace();
        }
     }
}

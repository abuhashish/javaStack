import java.util.HashMap;
import java.util.Set;
class maps{
    public static void main(String [] args){
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("hello","hello its me i was wondering");
        songs.put("blue","im blue if i go green i die ");
        songs.put("stero","my hear is a stero it listens for you so listen close");
        songs.put("sevenNationarmy","i am gonna fight them all seven nation army cannot hold me down");
        String song=songs.get("stero");
        System.out.println(song);
        Set<String> Keys=songs.keySet();
        for(String Key:Keys){
            System.out.println(Key);
            System.out.println(songs.get(Key));
        }
    }
}
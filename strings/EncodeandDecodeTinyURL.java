public class Codec {
    HashMap<String, String> hm = new HashMap<>();
    String alphabet = "ABCDEFGHIJKLMNOPQRTYUVWXYZabcdefghijklmnpqrstuvwxvz1234567890";
    Random r = new Random();
    String CompanyUrl = "www.anuznagpal.com/";
    


    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key ="";
        do{
            for(int i = 0; i<6; i++){
            int point = r.nextInt(alphabet.length());
            key+=alphabet.charAt(point);
            }
        }
        while(hm.containsKey(key));
        hm.put(key,longUrl);
        return CompanyUrl+key;        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(CompanyUrl,"");
        return hm.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
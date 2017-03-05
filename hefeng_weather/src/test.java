import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by lyt on 16-12-11.
 */
public class test {
    public static void mian(String[] args){
    String httpUrl = "https://api.heweather.com/x3/weather?city=beijing&key=e0c1367762f14c69b80d342c9ff0935e";
    String jsonResult = request(httpUrl);
    System.out.println(jsonResult);
    public static String request(String httpUrl) {
        BufferedReader reader = null;
    }
    /*BufferedReader reader = null;
    String result = null;StringBuffer sbf = new StringBuffer();
    try {
        URL url = new URL(httpUrl);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        InputStream is = connection.getInputStream();
        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String strRead = null;
        while ((strRead = reader.readLine()) != null) {
        sbf.append(strRead); sbf.append("\r\n");
        }
        reader.close();
        result = sbf.toString();
    } catch (Exception e) { e.printStackTrace(); }
        return result;
    }*/
}

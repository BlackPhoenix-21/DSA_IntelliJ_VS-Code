
import java.io.*;
import java.net.*;

public class Request {

    public static void main(String[] args) {

        String host = "time.nist.gov";
        int port = 37;

        try {

            Socket verbindung = new Socket(host, port);
            // InputStream in = verbindung.getInputStream();

            DataInputStream dataStream = new DataInputStream(verbindung.getInputStream());

            // int result = in.read(daten);
            // int result = in.read(daten, 0, daten.length);
            // System.out.println(result);

            // int t = dataStream.readInt();
            // short s1 = dataStream.readShort();
            // short s2 = dataStream.readShort();

            long l = Integer.toUnsignedLong(dataStream.readInt());

            System.out.println(l);

            // byte[] data = new byte[4];
            // dataStream.read(data, 0, 4);

            // System.out.println(s1 + " " + s2);

            // for (int i = 0; i < data.length; i++) {
            // System.out.println(data[i]);
            // }

            // System.out.println(new String(data));

            verbindung.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    /*
     * short: 17.256; 24.941; 28.777; 28.526
     * byte: 67; 104; 97; 109; 112; 105; 111; 110
     * String: C h a m p i o n
     * 01000011|01101000|01100001|01101101|01110000|01101001|01101111|01101110
     */

}
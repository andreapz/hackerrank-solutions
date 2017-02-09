import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;

/**
 * Created by andreaputzu on 09/02/17.
 */

public class KeystoreTest {


    private static String ksPw = "mamadou";
    private static String aliasPw = "mamadou";

    // private static String alias = "indoona";
     private static String alias = "tiscali_mail";
    //private static String alias = "istella";

    private static String keystore = "android_keystore_tiscali_play";

    public static void main(String[] args) {
        KeyStore ks = null;
        try {
            ks = KeyStore.getInstance(KeyStore.getDefaultType());
            try (FileInputStream fis = new FileInputStream(keystore)) {
                ks.load(fis, ksPw.toCharArray());
                ks.getEntry(alias, new KeyStore.PasswordProtection(aliasPw.toCharArray()));
                System.out.println("Keystore alias pwd OK");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (CertificateException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnrecoverableEntryException e) {
                e.printStackTrace();
            }
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
    }
}
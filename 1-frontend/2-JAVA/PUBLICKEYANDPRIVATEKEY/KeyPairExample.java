package PUBLICKEYANDPRIVATEKEY;

import java.security.*;
import java.util.Base64;
import javax.crypto.*;

public class KeyPairExample {

    public static void main(String[] args) {
        // Try to encrypt and decrypt
        try {
            // Generate key pair
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048); // You can choose a different key size
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // Get public and private keys
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            // Encrypt
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptedData = cipher.doFinal("Prokofiev GOOSE!!".getBytes());
            System.out.println("Encrypted Data: " + Base64.getEncoder().encodeToString(encryptedData));

            // Decrypt
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedData = cipher.doFinal(encryptedData);
            System.out.println("Decrypted Data: " + new String(decryptedData));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
    }
}
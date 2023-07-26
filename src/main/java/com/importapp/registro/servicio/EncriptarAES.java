
package com.importapp.registro.servicio;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

/*
* Autor: Alfredo Loaiza
* Descripcion: Servicio para encriptar AES
* Fecha: 05/07/2023
*/

public class EncriptarAES {
    private static final String AES_ALGORITHM = "AES";
    private static final String ENCRYPTION_KEY = "YOUR_ENCRYPTION_KEY";

    public static String encryptPassword(String password) throws Exception {
        byte[] key = generateKey(ENCRYPTION_KEY);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, AES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static byte[] generateKey(String encryptionKey) throws Exception {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        byte[] keyBytes = encryptionKey.getBytes(StandardCharsets.UTF_8);
        keyBytes = sha.digest(keyBytes);
        return Arrays.copyOf(keyBytes, 16);
    }
}

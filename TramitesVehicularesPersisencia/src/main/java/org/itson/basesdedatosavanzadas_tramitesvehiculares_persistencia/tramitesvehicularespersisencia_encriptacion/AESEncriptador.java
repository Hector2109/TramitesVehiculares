/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.basesdedatosavanzadas_tramitesvehiculares_persistencia.tramitesvehicularespersisencia_encriptacion;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Hector Espinoza & Abel Sanchez
 */
public class AESEncriptador {
    
    private static final String clave="";
    
    
    /**
     * Método el cual se usará para encriptar, se usará el algoritmo de cifrado AES
     * @param texto texto desencriptado
     * @return texto encriptado
     * @throws Exception 
     */
    public static String encriptar(String texto) throws Exception {
        SecretKeySpec claveSecreta = new SecretKeySpec(clave.getBytes(), "AES");
        Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cifrador.init(Cipher.ENCRYPT_MODE, claveSecreta);
        byte[] textoEncriptado = cifrador.doFinal(texto.getBytes());
        return Base64.getEncoder().encodeToString(textoEncriptado);
    }

    /**
     * Método el cuál se usará para desencrptar, se usará algoritmo de cigrado AES
     * @param textoEncriptado texto que se quiere encriptar
     * @return texto desencriptado
     * @throws Exception 
     */
    public static String desencriptar(String textoEncriptado) throws Exception {
        SecretKeySpec claveSecreta = new SecretKeySpec(clave.getBytes(), "AES");
        Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cifrador.init(Cipher.DECRYPT_MODE, claveSecreta);
        byte[] textoDecodificado = Base64.getDecoder().decode(textoEncriptado);
        byte[] textoDesencriptado = cifrador.doFinal(textoDecodificado);
        return new String(textoDesencriptado);
    }
    
}

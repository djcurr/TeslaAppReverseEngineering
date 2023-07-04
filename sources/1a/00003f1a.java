package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class p {
    public static SecretKey a(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) {
        KeyAgreement keyAgreement;
        try {
            if (provider != null) {
                keyAgreement = KeyAgreement.getInstance("ECDH", provider);
            } else {
                keyAgreement = KeyAgreement.getInstance("ECDH");
            }
            try {
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e11) {
                throw new JOSEException("Invalid key for ECDH key agreement: " + e11.getMessage(), e11);
            }
        } catch (NoSuchAlgorithmException e12) {
            throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e12.getMessage(), e12);
        }
    }
}
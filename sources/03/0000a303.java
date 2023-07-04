package org.spongycastle.openssl.jcajce;

import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.jcajce.JcaX509CRLHolder;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.openssl.MiscPEMGenerator;
import org.spongycastle.openssl.PEMEncryptor;

/* loaded from: classes4.dex */
public class JcaMiscPEMGenerator extends MiscPEMGenerator {
    private String algorithm;
    private Object obj;
    private char[] password;
    private Provider provider;
    private SecureRandom random;

    public JcaMiscPEMGenerator(Object obj) {
        super(convertObject(obj));
    }

    private static Object convertObject(Object obj) {
        if (obj instanceof X509Certificate) {
            try {
                return new JcaX509CertificateHolder((X509Certificate) obj);
            } catch (CertificateEncodingException e11) {
                throw new IllegalArgumentException("Cannot encode object: " + e11.toString());
            }
        } else if (obj instanceof X509CRL) {
            try {
                return new JcaX509CRLHolder((X509CRL) obj);
            } catch (CRLException e12) {
                throw new IllegalArgumentException("Cannot encode object: " + e12.toString());
            }
        } else if (obj instanceof KeyPair) {
            return convertObject(((KeyPair) obj).getPrivate());
        } else {
            if (obj instanceof PrivateKey) {
                return PrivateKeyInfo.getInstance(((Key) obj).getEncoded());
            }
            return obj instanceof PublicKey ? SubjectPublicKeyInfo.getInstance(((PublicKey) obj).getEncoded()) : obj;
        }
    }

    public JcaMiscPEMGenerator(Object obj, PEMEncryptor pEMEncryptor) {
        super(convertObject(obj), pEMEncryptor);
    }
}
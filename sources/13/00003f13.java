package com.nimbusds.jose.crypto.impl;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public class i {
    public static Cipher a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
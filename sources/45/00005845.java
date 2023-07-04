package com.stripe.android.stripe3ds2.security;

import java.io.Serializable;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
public interface DiffieHellmanKeyGenerator extends Serializable {
    SecretKey generate(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, String str);
}
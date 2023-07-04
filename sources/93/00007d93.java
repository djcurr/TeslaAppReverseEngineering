package k60;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public interface k extends Key {
    PrivateKey getPrivate();

    PublicKey getPublic();
}
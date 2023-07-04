package k60;

import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public interface l extends PrivateKey {
    PrivateKey getEphemeralPrivateKey();

    PublicKey getEphemeralPublicKey();

    PrivateKey getStaticPrivateKey();
}
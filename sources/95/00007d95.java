package k60;

import java.security.PublicKey;

/* loaded from: classes5.dex */
public interface m extends PublicKey {
    PublicKey getEphemeralKey();

    PublicKey getStaticKey();
}
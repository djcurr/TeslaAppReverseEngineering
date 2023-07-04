package k60;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;

/* loaded from: classes5.dex */
public interface e extends d, DHPrivateKey {
    @Override // javax.crypto.interfaces.DHPrivateKey
    BigInteger getX();
}
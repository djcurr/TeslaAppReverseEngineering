package k60;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;

/* loaded from: classes5.dex */
public interface f extends d, DHPublicKey {
    @Override // javax.crypto.interfaces.DHPublicKey
    BigInteger getY();
}
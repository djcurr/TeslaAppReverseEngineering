package y50;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public interface b {
    void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr);

    void init(BigInteger bigInteger, SecureRandom secureRandom);

    boolean isDeterministic();

    BigInteger nextK();
}
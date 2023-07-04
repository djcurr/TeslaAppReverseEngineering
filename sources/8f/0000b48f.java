package t50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public interface a {
    int addPadding(byte[] bArr, int i11);

    void init(SecureRandom secureRandom);

    int padCount(byte[] bArr);
}
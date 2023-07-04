package f60;

import java.security.Key;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public interface b extends Key, PublicKey {
    byte[] getPointEncoding();
}
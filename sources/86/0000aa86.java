package pd;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* loaded from: classes.dex */
public interface g {
    PooledByteBuffer a(InputStream inputStream);

    PooledByteBuffer b(InputStream inputStream, int i11);

    i c();

    PooledByteBuffer d(byte[] bArr);

    i e(int i11);
}
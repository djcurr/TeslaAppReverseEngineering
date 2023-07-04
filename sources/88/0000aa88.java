package pd;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;
import md.p;

/* loaded from: classes.dex */
public abstract class i extends OutputStream {
    public abstract PooledByteBuffer a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e11) {
            p.a(e11);
        }
    }

    public abstract int size();
}
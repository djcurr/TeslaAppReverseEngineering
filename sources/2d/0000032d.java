package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface g0 extends AutoCloseable {

    /* loaded from: classes.dex */
    public interface a {
        ByteBuffer b();

        int c();

        int d();
    }

    Rect M0();

    void c0(Rect rect);

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    int getWidth();

    z.j0 l1();

    Image u1();

    a[] x0();
}
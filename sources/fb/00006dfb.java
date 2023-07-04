package fa;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: fa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0513a {
        void a(Bitmap bitmap);

        byte[] b(int i11);

        Bitmap c(int i11, int i12, Bitmap.Config config);

        int[] d(int i11);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    int a();

    void b();

    void c(Bitmap.Config config);

    void clear();

    ByteBuffer d();

    int e();

    void f();

    int g();

    Bitmap getNextFrame();

    int h();
}
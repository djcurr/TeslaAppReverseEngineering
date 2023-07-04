package d0;

import a0.e;
import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.g0;
import androidx.camera.core.impl.b0;
import androidx.camera.core.n0;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public class i implements b0 {

    /* renamed from: h  reason: collision with root package name */
    private static final Rect f23256h = new Rect(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f23257a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23258b;

    /* renamed from: f  reason: collision with root package name */
    private ImageWriter f23262f;

    /* renamed from: c  reason: collision with root package name */
    private final Object f23259c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f23260d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f23261e = 0;

    /* renamed from: g  reason: collision with root package name */
    private Rect f23263g = f23256h;

    public i(int i11, int i12) {
        this.f23257a = i11;
        this.f23258b = i12;
    }

    private static a0.e e(g0 g0Var) {
        e.b a11 = a0.e.a();
        g0Var.l1().b(a11);
        return a11.j(g0Var.getWidth()).i(g0Var.getHeight()).a();
    }

    @Override // androidx.camera.core.impl.b0
    public void a(Surface surface, int i11) {
        v3.h.i(i11 == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f23259c) {
            if (!this.f23260d) {
                if (this.f23262f == null) {
                    this.f23262f = e0.a.a(surface, this.f23258b, i11);
                } else {
                    throw new IllegalStateException("Output surface already set.");
                }
            } else {
                n0.m("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            }
        }
    }

    @Override // androidx.camera.core.impl.b0
    public void b(Size size) {
        synchronized (this.f23259c) {
            this.f23263g = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013b A[Catch: all -> 0x015e, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x015e, blocks: (B:43:0x00e3, B:90:0x013b), top: B:151:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    @Override // androidx.camera.core.impl.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(androidx.camera.core.impl.q0 r18) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.i.c(androidx.camera.core.impl.q0):void");
    }

    public void d() {
        synchronized (this.f23259c) {
            if (!this.f23260d) {
                this.f23260d = true;
                if (this.f23261e == 0 && this.f23262f != null) {
                    n0.a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                    this.f23262f.close();
                } else {
                    n0.a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f23264a;

        a(ByteBuffer byteBuffer) {
            this.f23264a = byteBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            if (this.f23264a.hasRemaining()) {
                this.f23264a.put((byte) i11);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            int i13;
            Objects.requireNonNull(bArr);
            if (i11 < 0 || i11 > bArr.length || i12 < 0 || (i13 = i11 + i12) > bArr.length || i13 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i12 == 0) {
                return;
            }
            if (this.f23264a.remaining() >= i12) {
                this.f23264a.put(bArr, i11, i12);
                return;
            }
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
    }
}
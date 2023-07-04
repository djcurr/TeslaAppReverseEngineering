package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.g0;
import androidx.camera.core.impl.l1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class a implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Image f2082a;

    /* renamed from: b  reason: collision with root package name */
    private final C0043a[] f2083b;

    /* renamed from: c  reason: collision with root package name */
    private final z.j0 f2084c;

    /* renamed from: androidx.camera.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0043a implements g0.a {

        /* renamed from: a  reason: collision with root package name */
        private final Image.Plane f2085a;

        C0043a(Image.Plane plane) {
            this.f2085a = plane;
        }

        @Override // androidx.camera.core.g0.a
        public synchronized ByteBuffer b() {
            return this.f2085a.getBuffer();
        }

        @Override // androidx.camera.core.g0.a
        public synchronized int c() {
            return this.f2085a.getRowStride();
        }

        @Override // androidx.camera.core.g0.a
        public synchronized int d() {
            return this.f2085a.getPixelStride();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Image image) {
        this.f2082a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f2083b = new C0043a[planes.length];
            for (int i11 = 0; i11 < planes.length; i11++) {
                this.f2083b[i11] = new C0043a(planes[i11]);
            }
        } else {
            this.f2083b = new C0043a[0];
        }
        this.f2084c = m0.d(l1.a(), image.getTimestamp(), 0);
    }

    @Override // androidx.camera.core.g0
    public synchronized Rect M0() {
        return this.f2082a.getCropRect();
    }

    @Override // androidx.camera.core.g0
    public synchronized void c0(Rect rect) {
        this.f2082a.setCropRect(rect);
    }

    @Override // androidx.camera.core.g0, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2082a.close();
    }

    @Override // androidx.camera.core.g0
    public synchronized int getFormat() {
        return this.f2082a.getFormat();
    }

    @Override // androidx.camera.core.g0
    public synchronized int getHeight() {
        return this.f2082a.getHeight();
    }

    @Override // androidx.camera.core.g0
    public synchronized int getWidth() {
        return this.f2082a.getWidth();
    }

    @Override // androidx.camera.core.g0
    public z.j0 l1() {
        return this.f2084c;
    }

    @Override // androidx.camera.core.g0
    public synchronized Image u1() {
        return this.f2082a;
    }

    @Override // androidx.camera.core.g0
    public synchronized g0.a[] x0() {
        return this.f2083b;
    }
}
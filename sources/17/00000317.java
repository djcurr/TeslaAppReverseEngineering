package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.r0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements androidx.camera.core.impl.r0 {

    /* renamed from: a */
    private final ImageReader f2185a;

    public d(ImageReader imageReader) {
        this.f2185a = imageReader;
    }

    public static /* synthetic */ void a(d dVar, Executor executor, r0.a aVar, ImageReader imageReader) {
        dVar.j(executor, aVar, imageReader);
    }

    public static /* synthetic */ void g(d dVar, r0.a aVar) {
        dVar.i(aVar);
    }

    private boolean h(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    public /* synthetic */ void i(r0.a aVar) {
        aVar.a(this);
    }

    public /* synthetic */ void j(Executor executor, final r0.a aVar, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.c
            {
                d.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.g(d.this, aVar);
            }
        });
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized g0 b() {
        Image image;
        try {
            image = this.f2185a.acquireLatestImage();
        } catch (RuntimeException e11) {
            if (!h(e11)) {
                throw e11;
            }
            image = null;
        }
        if (image == null) {
            return null;
        }
        return new a(image);
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized void c() {
        this.f2185a.setOnImageAvailableListener(null, null);
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized void close() {
        this.f2185a.close();
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized int d() {
        return this.f2185a.getMaxImages();
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized void e(final r0.a aVar, final Executor executor) {
        this.f2185a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
            {
                d.this = this;
            }

            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                d.a(d.this, executor, aVar, imageReader);
            }
        }, a0.i.a());
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized g0 f() {
        Image image;
        try {
            image = this.f2185a.acquireNextImage();
        } catch (RuntimeException e11) {
            if (!h(e11)) {
                throw e11;
            }
            image = null;
        }
        if (image == null) {
            return null;
        }
        return new a(image);
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized int getHeight() {
        return this.f2185a.getHeight();
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized Surface getSurface() {
        return this.f2185a.getSurface();
    }

    @Override // androidx.camera.core.impl.r0
    public synchronized int getWidth() {
        return this.f2185a.getWidth();
    }
}
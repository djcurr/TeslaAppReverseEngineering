package t1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class e implements h0 {

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f51410b;

    public e(Bitmap bitmap) {
        kotlin.jvm.internal.s.g(bitmap, "bitmap");
        this.f51410b = bitmap;
    }

    @Override // t1.h0
    public void a() {
        this.f51410b.prepareToDraw();
    }

    @Override // t1.h0
    public int b() {
        Bitmap.Config config = this.f51410b.getConfig();
        kotlin.jvm.internal.s.f(config, "bitmap.config");
        return f.e(config);
    }

    public final Bitmap c() {
        return this.f51410b;
    }

    @Override // t1.h0
    public int getHeight() {
        return this.f51410b.getHeight();
    }

    @Override // t1.h0
    public int getWidth() {
        return this.f51410b.getWidth();
    }
}
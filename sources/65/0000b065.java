package ra;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class c extends b<Drawable> {
    private c(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ja.c<Drawable> d(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    @Override // ja.c
    public int a() {
        return Math.max(1, this.f49330a.getIntrinsicWidth() * this.f49330a.getIntrinsicHeight() * 4);
    }

    @Override // ja.c
    public Class<Drawable> b() {
        return this.f49330a.getClass();
    }

    @Override // ja.c
    public void recycle() {
    }
}
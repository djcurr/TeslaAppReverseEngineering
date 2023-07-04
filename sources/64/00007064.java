package gf;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class h implements qd.h<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private static h f27973a;

    private h() {
    }

    public static h b() {
        if (f27973a == null) {
            f27973a = new h();
        }
        return f27973a;
    }

    @Override // qd.h
    /* renamed from: c */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
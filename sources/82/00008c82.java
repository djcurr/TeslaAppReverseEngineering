package nk;

import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import tk.b;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f41741f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f41742a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41743b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41744c;

    /* renamed from: d  reason: collision with root package name */
    private final int f41745d;

    /* renamed from: e  reason: collision with root package name */
    private final float f41746e;

    public a(Context context) {
        this(b.b(context, fk.b.f26382r, false), kk.a.b(context, fk.b.f26381q, 0), kk.a.b(context, fk.b.f26380p, 0), kk.a.b(context, fk.b.f26378n, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i11) {
        return m3.a.k(i11, 255) == this.f41745d;
    }

    public float a(float f11) {
        float f12 = this.f41746e;
        return (f12 <= BitmapDescriptorFactory.HUE_RED || f11 <= BitmapDescriptorFactory.HUE_RED) ? BitmapDescriptorFactory.HUE_RED : Math.min(((((float) Math.log1p(f11 / f12)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i11, float f11) {
        int i12;
        float a11 = a(f11);
        int alpha = Color.alpha(i11);
        int h11 = kk.a.h(m3.a.k(i11, 255), this.f41743b, a11);
        if (a11 > BitmapDescriptorFactory.HUE_RED && (i12 = this.f41744c) != 0) {
            h11 = kk.a.g(h11, m3.a.k(i12, f41741f));
        }
        return m3.a.k(h11, alpha);
    }

    public int c(int i11, float f11) {
        return (this.f41742a && e(i11)) ? b(i11, f11) : i11;
    }

    public boolean d() {
        return this.f41742a;
    }

    public a(boolean z11, int i11, int i12, int i13, float f11) {
        this.f41742a = z11;
        this.f41743b = i11;
        this.f41744c = i12;
        this.f41745d = i13;
        this.f41746e = f11;
    }
}
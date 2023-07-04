package je;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f33345a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33346b = false;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f33347c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f33348d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f33349e = -1;

    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i11 = this.f33345a;
        if (i11 != -1) {
            drawable.setAlpha(i11);
        }
        if (this.f33346b) {
            drawable.setColorFilter(this.f33347c);
        }
        int i12 = this.f33348d;
        if (i12 != -1) {
            drawable.setDither(i12 != 0);
        }
        int i13 = this.f33349e;
        if (i13 != -1) {
            drawable.setFilterBitmap(i13 != 0);
        }
    }

    public void b(int i11) {
        this.f33345a = i11;
    }

    public void c(ColorFilter colorFilter) {
        this.f33347c = colorFilter;
        this.f33346b = colorFilter != null;
    }

    public void d(boolean z11) {
        this.f33348d = z11 ? 1 : 0;
    }

    public void e(boolean z11) {
        this.f33349e = z11 ? 1 : 0;
    }
}
package o2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f42157a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42158b;

    /* renamed from: c  reason: collision with root package name */
    private final int f42159c;

    /* renamed from: d  reason: collision with root package name */
    private final TextPaint f42160d;

    /* renamed from: e  reason: collision with root package name */
    private final int f42161e;

    /* renamed from: f  reason: collision with root package name */
    private final TextDirectionHeuristic f42162f;

    /* renamed from: g  reason: collision with root package name */
    private final Layout.Alignment f42163g;

    /* renamed from: h  reason: collision with root package name */
    private final int f42164h;

    /* renamed from: i  reason: collision with root package name */
    private final TextUtils.TruncateAt f42165i;

    /* renamed from: j  reason: collision with root package name */
    private final int f42166j;

    /* renamed from: k  reason: collision with root package name */
    private final float f42167k;

    /* renamed from: l  reason: collision with root package name */
    private final float f42168l;

    /* renamed from: m  reason: collision with root package name */
    private final int f42169m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f42170n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f42171o;

    /* renamed from: p  reason: collision with root package name */
    private final int f42172p;

    /* renamed from: q  reason: collision with root package name */
    private final int f42173q;

    /* renamed from: r  reason: collision with root package name */
    private final int[] f42174r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f42175s;

    public n(CharSequence text, int i11, int i12, TextPaint paint, int i13, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i14, TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int[] iArr, int[] iArr2) {
        s.g(text, "text");
        s.g(paint, "paint");
        s.g(textDir, "textDir");
        s.g(alignment, "alignment");
        this.f42157a = text;
        this.f42158b = i11;
        this.f42159c = i12;
        this.f42160d = paint;
        this.f42161e = i13;
        this.f42162f = textDir;
        this.f42163g = alignment;
        this.f42164h = i14;
        this.f42165i = truncateAt;
        this.f42166j = i15;
        this.f42167k = f11;
        this.f42168l = f12;
        this.f42169m = i16;
        this.f42170n = z11;
        this.f42171o = z12;
        this.f42172p = i17;
        this.f42173q = i18;
        this.f42174r = iArr;
        this.f42175s = iArr2;
        if (!(i11 >= 0 && i11 <= i12)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i12 >= 0 && i12 <= text.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i15 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f11 >= BitmapDescriptorFactory.HUE_RED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final Layout.Alignment a() {
        return this.f42163g;
    }

    public final int b() {
        return this.f42172p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f42165i;
    }

    public final int d() {
        return this.f42166j;
    }

    public final int e() {
        return this.f42159c;
    }

    public final int f() {
        return this.f42173q;
    }

    public final boolean g() {
        return this.f42170n;
    }

    public final int h() {
        return this.f42169m;
    }

    public final int[] i() {
        return this.f42174r;
    }

    public final float j() {
        return this.f42168l;
    }

    public final float k() {
        return this.f42167k;
    }

    public final int l() {
        return this.f42164h;
    }

    public final TextPaint m() {
        return this.f42160d;
    }

    public final int[] n() {
        return this.f42175s;
    }

    public final int o() {
        return this.f42158b;
    }

    public final CharSequence p() {
        return this.f42157a;
    }

    public final TextDirectionHeuristic q() {
        return this.f42162f;
    }

    public final boolean r() {
        return this.f42171o;
    }

    public final int s() {
        return this.f42161e;
    }
}
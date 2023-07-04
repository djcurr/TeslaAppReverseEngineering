package u2;

import java.util.List;
import n2.a;
import n2.a0;
import n2.p;
import n2.s;
import wz.e0;
import wz.v;

/* loaded from: classes.dex */
public final class d implements n2.k {

    /* renamed from: a  reason: collision with root package name */
    private final String f53012a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f53013b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a.b<s>> f53014c;

    /* renamed from: d  reason: collision with root package name */
    private final List<a.b<p>> f53015d;

    /* renamed from: e  reason: collision with root package name */
    private final j f53016e;

    /* renamed from: f  reason: collision with root package name */
    private final x2.d f53017f;

    /* renamed from: g  reason: collision with root package name */
    private final g f53018g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f53019h;

    /* renamed from: i  reason: collision with root package name */
    private final o2.d f53020i;

    /* renamed from: j  reason: collision with root package name */
    private final int f53021j;

    public d(String text, a0 style, List<a.b<s>> spanStyles, List<a.b<p>> placeholders, j typefaceAdapter, x2.d density) {
        List d11;
        List y02;
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(typefaceAdapter, "typefaceAdapter");
        kotlin.jvm.internal.s.g(density, "density");
        this.f53012a = text;
        this.f53013b = style;
        this.f53014c = spanStyles;
        this.f53015d = placeholders;
        this.f53016e = typefaceAdapter;
        this.f53017f = density;
        g gVar = new g(1, density.getDensity());
        this.f53018g = gVar;
        int b11 = e.b(style.s(), style.o());
        this.f53021j = b11;
        s a11 = v2.f.a(gVar, style.y(), typefaceAdapter, density);
        float textSize = gVar.getTextSize();
        d11 = v.d(new a.b(a11, 0, text.length()));
        y02 = e0.y0(d11, spanStyles);
        CharSequence a12 = c.a(text, textSize, style, y02, placeholders, density, typefaceAdapter);
        this.f53019h = a12;
        this.f53020i = new o2.d(a12, gVar, b11);
    }

    @Override // n2.k
    public float a() {
        return this.f53020i.c();
    }

    @Override // n2.k
    public float b() {
        return this.f53020i.b();
    }

    public final CharSequence c() {
        return this.f53019h;
    }

    public final o2.d d() {
        return this.f53020i;
    }

    public final a0 e() {
        return this.f53013b;
    }

    public final int f() {
        return this.f53021j;
    }

    public final g g() {
        return this.f53018g;
    }
}
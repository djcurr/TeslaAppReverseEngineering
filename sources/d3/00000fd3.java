package c8;

import android.graphics.Path;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class n implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8978a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f8979b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8980c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.a f8981d;

    /* renamed from: e  reason: collision with root package name */
    private final b8.d f8982e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8983f;

    public n(String str, boolean z11, Path.FillType fillType, b8.a aVar, b8.d dVar, boolean z12) {
        this.f8980c = str;
        this.f8978a = z11;
        this.f8979b = fillType;
        this.f8981d = aVar;
        this.f8982e = dVar;
        this.f8983f = z12;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.g(aVar, bVar, this);
    }

    public b8.a b() {
        return this.f8981d;
    }

    public Path.FillType c() {
        return this.f8979b;
    }

    public String d() {
        return this.f8980c;
    }

    public b8.d e() {
        return this.f8982e;
    }

    public boolean f() {
        return this.f8983f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f8978a + CoreConstants.CURLY_RIGHT;
    }
}
package c8;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class o implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8984a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f8985b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8986c;

    public o(String str, List<c> list, boolean z11) {
        this.f8984a = str;
        this.f8985b = list;
        this.f8986c = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.d(aVar, bVar, this);
    }

    public List<c> b() {
        return this.f8985b;
    }

    public String c() {
        return this.f8984a;
    }

    public boolean d() {
        return this.f8986c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f8984a + "' Shapes: " + Arrays.toString(this.f8985b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
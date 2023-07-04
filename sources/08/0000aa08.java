package p4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4.p;

/* loaded from: classes.dex */
public class q<D extends p> {

    /* renamed from: a  reason: collision with root package name */
    private final b0<? extends D> f46130a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46131b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46132c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f46133d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, g> f46134e;

    /* renamed from: f  reason: collision with root package name */
    private List<n> f46135f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, f> f46136g;

    public q(b0<? extends D> navigator, int i11, String str) {
        kotlin.jvm.internal.s.g(navigator, "navigator");
        this.f46130a = navigator;
        this.f46131b = i11;
        this.f46132c = str;
        this.f46134e = new LinkedHashMap();
        this.f46135f = new ArrayList();
        this.f46136g = new LinkedHashMap();
    }

    public D a() {
        D a11 = this.f46130a.a();
        if (d() != null) {
            a11.v(d());
        }
        if (b() != -1) {
            a11.s(b());
        }
        a11.t(c());
        for (Map.Entry<String, g> entry : this.f46134e.entrySet()) {
            a11.b(entry.getKey(), entry.getValue());
        }
        for (n nVar : this.f46135f) {
            a11.e(nVar);
        }
        for (Map.Entry<Integer, f> entry2 : this.f46136g.entrySet()) {
            a11.r(entry2.getKey().intValue(), entry2.getValue());
        }
        return a11;
    }

    public final int b() {
        return this.f46131b;
    }

    public final CharSequence c() {
        return this.f46133d;
    }

    public final String d() {
        return this.f46132c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(b0<? extends D> navigator, String str) {
        this(navigator, -1, str);
        kotlin.jvm.internal.s.g(navigator, "navigator");
    }
}
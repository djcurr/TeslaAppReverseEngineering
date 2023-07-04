package p4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s extends q<r> {

    /* renamed from: h  reason: collision with root package name */
    private final c0 f46146h;

    /* renamed from: i  reason: collision with root package name */
    private int f46147i;

    /* renamed from: j  reason: collision with root package name */
    private String f46148j;

    /* renamed from: k  reason: collision with root package name */
    private final List<p> f46149k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(c0 provider, String startDestination, String str) {
        super(provider.d(t.class), str);
        kotlin.jvm.internal.s.g(provider, "provider");
        kotlin.jvm.internal.s.g(startDestination, "startDestination");
        this.f46149k = new ArrayList();
        this.f46146h = provider;
        this.f46148j = startDestination;
    }

    public final void e(p destination) {
        kotlin.jvm.internal.s.g(destination, "destination");
        this.f46149k.add(destination);
    }

    public r f() {
        r rVar = (r) super.a();
        rVar.y(this.f46149k);
        int i11 = this.f46147i;
        if (i11 == 0 && this.f46148j == null) {
            if (d() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.f46148j;
        if (str != null) {
            kotlin.jvm.internal.s.e(str);
            rVar.I(str);
        } else {
            rVar.H(i11);
        }
        return rVar;
    }

    public final c0 g() {
        return this.f46146h;
    }
}
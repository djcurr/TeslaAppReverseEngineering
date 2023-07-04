package z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final List<l0> f59995a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l0> f59996b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l0> f59997c;

    /* renamed from: d  reason: collision with root package name */
    private final long f59998d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<l0> f59999a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final List<l0> f60000b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        final List<l0> f60001c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        long f60002d = 5000;

        public a(l0 l0Var, int i11) {
            a(l0Var, i11);
        }

        public a a(l0 l0Var, int i11) {
            boolean z11 = false;
            v3.h.b(l0Var != null, "Point cannot be null.");
            if (i11 >= 1 && i11 <= 7) {
                z11 = true;
            }
            v3.h.b(z11, "Invalid metering mode " + i11);
            if ((i11 & 1) != 0) {
                this.f59999a.add(l0Var);
            }
            if ((i11 & 2) != 0) {
                this.f60000b.add(l0Var);
            }
            if ((i11 & 4) != 0) {
                this.f60001c.add(l0Var);
            }
            return this;
        }

        public r b() {
            return new r(this);
        }
    }

    r(a aVar) {
        this.f59995a = Collections.unmodifiableList(aVar.f59999a);
        this.f59996b = Collections.unmodifiableList(aVar.f60000b);
        this.f59997c = Collections.unmodifiableList(aVar.f60001c);
        this.f59998d = aVar.f60002d;
    }

    public long a() {
        return this.f59998d;
    }

    public List<l0> b() {
        return this.f59996b;
    }

    public List<l0> c() {
        return this.f59995a;
    }

    public List<l0> d() {
        return this.f59997c;
    }

    public boolean e() {
        return this.f59998d > 0;
    }
}
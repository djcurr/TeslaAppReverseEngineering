package q4;

import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f47370a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static q<p4.i, c1.i, Integer, b0> f47371b = j1.c.c(-985532828, false, a.f47372a);

    /* loaded from: classes.dex */
    static final class a extends u implements q<p4.i, c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47372a = new a();

        a() {
            super(3);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(p4.i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(p4.i it2, c1.i iVar, int i11) {
            s.g(it2, "it");
        }
    }

    public final q<p4.i, c1.i, Integer, b0> a() {
        return f47371b;
    }
}
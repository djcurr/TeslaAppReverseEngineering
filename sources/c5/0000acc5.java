package q4;

import h00.q;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import p4.b0;
import p4.p;
import p4.w;

@b0.b("composable")
/* loaded from: classes.dex */
public final class d extends b0<b> {

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends p {

        /* renamed from: k  reason: collision with root package name */
        private final q<p4.i, c1.i, Integer, vz.b0> f47376k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d navigator, q<? super p4.i, ? super c1.i, ? super Integer, vz.b0> content) {
            super(navigator);
            s.g(navigator, "navigator");
            s.g(content, "content");
            this.f47376k = content;
        }

        public final q<p4.i, c1.i, Integer, vz.b0> x() {
            return this.f47376k;
        }
    }

    static {
        new a(null);
    }

    @Override // p4.b0
    public void e(List<p4.i> entries, w wVar, b0.a aVar) {
        s.g(entries, "entries");
        for (p4.i iVar : entries) {
            b().j(iVar);
        }
    }

    @Override // p4.b0
    public void j(p4.i popUpTo, boolean z11) {
        s.g(popUpTo, "popUpTo");
        b().h(popUpTo, z11);
    }

    @Override // p4.b0
    /* renamed from: l */
    public b a() {
        return new b(this, q4.b.f47370a.a());
    }

    public final h0<List<p4.i>> m() {
        return b().b();
    }

    public final h0<Set<p4.i>> n() {
        return b().c();
    }

    public final void o(p4.i entry) {
        s.g(entry, "entry");
        b().e(entry);
    }
}
package q4;

import h00.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import p4.b0;
import p4.p;
import p4.w;

@b0.b("dialog")
/* loaded from: classes.dex */
public final class f extends b0<b> {

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    @Override // p4.b0
    public void e(List<p4.i> entries, w wVar, b0.a aVar) {
        s.g(entries, "entries");
        for (p4.i iVar : entries) {
            b().i(iVar);
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
        return new b(this, null, c.f47373a.a(), 2, null);
    }

    public final void m(p4.i backStackEntry) {
        s.g(backStackEntry, "backStackEntry");
        b().g(backStackEntry, false);
    }

    public final h0<List<p4.i>> n() {
        return b().b();
    }

    public final void o(p4.i entry) {
        s.g(entry, "entry");
        b().e(entry);
    }

    /* loaded from: classes.dex */
    public static final class b extends p implements p4.c {

        /* renamed from: k  reason: collision with root package name */
        private final androidx.compose.ui.window.g f47391k;

        /* renamed from: l  reason: collision with root package name */
        private final q<p4.i, c1.i, Integer, vz.b0> f47392l;

        public /* synthetic */ b(f fVar, androidx.compose.ui.window.g gVar, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(fVar, (i11 & 2) != 0 ? new androidx.compose.ui.window.g(false, false, null, 7, null) : gVar, qVar);
        }

        public final q<p4.i, c1.i, Integer, vz.b0> x() {
            return this.f47392l;
        }

        public final androidx.compose.ui.window.g y() {
            return this.f47391k;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(f navigator, androidx.compose.ui.window.g dialogProperties, q<? super p4.i, ? super c1.i, ? super Integer, vz.b0> content) {
            super(navigator);
            s.g(navigator, "navigator");
            s.g(dialogProperties, "dialogProperties");
            s.g(content, "content");
            this.f47391k = dialogProperties;
            this.f47392l = content;
        }
    }
}
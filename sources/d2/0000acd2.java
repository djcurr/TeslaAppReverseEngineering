package q4;

import androidx.lifecycle.p0;
import androidx.lifecycle.u0;
import c1.e1;
import c1.r;
import c1.x0;
import c1.y;
import c1.z;
import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l1.c f47393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<c1.i, Integer, b0> f47394b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f47395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l1.c cVar, p<? super c1.i, ? super Integer, b0> pVar, int i11) {
            super(2);
            this.f47393a = cVar;
            this.f47394b = pVar;
            this.f47395c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                g.b(this.f47393a, this.f47394b, iVar, ((this.f47395c >> 3) & 112) | 8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p4.i f47396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l1.c f47397b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<c1.i, Integer, b0> f47398c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f47399d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p4.i iVar, l1.c cVar, p<? super c1.i, ? super Integer, b0> pVar, int i11) {
            super(2);
            this.f47396a = iVar;
            this.f47397b = cVar;
            this.f47398c = pVar;
            this.f47399d = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            g.a(this.f47396a, this.f47397b, this.f47398c, iVar, this.f47399d | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends u implements l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q4.a f47400a;

        /* loaded from: classes.dex */
        public static final class a implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q4.a f47401a;

            public a(q4.a aVar) {
                this.f47401a = aVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f47401a.h(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q4.a aVar) {
            super(1);
            this.f47400a = aVar;
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            return new a(this.f47400a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l1.c f47402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<c1.i, Integer, b0> f47403b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f47404c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(l1.c cVar, p<? super c1.i, ? super Integer, b0> pVar, int i11) {
            super(2);
            this.f47402a = cVar;
            this.f47403b = pVar;
            this.f47404c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            g.b(this.f47402a, this.f47403b, iVar, this.f47404c | 1);
        }
    }

    public static final void a(p4.i iVar, l1.c saveableStateHolder, p<? super c1.i, ? super Integer, b0> content, c1.i iVar2, int i11) {
        s.g(iVar, "<this>");
        s.g(saveableStateHolder, "saveableStateHolder");
        s.g(content, "content");
        c1.i h11 = iVar2.h(-1206422650);
        r.a(new x0[]{m4.a.f38401a.b(iVar), androidx.compose.ui.platform.z.i().c(iVar), androidx.compose.ui.platform.z.j().c(iVar)}, j1.c.b(h11, -819892566, true, new a(saveableStateHolder, content, i11)), h11, 56);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(iVar, saveableStateHolder, content, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(l1.c cVar, p<? super c1.i, ? super Integer, b0> pVar, c1.i iVar, int i11) {
        c1.i h11 = iVar.h(-417208668);
        h11.x(564614654);
        u0 a11 = m4.a.f38401a.a(h11, 0);
        if (a11 != null) {
            p0 b11 = m4.b.b(q4.a.class, a11, null, null, h11, 4168, 0);
            h11.N();
            q4.a aVar = (q4.a) b11;
            aVar.h(cVar);
            cVar.a(aVar.g(), pVar, h11, (i11 & 112) | 520);
            c1.b0.a(aVar, new c(aVar), h11, 8);
            e1 l11 = h11.l();
            if (l11 == null) {
                return;
            }
            l11.a(new d(cVar, pVar, i11));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
package q4;

import c1.e1;
import c1.n1;
import c1.v1;
import c1.y;
import c1.z;
import h00.l;
import h00.p;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import m1.r;
import q4.f;
import vz.b0;

/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f47377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p4.i f47378b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, p4.i iVar) {
            super(0);
            this.f47377a = fVar;
            this.f47378b = iVar;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo11invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f47377a.m(this.f47378b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p4.i f47379a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l1.c f47380b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f.b f47381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f47382d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends u implements p<c1.i, Integer, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.b f47383a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p4.i f47384b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.b bVar, p4.i iVar) {
                super(2);
                this.f47383a = bVar;
                this.f47384b = iVar;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    this.f47383a.x().invoke(this.f47384b, iVar, 8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q4.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1019b extends u implements l<z, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f47385a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p4.i f47386b;

            /* renamed from: q4.e$b$b$a */
            /* loaded from: classes.dex */
            public static final class a implements y {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f47387a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ p4.i f47388b;

                public a(f fVar, p4.i iVar) {
                    this.f47387a = fVar;
                    this.f47388b = iVar;
                }

                @Override // c1.y
                public void dispose() {
                    this.f47387a.o(this.f47388b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1019b(f fVar, p4.i iVar) {
                super(1);
                this.f47385a = fVar;
                this.f47386b = iVar;
            }

            @Override // h00.l
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final y mo12invoke(z DisposableEffect) {
                s.g(DisposableEffect, "$this$DisposableEffect");
                return new a(this.f47385a, this.f47386b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p4.i iVar, l1.c cVar, f.b bVar, f fVar) {
            super(2);
            this.f47379a = iVar;
            this.f47380b = cVar;
            this.f47381c = bVar;
            this.f47382d = fVar;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            p4.i iVar2 = this.f47379a;
            g.a(iVar2, this.f47380b, j1.c.b(iVar, -819895998, true, new a(this.f47381c, iVar2)), iVar, 456);
            p4.i iVar3 = this.f47379a;
            c1.b0.a(iVar3, new C1019b(this.f47382d, iVar3), iVar, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends u implements p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f47389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f47390b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, int i11) {
            super(2);
            this.f47389a = fVar;
            this.f47390b = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            e.a(this.f47389a, iVar, this.f47390b | 1);
        }
    }

    public static final void a(f dialogNavigator, c1.i iVar, int i11) {
        s.g(dialogNavigator, "dialogNavigator");
        c1.i h11 = iVar.h(875187441);
        if (((((i11 & 14) == 0 ? (h11.O(dialogNavigator) ? 4 : 2) | i11 : i11) & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            l1.c a11 = l1.e.a(h11, 0);
            v1 b11 = n1.b(dialogNavigator.n(), null, h11, 8, 1);
            r<p4.i> l11 = j.l(b(b11), h11, 8);
            j.g(l11, b(b11), h11, 64);
            for (p4.i iVar2 : l11) {
                f.b bVar = (f.b) iVar2.f();
                androidx.compose.ui.window.a.a(new a(dialogNavigator, iVar2), bVar.y(), j1.c.b(h11, -819896195, true, new b(iVar2, a11, bVar, dialogNavigator)), h11, 384, 0);
            }
        }
        e1 l12 = h11.l();
        if (l12 == null) {
            return;
        }
        l12.a(new c(dialogNavigator, i11));
    }

    private static final List<p4.i> b(v1<? extends List<p4.i>> v1Var) {
        return v1Var.getValue();
    }
}
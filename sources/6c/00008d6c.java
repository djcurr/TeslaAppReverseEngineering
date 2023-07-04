package o1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import h00.l;
import h00.p;
import h00.q;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements l<f.c, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f42060a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(f.c it2) {
            s.g(it2, "it");
            return Boolean.valueOf(!(it2 instanceof d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements p<f, f.c, f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c1.i f42061a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c1.i iVar) {
            super(2);
            this.f42061a = iVar;
        }

        @Override // h00.p
        /* renamed from: a */
        public final f invoke(f acc, f.c element) {
            s.g(acc, "acc");
            s.g(element, "element");
            boolean z11 = element instanceof d;
            f.c cVar = element;
            if (z11) {
                cVar = e.c(this.f42061a, (f) ((q) r0.f(((d) element).b(), 3)).invoke(f.f42062f1, this.f42061a, 0));
            }
            return acc.g0(cVar);
        }
    }

    public static final f a(f fVar, l<? super y0, b0> inspectorInfo, q<? super f, ? super c1.i, ? super Integer, ? extends f> factory) {
        s.g(fVar, "<this>");
        s.g(inspectorInfo, "inspectorInfo");
        s.g(factory, "factory");
        return fVar.g0(new d(inspectorInfo, factory));
    }

    public static /* synthetic */ f b(f fVar, l lVar, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = x0.a();
        }
        return a(fVar, lVar, qVar);
    }

    public static final f c(c1.i iVar, f modifier) {
        s.g(iVar, "<this>");
        s.g(modifier, "modifier");
        if (modifier.p(a.f42060a)) {
            return modifier;
        }
        iVar.x(1219399079);
        f fVar = (f) modifier.C(f.f42062f1, new b(iVar));
        iVar.N();
        return fVar;
    }
}
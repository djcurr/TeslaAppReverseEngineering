package y00;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k20.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public class f extends p implements w00.b {
    private static final u10.f L = u10.f.i("<init>");
    protected final boolean K;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w00.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, b.a aVar, w00.n0 n0Var) {
        super(cVar, dVar, gVar, L, aVar, n0Var);
        if (cVar == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (aVar == null) {
            w(2);
        }
        if (n0Var == null) {
            w(3);
        }
        this.K = z11;
    }

    public static f i1(w00.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, w00.n0 n0Var) {
        if (cVar == null) {
            w(4);
        }
        if (gVar == null) {
            w(5);
        }
        if (n0Var == null) {
            w(6);
        }
        return new f(cVar, null, gVar, z11, b.a.DECLARATION, n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void w(int r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.f.w(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean Y() {
        return this.K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public w00.c Z() {
        w00.c b11 = b();
        if (b11 == null) {
            w(16);
        }
        return b11;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            w(19);
        }
        return emptySet;
    }

    public w00.l0 g1() {
        w00.c b11 = b();
        if (b11.j()) {
            w00.i b12 = b11.b();
            if (b12 instanceof w00.c) {
                return ((w00.c) b12).E0();
            }
            return null;
        }
        return null;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: h1 */
    public w00.b z0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, b.a aVar, boolean z11) {
        w00.b bVar = (w00.b) super.z0(iVar, fVar, qVar, aVar, z11);
        if (bVar == null) {
            w(25);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.p
    /* renamed from: j1 */
    public f H0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a aVar, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w00.n0 n0Var) {
        if (iVar == null) {
            w(21);
        }
        if (aVar == null) {
            w(22);
        }
        if (gVar == null) {
            w(23);
        }
        if (n0Var == null) {
            w(24);
        }
        b.a aVar2 = b.a.DECLARATION;
        if (aVar != aVar2 && aVar != b.a.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + iVar + "\nkind: " + aVar);
        }
        return new f((w00.c) iVar, this, gVar, this.K, aVar2, n0Var);
    }

    @Override // y00.k, w00.i
    /* renamed from: k1 */
    public w00.c b() {
        w00.c cVar = (w00.c) super.b();
        if (cVar == null) {
            w(15);
        }
        return cVar;
    }

    public f l1(List<v0> list, w00.q qVar) {
        if (list == null) {
            w(13);
        }
        if (qVar == null) {
            w(14);
        }
        m1(list, qVar, b().o());
        return this;
    }

    public f m1(List<v0> list, w00.q qVar, List<s0> list2) {
        if (list == null) {
            w(10);
        }
        if (qVar == null) {
            w(11);
        }
        if (list2 == null) {
            w(12);
        }
        super.N0(null, g1(), list2, list, null, kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL, qVar);
        return this;
    }

    @Override // y00.p, w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.m(this, d11);
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    public void y0(Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            w(20);
        }
    }

    @Override // y00.p, w00.p0
    public w00.b c(d1 d1Var) {
        if (d1Var == null) {
            w(18);
        }
        return (w00.b) super.c(d1Var);
    }

    @Override // y00.p, y00.k
    /* renamed from: a */
    public w00.b d0() {
        w00.b bVar = (w00.b) super.d0();
        if (bVar == null) {
            w(17);
        }
        return bVar;
    }
}
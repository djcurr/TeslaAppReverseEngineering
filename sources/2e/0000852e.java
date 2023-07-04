package m0;

import c1.e1;
import p0.h0;

/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f37919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<v1.e, vz.b0> f37920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o1.f fVar, h00.l<? super v1.e, vz.b0> lVar, int i11) {
            super(2);
            this.f37919a = fVar;
            this.f37920b = lVar;
            this.f37921c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            g.a(this.f37919a, this.f37920b, iVar, this.f37921c | 1);
        }
    }

    public static final void a(o1.f modifier, h00.l<? super v1.e, vz.b0> onDraw, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(modifier, "modifier");
        kotlin.jvm.internal.s.g(onDraw, "onDraw");
        c1.i h11 = iVar.h(-912324257);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(onDraw) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            h0.a(q1.i.a(modifier, onDraw), h11, 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(modifier, onDraw, i11));
    }
}
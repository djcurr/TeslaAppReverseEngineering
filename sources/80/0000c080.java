package y0;

/* loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f58148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f58148a = pVar;
            this.f58149b = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            j0.a(this.f58148a, iVar, this.f58149b | 1);
        }
    }

    public static final void a(h00.p<? super c1.i, ? super Integer, vz.b0> content, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(content, "content");
        c1.i h11 = iVar.h(-1558451989);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(content) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((2 ^ (i12 & 11)) == 0 && h11.i()) {
            h11.G();
        } else {
            content.invoke(h11, Integer.valueOf(i12 & 14));
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(content, i11));
    }
}
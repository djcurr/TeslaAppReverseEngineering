package s0;

import java.util.List;
import vz.b0;

/* loaded from: classes.dex */
public final class s implements q0.g {

    /* renamed from: a  reason: collision with root package name */
    private final y<h> f49881a;

    /* renamed from: b  reason: collision with root package name */
    private final c<h> f49882b;

    /* renamed from: c  reason: collision with root package name */
    private List<Integer> f49883c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<q0.d, Integer, h00.p<? super c1.i, ? super Integer, ? extends b0>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.r<q0.d, Integer, c1.i, Integer, b0> f49884a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s0.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1093a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.r<q0.d, Integer, c1.i, Integer, b0> f49885a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ q0.d f49886b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f49887c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1093a(h00.r<? super q0.d, ? super Integer, ? super c1.i, ? super Integer, b0> rVar, q0.d dVar, int i11) {
                super(2);
                this.f49885a = rVar;
                this.f49886b = dVar;
                this.f49887c = i11;
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
                    this.f49885a.invoke(this.f49886b, Integer.valueOf(this.f49887c), iVar, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.r<? super q0.d, ? super Integer, ? super c1.i, ? super Integer, b0> rVar) {
            super(2);
            this.f49884a = rVar;
        }

        public final h00.p<c1.i, Integer, b0> a(q0.d $receiver, int i11) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            return j1.c.c(-985533267, true, new C1093a(this.f49884a, $receiver, i11));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ h00.p<? super c1.i, ? super Integer, ? extends b0> invoke(q0.d dVar, Integer num) {
            return a(dVar, num.intValue());
        }
    }

    public s() {
        y<h> yVar = new y<>();
        this.f49881a = yVar;
        this.f49882b = yVar;
    }

    @Override // q0.g
    public void a(int i11, h00.l<? super Integer, ? extends Object> lVar, h00.r<? super q0.d, ? super Integer, ? super c1.i, ? super Integer, b0> itemContent) {
        kotlin.jvm.internal.s.g(itemContent, "itemContent");
        this.f49881a.c(i11, new h(lVar, new a(itemContent)));
    }

    public final List<Integer> b() {
        List<Integer> i11;
        List<Integer> list = this.f49883c;
        if (list == null) {
            i11 = wz.w.i();
            return i11;
        }
        return list;
    }

    public final c<h> c() {
        return this.f49882b;
    }
}
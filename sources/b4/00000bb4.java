package b1;

import t1.a0;
import t1.c0;

/* loaded from: classes.dex */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7257a = a.f7258a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7258a = new a();

        private a() {
        }

        public final f a(long j11, boolean z11) {
            f fVar;
            f fVar2;
            f fVar3;
            if (z11) {
                if (c0.h(j11) > 0.5d) {
                    fVar3 = p.f7260b;
                    return fVar3;
                }
                fVar2 = p.f7261c;
                return fVar2;
            }
            fVar = p.f7262d;
            return fVar;
        }

        public final long b(long j11, boolean z11) {
            return (z11 || ((double) c0.h(j11)) >= 0.5d) ? j11 : a0.f51365b.g();
        }
    }

    long a(c1.i iVar, int i11);

    f b(c1.i iVar, int i11);
}
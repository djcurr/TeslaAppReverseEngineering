package s0;

import f2.m0;
import java.util.ArrayList;
import java.util.List;
import p0.a;
import vz.b0;

/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f49853a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a invoke) {
            kotlin.jvm.internal.s.g(invoke, "$this$invoke");
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<m0.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<r> f49854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f49855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<r> list, r rVar) {
            super(1);
            this.f49854a = list;
            this.f49855b = rVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a invoke) {
            kotlin.jvm.internal.s.g(invoke, "$this$invoke");
            List<r> list = this.f49854a;
            r rVar = this.f49855b;
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                r rVar2 = list.get(i11);
                if (rVar2 != rVar) {
                    rVar2.l(invoke);
                }
                i11 = i12;
            }
            r rVar3 = this.f49855b;
            if (rVar3 == null) {
                return;
            }
            rVar3.l(invoke);
        }
    }

    private static final List<r> a(List<u> list, int i11, int i12, int i13, int i14, int i15, boolean z11, a.k kVar, a.d dVar, boolean z12, x2.d dVar2, x2.q qVar) {
        int i16 = z11 ? i12 : i11;
        boolean z13 = i13 < Math.min(i16, i14);
        if (z13) {
            if (!(i15 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (z13) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = list.get(!z12 ? i17 : (size - i17) - 1).d();
            }
            int[] iArr2 = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr2[i18] = 0;
            }
            if (z11) {
                if (kVar != null) {
                    kVar.b(dVar2, i16, iArr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (dVar != null) {
                dVar.c(dVar2, i16, iArr, qVar, iArr2);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            int i19 = 0;
            int i21 = 0;
            while (i19 < size) {
                int i22 = iArr2[i19];
                i19++;
                int i23 = i21 + 1;
                if (z12) {
                    i21 = (size - i21) - 1;
                }
                u uVar = list.get(i21);
                if (z12) {
                    i22 = (i16 - i22) - uVar.d();
                }
                arrayList.add(z12 ? 0 : arrayList.size(), uVar.f(i22, i11, i12));
                i21 = i23;
            }
        } else {
            int size2 = list.size();
            int i24 = i15;
            for (int i25 = 0; i25 < size2; i25++) {
                u uVar2 = list.get(i25);
                arrayList.add(uVar2.f(i24, i11, i12));
                i24 += uVar2.e();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final s0.p b(int r23, s0.v r24, int r25, int r26, int r27, int r28, int r29, float r30, long r31, boolean r33, java.util.List<java.lang.Integer> r34, p0.a.k r35, p0.a.d r36, boolean r37, x2.d r38, x2.q r39, s0.i r40, h00.q<? super java.lang.Integer, ? super java.lang.Integer, ? super h00.l<? super f2.m0.a, vz.b0>, ? extends f2.a0> r41) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.o.b(int, s0.v, int, int, int, int, int, float, long, boolean, java.util.List, p0.a$k, p0.a$d, boolean, x2.d, x2.q, s0.i, h00.q):s0.p");
    }
}
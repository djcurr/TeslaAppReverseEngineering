package c1;

import androidx.compose.runtime.ProvidedValue;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProvidedValue<?>[] f8674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<i, Integer, vz.b0> f8675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8676c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ProvidedValue<?>[] providedValueArr, h00.p<? super i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f8674a = providedValueArr;
            this.f8675b = pVar;
            this.f8676c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            ProvidedValue<?>[] providedValueArr = this.f8674a;
            r.a((x0[]) Arrays.copyOf(providedValueArr, providedValueArr.length), this.f8675b, iVar, this.f8676c | 1);
        }
    }

    public static final void a(ProvidedValue<?>[] values, h00.p<? super i, ? super Integer, vz.b0> content, i iVar, int i11) {
        kotlin.jvm.internal.s.g(values, "values");
        kotlin.jvm.internal.s.g(content, "content");
        i h11 = iVar.h(-1460639761);
        h11.H(values);
        content.invoke(h11, Integer.valueOf((i11 >> 3) & 14));
        h11.I();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(values, content, i11));
    }

    public static final <T> w0<T> b(m1<T> policy, h00.a<? extends T> defaultFactory) {
        kotlin.jvm.internal.s.g(policy, "policy");
        kotlin.jvm.internal.s.g(defaultFactory, "defaultFactory");
        return new a0(policy, defaultFactory);
    }

    public static /* synthetic */ w0 c(m1 m1Var, h00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            m1Var = n1.o();
        }
        return b(m1Var, aVar);
    }

    public static final <T> w0<T> d(h00.a<? extends T> defaultFactory) {
        kotlin.jvm.internal.s.g(defaultFactory, "defaultFactory");
        return new w1(defaultFactory);
    }
}
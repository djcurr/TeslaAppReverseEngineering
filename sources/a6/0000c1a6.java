package y20;

import kotlinx.coroutines.internal.d0;
import v20.a2;
import zz.g;

/* loaded from: classes5.dex */
public final class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<Integer, g.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r<?> f59064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r<?> rVar) {
            super(2);
            this.f59064a = rVar;
        }

        public final Integer a(int i11, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f59064a.f59057b.get(key);
            if (key != a2.f53887l1) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i11 + 1);
            }
            a2 a2Var = (a2) bVar2;
            a2 b11 = t.b((a2) bVar, a2Var);
            if (b11 == a2Var) {
                if (a2Var != null) {
                    i11++;
                }
                return Integer.valueOf(i11);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b11 + ", expected child of " + a2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(r<?> rVar, zz.g gVar) {
        if (((Number) gVar.fold(0, new a(rVar))).intValue() == rVar.f59058c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + rVar.f59057b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final a2 b(a2 a2Var, a2 a2Var2) {
        while (a2Var != null) {
            if (a2Var == a2Var2 || !(a2Var instanceof d0)) {
                return a2Var;
            }
            a2Var = ((d0) a2Var).a1();
        }
        return null;
    }
}
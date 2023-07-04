package k20;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class b0 extends b1 {

    /* renamed from: b  reason: collision with root package name */
    private final w00.s0[] f34219b;

    /* renamed from: c  reason: collision with root package name */
    private final y0[] f34220c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34221d;

    public /* synthetic */ b0(w00.s0[] s0VarArr, y0[] y0VarArr, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0VarArr, y0VarArr, (i11 & 4) != 0 ? false : z11);
    }

    @Override // k20.b1
    public boolean b() {
        return this.f34221d;
    }

    @Override // k20.b1
    public y0 e(d0 key) {
        kotlin.jvm.internal.s.g(key, "key");
        w00.e n11 = key.H0().n();
        w00.s0 s0Var = n11 instanceof w00.s0 ? (w00.s0) n11 : null;
        if (s0Var == null) {
            return null;
        }
        int index = s0Var.getIndex();
        w00.s0[] s0VarArr = this.f34219b;
        if (index >= s0VarArr.length || !kotlin.jvm.internal.s.c(s0VarArr[index].i(), s0Var.i())) {
            return null;
        }
        return this.f34220c[index];
    }

    @Override // k20.b1
    public boolean f() {
        return this.f34220c.length == 0;
    }

    public final y0[] i() {
        return this.f34220c;
    }

    public final w00.s0[] j() {
        return this.f34219b;
    }

    public b0(w00.s0[] parameters, y0[] arguments, boolean z11) {
        kotlin.jvm.internal.s.g(parameters, "parameters");
        kotlin.jvm.internal.s.g(arguments, "arguments");
        this.f34219b = parameters;
        this.f34220c = arguments;
        this.f34221d = z11;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b0(java.util.List<? extends w00.s0> r9, java.util.List<? extends k20.y0> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "argumentsList"
            kotlin.jvm.internal.s.g(r10, r0)
            r0 = 0
            w00.s0[] r1 = new w00.s0[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r9, r1)
            r3 = r9
            w00.s0[] r3 = (w00.s0[]) r3
            k20.y0[] r9 = new k20.y0[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            java.util.Objects.requireNonNull(r9, r1)
            r4 = r9
            k20.y0[] r4 = (k20.y0[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k20.b0.<init>(java.util.List, java.util.List):void");
    }
}
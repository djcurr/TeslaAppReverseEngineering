package pr;

import java.util.Map;

/* loaded from: classes2.dex */
public final class q implements v {

    /* renamed from: b  reason: collision with root package name */
    private final Map<n00.d<?>, u<?>> f46890b;

    /* JADX WARN: Multi-variable type inference failed */
    private q(Map<n00.d<?>, ? extends u<?>> map) {
        this.f46890b = map;
    }

    @Override // pr.v
    public <RenderingT> u<RenderingT> a(n00.d<? extends RenderingT> renderingType) {
        kotlin.jvm.internal.s.g(renderingType, "renderingType");
        u<?> uVar = this.f46890b.get(renderingType);
        if (uVar instanceof u) {
            return (u<RenderingT>) uVar;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(com.squareup.workflow1.ui.ViewFactory<?>... r7) {
        /*
            r6 = this;
            java.lang.String r0 = "bindings"
            kotlin.jvm.internal.s.g(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L20
            r4 = r7[r3]
            n00.d r5 = r4.getType()
            vz.p r4 = vz.v.a(r5, r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto Le
        L20:
            java.util.Map r0 = wz.p0.t(r0)
            java.util.Set r1 = r0.keySet()
            int r1 = r1.size()
            int r3 = r7.length
            if (r1 != r3) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 != 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r7.length
            r1.<init>(r3)
            int r3 = r7.length
        L40:
            if (r2 >= r3) goto L4e
            r4 = r7[r2]
            n00.d r4 = r4.getType()
            r1.add(r4)
            int r2 = r2 + 1
            goto L40
        L4e:
            r0.append(r1)
            java.lang.String r7 = " must not have duplicate entries."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L64:
            vz.b0 r7 = vz.b0.f54756a
            r6.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pr.q.<init>(pr.u[]):void");
    }
}
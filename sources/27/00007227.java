package h2;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final k f28757a;

    /* renamed from: b  reason: collision with root package name */
    private final c f28758b;

    /* renamed from: c  reason: collision with root package name */
    private final List<k> f28759c;

    public p(k root, c relayoutNodes, List<k> postponedMeasureRequests) {
        kotlin.jvm.internal.s.g(root, "root");
        kotlin.jvm.internal.s.g(relayoutNodes, "relayoutNodes");
        kotlin.jvm.internal.s.g(postponedMeasureRequests, "postponedMeasureRequests");
        this.f28757a = root;
        this.f28758b = relayoutNodes;
        this.f28759c = postponedMeasureRequests;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r0 != null && r0.e()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean b(h2.k r7) {
        /*
            r6 = this;
            h2.k r0 = r7.e0()
            boolean r1 = r7.e()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L22
            int r1 = r7.f0()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r4) goto L6f
            if (r0 != 0) goto L19
        L17:
            r1 = r2
            goto L20
        L19:
            boolean r1 = r0.e()
            if (r1 != r3) goto L17
            r1 = r3
        L20:
            if (r1 == 0) goto L6f
        L22:
            h2.k$e r1 = r7.R()
            h2.k$e r4 = h2.k.e.NeedsRemeasure
            if (r1 != r4) goto L33
            java.util.List<h2.k> r1 = r6.f28759c
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L33
            return r3
        L33:
            if (r0 != 0) goto L37
            r0 = 0
            goto L3b
        L37:
            h2.k$e r0 = r0.R()
        L3b:
            h2.k$e r1 = r7.R()
            if (r1 != r4) goto L51
            h2.c r1 = r6.f28758b
            boolean r7 = r1.b(r7)
            if (r7 != 0) goto L4f
            if (r0 == r4) goto L4f
            h2.k$e r7 = h2.k.e.Measuring
            if (r0 != r7) goto L50
        L4f:
            r2 = r3
        L50:
            return r2
        L51:
            h2.k$e r1 = r7.R()
            h2.k$e r5 = h2.k.e.NeedsRelayout
            if (r1 != r5) goto L6f
            h2.c r1 = r6.f28758b
            boolean r7 = r1.b(r7)
            if (r7 != 0) goto L6d
            if (r0 == r4) goto L6d
            if (r0 == r5) goto L6d
            h2.k$e r7 = h2.k.e.Measuring
            if (r0 == r7) goto L6d
            h2.k$e r7 = h2.k.e.LayingOut
            if (r0 != r7) goto L6e
        L6d:
            r2 = r3
        L6e:
            return r2
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.p.b(h2.k):boolean");
    }

    private final boolean c(k kVar) {
        if (b(kVar)) {
            List<k> J = kVar.J();
            int size = J.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                if (!c(J.get(i11))) {
                    return false;
                }
                i11 = i12;
            }
            return true;
        }
        return false;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        kotlin.jvm.internal.s.f(sb2, "append(value)");
        sb2.append('\n');
        kotlin.jvm.internal.s.f(sb2, "append('\\n')");
        e(this, sb2, this.f28757a, 0);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "stringBuilder.toString()");
        return sb3;
    }

    private static final void e(p pVar, StringBuilder sb2, k kVar, int i11) {
        String f11 = pVar.f(kVar);
        if (f11.length() > 0) {
            int i12 = 0;
            while (i12 < i11) {
                i12++;
                sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            }
            sb2.append(f11);
            kotlin.jvm.internal.s.f(sb2, "append(value)");
            sb2.append('\n');
            kotlin.jvm.internal.s.f(sb2, "append('\\n')");
            i11++;
        }
        List<k> J = kVar.J();
        int size = J.size();
        for (int i13 = 0; i13 < size; i13++) {
            e(pVar, sb2, J.get(i13), i11);
        }
    }

    private final String f(k kVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(kVar.R());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!kVar.e()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + kVar.Y() + ']');
        if (!b(kVar)) {
            sb2.append("[INCONSISTENT]");
        }
        String sb4 = sb2.toString();
        kotlin.jvm.internal.s.f(sb4, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb4;
    }

    public final void a() {
        if (!c(this.f28757a)) {
            System.out.println((Object) d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
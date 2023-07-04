package b10;

import b10.f;
import b10.t;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.List;
import w00.z0;

/* loaded from: classes5.dex */
public abstract class r extends n implements f, t, l10.q {
    @Override // l10.d
    public boolean C() {
        return f.a.c(this);
    }

    @Override // b10.t
    public int G() {
        return S().getModifiers();
    }

    @Override // l10.d
    /* renamed from: P */
    public c l(u10.c cVar) {
        return f.a.a(this, cVar);
    }

    @Override // l10.d
    /* renamed from: Q */
    public List<c> getAnnotations() {
        return f.a.b(this);
    }

    @Override // l10.q
    /* renamed from: R */
    public j O() {
        Class<?> declaringClass = S().getDeclaringClass();
        kotlin.jvm.internal.s.f(declaringClass, "member.declaringClass");
        return new j(declaringClass);
    }

    public abstract Member S();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:9:0x002b->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[EDGE_INSN: B:27:0x00a1->B:25:0x00a1 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<l10.b0> T(java.lang.reflect.Type[] r12, java.lang.annotation.Annotation[][] r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "parameterAnnotations"
            kotlin.jvm.internal.s.g(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            b10.a r1 = b10.a.f7284a
            java.lang.reflect.Member r2 = r11.S()
            java.util.List r1 = r1.b(r2)
            r2 = 0
            if (r1 != 0) goto L1f
            r3 = r2
            goto L25
        L1f:
            int r3 = r1.size()
            int r4 = r12.length
            int r3 = r3 - r4
        L25:
            int r4 = r12.length
            int r4 = r4 + (-1)
            if (r4 < 0) goto La1
            r5 = r2
        L2b:
            int r6 = r5 + 1
            b10.w$a r7 = b10.w.f7324a
            r8 = r12[r5]
            b10.w r7 = r7.a(r8)
            if (r1 != 0) goto L39
            r8 = 0
            goto L43
        L39:
            int r8 = r5 + r3
            java.lang.Object r8 = wz.u.e0(r1, r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L5d
        L43:
            if (r14 == 0) goto L4d
            int r9 = wz.l.L(r12)
            if (r5 != r9) goto L4d
            r9 = 1
            goto L4e
        L4d:
            r9 = r2
        L4e:
            b10.y r10 = new b10.y
            r5 = r13[r5]
            r10.<init>(r7, r5, r8, r9)
            r0.add(r10)
            if (r6 <= r4) goto L5b
            goto La1
        L5b:
            r5 = r6
            goto L2b
        L5d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "No parameter with index "
            r12.append(r13)
            r12.append(r5)
            r13 = 43
            r12.append(r13)
            r12.append(r3)
            java.lang.String r13 = " (name="
            r12.append(r13)
            u10.f r13 = r11.getName()
            r12.append(r13)
            java.lang.String r13 = " type="
            r12.append(r13)
            r12.append(r7)
            java.lang.String r13 = ") in "
            r12.append(r13)
            r12.append(r1)
            java.lang.String r13 = "@ReflectJavaMember"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b10.r.T(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && kotlin.jvm.internal.s.c(S(), ((r) obj).S());
    }

    @Override // b10.f
    public AnnotatedElement getElement() {
        return (AnnotatedElement) S();
    }

    @Override // l10.t
    public u10.f getName() {
        String name = S().getName();
        u10.f f11 = name == null ? null : u10.f.f(name);
        if (f11 == null) {
            u10.f NO_NAME_PROVIDED = u10.h.f53000a;
            kotlin.jvm.internal.s.f(NO_NAME_PROVIDED, "NO_NAME_PROVIDED");
            return NO_NAME_PROVIDED;
        }
        return f11;
    }

    @Override // l10.s
    public z0 getVisibility() {
        return t.a.a(this);
    }

    public int hashCode() {
        return S().hashCode();
    }

    @Override // l10.s
    public boolean isAbstract() {
        return t.a.b(this);
    }

    @Override // l10.s
    public boolean isFinal() {
        return t.a.c(this);
    }

    @Override // l10.s
    public boolean k() {
        return t.a.d(this);
    }

    public String toString() {
        return getClass().getName() + ": " + S();
    }
}
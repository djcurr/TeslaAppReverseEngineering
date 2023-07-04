package n10;

import ch.qos.logback.core.CoreConstants;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import w00.o0;

/* loaded from: classes5.dex */
public final class i implements i20.f {

    /* renamed from: b  reason: collision with root package name */
    private final b20.d f40204b;

    /* renamed from: c  reason: collision with root package name */
    private final b20.d f40205c;

    /* renamed from: d  reason: collision with root package name */
    private final o f40206d;

    public i(b20.d className, b20.d dVar, p10.l packageProto, r10.c nameResolver, g20.s<t10.e> sVar, boolean z11, i20.e abiStability, o oVar) {
        kotlin.jvm.internal.s.g(className, "className");
        kotlin.jvm.internal.s.g(packageProto, "packageProto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.s.g(abiStability, "abiStability");
        this.f40204b = className;
        this.f40205c = dVar;
        this.f40206d = oVar;
        h.f<p10.l, Integer> packageModuleName = s10.a.f49985m;
        kotlin.jvm.internal.s.f(packageModuleName, "packageModuleName");
        Integer num = (Integer) r10.e.a(packageProto, packageModuleName);
        if (num == null) {
            return;
        }
        nameResolver.getString(num.intValue());
    }

    @Override // i20.f
    public String a() {
        return "Class '" + d().b().b() + CoreConstants.SINGLE_QUOTE_CHAR;
    }

    @Override // w00.n0
    public o0 b() {
        o0 NO_SOURCE_FILE = o0.f55304a;
        kotlin.jvm.internal.s.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final u10.b d() {
        return new u10.b(this.f40204b.g(), g());
    }

    public final b20.d e() {
        return this.f40205c;
    }

    public final o f() {
        return this.f40206d;
    }

    public final u10.f g() {
        String S0;
        String f11 = this.f40204b.f();
        kotlin.jvm.internal.s.f(f11, "className.internalName");
        S0 = kotlin.text.w.S0(f11, '/', null, 2, null);
        u10.f f12 = u10.f.f(S0);
        kotlin.jvm.internal.s.f(f12, "identifier(className.int….substringAfterLast('/'))");
        return f12;
    }

    public String toString() {
        return ((Object) i.class.getSimpleName()) + ": " + this.f40204b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(n10.o r11, p10.l r12, r10.c r13, g20.s<t10.e> r14, boolean r15, i20.e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            kotlin.jvm.internal.s.g(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            kotlin.jvm.internal.s.g(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.s.g(r8, r0)
            u10.b r0 = r11.j()
            b20.d r2 = b20.d.b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            kotlin.jvm.internal.s.f(r2, r0)
            o10.a r0 = r11.a()
            java.lang.String r0 = r0.e()
            r1 = 0
            if (r0 != 0) goto L33
        L31:
            r3 = r1
            goto L43
        L33:
            int r3 = r0.length()
            if (r3 <= 0) goto L3b
            r3 = 1
            goto L3c
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L31
            b20.d r1 = b20.d.d(r0)
            goto L31
        L43:
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.i.<init>(n10.o, p10.l, r10.c, g20.s, boolean, i20.e):void");
    }
}
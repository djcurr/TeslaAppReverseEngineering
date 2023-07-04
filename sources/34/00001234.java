package coil.util;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
/* loaded from: classes.dex */
public final class Lifecycles {

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "observeStarted")
    /* renamed from: coil.util.-Lifecycles$a */
    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f9317a;

        /* renamed from: b  reason: collision with root package name */
        int f9318b;

        /* renamed from: c  reason: collision with root package name */
        Object f9319c;

        /* renamed from: d  reason: collision with root package name */
        Object f9320d;

        a(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9317a = obj;
            this.f9318b |= Integer.MIN_VALUE;
            return Lifecycles.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$observeStarted$2$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.p r6, zz.d<? super vz.b0> r7) {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles.a
            if (r0 == 0) goto L13
            r0 = r7
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.a) r0
            int r1 = r0.f9318b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9318b = r1
            goto L18
        L13:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9317a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f9318b
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f9320d
            kotlin.jvm.internal.l0 r6 = (kotlin.jvm.internal.l0) r6
            java.lang.Object r0 = r0.f9319c
            androidx.lifecycle.p r0 = (androidx.lifecycle.p) r0
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L79
        L31:
            r7 = move-exception
            goto L8a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            vz.r.b(r7)
            kotlin.jvm.internal.l0 r7 = new kotlin.jvm.internal.l0
            r7.<init>()
            r2 = 0
            r7.f34916a = r2
            r0.f9319c = r6     // Catch: java.lang.Throwable -> L85
            r0.f9320d = r7     // Catch: java.lang.Throwable -> L85
            r0.f9318b = r3     // Catch: java.lang.Throwable -> L85
            v20.p r2 = new v20.p     // Catch: java.lang.Throwable -> L85
            zz.d r4 = a00.b.c(r0)     // Catch: java.lang.Throwable -> L85
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L85
            r2.y()     // Catch: java.lang.Throwable -> L85
            coil.util.-Lifecycles$observeStarted$2$1 r3 = new coil.util.-Lifecycles$observeStarted$2$1     // Catch: java.lang.Throwable -> L85
            r3.<init>()     // Catch: java.lang.Throwable -> L85
            r7.f34916a = r3     // Catch: java.lang.Throwable -> L85
            androidx.lifecycle.u r3 = (androidx.lifecycle.u) r3     // Catch: java.lang.Throwable -> L85
            kotlin.jvm.internal.s.e(r3)     // Catch: java.lang.Throwable -> L85
            r6.a(r3)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r2 = r2.s()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r3 = a00.b.d()     // Catch: java.lang.Throwable -> L85
            if (r2 != r3) goto L74
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L85
        L74:
            if (r2 != r1) goto L77
            return r1
        L77:
            r0 = r6
            r6 = r7
        L79:
            T r6 = r6.f34916a
            androidx.lifecycle.u r6 = (androidx.lifecycle.u) r6
            if (r6 == 0) goto L82
            r0.c(r6)
        L82:
            vz.b0 r6 = vz.b0.f54756a
            return r6
        L85:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L8a:
            T r6 = r6.f34916a
            androidx.lifecycle.u r6 = (androidx.lifecycle.u) r6
            if (r6 == 0) goto L93
            r0.c(r6)
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.a(androidx.lifecycle.p, zz.d):java.lang.Object");
    }
}
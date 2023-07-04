package androidx.lifecycle;

import v20.a2;
import v20.e1;
import v20.y2;

/* loaded from: classes.dex */
public final class f<T> extends d0<T> {

    /* renamed from: b  reason: collision with root package name */
    private c<T> f5132b;

    /* renamed from: c  reason: collision with root package name */
    private i f5133c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f<T> f5134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar) {
            super(0);
            this.f5134a = fVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((f) this.f5134a).f5132b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {234}, m = "clearSource$lifecycle_livedata_ktx_release")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f5135a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f5136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f5137c;

        /* renamed from: d  reason: collision with root package name */
        int f5138d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar, zz.d<? super b> dVar) {
            super(dVar);
            this.f5137c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5136b = obj;
            this.f5138d |= Integer.MIN_VALUE;
            return this.f5137c.e(this);
        }
    }

    public f(zz.g context, long j11, h00.p<? super b0<T>, ? super zz.d<? super vz.b0>, ? extends Object> block) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(block, "block");
        this.f5132b = new c<>(this, block, j11, v20.p0.a(e1.c().R0().plus(context).plus(y2.a((a2) context.get(a2.f53887l1)))), new a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(zz.d<? super vz.b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.f.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.f$b r0 = (androidx.lifecycle.f.b) r0
            int r1 = r0.f5138d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5138d = r1
            goto L18
        L13:
            androidx.lifecycle.f$b r0 = new androidx.lifecycle.f$b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5136b
            a00.b.d()
            int r1 = r0.f5138d
            if (r1 == 0) goto L34
            r2 = 1
            if (r1 != r2) goto L2c
            java.lang.Object r0 = r0.f5135a
            androidx.lifecycle.f r0 = (androidx.lifecycle.f) r0
            vz.r.b(r5)
            goto L38
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            vz.r.b(r5)
            r0 = r4
        L38:
            r5 = 0
            r0.f5133c = r5
            vz.b0 r5 = vz.b0.f54756a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f.e(zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.d0, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        c<T> cVar = this.f5132b;
        if (cVar == null) {
            return;
        }
        cVar.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.d0, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        c<T> cVar = this.f5132b;
        if (cVar == null) {
            return;
        }
        cVar.g();
    }
}
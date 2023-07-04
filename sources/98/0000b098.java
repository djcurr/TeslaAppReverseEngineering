package retrofit2;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import vz.b0;
import vz.q;

/* loaded from: classes4.dex */
public final class l {

    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Throwable, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ retrofit2.b f49403a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(retrofit2.b bVar) {
            super(1);
            this.f49403a = bVar;
        }

        public final void a(Throwable th2) {
            this.f49403a.cancel();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            a(th2);
            return b0.f54756a;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Throwable, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ retrofit2.b f49404a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(retrofit2.b bVar) {
            super(1);
            this.f49404a = bVar;
        }

        public final void a(Throwable th2) {
            this.f49404a.cancel();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            a(th2);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    public static final class c<T> implements retrofit2.d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v20.o f49405a;

        c(v20.o oVar) {
            this.f49405a = oVar;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b<T> call, Throwable t11) {
            kotlin.jvm.internal.s.h(call, "call");
            kotlin.jvm.internal.s.h(t11, "t");
            v20.o oVar = this.f49405a;
            q.a aVar = vz.q.f54772b;
            oVar.resumeWith(vz.q.b(vz.r.a(t11)));
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b<T> call, s<T> response) {
            kotlin.jvm.internal.s.h(call, "call");
            kotlin.jvm.internal.s.h(response, "response");
            if (response.f()) {
                T a11 = response.a();
                if (a11 == null) {
                    Object tag = call.request().tag(k.class);
                    if (tag == null) {
                        kotlin.jvm.internal.s.r();
                    }
                    kotlin.jvm.internal.s.d(tag, "call.request().tag(Invocation::class.java)!!");
                    Method method = ((k) tag).a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    kotlin.jvm.internal.s.d(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    kotlin.jvm.internal.s.d(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append(CoreConstants.DOT);
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
                    v20.o oVar = this.f49405a;
                    q.a aVar = vz.q.f54772b;
                    oVar.resumeWith(vz.q.b(vz.r.a(kotlinNullPointerException)));
                    return;
                }
                v20.o oVar2 = this.f49405a;
                q.a aVar2 = vz.q.f54772b;
                oVar2.resumeWith(vz.q.b(a11));
                return;
            }
            v20.o oVar3 = this.f49405a;
            HttpException httpException = new HttpException(response);
            q.a aVar3 = vz.q.f54772b;
            oVar3.resumeWith(vz.q.b(vz.r.a(httpException)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    public static final class d<T> implements retrofit2.d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v20.o f49406a;

        d(v20.o oVar) {
            this.f49406a = oVar;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b<T> call, Throwable t11) {
            kotlin.jvm.internal.s.h(call, "call");
            kotlin.jvm.internal.s.h(t11, "t");
            v20.o oVar = this.f49406a;
            q.a aVar = vz.q.f54772b;
            oVar.resumeWith(vz.q.b(vz.r.a(t11)));
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b<T> call, s<T> response) {
            kotlin.jvm.internal.s.h(call, "call");
            kotlin.jvm.internal.s.h(response, "response");
            if (response.f()) {
                v20.o oVar = this.f49406a;
                T a11 = response.a();
                q.a aVar = vz.q.f54772b;
                oVar.resumeWith(vz.q.b(a11));
                return;
            }
            v20.o oVar2 = this.f49406a;
            HttpException httpException = new HttpException(response);
            q.a aVar2 = vz.q.f54772b;
            oVar2.resumeWith(vz.q.b(vz.r.a(httpException)));
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.l<Throwable, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ retrofit2.b f49407a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(retrofit2.b bVar) {
            super(1);
            this.f49407a = bVar;
        }

        public final void a(Throwable th2) {
            this.f49407a.cancel();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            a(th2);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    public static final class f<T> implements retrofit2.d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v20.o f49408a;

        f(v20.o oVar) {
            this.f49408a = oVar;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b<T> call, Throwable t11) {
            kotlin.jvm.internal.s.h(call, "call");
            kotlin.jvm.internal.s.h(t11, "t");
            v20.o oVar = this.f49408a;
            q.a aVar = vz.q.f54772b;
            oVar.resumeWith(vz.q.b(vz.r.a(t11)));
        }

        @Override // retrofit2.d
        public void onResponse(retrofit2.b<T> call, s<T> response) {
            kotlin.jvm.internal.s.h(call, "call");
            kotlin.jvm.internal.s.h(response, "response");
            v20.o oVar = this.f49408a;
            q.a aVar = vz.q.f54772b;
            oVar.resumeWith(vz.q.b(response));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ zz.d f49409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Exception f49410b;

        g(zz.d dVar, Exception exc) {
            this.f49409a = dVar;
            this.f49410b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zz.d c11;
            c11 = a00.c.c(this.f49409a);
            Exception exc = this.f49410b;
            q.a aVar = vz.q.f54772b;
            c11.resumeWith(vz.q.b(vz.r.a(exc)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f49411a;

        /* renamed from: b  reason: collision with root package name */
        int f49412b;

        /* renamed from: c  reason: collision with root package name */
        Object f49413c;

        h(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49411a = obj;
            this.f49412b |= Integer.MIN_VALUE;
            return l.d(null, this);
        }
    }

    public static final <T> Object a(retrofit2.b<T> bVar, zz.d<? super T> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.T(new a(bVar));
        bVar.enqueue(new c(pVar));
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    public static final <T> Object b(retrofit2.b<T> bVar, zz.d<? super T> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.T(new b(bVar));
        bVar.enqueue(new d(pVar));
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    public static final <T> Object c(retrofit2.b<T> bVar, zz.d<? super s<T>> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.T(new e(bVar));
        bVar.enqueue(new f(pVar));
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(java.lang.Exception r4, zz.d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.l.h
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.l$h r0 = (retrofit2.l.h) r0
            int r1 = r0.f49412b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49412b = r1
            goto L18
        L13:
            retrofit2.l$h r0 = new retrofit2.l$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f49411a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f49412b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f49413c
            java.lang.Exception r4 = (java.lang.Exception) r4
            vz.r.b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            vz.r.b(r5)
            r0.f49413c = r4
            r0.f49412b = r3
            v20.j0 r5 = v20.e1.a()
            zz.g r2 = r0.getContext()
            retrofit2.l$g r3 = new retrofit2.l$g
            r3.<init>(r0, r4)
            r5.I0(r2, r3)
            java.lang.Object r4 = a00.b.d()
            java.lang.Object r5 = a00.b.d()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            vz.b0 r4 = vz.b0.f54756a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.l.d(java.lang.Exception, zz.d):java.lang.Object");
    }
}
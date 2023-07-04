package com.plaid.internal;

import com.plaid.internal.f7;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class b2<S, E> implements retrofit2.b<f7<? extends S, ? extends E>> {

    /* renamed from: a  reason: collision with root package name */
    public final retrofit2.b<S> f18188a;

    /* renamed from: b  reason: collision with root package name */
    public final retrofit2.f<ResponseBody, E> f18189b;

    /* loaded from: classes2.dex */
    public static final class a implements retrofit2.d<S> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ retrofit2.d<f7<S, E>> f18190a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b2<S, E> f18191b;

        public a(retrofit2.d<f7<S, E>> dVar, b2<S, E> b2Var) {
            this.f18190a = dVar;
            this.f18191b = b2Var;
        }

        @Override // retrofit2.d
        public void onFailure(retrofit2.b<S> call, Throwable throwable) {
            kotlin.jvm.internal.s.g(call, "call");
            kotlin.jvm.internal.s.g(throwable, "throwable");
            this.f18190a.onResponse(this.f18191b, retrofit2.s.h(throwable instanceof IOException ? new f7.b((IOException) throwable) : new f7.d(throwable)));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
        @Override // retrofit2.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onResponse(retrofit2.b<S> r6, retrofit2.s<S> r7) {
            /*
                r5 = this;
                java.lang.String r0 = "call"
                kotlin.jvm.internal.s.g(r6, r0)
                java.lang.String r6 = "response"
                kotlin.jvm.internal.s.g(r7, r6)
                java.lang.Object r6 = r7.a()
                int r0 = r7.b()
                okhttp3.ResponseBody r1 = r7.d()
                boolean r7 = r7.f()
                r2 = 0
                if (r7 == 0) goto L41
                if (r6 == 0) goto L30
                retrofit2.d<com.plaid.internal.f7<S, E>> r7 = r5.f18190a
                com.plaid.internal.b2<S, E> r0 = r5.f18191b
                com.plaid.internal.f7$c r1 = new com.plaid.internal.f7$c
                r1.<init>(r6)
                retrofit2.s r6 = retrofit2.s.h(r1)
                r7.onResponse(r0, r6)
                goto L7c
            L30:
                retrofit2.d<com.plaid.internal.f7<S, E>> r6 = r5.f18190a
                com.plaid.internal.b2<S, E> r7 = r5.f18191b
                com.plaid.internal.f7$d r0 = new com.plaid.internal.f7$d
                r0.<init>(r2)
                retrofit2.s r0 = retrofit2.s.h(r0)
                r6.onResponse(r7, r0)
                goto L7c
            L41:
                if (r1 != 0) goto L44
                goto L58
            L44:
                long r6 = r1.contentLength()
                r3 = 0
                int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r6 != 0) goto L4f
                goto L58
            L4f:
                com.plaid.internal.b2<S, E> r6 = r5.f18191b     // Catch: java.lang.Exception -> L58
                retrofit2.f<okhttp3.ResponseBody, E> r6 = r6.f18189b     // Catch: java.lang.Exception -> L58
                java.lang.Object r6 = r6.convert(r1)     // Catch: java.lang.Exception -> L58
                goto L59
            L58:
                r6 = r2
            L59:
                if (r6 == 0) goto L6c
                retrofit2.d<com.plaid.internal.f7<S, E>> r7 = r5.f18190a
                com.plaid.internal.b2<S, E> r1 = r5.f18191b
                com.plaid.internal.f7$a r2 = new com.plaid.internal.f7$a
                r2.<init>(r6, r0)
                retrofit2.s r6 = retrofit2.s.h(r2)
                r7.onResponse(r1, r6)
                goto L7c
            L6c:
                retrofit2.d<com.plaid.internal.f7<S, E>> r6 = r5.f18190a
                com.plaid.internal.b2<S, E> r7 = r5.f18191b
                com.plaid.internal.f7$d r0 = new com.plaid.internal.f7$d
                r0.<init>(r2)
                retrofit2.s r0 = retrofit2.s.h(r0)
                r6.onResponse(r7, r0)
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.b2.a.onResponse(retrofit2.b, retrofit2.s):void");
        }
    }

    public b2(retrofit2.b<S> delegate, retrofit2.f<ResponseBody, E> errorConverter) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        kotlin.jvm.internal.s.g(errorConverter, "errorConverter");
        this.f18188a = delegate;
        this.f18189b = errorConverter;
    }

    @Override // retrofit2.b
    /* renamed from: a */
    public b2<S, E> mo117clone() {
        retrofit2.b<S> mo117clone = this.f18188a.mo117clone();
        kotlin.jvm.internal.s.f(mo117clone, "delegate.clone()");
        return new b2<>(mo117clone, this.f18189b);
    }

    @Override // retrofit2.b
    public void cancel() {
        this.f18188a.cancel();
    }

    @Override // retrofit2.b
    public void enqueue(retrofit2.d<f7<S, E>> callback) {
        kotlin.jvm.internal.s.g(callback, "callback");
        this.f18188a.enqueue(new a(callback, this));
    }

    @Override // retrofit2.b
    public retrofit2.s<f7<S, E>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.b
    public boolean isCanceled() {
        return this.f18188a.isCanceled();
    }

    @Override // retrofit2.b
    public boolean isExecuted() {
        return this.f18188a.isExecuted();
    }

    @Override // retrofit2.b
    public Request request() {
        Request request = this.f18188a.request();
        kotlin.jvm.internal.s.f(request, "delegate.request()");
        return request;
    }

    @Override // retrofit2.b
    public okio.f0 timeout() {
        okio.f0 timeout = this.f18188a.timeout();
        kotlin.jvm.internal.s.f(timeout, "delegate.timeout()");
        return timeout;
    }

    public Object clone() {
        retrofit2.b<S> mo117clone = this.f18188a.mo117clone();
        kotlin.jvm.internal.s.f(mo117clone, "delegate.clone()");
        return new b2(mo117clone, this.f18189b);
    }
}
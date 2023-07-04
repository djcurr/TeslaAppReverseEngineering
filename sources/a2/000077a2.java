package io.grpc;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class s0<ReqT, RespT> {

    /* renamed from: a  reason: collision with root package name */
    private final d f31593a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31594b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31595c;

    /* renamed from: d  reason: collision with root package name */
    private final c<ReqT> f31596d;

    /* renamed from: e  reason: collision with root package name */
    private final c<RespT> f31597e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f31598f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f31599g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f31600h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f31601i;

    /* loaded from: classes5.dex */
    public static final class b<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        private c<ReqT> f31602a;

        /* renamed from: b  reason: collision with root package name */
        private c<RespT> f31603b;

        /* renamed from: c  reason: collision with root package name */
        private d f31604c;

        /* renamed from: d  reason: collision with root package name */
        private String f31605d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f31606e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f31607f;

        /* renamed from: g  reason: collision with root package name */
        private Object f31608g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f31609h;

        public s0<ReqT, RespT> a() {
            return new s0<>(this.f31604c, this.f31605d, this.f31602a, this.f31603b, this.f31608g, this.f31606e, this.f31607f, this.f31609h);
        }

        public b<ReqT, RespT> b(String str) {
            this.f31605d = str;
            return this;
        }

        public b<ReqT, RespT> c(c<ReqT> cVar) {
            this.f31602a = cVar;
            return this;
        }

        public b<ReqT, RespT> d(c<RespT> cVar) {
            this.f31603b = cVar;
            return this;
        }

        public b<ReqT, RespT> e(boolean z11) {
            this.f31609h = z11;
            return this;
        }

        public b<ReqT, RespT> f(Object obj) {
            this.f31608g = obj;
            return this;
        }

        public b<ReqT, RespT> g(d dVar) {
            this.f31604c = dVar;
            return this;
        }

        private b() {
        }
    }

    /* loaded from: classes5.dex */
    public interface c<T> {
        InputStream a(T t11);

        T b(InputStream inputStream);
    }

    /* loaded from: classes5.dex */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean clientSendsOneMessage() {
            return this == UNARY || this == SERVER_STREAMING;
        }

        public final boolean serverSendsOneMessage() {
            return this == UNARY || this == CLIENT_STREAMING;
        }
    }

    public static String a(String str) {
        int lastIndexOf = ((String) com.google.common.base.u.p(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) com.google.common.base.u.p(str, "fullServiceName")) + "/" + ((String) com.google.common.base.u.p(str2, "methodName"));
    }

    public static <ReqT, RespT> b<ReqT, RespT> g() {
        return h(null, null);
    }

    public static <ReqT, RespT> b<ReqT, RespT> h(c<ReqT> cVar, c<RespT> cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.f31594b;
    }

    public String d() {
        return this.f31595c;
    }

    public d e() {
        return this.f31593a;
    }

    public boolean f() {
        return this.f31600h;
    }

    public RespT i(InputStream inputStream) {
        return this.f31597e.b(inputStream);
    }

    public InputStream j(ReqT reqt) {
        return this.f31596d.a(reqt);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("fullMethodName", this.f31594b).d("type", this.f31593a).e("idempotent", this.f31599g).e("safe", this.f31600h).e("sampledToLocalTracing", this.f31601i).d("requestMarshaller", this.f31596d).d("responseMarshaller", this.f31597e).d("schemaDescriptor", this.f31598f).m().toString();
    }

    private s0(d dVar, String str, c<ReqT> cVar, c<RespT> cVar2, Object obj, boolean z11, boolean z12, boolean z13) {
        new AtomicReferenceArray(2);
        this.f31593a = (d) com.google.common.base.u.p(dVar, "type");
        this.f31594b = (String) com.google.common.base.u.p(str, "fullMethodName");
        this.f31595c = a(str);
        this.f31596d = (c) com.google.common.base.u.p(cVar, "requestMarshaller");
        this.f31597e = (c) com.google.common.base.u.p(cVar2, "responseMarshaller");
        this.f31598f = obj;
        this.f31599g = z11;
        this.f31600h = z12;
        this.f31601i = z13;
    }
}
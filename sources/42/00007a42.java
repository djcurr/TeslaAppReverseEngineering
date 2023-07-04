package iu;

import com.squareup.moshi.f;
import com.squareup.moshi.p;
import com.tesla.messagebuilder.util.RemoteBuildingRequestBody;
import com.tesla.messagebuilder.util.RemoteBuildingRequestBodyJsonAdapter;
import com.tesla.messagebuilder.util.RemoteBuildingResponse;
import com.tesla.messagebuilder.util.RemoteBuildingResponseJsonAdapter;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32771a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final k f32772b;

    /* renamed from: c  reason: collision with root package name */
    private static final k f32773c;

    /* renamed from: d  reason: collision with root package name */
    private static final k f32774d;

    /* renamed from: iu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0600a extends u implements h00.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0600a f32775a = new C0600a();

        C0600a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final p invoke() {
            return new p.b().d();
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<RemoteBuildingRequestBodyJsonAdapter> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32776a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final RemoteBuildingRequestBodyJsonAdapter invoke() {
            p moshi = a.f32771a.b();
            s.f(moshi, "moshi");
            return new RemoteBuildingRequestBodyJsonAdapter(moshi);
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements h00.a<RemoteBuildingResponseJsonAdapter> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f32777a = new c();

        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final RemoteBuildingResponseJsonAdapter invoke() {
            p moshi = a.f32771a.b();
            s.f(moshi, "moshi");
            return new RemoteBuildingResponseJsonAdapter(moshi);
        }
    }

    static {
        k a11;
        k a12;
        k a13;
        a11 = m.a(C0600a.f32775a);
        f32772b = a11;
        a12 = m.a(b.f32776a);
        f32773c = a12;
        a13 = m.a(c.f32777a);
        f32774d = a13;
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p b() {
        return (p) f32772b.getValue();
    }

    public final f<RemoteBuildingRequestBody> c() {
        return (f) f32773c.getValue();
    }

    public final f<RemoteBuildingResponse> d() {
        return (f) f32774d.getValue();
    }
}
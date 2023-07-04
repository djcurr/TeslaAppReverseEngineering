package rs;

import kotlin.jvm.internal.u;
import okhttp3.OkHttpClient;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49663a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final k f49664b;

    /* renamed from: rs.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C1084a extends u implements h00.a<OkHttpClient> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1084a f49665a = new C1084a();

        C1084a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final OkHttpClient invoke() {
            return new OkHttpClient.Builder().build();
        }
    }

    static {
        k a11;
        a11 = m.a(C1084a.f49665a);
        f49664b = a11;
    }

    private a() {
    }

    public final OkHttpClient a() {
        return (OkHttpClient) f49664b.getValue();
    }
}
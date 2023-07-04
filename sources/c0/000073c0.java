package hu;

import com.tesla.logging.TeslaLog;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.s;
import vu.c;
import xt.k;
import xt.l;
import zu.j;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f29424a = new b();

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final hu.a f29425a;

        /* renamed from: b  reason: collision with root package name */
        private final int f29426b;

        public a(hu.a metadata, int i11) {
            s.g(metadata, "metadata");
            this.f29425a = metadata;
            this.f29426b = i11;
        }

        public final hu.a a() {
            return this.f29425a;
        }

        public final int b() {
            return this.f29426b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f29425a, aVar.f29425a) && this.f29426b == aVar.f29426b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f29425a.hashCode() * 31) + Integer.hashCode(this.f29426b);
        }

        public String toString() {
            hu.a aVar = this.f29425a;
            int i11 = this.f29426b;
            return "Result(metadata=" + aVar + ", expires=" + i11 + ")";
        }
    }

    private b() {
    }

    private final byte[] b(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
        byteArrayOutputStream.write((i11 >> 24) & 255);
        byteArrayOutputStream.write((i11 >> 16) & 255);
        byteArrayOutputStream.write((i11 >> 8) & 255);
        byteArrayOutputStream.write(i11 & 255);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.f(byteArray, "data.toByteArray()");
        return byteArray;
    }

    public final a a(c sessionInfo, int i11, yt.b domain, String vin, int i12) {
        s.g(sessionInfo, "sessionInfo");
        s.g(domain, "domain");
        s.g(vin, "vin");
        int j11 = sessionInfo.j();
        int i13 = i12 + j11;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        teslaLog.i("SignedProtoRequest", "vehicle clock time => " + j11 + " expires in " + i13 + "s");
        hu.a aVar = new hu.a();
        aVar.b(l.TAG_SIGNATURE_TYPE, k.SIGNATURE_TYPE_AES_GCM_PERSONALIZED.getValue());
        aVar.b(l.TAG_DOMAIN, domain.getValue());
        aVar.c(l.TAG_PERSONALIZATION, vin);
        aVar.a(l.TAG_EPOCH.getValue(), j.f(sessionInfo.f()));
        aVar.a(l.TAG_EXPIRES_AT.getValue(), b(i13));
        aVar.a(l.TAG_COUNTER.getValue(), b(i11));
        return new a(aVar, i13);
    }
}
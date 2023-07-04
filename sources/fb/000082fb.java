package la;

import bb.k;
import cb.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final bb.g<ha.b, String> f37153a = new bb.g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    private final v3.f<b> f37154b = cb.a.d(10, new a(this));

    /* loaded from: classes.dex */
    class a implements a.d<b> {
        a(j jVar) {
        }

        @Override // cb.a.d
        /* renamed from: a */
        public b create() {
            try {
                return new b(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256));
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        final MessageDigest f37155a;

        /* renamed from: b  reason: collision with root package name */
        private final cb.c f37156b = cb.c.a();

        b(MessageDigest messageDigest) {
            this.f37155a = messageDigest;
        }

        @Override // cb.a.f
        public cb.c d() {
            return this.f37156b;
        }
    }

    private String a(ha.b bVar) {
        b bVar2 = (b) bb.j.d(this.f37154b.b());
        try {
            bVar.b(bVar2.f37155a);
            return k.w(bVar2.f37155a.digest());
        } finally {
            this.f37154b.a(bVar2);
        }
    }

    public String b(ha.b bVar) {
        String g11;
        synchronized (this.f37153a) {
            g11 = this.f37153a.g(bVar);
        }
        if (g11 == null) {
            g11 = a(bVar);
        }
        synchronized (this.f37153a) {
            this.f37153a.k(bVar, g11);
        }
        return g11;
    }
}
package kl;

import hl.d;
import hl.p;
import hl.q;
import hl.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import pl.g;

/* loaded from: classes3.dex */
public class c implements q<d, d> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f34820a = Logger.getLogger(c.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private p<d> f34821a;

        public a(p<d> pVar) {
            this.f34821a = pVar;
        }

        @Override // hl.d
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g.a(this.f34821a.b().a(), this.f34821a.b().c().a(bArr, bArr2));
        }

        @Override // hl.d
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<d> bVar : this.f34821a.c(copyOfRange)) {
                    try {
                        return bVar.c().b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e11) {
                        Logger logger = c.f34820a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e11.toString());
                    }
                }
            }
            for (p.b<d> bVar2 : this.f34821a.e()) {
                try {
                    return bVar2.c().b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        r.r(new c());
    }

    @Override // hl.q
    public Class<d> a() {
        return d.class;
    }

    @Override // hl.q
    public Class<d> c() {
        return d.class;
    }

    @Override // hl.q
    /* renamed from: f */
    public d b(p<d> pVar) {
        return new a(pVar);
    }
}
package il;

import hl.p;
import hl.q;
import hl.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class b implements q<hl.a, hl.a> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f30456a = Logger.getLogger(b.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: il.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0583b implements hl.a {

        /* renamed from: a  reason: collision with root package name */
        private final p<hl.a> f30457a;

        @Override // hl.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return pl.g.a(this.f30457a.b().a(), this.f30457a.b().c().a(bArr, bArr2));
        }

        @Override // hl.a
        public byte[] decrypt(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<hl.a> bVar : this.f30457a.c(copyOfRange)) {
                    try {
                        return bVar.c().decrypt(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e11) {
                        Logger logger = b.f30456a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e11.toString());
                    }
                }
            }
            for (p.b<hl.a> bVar2 : this.f30457a.e()) {
                try {
                    return bVar2.c().decrypt(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        private C0583b(p<hl.a> pVar) {
            this.f30457a = pVar;
        }
    }

    b() {
    }

    public static void e() {
        r.r(new b());
    }

    @Override // hl.q
    public Class<hl.a> a() {
        return hl.a.class;
    }

    @Override // hl.q
    public Class<hl.a> c() {
        return hl.a.class;
    }

    @Override // hl.q
    /* renamed from: f */
    public hl.a b(p<hl.a> pVar) {
        return new C0583b(pVar);
    }
}
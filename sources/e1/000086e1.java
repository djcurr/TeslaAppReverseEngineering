package ml;

import hl.o;
import hl.p;
import hl.q;
import hl.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import ol.i0;
import pl.g;

/* loaded from: classes3.dex */
class d implements q<o, o> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f38618a = Logger.getLogger(d.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final p<o> f38619a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f38620b;

        @Override // hl.o
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<o> bVar : this.f38619a.c(copyOf)) {
                    try {
                        if (bVar.b().equals(i0.LEGACY)) {
                            bVar.c().a(copyOfRange, g.a(bArr2, this.f38620b));
                            return;
                        } else {
                            bVar.c().a(copyOfRange, bArr2);
                            return;
                        }
                    } catch (GeneralSecurityException e11) {
                        Logger logger = d.f38618a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e11);
                    }
                }
                for (p.b<o> bVar2 : this.f38619a.e()) {
                    try {
                        bVar2.c().a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        @Override // hl.o
        public byte[] b(byte[] bArr) {
            if (this.f38619a.b().b().equals(i0.LEGACY)) {
                return g.a(this.f38619a.b().a(), this.f38619a.b().c().b(g.a(bArr, this.f38620b)));
            }
            return g.a(this.f38619a.b().a(), this.f38619a.b().c().b(bArr));
        }

        private b(p<o> pVar) {
            this.f38620b = new byte[]{0};
            this.f38619a = pVar;
        }
    }

    d() {
    }

    public static void e() {
        r.r(new d());
    }

    @Override // hl.q
    public Class<o> a() {
        return o.class;
    }

    @Override // hl.q
    public Class<o> c() {
        return o.class;
    }

    @Override // hl.q
    /* renamed from: f */
    public o b(p<o> pVar) {
        return new b(pVar);
    }
}
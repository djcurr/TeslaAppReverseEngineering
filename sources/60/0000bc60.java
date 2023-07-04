package w50;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final SecureRandom f55633a;

    /* renamed from: w50.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1268a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55634a;

        C1268a(int i11) {
            this.f55634a = i11;
        }

        @Override // w50.c
        public int entropySize() {
            return this.f55634a;
        }

        @Override // w50.c
        public byte[] getEntropy() {
            if (!(a.this.f55633a instanceof f)) {
                SecureRandom unused = a.this.f55633a;
                return a.this.f55633a.generateSeed((this.f55634a + 7) / 8);
            }
            byte[] bArr = new byte[(this.f55634a + 7) / 8];
            a.this.f55633a.nextBytes(bArr);
            return bArr;
        }
    }

    public a(SecureRandom secureRandom, boolean z11) {
        this.f55633a = secureRandom;
    }

    @Override // w50.d
    public c get(int i11) {
        return new C1268a(i11);
    }
}
package x8;

/* loaded from: classes.dex */
public class a extends v8.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ boolean f57336b = true;

    public a(byte[] bArr) {
        super(bArr);
    }

    public static a b(String str, long j11, b bVar, short s11, e eVar) {
        byte[] c11 = v8.b.c((byte) 1);
        boolean z11 = f57336b;
        if (z11 || c11.length == 1) {
            byte[] d11 = v8.b.d(str.charAt(0), str.charAt(1));
            if (z11 || d11.length == 2) {
                byte[] e11 = v8.b.e(j11);
                if (z11 || e11.length == 8) {
                    byte[] h11 = v8.b.h();
                    if (z11 || h11.length == 2) {
                        bVar.a();
                        byte[] c12 = v8.b.c(bVar.f57337a);
                        if (z11 || c12.length == 1) {
                            byte[] c13 = v8.b.c(bVar.f57338b);
                            if (z11 || c13.length == 1) {
                                byte[] bArr = (byte[]) bVar.f57339c.clone();
                                if (z11 || bArr.length == (bVar.f57338b & 255)) {
                                    byte[] f11 = v8.b.f(s11);
                                    if (z11 || f11.length == 2) {
                                        byte[] h12 = v8.b.h();
                                        if (z11 || h12.length == 2) {
                                            eVar.a();
                                            byte[] c14 = v8.b.c(eVar.f57341a);
                                            if (z11 || c14.length == 1) {
                                                byte[] bArr2 = (byte[]) eVar.f57342b.clone();
                                                if (z11 || bArr2.length == (eVar.f57341a & 255)) {
                                                    byte[] i11 = v8.b.i();
                                                    if (z11 || i11.length == 4) {
                                                        return new a(v8.b.g(c11, d11, e11, h11, c12, c13, bArr, f11, h12, c14, bArr2, i11));
                                                    }
                                                    throw new AssertionError();
                                                }
                                                throw new AssertionError();
                                            }
                                            throw new AssertionError();
                                        }
                                        throw new AssertionError();
                                    }
                                    throw new AssertionError();
                                }
                                throw new AssertionError();
                            }
                            throw new AssertionError();
                        }
                        throw new AssertionError();
                    }
                    throw new AssertionError();
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public static a c() {
        try {
            return b("EX", 0L, new c(""), (short) 0, new f());
        } catch (Exception unused) {
            return null;
        }
    }
}
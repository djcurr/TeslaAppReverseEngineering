package pl;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f46689a = new a();

    /* loaded from: classes3.dex */
    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SecureRandom initialValue() {
            return u.a();
        }
    }

    static /* synthetic */ SecureRandom a() {
        return b();
    }

    private static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i11) {
        byte[] bArr = new byte[i11];
        f46689a.get().nextBytes(bArr);
        return bArr;
    }
}
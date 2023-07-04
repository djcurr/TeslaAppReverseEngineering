package pl;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class s implements nl.a {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Mac> f46682a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46683b;

    /* renamed from: c  reason: collision with root package name */
    private final Key f46684c;

    /* renamed from: d  reason: collision with root package name */
    private final int f46685d;

    /* loaded from: classes3.dex */
    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a11 = m.f46675g.a(s.this.f46683b);
                a11.init(s.this.f46684c);
                return a11;
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public s(String str, Key key) {
        a aVar = new a();
        this.f46682a = aVar;
        this.f46683b = str;
        this.f46684c = key;
        if (key.getEncoded().length >= 16) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    this.f46685d = 20;
                    break;
                case 1:
                    this.f46685d = 32;
                    break;
                case 2:
                    this.f46685d = 48;
                    break;
                case 3:
                    this.f46685d = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    @Override // nl.a
    public byte[] a(byte[] bArr, int i11) {
        if (i11 <= this.f46685d) {
            this.f46682a.get().update(bArr);
            return Arrays.copyOf(this.f46682a.get().doFinal(), i11);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
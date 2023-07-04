package ct;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f23075a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f23076b;

    public c(byte[] iv2, byte[] encryptedData) {
        s.g(iv2, "iv");
        s.g(encryptedData, "encryptedData");
        this.f23075a = iv2;
        this.f23076b = encryptedData;
    }

    public final byte[] a() {
        return this.f23076b;
    }

    public final byte[] b() {
        return this.f23075a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (s.c(c.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.tesla.data.realm.EncryptionResult");
            c cVar = (c) obj;
            return Arrays.equals(this.f23075a, cVar.f23075a) && Arrays.equals(this.f23076b, cVar.f23076b);
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f23075a) * 31) + Arrays.hashCode(this.f23076b);
    }

    public String toString() {
        String arrays = Arrays.toString(this.f23075a);
        String arrays2 = Arrays.toString(this.f23076b);
        return "EncryptionResult(iv=" + arrays + ", encryptedData=" + arrays2 + ")";
    }
}
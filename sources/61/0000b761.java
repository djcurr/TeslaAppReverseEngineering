package u50;

import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes5.dex */
public class p1 implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private Hashtable f53267a;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Hashtable f53268a = new Hashtable();

        public b() {
        }

        public b(Hashtable hashtable) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                this.f53268a.put(num, hashtable.get(num));
            }
        }

        public p1 a() {
            return new p1(this.f53268a);
        }

        public b b(int i11, byte[] bArr) {
            if (bArr != null) {
                if (i11 == 0 || (i11 >= 4 && i11 < 63 && i11 != 48)) {
                    if (i11 != 4) {
                        this.f53268a.put(r70.f.d(i11), bArr);
                        return this;
                    }
                    throw new IllegalArgumentException("Parameter type 4 is reserved for internal use.");
                }
                throw new IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
            }
            throw new IllegalArgumentException("Parameter value must not be null.");
        }

        public b c(byte[] bArr) {
            return b(0, bArr);
        }
    }

    public p1() {
        this(new Hashtable());
    }

    private p1(Hashtable hashtable) {
        this.f53267a = hashtable;
    }

    public byte[] a() {
        return (byte[]) this.f53267a.get(r70.f.d(0));
    }

    public Hashtable b() {
        return this.f53267a;
    }
}
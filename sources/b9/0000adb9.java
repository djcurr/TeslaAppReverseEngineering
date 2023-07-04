package qc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f48044f;

    /* renamed from: e  reason: collision with root package name */
    protected final List<a> f48045e = new ArrayList(4);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f48046a;

        /* renamed from: qc.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC1024a {
            DC,
            AC,
            UNKNOWN;

            public static EnumC1024a typeOf(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        return UNKNOWN;
                    }
                    return AC;
                }
                return DC;
            }
        }

        public a(EnumC1024a enumC1024a, int i11, byte[] bArr, byte[] bArr2) {
            if (bArr == null) {
                throw new IllegalArgumentException("lengthBytes cannot be null.");
            }
            if (bArr2 != null) {
                this.f48046a = bArr2;
                return;
            }
            throw new IllegalArgumentException("valueBytes cannot be null.");
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f48044f = hashMap;
        hashMap.put(1, "Number of Tables");
    }

    public b() {
        E(new qc.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<a> V() {
        return this.f48045e;
    }

    @Override // cc.b
    public String n() {
        return "Huffman";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f48044f;
    }
}
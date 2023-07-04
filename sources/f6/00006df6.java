package f9;

/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int[] f26143a;

        /* renamed from: b  reason: collision with root package name */
        public int f26144b;

        /* renamed from: c  reason: collision with root package name */
        public int f26145c;

        public b() {
            this.f26143a = new int[256];
        }
    }

    public static b a(String str) {
        if (str != null) {
            b bVar = new b();
            for (int i11 = 0; i11 < 256; i11++) {
                bVar.f26143a[i11] = i11;
            }
            bVar.f26144b = 0;
            bVar.f26145c = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < 256; i14++) {
                try {
                    char charAt = str.charAt(i12);
                    int[] iArr = bVar.f26143a;
                    i13 = ((charAt + iArr[i14]) + i13) % 256;
                    int i15 = iArr[i14];
                    iArr[i14] = iArr[i13];
                    iArr[i13] = i15;
                    i12 = (i12 + 1) % str.length();
                } catch (Exception unused) {
                    return null;
                }
            }
            return bVar;
        }
        return null;
    }

    public static byte[] b(byte[] bArr) {
        b a11;
        if (bArr == null || (a11 = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return c(bArr, a11);
    }

    public static byte[] c(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i11 = bVar.f26144b;
        int i12 = bVar.f26145c;
        for (int i13 = 0; i13 < bArr.length; i13++) {
            i11 = (i11 + 1) % 256;
            int[] iArr = bVar.f26143a;
            i12 = (iArr[i11] + i12) % 256;
            int i14 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i14;
            bArr[i13] = (byte) (iArr[(iArr[i11] + iArr[i12]) % 256] ^ bArr[i13]);
        }
        bVar.f26144b = i11;
        bVar.f26145c = i12;
        return bArr;
    }
}
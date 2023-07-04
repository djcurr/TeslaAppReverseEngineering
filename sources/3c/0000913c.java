package org.bouncycastle.crypto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class x implements g {
    private static final /* synthetic */ x[] $VALUES;
    public static final x ASCII;
    public static final x PKCS12;
    public static final x UTF8;

    /* loaded from: classes5.dex */
    enum a extends x {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // org.bouncycastle.crypto.x, org.bouncycastle.crypto.g
        public byte[] convert(char[] cArr) {
            return w.PKCS5PasswordToBytes(cArr);
        }

        @Override // org.bouncycastle.crypto.x, org.bouncycastle.crypto.g
        public String getType() {
            return "ASCII";
        }
    }

    static {
        a aVar = new a("ASCII", 0);
        ASCII = aVar;
        x xVar = new x("UTF8", 1) { // from class: org.bouncycastle.crypto.x.b
            @Override // org.bouncycastle.crypto.x, org.bouncycastle.crypto.g
            public byte[] convert(char[] cArr) {
                return w.PKCS5PasswordToUTF8Bytes(cArr);
            }

            @Override // org.bouncycastle.crypto.x, org.bouncycastle.crypto.g
            public String getType() {
                return "UTF8";
            }
        };
        UTF8 = xVar;
        x xVar2 = new x("PKCS12", 2) { // from class: org.bouncycastle.crypto.x.c
            @Override // org.bouncycastle.crypto.x, org.bouncycastle.crypto.g
            public byte[] convert(char[] cArr) {
                return w.PKCS12PasswordToBytes(cArr);
            }

            @Override // org.bouncycastle.crypto.x, org.bouncycastle.crypto.g
            public String getType() {
                return "PKCS12";
            }
        };
        PKCS12 = xVar2;
        $VALUES = new x[]{aVar, xVar, xVar2};
    }

    private x(String str, int i11) {
    }

    /* synthetic */ x(String str, int i11, a aVar) {
        this(str, i11);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    @Override // org.bouncycastle.crypto.g
    public abstract /* synthetic */ byte[] convert(char[] cArr);

    @Override // org.bouncycastle.crypto.g
    public abstract /* synthetic */ String getType();
}
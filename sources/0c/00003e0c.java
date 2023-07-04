package com.google.zxing.qrcode.decoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DATA_MASK_000;
    public static final c DATA_MASK_001;
    public static final c DATA_MASK_010;
    public static final c DATA_MASK_011;
    public static final c DATA_MASK_100;
    public static final c DATA_MASK_101;
    public static final c DATA_MASK_110;
    public static final c DATA_MASK_111;

    /* loaded from: classes2.dex */
    enum a extends c {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.zxing.qrcode.decoder.c
        boolean isMasked(int i11, int i12) {
            return ((i11 + i12) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        DATA_MASK_000 = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: com.google.zxing.qrcode.decoder.c.b
            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i11, int i12) {
                return (i11 & 1) == 0;
            }
        };
        DATA_MASK_001 = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: com.google.zxing.qrcode.decoder.c.c
            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i11, int i12) {
                return i12 % 3 == 0;
            }
        };
        DATA_MASK_010 = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: com.google.zxing.qrcode.decoder.c.d
            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i11, int i12) {
                return (i11 + i12) % 3 == 0;
            }
        };
        DATA_MASK_011 = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: com.google.zxing.qrcode.decoder.c.e
            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i11, int i12) {
                return (((i11 / 2) + (i12 / 3)) & 1) == 0;
            }
        };
        DATA_MASK_100 = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: com.google.zxing.qrcode.decoder.c.f
            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i11, int i12) {
                return (i11 * i12) % 6 == 0;
            }
        };
        DATA_MASK_101 = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: com.google.zxing.qrcode.decoder.c.g
            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i11, int i12) {
                return (i11 * i12) % 6 < 3;
            }
        };
        DATA_MASK_110 = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: com.google.zxing.qrcode.decoder.c.h
            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i11, int i12) {
                return (((i11 + i12) + ((i11 * i12) % 3)) & 1) == 0;
            }
        };
        DATA_MASK_111 = cVar7;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i11) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    abstract boolean isMasked(int i11, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void unmaskBitMatrix(uo.b bVar, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (isMasked(i12, i13)) {
                    bVar.c(i13, i12);
                }
            }
        }
    }

    /* synthetic */ c(String str, int i11, a aVar) {
        this(str, i11);
    }
}
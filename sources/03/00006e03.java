package fc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f26197e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26198a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f26199b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f26200c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f26201d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f26202e;

        static {
            int[] iArr = new int[g.values().length];
            f26202e = iArr;
            try {
                iArr[g.LCS_GM_BUSINESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26202e[g.LCS_GM_GRAPHICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26202e[g.LCS_GM_IMAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26202e[g.LCS_GM_ABS_COLORIMETRIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.values().length];
            f26201d = iArr2;
            try {
                iArr2[d.LCS_CALIBRATED_RGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26201d[d.LCS_sRGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26201d[d.LCS_WINDOWS_COLOR_SPACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26201d[d.PROFILE_LINKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26201d[d.PROFILE_EMBEDDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[f.values().length];
            f26200c = iArr3;
            try {
                iArr3[f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26200c[f.ERROR_DIFFUSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26200c[f.PANDA.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26200c[f.SUPER_CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[e.values().length];
            f26199b = iArr4;
            try {
                iArr4[e.BI_RGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26199b[e.BI_RLE8.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26199b[e.BI_RLE4.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26199b[e.BI_BITFIELDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26199b[e.BI_HUFFMAN_1D.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f26199b[e.BI_JPEG.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26199b[e.BI_RLE24.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26199b[e.BI_PNG.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26199b[e.BI_ALPHABITFIELDS.ordinal()] = 9;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f26199b[e.BI_CMYK.ordinal()] = 10;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f26199b[e.BI_CMYKRLE8.ordinal()] = 11;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f26199b[e.BI_CMYKRLE4.ordinal()] = 12;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr5 = new int[EnumC0514b.values().length];
            f26198a = iArr5;
            try {
                iArr5[EnumC0514b.BITMAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f26198a[EnumC0514b.OS2_BITMAP_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f26198a[EnumC0514b.OS2_COLOR_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f26198a[EnumC0514b.OS2_COLOR_POINTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f26198a[EnumC0514b.OS2_ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f26198a[EnumC0514b.OS2_POINTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
        }
    }

    /* renamed from: fc.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0514b {
        BITMAP(19778),
        OS2_BITMAP_ARRAY(16706),
        OS2_ICON(17225),
        OS2_COLOR_ICON(18755),
        OS2_COLOR_POINTER(20547),
        OS2_POINTER(21584);
        
        private final int value;

        EnumC0514b(int i11) {
            this.value = i11;
        }

        public static EnumC0514b typeOf(int i11) {
            EnumC0514b[] values;
            for (EnumC0514b enumC0514b : values()) {
                if (enumC0514b.value == i11) {
                    return enumC0514b;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f26198a[ordinal()]) {
                case 1:
                    return "Standard";
                case 2:
                    return "Bitmap Array";
                case 3:
                    return "Color Icon";
                case 4:
                    return "Color Pointer";
                case 5:
                    return "Monochrome Icon";
                case 6:
                    return "Monochrome Pointer";
                default:
                    throw new IllegalStateException("Unimplemented bitmap type " + super.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        RGB(0);
        
        private final int value;

        c(int i11) {
            this.value = i11;
        }

        public static c typeOf(int i11) {
            if (i11 == 0) {
                return RGB;
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LCS_CALIBRATED_RGB(0),
        LCS_sRGB(1934772034),
        LCS_WINDOWS_COLOR_SPACE(1466527264),
        PROFILE_LINKED(1279872587),
        PROFILE_EMBEDDED(1296188740);
        
        private final long value;

        d(long j11) {
            this.value = j11;
        }

        public static d typeOf(long j11) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.value == j11) {
                    return dVar;
                }
            }
            return null;
        }

        public long getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f26201d[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return "Embedded Profile";
                            }
                            throw new IllegalStateException("Unimplemented color space type " + super.toString());
                        }
                        return "Linked Profile";
                    }
                    return "System Default Color Space, sRGB";
                }
                return "sRGB Color Space";
            }
            return "Calibrated RGB";
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        NONE(0),
        ERROR_DIFFUSION(1),
        PANDA(2),
        SUPER_CIRCLE(3);
        
        private final int value;

        f(int i11) {
            this.value = i11;
        }

        public static f typeOf(int i11) {
            f[] values;
            for (f fVar : values()) {
                if (fVar.value == i11) {
                    return fVar;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f26200c[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "Super-circle Halftoning";
                        }
                        throw new IllegalStateException("Unimplemented rendering halftoning algorithm type " + super.toString());
                    }
                    return "Processing Algorithm for Noncoded Document Acquisition";
                }
                return "Error Diffusion Halftoning";
            }
            return "No Halftoning Algorithm";
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        LCS_GM_BUSINESS(1),
        LCS_GM_GRAPHICS(2),
        LCS_GM_IMAGES(4),
        LCS_GM_ABS_COLORIMETRIC(8);
        
        private final int value;

        g(int i11) {
            this.value = i11;
        }

        public static g typeOf(long j11) {
            g[] values;
            for (g gVar : values()) {
                if (gVar.value == j11) {
                    return gVar;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f26202e[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "Match, Absolute Colorimetric";
                        }
                        throw new IllegalStateException("Unimplemented rendering intent " + super.toString());
                    }
                    return "Picture, Perceptual";
                }
                return "Proof, Relative Colorimetric";
            }
            return "Graphic, Saturation";
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f26197e = hashMap;
        hashMap.put(-2, "Bitmap type");
        hashMap.put(-1, "Header Size");
        hashMap.put(1, "Image Height");
        hashMap.put(2, "Image Width");
        hashMap.put(3, "Planes");
        hashMap.put(4, "Bits Per Pixel");
        hashMap.put(5, "Compression");
        hashMap.put(6, "X Pixels per Meter");
        hashMap.put(7, "Y Pixels per Meter");
        hashMap.put(8, "Palette Colour Count");
        hashMap.put(9, "Important Colour Count");
        hashMap.put(10, "Rendering");
        hashMap.put(11, "Color Encoding");
        hashMap.put(12, "Red Mask");
        hashMap.put(13, "Green Mask");
        hashMap.put(14, "Blue Mask");
        hashMap.put(15, "Alpha Mask");
        hashMap.put(16, "Color Space Type");
        hashMap.put(17, "Red Gamma Curve");
        hashMap.put(18, "Green Gamma Curve");
        hashMap.put(19, "Blue Gamma Curve");
        hashMap.put(20, "Rendering Intent");
        hashMap.put(21, "Linked Profile File Name");
    }

    public b() {
        E(new fc.a(this));
    }

    public EnumC0514b V() {
        Integer l11 = l(-2);
        if (l11 == null) {
            return null;
        }
        return EnumC0514b.typeOf(l11.intValue());
    }

    public c W() {
        Integer l11 = l(11);
        if (l11 == null) {
            return null;
        }
        return c.typeOf(l11.intValue());
    }

    public d X() {
        Long m11 = m(16);
        if (m11 == null) {
            return null;
        }
        return d.typeOf(m11.longValue());
    }

    public e Y() {
        return e.typeOf(this);
    }

    public f Z() {
        Integer l11 = l(10);
        if (l11 == null) {
            return null;
        }
        return f.typeOf(l11.intValue());
    }

    public g a0() {
        Integer l11 = l(20);
        if (l11 == null) {
            return null;
        }
        return g.typeOf(l11.intValue());
    }

    @Override // cc.b
    public String n() {
        return "BMP Header";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f26197e;
    }

    /* loaded from: classes.dex */
    public enum e {
        BI_RGB(0),
        BI_RLE8(1),
        BI_RLE4(2),
        BI_BITFIELDS(3),
        BI_HUFFMAN_1D(3),
        BI_JPEG(4),
        BI_RLE24(4),
        BI_PNG(5),
        BI_ALPHABITFIELDS(6),
        BI_CMYK(11),
        BI_CMYKRLE8(12),
        BI_CMYKRLE4(13);
        
        private final int value;

        e(int i11) {
            this.value = i11;
        }

        public static e typeOf(b bVar) {
            Integer l11;
            Integer l12 = bVar.l(5);
            if (l12 == null || (l11 = bVar.l(-1)) == null) {
                return null;
            }
            return typeOf(l12.intValue(), l11.intValue());
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f26199b[ordinal()]) {
                case 1:
                    return "None";
                case 2:
                    return "RLE 8-bit/pixel";
                case 3:
                    return "RLE 4-bit/pixel";
                case 4:
                    return "Bit Fields";
                case 5:
                    return "Huffman 1D";
                case 6:
                    return "JPEG";
                case 7:
                    return "RLE 24-bit/pixel";
                case 8:
                    return "PNG";
                case 9:
                    return "RGBA Bit Fields";
                case 10:
                    return "CMYK Uncompressed";
                case 11:
                    return "CMYK RLE-8";
                case 12:
                    return "CMYK RLE-4";
                default:
                    throw new IllegalStateException("Unimplemented compression type " + super.toString());
            }
        }

        public static e typeOf(int i11, int i12) {
            switch (i11) {
                case 0:
                    return BI_RGB;
                case 1:
                    return BI_RLE8;
                case 2:
                    return BI_RLE4;
                case 3:
                    return i12 == 64 ? BI_HUFFMAN_1D : BI_BITFIELDS;
                case 4:
                    return i12 == 64 ? BI_RLE24 : BI_JPEG;
                case 5:
                    return BI_PNG;
                case 6:
                    return BI_ALPHABITFIELDS;
                case 7:
                case 8:
                case 9:
                case 10:
                default:
                    return null;
                case 11:
                    return BI_CMYK;
                case 12:
                    return BI_CMYKRLE8;
                case 13:
                    return BI_CMYKRLE4;
            }
        }
    }
}
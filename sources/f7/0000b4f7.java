package tb;

import com.drew.imaging.png.PngProcessingException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f51873c = new HashSet(Arrays.asList("IDAT", "sPLT", "iTXt", "tEXt", "zTXt"));

    /* renamed from: d  reason: collision with root package name */
    public static final d f51874d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f51875e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f51876f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f51877g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f51878h;

    /* renamed from: i  reason: collision with root package name */
    public static final d f51879i;

    /* renamed from: j  reason: collision with root package name */
    public static final d f51880j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f51881k;

    /* renamed from: l  reason: collision with root package name */
    public static final d f51882l;

    /* renamed from: m  reason: collision with root package name */
    public static final d f51883m;

    /* renamed from: n  reason: collision with root package name */
    public static final d f51884n;

    /* renamed from: o  reason: collision with root package name */
    public static final d f51885o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f51886p;

    /* renamed from: q  reason: collision with root package name */
    public static final d f51887q;

    /* renamed from: r  reason: collision with root package name */
    public static final d f51888r;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f51889a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f51890b;

    static {
        try {
            f51874d = new d("IHDR");
            f51875e = new d("PLTE");
            new d("IDAT", true);
            f51876f = new d("IEND");
            f51877g = new d("cHRM");
            f51878h = new d("gAMA");
            f51879i = new d("iCCP");
            f51880j = new d("sBIT");
            f51881k = new d("sRGB");
            f51882l = new d("bKGD");
            new d("hIST");
            f51883m = new d("tRNS");
            f51884n = new d("pHYs");
            new d("sPLT", true);
            f51885o = new d("tIME");
            f51886p = new d("iTXt", true);
            f51887q = new d("tEXt", true);
            f51888r = new d("zTXt", true);
        } catch (PngProcessingException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public d(String str) {
        this(str, false);
    }

    private static boolean c(byte b11) {
        return (b11 >= 65 && b11 <= 90) || (b11 >= 97 && b11 <= 122);
    }

    private static void d(byte[] bArr) {
        if (bArr.length == 4) {
            for (byte b11 : bArr) {
                if (!c(b11)) {
                    throw new PngProcessingException("PNG chunk type identifier may only contain alphabet characters");
                }
            }
            return;
        }
        throw new PngProcessingException("PNG chunk type identifier must be four bytes in length");
    }

    public boolean a() {
        return this.f51890b;
    }

    public String b() {
        try {
            return new String(this.f51889a, "ASCII");
        } catch (UnsupportedEncodingException unused) {
            return "Invalid object instance";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f51889a, ((d) obj).f51889a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f51889a);
    }

    public String toString() {
        return b();
    }

    public d(String str, boolean z11) {
        this.f51890b = z11;
        try {
            byte[] bytes = str.getBytes("ASCII");
            d(bytes);
            this.f51889a = bytes;
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException("Unable to convert string code to bytes.");
        }
    }

    public d(byte[] bArr) {
        d(bArr);
        this.f51889a = bArr;
        this.f51890b = f51873c.contains(b());
    }
}
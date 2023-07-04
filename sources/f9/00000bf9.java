package b3;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    String f7361a;

    /* renamed from: b  reason: collision with root package name */
    private int f7362b;

    /* renamed from: c  reason: collision with root package name */
    private int f7363c;

    /* renamed from: d  reason: collision with root package name */
    private float f7364d;

    /* renamed from: e  reason: collision with root package name */
    private String f7365e;

    /* renamed from: f  reason: collision with root package name */
    boolean f7366f;

    public a(a aVar) {
        this.f7363c = Integer.MIN_VALUE;
        this.f7364d = Float.NaN;
        this.f7365e = null;
        this.f7361a = aVar.f7361a;
        this.f7362b = aVar.f7362b;
        this.f7363c = aVar.f7363c;
        this.f7364d = aVar.f7364d;
        this.f7365e = aVar.f7365e;
        this.f7366f = aVar.f7366f;
    }

    public static String a(int i11) {
        String str = "00000000" + Integer.toHexString(i11);
        return "#" + str.substring(str.length() - 8);
    }

    public a b() {
        return new a(this);
    }

    public boolean c() {
        return this.f7366f;
    }

    public float d() {
        return this.f7364d;
    }

    public int e() {
        return this.f7363c;
    }

    public String f() {
        return this.f7361a;
    }

    public String g() {
        return this.f7365e;
    }

    public int h() {
        return this.f7362b;
    }

    public void i(float f11) {
        this.f7364d = f11;
    }

    public void j(int i11) {
        this.f7363c = i11;
    }

    public String toString() {
        String str = this.f7361a + CoreConstants.COLON_CHAR;
        switch (this.f7362b) {
            case 900:
                return str + this.f7363c;
            case 901:
                return str + this.f7364d;
            case 902:
                return str + a(this.f7363c);
            case 903:
                return str + this.f7365e;
            case 904:
                return str + Boolean.valueOf(this.f7366f);
            case 905:
                return str + this.f7364d;
            default:
                return str + "????";
        }
    }

    public a(String str, int i11, int i12) {
        this.f7363c = Integer.MIN_VALUE;
        this.f7364d = Float.NaN;
        this.f7365e = null;
        this.f7361a = str;
        this.f7362b = i11;
        if (i11 == 901) {
            this.f7364d = i12;
        } else {
            this.f7363c = i12;
        }
    }

    public a(String str, int i11, float f11) {
        this.f7363c = Integer.MIN_VALUE;
        this.f7364d = Float.NaN;
        this.f7365e = null;
        this.f7361a = str;
        this.f7362b = i11;
        this.f7364d = f11;
    }
}
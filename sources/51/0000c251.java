package yb;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f59430c = new a("BYTE", 1, 1);

    /* renamed from: d  reason: collision with root package name */
    public static final a f59431d = new a("STRING", 2, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final a f59432e = new a("USHORT", 3, 2);

    /* renamed from: f  reason: collision with root package name */
    public static final a f59433f = new a("ULONG", 4, 4);

    /* renamed from: g  reason: collision with root package name */
    public static final a f59434g = new a("URATIONAL", 5, 8);

    /* renamed from: h  reason: collision with root package name */
    public static final a f59435h = new a("SBYTE", 6, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f59436i = new a("UNDEFINED", 7, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f59437j = new a("SSHORT", 8, 2);

    /* renamed from: k  reason: collision with root package name */
    public static final a f59438k = new a("SLONG", 9, 4);

    /* renamed from: l  reason: collision with root package name */
    public static final a f59439l = new a("SRATIONAL", 10, 8);

    /* renamed from: m  reason: collision with root package name */
    public static final a f59440m = new a("SINGLE", 11, 4);

    /* renamed from: n  reason: collision with root package name */
    public static final a f59441n = new a("DOUBLE", 12, 8);

    /* renamed from: a  reason: collision with root package name */
    private final String f59442a;

    /* renamed from: b  reason: collision with root package name */
    private final int f59443b;

    private a(String str, int i11, int i12) {
        this.f59442a = str;
        this.f59443b = i12;
    }

    public static a a(int i11) {
        switch (i11) {
            case 1:
                return f59430c;
            case 2:
                return f59431d;
            case 3:
                return f59432e;
            case 4:
                return f59433f;
            case 5:
                return f59434g;
            case 6:
                return f59435h;
            case 7:
                return f59436i;
            case 8:
                return f59437j;
            case 9:
                return f59438k;
            case 10:
                return f59439l;
            case 11:
                return f59440m;
            case 12:
                return f59441n;
            default:
                return null;
        }
    }

    public int b() {
        return this.f59443b;
    }

    public String toString() {
        return this.f59442a;
    }
}
package atd.a;

/* loaded from: classes.dex */
public enum f {
    GET(atd.s0.a.a(-102622612482624L), false),
    POST(atd.s0.a.a(-102652677253696L), true);
    
    private boolean mDoOutput;
    private String mValue;

    f(String str, boolean z11) {
        this.mValue = str;
        this.mDoOutput = z11;
    }

    public static boolean a(f fVar) {
        return !fVar.equals(GET);
    }

    public static boolean b(f fVar) {
        return fVar.equals(POST);
    }

    public String a() {
        return this.mValue;
    }

    public boolean b() {
        return this.mDoOutput;
    }
}
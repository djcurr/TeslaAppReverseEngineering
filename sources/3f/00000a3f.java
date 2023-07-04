package atd.a0;

import atd.e.c;

/* loaded from: classes.dex */
public final class a extends Exception {

    /* renamed from: a */
    private final c f6768a;

    public a(String str, c cVar) {
        super(str);
        this.f6768a = cVar;
    }

    public String a() {
        Throwable cause;
        String a11;
        String message = getMessage();
        if (getCause() != null) {
            a11 = atd.s0.a.a(-799914847955520L) + cause.getMessage();
        } else {
            a11 = atd.s0.a.a(-799940617759296L);
        }
        return message + a11;
    }

    public c b() {
        return this.f6768a;
    }

    public a(String str, Throwable th2, c cVar) {
        super(str, th2);
        this.f6768a = cVar;
    }
}
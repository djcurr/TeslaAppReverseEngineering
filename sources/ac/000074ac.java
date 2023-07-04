package i5;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f29901e;

    /* renamed from: a  reason: collision with root package name */
    private a f29902a;

    /* renamed from: b  reason: collision with root package name */
    private b f29903b;

    /* renamed from: c  reason: collision with root package name */
    private e f29904c;

    /* renamed from: d  reason: collision with root package name */
    private f f29905d;

    private g(Context context, m5.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f29902a = new a(applicationContext, aVar);
        this.f29903b = new b(applicationContext, aVar);
        this.f29904c = new e(applicationContext, aVar);
        this.f29905d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, m5.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f29901e == null) {
                f29901e = new g(context, aVar);
            }
            gVar = f29901e;
        }
        return gVar;
    }

    public a a() {
        return this.f29902a;
    }

    public b b() {
        return this.f29903b;
    }

    public e d() {
        return this.f29904c;
    }

    public f e() {
        return this.f29905d;
    }
}
package s3;

import android.graphics.Typeface;
import android.os.Handler;
import s3.e;
import s3.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final f.c f50193a;

    /* renamed from: b */
    private final Handler f50194b;

    /* renamed from: s3.a$a */
    /* loaded from: classes.dex */
    public class RunnableC1111a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ f.c f50195a;

        /* renamed from: b */
        final /* synthetic */ Typeface f50196b;

        RunnableC1111a(a aVar, f.c cVar, Typeface typeface) {
            this.f50195a = cVar;
            this.f50196b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f50195a.b(this.f50196b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ f.c f50197a;

        /* renamed from: b */
        final /* synthetic */ int f50198b;

        b(a aVar, f.c cVar, int i11) {
            this.f50197a = cVar;
            this.f50198b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f50197a.a(this.f50198b);
        }
    }

    public a(f.c cVar, Handler handler) {
        this.f50193a = cVar;
        this.f50194b = handler;
    }

    private void a(int i11) {
        this.f50194b.post(new b(this, this.f50193a, i11));
    }

    private void c(Typeface typeface) {
        this.f50194b.post(new RunnableC1111a(this, this.f50193a, typeface));
    }

    public void b(e.C1112e c1112e) {
        if (c1112e.a()) {
            c(c1112e.f50220a);
        } else {
            a(c1112e.f50221b);
        }
    }
}
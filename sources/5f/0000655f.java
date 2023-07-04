package d7;

import android.graphics.drawable.BitmapDrawable;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.x0;

/* loaded from: classes.dex */
public final class g extends com.adyen.checkout.core.api.c<BitmapDrawable> {

    /* renamed from: f */
    private static final String f23768f;

    /* renamed from: c */
    private final d7.b f23769c;

    /* renamed from: d */
    private final String f23770d;

    /* renamed from: e */
    private HashSet<b> f23771e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(BitmapDrawable bitmapDrawable);
    }

    static {
        new a(null);
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f23768f = c11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d7.b logoApi, String logoUrl, b callback) {
        super(new c(logoUrl));
        HashSet<b> e11;
        s.g(logoApi, "logoApi");
        s.g(logoUrl, "logoUrl");
        s.g(callback, "callback");
        this.f23769c = logoApi;
        this.f23770d = logoUrl;
        e11 = x0.e(callback);
        this.f23771e = e11;
    }

    public static /* synthetic */ void b(g gVar) {
        j(gVar);
    }

    public static /* synthetic */ void c(g gVar, BitmapDrawable bitmapDrawable) {
        l(gVar, bitmapDrawable);
    }

    private final void g() {
        synchronized (this) {
            for (b bVar : e()) {
                bVar.a();
            }
            e().clear();
            b0 b0Var = b0.f54756a;
        }
    }

    private final void h(BitmapDrawable bitmapDrawable) {
        synchronized (this) {
            for (b bVar : e()) {
                bVar.b(bitmapDrawable);
            }
            e().clear();
            b0 b0Var = b0.f54756a;
        }
    }

    private final void i() {
        com.adyen.checkout.core.api.g.f9590a.post(new Runnable() { // from class: d7.e
            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.b(g.this);
            }
        });
    }

    public static final void j(g this$0) {
        s.g(this$0, "this$0");
        this$0.f23769c.k(this$0.f(), null);
        this$0.g();
    }

    private final void k(final BitmapDrawable bitmapDrawable) {
        com.adyen.checkout.core.api.g.f9590a.post(new Runnable() { // from class: d7.f
            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.c(g.this, bitmapDrawable);
            }
        });
    }

    public static final void l(g this$0, BitmapDrawable drawable) {
        s.g(this$0, "this$0");
        s.g(drawable, "$drawable");
        this$0.f23769c.k(this$0.f(), drawable);
        this$0.h(drawable);
    }

    public final void d(b callback) {
        s.g(callback, "callback");
        synchronized (this) {
            e().add(callback);
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        String str = f23768f;
        o7.b.f(str, "done");
        if (isCancelled()) {
            o7.b.a(str, "canceled");
            i();
            return;
        }
        try {
            BitmapDrawable result = get(100L, TimeUnit.MILLISECONDS);
            s.f(result, "result");
            k(result);
        } catch (InterruptedException e11) {
            o7.b.d(f23768f, "Execution interrupted.", e11);
            i();
        } catch (ExecutionException unused) {
            o7.b.c(f23768f, s.p("Execution failed for logo  - ", this.f23770d));
            i();
        } catch (TimeoutException e12) {
            o7.b.d(f23768f, "Execution timed out.", e12);
            i();
        }
    }

    public final HashSet<b> e() {
        return this.f23771e;
    }

    public final String f() {
        return this.f23770d;
    }
}
package atd.a;

import android.os.Handler;
import android.os.Looper;
import atd.d.j;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d<T extends atd.d.j> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c<T> f6736a;

    /* renamed from: b  reason: collision with root package name */
    private final Callable<T> f6737b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ atd.d.j f6738a;

        a(atd.d.j jVar) {
            this.f6738a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f6736a.a(this.f6738a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Exception f6740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6741b;

        b(Exception exc, String str) {
            this.f6740a = exc;
            this.f6741b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f6736a.a(this.f6740a, this.f6741b);
        }
    }

    public d(c<T> cVar, Callable<T> callable) {
        this.f6736a = cVar;
        this.f6737b = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a((d<T>) this.f6737b.call());
        } catch (Exception e11) {
            a(e11, atd.s0.a.a(-102918965226048L));
        }
    }

    private void a(T t11) {
        a(new a(t11));
    }

    private void a(Exception exc, String str) {
        a(new b(exc, str));
    }

    private void a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
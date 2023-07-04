package y70;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y70.f;
import y70.g;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: m  reason: collision with root package name */
    private static final ExecutorService f59347m = Executors.newCachedThreadPool();

    /* renamed from: e  reason: collision with root package name */
    boolean f59352e;

    /* renamed from: g  reason: collision with root package name */
    boolean f59354g;

    /* renamed from: h  reason: collision with root package name */
    boolean f59355h;

    /* renamed from: j  reason: collision with root package name */
    List<z70.b> f59357j;

    /* renamed from: k  reason: collision with root package name */
    f f59358k;

    /* renamed from: l  reason: collision with root package name */
    g f59359l;

    /* renamed from: a  reason: collision with root package name */
    boolean f59348a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f59349b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f59350c = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f59351d = true;

    /* renamed from: f  reason: collision with root package name */
    boolean f59353f = true;

    /* renamed from: i  reason: collision with root package name */
    ExecutorService f59356i = f59347m;

    Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f b() {
        f fVar = this.f59358k;
        return fVar != null ? fVar : (!f.a.c() || a() == null) ? new f.b() : new f.a("EventBus");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g c() {
        Object a11;
        g gVar = this.f59359l;
        if (gVar != null) {
            return gVar;
        }
        if (!f.a.c() || (a11 = a()) == null) {
            return null;
        }
        return new g.a((Looper) a11);
    }
}
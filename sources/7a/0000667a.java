package e;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f24373a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f24374b;

    public void a(b bVar) {
        if (this.f24374b != null) {
            bVar.a(this.f24374b);
        }
        this.f24373a.add(bVar);
    }

    public void b() {
        this.f24374b = null;
    }

    public void c(Context context) {
        this.f24374b = context;
        for (b bVar : this.f24373a) {
            bVar.a(context);
        }
    }

    public Context d() {
        return this.f24374b;
    }

    public void e(b bVar) {
        this.f24373a.remove(bVar);
    }
}
package x1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.b0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private h00.a<b0> f56780a;

    private j() {
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(v1.e eVar);

    public h00.a<b0> b() {
        return this.f56780a;
    }

    public final void c() {
        h00.a<b0> b11 = b();
        if (b11 == null) {
            return;
        }
        b11.invoke();
    }

    public void d(h00.a<b0> aVar) {
        this.f56780a = aVar;
    }
}
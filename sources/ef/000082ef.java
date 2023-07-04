package la;

import java.io.File;
import la.a;

/* loaded from: classes.dex */
public class d implements a.InterfaceC0700a {

    /* renamed from: a  reason: collision with root package name */
    private final long f37129a;

    /* renamed from: b  reason: collision with root package name */
    private final a f37130b;

    /* loaded from: classes.dex */
    public interface a {
        File a();
    }

    public d(a aVar, long j11) {
        this.f37129a = j11;
        this.f37130b = aVar;
    }

    @Override // la.a.InterfaceC0700a
    public la.a build() {
        File a11 = this.f37130b.a();
        if (a11 == null) {
            return null;
        }
        if (a11.isDirectory() || a11.mkdirs()) {
            return e.c(a11, this.f37129a);
        }
        return null;
    }
}
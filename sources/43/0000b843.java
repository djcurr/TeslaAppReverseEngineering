package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final a f53754a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        String a();

        Object b();

        Surface getSurface();
    }

    public b(Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            this.f53754a = new e(surface);
        } else if (i11 >= 26) {
            this.f53754a = new d(surface);
        } else if (i11 >= 24) {
            this.f53754a = new c(surface);
        } else {
            this.f53754a = new f(surface);
        }
    }

    public static b d(Object obj) {
        a c11;
        if (obj == null) {
            return null;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            c11 = e.e((OutputConfiguration) obj);
        } else if (i11 >= 26) {
            c11 = d.d((OutputConfiguration) obj);
        } else {
            c11 = i11 >= 24 ? c.c((OutputConfiguration) obj) : null;
        }
        if (c11 == null) {
            return null;
        }
        return new b(c11);
    }

    public String a() {
        return this.f53754a.a();
    }

    public Surface b() {
        return this.f53754a.getSurface();
    }

    public Object c() {
        return this.f53754a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f53754a.equals(((b) obj).f53754a);
        }
        return false;
    }

    public int hashCode() {
        return this.f53754a.hashCode();
    }

    private b(a aVar) {
        this.f53754a = aVar;
    }
}
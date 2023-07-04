package fx;

import ix.g;

/* loaded from: classes5.dex */
public class b implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final b f27035c = null;

    /* renamed from: d  reason: collision with root package name */
    static /* synthetic */ Class f27036d;

    static {
        if (f27036d == null) {
            f27036d = a("org.python.core.PyObject");
        }
        new b();
    }

    public b() {
        new a(this);
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
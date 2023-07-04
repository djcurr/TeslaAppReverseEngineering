package mp;

import org.aspectj.lang.NoAspectBoundException;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static /* synthetic */ Throwable f38683a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ f f38684b = null;

    static {
        try {
            a();
        } catch (Throwable th2) {
            f38683a = th2;
        }
    }

    private static /* synthetic */ void a() {
        f38684b = new f();
    }

    public static f b() {
        f fVar = f38684b;
        if (fVar != null) {
            return fVar;
        }
        throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", f38683a);
    }

    public void c(a40.a aVar) {
        if (aVar.a() instanceof a) {
            if (((a) aVar.a()).i()) {
                return;
            }
            ((a) aVar.a()).l();
            return;
        }
        throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
    }
}
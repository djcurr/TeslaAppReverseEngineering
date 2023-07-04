package g20;

/* loaded from: classes5.dex */
public abstract class o extends y00.z {

    /* renamed from: g  reason: collision with root package name */
    private final j20.n f27429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u10.c fqName, j20.n storageManager, w00.x module) {
        super(module, fqName);
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(module, "module");
        this.f27429g = storageManager;
    }

    public abstract g F0();

    public boolean G0(u10.f name) {
        kotlin.jvm.internal.s.g(name, "name");
        d20.h m11 = m();
        return (m11 instanceof i20.h) && ((i20.h) m11).r().contains(name);
    }

    public abstract void H0(j jVar);
}
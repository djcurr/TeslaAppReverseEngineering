package pp;

/* loaded from: classes2.dex */
public abstract class f {
    public static f a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new a(cls.getSimpleName());
        }
        return new d(cls.getSimpleName());
    }

    public abstract void b(String str);
}
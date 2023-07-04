package freemarker.core;

/* loaded from: classes5.dex */
public class NonDateException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26842l;

    static {
        if (f26842l == null) {
            f26842l = l("freemarker.template.TemplateDateModel");
        }
    }

    static /* synthetic */ Class l(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }
}
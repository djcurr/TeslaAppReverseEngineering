package freemarker.core;

/* loaded from: classes5.dex */
public class NonNumericalException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26847l;

    static {
        if (f26847l == null) {
            f26847l = l("freemarker.template.TemplateNumberModel");
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
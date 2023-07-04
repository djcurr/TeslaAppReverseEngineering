package freemarker.core;

/* loaded from: classes5.dex */
public class NonMethodException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26845l;

    static {
        if (f26845l == null) {
            f26845l = l("freemarker.template.TemplateMethodModel");
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
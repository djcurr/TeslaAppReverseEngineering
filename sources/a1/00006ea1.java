package freemarker.core;

/* loaded from: classes5.dex */
public class NonBooleanException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26841l;

    static {
        if (f26841l == null) {
            f26841l = l("freemarker.template.TemplateBooleanModel");
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
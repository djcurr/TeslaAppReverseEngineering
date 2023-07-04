package freemarker.core;

/* loaded from: classes5.dex */
public class NonSequenceException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26848l;

    static {
        if (f26848l == null) {
            f26848l = l("freemarker.template.TemplateSequenceModel");
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
package freemarker.core;

/* loaded from: classes5.dex */
public class NonHashException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26844l;

    static {
        if (f26844l == null) {
            f26844l = l("freemarker.template.TemplateHashModel");
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
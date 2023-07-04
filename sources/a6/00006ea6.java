package freemarker.core;

/* loaded from: classes5.dex */
public class NonNodeException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26846l;

    static {
        if (f26846l == null) {
            f26846l = l("freemarker.template.TemplateNodeModel");
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
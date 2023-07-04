package freemarker.core;

/* loaded from: classes5.dex */
public class NonExtendedHashException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26843l;

    static {
        if (f26843l == null) {
            f26843l = l("freemarker.template.TemplateHashModelEx");
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
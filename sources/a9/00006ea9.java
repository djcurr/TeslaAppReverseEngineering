package freemarker.core;

/* loaded from: classes5.dex */
public class NonSequenceOrCollectionException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26849l;

    /* renamed from: m  reason: collision with root package name */
    static /* synthetic */ Class f26850m;

    static {
        if (f26849l == null) {
            f26849l = l("freemarker.template.TemplateSequenceModel");
        }
        if (f26850m == null) {
            f26850m = l("freemarker.template.TemplateCollectionModel");
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
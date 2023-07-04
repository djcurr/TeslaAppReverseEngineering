package freemarker.core;

/* loaded from: classes5.dex */
public class NonStringException extends UnexpectedTypeException {

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26851l;

    /* renamed from: m  reason: collision with root package name */
    static /* synthetic */ Class f26852m;

    /* renamed from: n  reason: collision with root package name */
    static /* synthetic */ Class f26853n;

    /* renamed from: o  reason: collision with root package name */
    static /* synthetic */ Class f26854o;

    static {
        if (f26851l == null) {
            f26851l = l("freemarker.template.TemplateScalarModel");
        }
        if (f26852m == null) {
            f26852m = l("freemarker.template.TemplateNumberModel");
        }
        if (f26853n == null) {
            f26853n = l("freemarker.template.TemplateDateModel");
        }
        if (f26854o == null) {
            f26854o = l("freemarker.template.TemplateBooleanModel");
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
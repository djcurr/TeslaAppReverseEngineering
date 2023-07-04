package freemarker.template;

/* loaded from: classes5.dex */
public class TemplateModelException extends TemplateException {
    public TemplateModelException() {
        this(null, null);
    }

    public TemplateModelException(String str, Exception exc) {
        super(str, exc, null);
    }
}
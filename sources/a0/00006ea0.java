package freemarker.core;

import freemarker.template.TemplateException;

/* loaded from: classes5.dex */
public class InvalidReferenceException extends TemplateException {
    static {
        c c11 = c.c();
        try {
            c.h(null);
            new InvalidReferenceException("Invalid reference. Details are unavilable, as this should have been handled by an FTL construct. If it wasn't, that's problably a bug in FreeMarker.", null);
        } finally {
            c.h(c11);
        }
    }

    public InvalidReferenceException(String str, c cVar) {
        super(str, cVar);
    }
}
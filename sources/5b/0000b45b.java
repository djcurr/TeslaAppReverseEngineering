package t2;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.s;
import wz.v;

/* loaded from: classes.dex */
public final class b implements h {
    @Override // t2.h
    public List<g> a() {
        List<g> d11;
        Locale locale = Locale.getDefault();
        s.f(locale, "getDefault()");
        d11 = v.d(new a(locale));
        return d11;
    }

    @Override // t2.h
    public g b(String languageTag) {
        s.g(languageTag, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(languageTag);
        s.f(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
package t2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c implements h {
    @Override // t2.h
    public List<g> a() {
        LocaleList localeList = LocaleList.getDefault();
        s.f(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            Locale locale = localeList.get(i11);
            s.f(locale, "localeList[i]");
            arrayList.add(new a(locale));
            i11 = i12;
        }
        return arrayList;
    }

    @Override // t2.h
    public g b(String languageTag) {
        s.g(languageTag, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(languageTag);
        s.f(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
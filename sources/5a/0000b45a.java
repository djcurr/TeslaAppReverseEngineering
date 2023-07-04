package t2;

import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Locale f51560a;

    public a(Locale javaLocale) {
        s.g(javaLocale, "javaLocale");
        this.f51560a = javaLocale;
    }

    @Override // t2.g
    public String a() {
        String languageTag = this.f51560a.toLanguageTag();
        s.f(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    @Override // t2.g
    public String b() {
        String country = this.f51560a.getCountry();
        s.f(country, "javaLocale.country");
        return country;
    }

    public final Locale c() {
        return this.f51560a;
    }
}
package net.time4j.i18n;

import java.util.Locale;

/* loaded from: classes5.dex */
public enum d {
    tl("fil"),
    no("nb"),
    in("id"),
    iw("he");
    
    static final d[] ALIASES = values();
    private final String alias;

    d(String str) {
        this.alias = str;
    }

    public static String getAlias(Locale locale) {
        d[] dVarArr;
        String language = locale.getLanguage();
        if (language.equals("no") && locale.getVariant().equals("NY") && locale.getCountry().equals("NO")) {
            return "nn";
        }
        for (d dVar : ALIASES) {
            if (language.equals(dVar.name())) {
                return dVar.alias;
            }
        }
        return language;
    }
}
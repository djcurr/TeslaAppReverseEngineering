package com.tesla.domain.model;

import android.content.Context;
import android.os.LocaleList;
import androidx.annotation.Keep;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zu.f;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b,\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/tesla/domain/model/DataRestrictedCountry;", "", "", "iso2", "Ljava/lang/String;", "getIso2", "()Ljava/lang/String;", "iso3", "getIso3", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Companion", "a", "CHINA", "AUSTRIA", "BELGIUM", "BULGARIA", "CROATIA", "CYPRUS", "CZECHIA", "DENMARK", "ESTONIA", "FINLAND", "FRANCE", "GERMANY", "GREECE", "HUNGARY", "IRELAND", "ITALY", "LATVIA", "LITHUANIA", "LUXEMBOURG", "MALTA", "NETHERLANDS", "POLAND", "PORTUGAL", "ROMANIA", "SLOVAKIA", "SLOVENIA", "SPAIN", "SWEDEN", "ICELAND", "LIECHTENSTEIN", "NORWAY", "SWITZERLAND", "UNITEDKINGDOM", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public enum DataRestrictedCountry {
    CHINA("cn", "CHN"),
    AUSTRIA("at", "AUT"),
    BELGIUM("be", "BEL"),
    BULGARIA("bg", "BGR"),
    CROATIA("hr", "HRV"),
    CYPRUS("cy", "CYP"),
    CZECHIA("cz", "CZE"),
    DENMARK("dk", "DNK"),
    ESTONIA("ee", "EST"),
    FINLAND("fi", "FIN"),
    FRANCE("fr", "FRA"),
    GERMANY("de", "DEU"),
    GREECE("gr", "GRC"),
    HUNGARY("hu", "HUN"),
    IRELAND("ie", "IRL"),
    ITALY("it", "ITA"),
    LATVIA("lv", "LVA"),
    LITHUANIA("lt", "LTU"),
    LUXEMBOURG("lu", "LUX"),
    MALTA("mt", "MLT"),
    NETHERLANDS("nl", "NLD"),
    POLAND("pl", "POL"),
    PORTUGAL("pt", "PRT"),
    ROMANIA("ro", "ROU"),
    SLOVAKIA("sk", "SVK"),
    SLOVENIA("si", "SVN"),
    SPAIN("es", "ESP"),
    SWEDEN("se", "SWE"),
    ICELAND("is", "ISL"),
    LIECHTENSTEIN("li", "LIE"),
    NORWAY("no", "nor"),
    SWITZERLAND("ch", "CHE"),
    UNITEDKINGDOM("gb", "GBR");
    
    private static final HashSet<String> iso2Countries;
    private static final HashSet<String> iso3Countries;
    private final String iso2;
    private final String iso3;
    public static final a Companion = new a(null);
    private static final String TAG = "DataRestrictedCountry";
    private static final g logger = g.f21878b.a(TAG);

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: com.tesla.domain.model.DataRestrictedCountry$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0394a {

            /* renamed from: a  reason: collision with root package name */
            private final String f21815a;

            /* renamed from: b  reason: collision with root package name */
            private final String f21816b;

            /* renamed from: c  reason: collision with root package name */
            private final LocaleList f21817c;

            public C0394a(String str, String str2, LocaleList locales) {
                s.g(locales, "locales");
                this.f21815a = str;
                this.f21816b = str2;
                this.f21817c = locales;
            }

            public final String a() {
                return this.f21815a;
            }

            public final String b() {
                return this.f21816b;
            }

            public final LocaleList c() {
                return this.f21817c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0394a) {
                    C0394a c0394a = (C0394a) obj;
                    return s.c(this.f21815a, c0394a.f21815a) && s.c(this.f21816b, c0394a.f21816b) && s.c(this.f21817c, c0394a.f21817c);
                }
                return false;
            }

            public int hashCode() {
                String str = this.f21815a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f21816b;
                return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f21817c.hashCode();
            }

            public String toString() {
                String str = this.f21815a;
                String str2 = this.f21816b;
                LocaleList localeList = this.f21817c;
                return "CountryCodes(network=" + str + ", sim=" + str2 + ", locales=" + localeList + ")";
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean c(String str) {
            HashSet hashSet = DataRestrictedCountry.iso2Countries;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            s.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            if (!hashSet.contains(lowerCase)) {
                HashSet hashSet2 = DataRestrictedCountry.iso3Countries;
                String upperCase = str.toUpperCase(locale);
                s.f(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
                if (!hashSet2.contains(upperCase)) {
                    return false;
                }
            }
            return true;
        }

        public final C0394a a(Context context) {
            s.g(context, "context");
            f fVar = f.f60769a;
            String a11 = fVar.a(context);
            String b11 = fVar.b(context);
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            s.f(locales, "context.resources.configuration.locales");
            return new C0394a(a11, b11, locales);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(android.content.Context r6) {
            /*
                r5 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.s.g(r6, r0)
                com.tesla.domain.model.DataRestrictedCountry$a$a r6 = r5.a(r6)
                java.lang.String r0 = r6.a()
                java.lang.String r1 = r6.b()
                android.os.LocaleList r6 = r6.c()
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L22
                boolean r4 = kotlin.text.m.w(r0)
                if (r4 == 0) goto L20
                goto L22
            L20:
                r4 = r2
                goto L23
            L22:
                r4 = r3
            L23:
                if (r4 != 0) goto L2c
                boolean r0 = r5.c(r0)
                if (r0 == 0) goto L2c
                return r3
            L2c:
                if (r1 == 0) goto L37
                boolean r0 = kotlin.text.m.w(r1)
                if (r0 == 0) goto L35
                goto L37
            L35:
                r0 = r2
                goto L38
            L37:
                r0 = r3
            L38:
                if (r0 != 0) goto L41
                boolean r0 = r5.c(r1)
                if (r0 == 0) goto L41
                return r3
            L41:
                boolean r0 = r6.isEmpty()
                if (r0 != 0) goto L6d
                java.util.Locale r6 = r6.get(r2)
                java.lang.String r0 = r6.getCountry()
                java.lang.String r6 = r6.getISO3Country()     // Catch: java.lang.Exception -> L54
                goto L56
            L54:
                java.lang.String r6 = ""
            L56:
                java.lang.String r1 = "country"
                kotlin.jvm.internal.s.f(r0, r1)
                boolean r0 = r5.c(r0)
                if (r0 != 0) goto L6c
                java.lang.String r0 = "countryIso3"
                kotlin.jvm.internal.s.f(r6, r0)
                boolean r6 = r5.c(r6)
                if (r6 == 0) goto L6d
            L6c:
                return r3
            L6d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.domain.model.DataRestrictedCountry.a.b(android.content.Context):boolean");
        }
    }

    static {
        DataRestrictedCountry[] values = values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DataRestrictedCountry dataRestrictedCountry : values) {
            arrayList.add(dataRestrictedCountry.getIso2());
        }
        iso2Countries = new HashSet<>(arrayList);
        DataRestrictedCountry[] values2 = values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (DataRestrictedCountry dataRestrictedCountry2 : values2) {
            arrayList2.add(dataRestrictedCountry2.getIso3());
        }
        iso3Countries = new HashSet<>(arrayList2);
    }

    DataRestrictedCountry(String str, String str2) {
        this.iso2 = str;
        this.iso3 = str2;
    }

    public final String getIso2() {
        return this.iso2;
    }

    public final String getIso3() {
        return this.iso3;
    }
}
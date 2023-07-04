package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import kotlin.text.v;
import kotlin.text.w;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u0000 *2\u00020\u0001:\u0002+*BQ\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$R\u0019\u0010\u000e\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0010\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0017\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u001b\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u001d\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001d\u0010\rR\u0019\u0010!\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u001f\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0013\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\u0019\u0010\u0012¨\u0006,"}, d2 = {"Lokhttp3/Cookie;", "", "Lokhttp3/HttpUrl;", "url", "", "matches", "other", "equals", "", "hashCode", "", "toString", "-deprecated_name", "()Ljava/lang/String;", "name", "-deprecated_value", "value", "-deprecated_persistent", "()Z", "persistent", "", "-deprecated_expiresAt", "()J", "expiresAt", "-deprecated_hostOnly", "hostOnly", "-deprecated_domain", "domain", "-deprecated_path", "path", "-deprecated_httpOnly", "httpOnly", "-deprecated_secure", "secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "J", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u000f\u001a\u00020\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "", "domain", "", "hostOnly", "name", "value", "", "expiresAt", "hostOnlyDomain", "path", "secure", "httpOnly", "Lokhttp3/Cookie;", "build", "Ljava/lang/String;", "J", "Z", "persistent", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            Objects.requireNonNull(str, "builder.name == null");
            String str2 = this.value;
            Objects.requireNonNull(str2, "builder.value == null");
            long j11 = this.expiresAt;
            String str3 = this.domain;
            Objects.requireNonNull(str3, "builder.domain == null");
            return new Cookie(str, str2, j11, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
        }

        public final Builder domain(String domain) {
            s.g(domain, "domain");
            return domain(domain, false);
        }

        public final Builder expiresAt(long j11) {
            if (j11 <= 0) {
                j11 = Long.MIN_VALUE;
            }
            if (j11 > DatesKt.MAX_DATE) {
                j11 = 253402300799999L;
            }
            this.expiresAt = j11;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            s.g(domain, "domain");
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            CharSequence d12;
            s.g(name, "name");
            d12 = w.d1(name);
            if (s.c(d12.toString(), name)) {
                this.name = name;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final Builder path(String path) {
            boolean H;
            s.g(path, "path");
            H = v.H(path, "/", false, 2, null);
            if (H) {
                this.path = path;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            CharSequence d12;
            s.g(value, "value");
            d12 = w.d1(value);
            if (s.c(d12.toString(), value)) {
                this.value = value;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        private final Builder domain(String str, boolean z11) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z11;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J(\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0007R\u001e\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001e\u0010%\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010&\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006)"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "", "urlHost", "domain", "", "domainMatch", "Lokhttp3/HttpUrl;", "url", "path", "pathMatch", "s", "", "pos", "limit", "", "parseExpires", "input", "invert", "dateCharacterOffset", "parseMaxAge", "parseDomain", "setCookie", "Lokhttp3/Cookie;", "parse", "currentTimeMillis", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "headers", "", "parseAll", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        private final int dateCharacterOffset(String str, int i11, int i12, boolean z11) {
            while (i11 < i12) {
                char charAt = str.charAt(i11);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z11)) {
                    return i11;
                }
                i11++;
            }
            return i12;
        }

        public final boolean domainMatch(String str, String str2) {
            boolean t11;
            if (s.c(str, str2)) {
                return true;
            }
            t11 = v.t(str, str2, false, 2, null);
            return t11 && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            boolean t11;
            String t02;
            t11 = v.t(str, ".", false, 2, null);
            if (!t11) {
                t02 = w.t0(str, ".");
                String canonicalHost = HostnamesKt.toCanonicalHost(t02);
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseExpires(String str, int i11, int i12) {
            int Z;
            int dateCharacterOffset = dateCharacterOffset(str, i11, i12, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            while (dateCharacterOffset < i12) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i12, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i14 != -1 || !matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    if (i15 != -1 || !matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                        if (i16 != -1 || !matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                            if (i13 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                                String group = matcher.group(1);
                                s.f(group, "matcher.group(1)");
                                i13 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            s.f(group2, "matcher.group(1)");
                            Locale locale = Locale.US;
                            s.f(locale, "Locale.US");
                            Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase = group2.toLowerCase(locale);
                            s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern = Cookie.MONTH_PATTERN.pattern();
                            s.f(pattern, "MONTH_PATTERN.pattern()");
                            Z = w.Z(pattern, lowerCase, 0, false, 6, null);
                            i16 = Z / 4;
                        }
                    } else {
                        String group3 = matcher.group(1);
                        s.f(group3, "matcher.group(1)");
                        i15 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    s.f(group4, "matcher.group(1)");
                    i14 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    s.f(group5, "matcher.group(2)");
                    i17 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    s.f(group6, "matcher.group(3)");
                    i18 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i12, false);
            }
            if (70 <= i13 && 99 >= i13) {
                i13 += 1900;
            }
            if (i13 >= 0 && 69 >= i13) {
                i13 += 2000;
            }
            if (i13 >= 1601) {
                if (i16 != -1) {
                    if (1 <= i15 && 31 >= i15) {
                        if (i14 >= 0 && 23 >= i14) {
                            if (i17 >= 0 && 59 >= i17) {
                                if (i18 >= 0 && 59 >= i18) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i13);
                                    gregorianCalendar.set(2, i16 - 1);
                                    gregorianCalendar.set(5, i15);
                                    gregorianCalendar.set(11, i14);
                                    gregorianCalendar.set(12, i17);
                                    gregorianCalendar.set(13, i18);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseMaxAge(String str) {
            boolean H;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e11) {
                if (new i("-?\\d+").g(str)) {
                    H = v.H(str, "-", false, 2, null);
                    return H ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e11;
            }
        }

        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            boolean H;
            boolean t11;
            String encodedPath = httpUrl.encodedPath();
            if (s.c(encodedPath, str)) {
                return true;
            }
            H = v.H(encodedPath, str, false, 2, null);
            if (H) {
                t11 = v.t(str, "/", false, 2, null);
                if (t11 || encodedPath.charAt(str.length()) == '/') {
                    return true;
                }
            }
            return false;
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            s.g(url, "url");
            s.g(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:154:0x0102, code lost:
            if (r1 > okhttp3.internal.http.DatesKt.MAX_DATE) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x015a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.Cookie parse$okhttp(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 373
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            List<Cookie> i11;
            s.g(url, "url");
            s.g(headers, "headers");
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            for (int i12 = 0; i12 < size; i12++) {
                Cookie parse = parse(url, values.get(i12));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                s.f(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            i11 = wz.w.i();
            return i11;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Cookie(String str, String str2, long j11, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j11;
        this.domain = str3;
        this.path = str4;
        this.secure = z11;
        this.httpOnly = z12;
        this.persistent = z13;
        this.hostOnly = z14;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain */
    public final String m846deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt */
    public final long m847deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly */
    public final boolean m848deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly */
    public final boolean m849deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name */
    public final String m850deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path */
    public final String m851deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent */
    public final boolean m852deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure */
    public final boolean m853deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value */
    public final String m854deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (s.c(cookie.name, this.name) && s.c(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && s.c(cookie.domain, this.domain) && s.c(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        boolean domainMatch;
        s.g(url, "url");
        if (!this.hostOnly) {
            domainMatch = Companion.domainMatch(url.host(), this.domain);
        } else {
            domainMatch = s.c(url.host(), this.domain);
        }
        if (domainMatch && Companion.pathMatch(url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (z11) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        s.f(sb3, "toString()");
        return sb3;
    }

    public final String value() {
        return this.value;
    }

    public /* synthetic */ Cookie(String str, String str2, long j11, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j11, str3, str4, z11, z12, z13, z14);
    }
}
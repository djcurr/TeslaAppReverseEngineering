package r3;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class h implements i {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f49119c = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f49120a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49121b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        g.b("en-Latn");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f49120a = f49119c;
            this.f49121b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < localeArr.length; i11++) {
            Locale locale = localeArr[i11];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb2, locale2);
                    if (i11 < localeArr.length - 1) {
                        sb2.append(CoreConstants.COMMA_CHAR);
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i11 + "] is null");
            }
        }
        this.f49120a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.f49121b = sb2.toString();
    }

    static void c(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append(CoreConstants.DASH_CHAR);
        sb2.append(locale.getCountry());
    }

    @Override // r3.i
    public String a() {
        return this.f49121b;
    }

    @Override // r3.i
    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f49120a;
        if (this.f49120a.length != localeArr.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            Locale[] localeArr2 = this.f49120a;
            if (i11 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i11].equals(localeArr[i11])) {
                return false;
            }
            i11++;
        }
    }

    @Override // r3.i
    public Locale get(int i11) {
        if (i11 >= 0) {
            Locale[] localeArr = this.f49120a;
            if (i11 < localeArr.length) {
                return localeArr[i11];
            }
        }
        return null;
    }

    public int hashCode() {
        int i11 = 1;
        int i12 = 0;
        while (true) {
            Locale[] localeArr = this.f49120a;
            if (i12 >= localeArr.length) {
                return i11;
            }
            i11 = (i11 * 31) + localeArr[i12].hashCode();
            i12++;
        }
    }

    @Override // r3.i
    public boolean isEmpty() {
        return this.f49120a.length == 0;
    }

    @Override // r3.i
    public int size() {
        return this.f49120a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f49120a;
            if (i11 < localeArr.length) {
                sb2.append(localeArr[i11]);
                if (i11 < this.f49120a.length - 1) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
                i11++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
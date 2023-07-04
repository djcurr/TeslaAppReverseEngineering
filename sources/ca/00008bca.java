package net.time4j.history;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class h implements Comparable<h> {

    /* renamed from: a  reason: collision with root package name */
    private final j f41399a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41400b;

    /* renamed from: c  reason: collision with root package name */
    private final int f41401c;

    /* renamed from: d  reason: collision with root package name */
    private final int f41402d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j jVar, int i11, int i12, int i13) {
        this.f41399a = jVar;
        this.f41400b = i11;
        this.f41401c = i12;
        this.f41402d = i13;
    }

    public static h f(j jVar, int i11, int i12, int i13) {
        return g(jVar, i11, i12, i13, p.DUAL_DATING, o.f41410d);
    }

    public static h g(j jVar, int i11, int i12, int i13, p pVar, o oVar) {
        Objects.requireNonNull(jVar, "Missing historic era.");
        if (i13 < 1 || i13 > 31) {
            throw new IllegalArgumentException("Day of month out of range: " + h(jVar, i11, i12, i13));
        } else if (i12 >= 1 && i12 <= 12) {
            if (jVar == j.BYZANTINE) {
                if (i11 < 0 || (i11 == 0 && i12 < 9)) {
                    throw new IllegalArgumentException("Before creation of the world: " + h(jVar, i11, i12, i13));
                }
            } else if (i11 < 1) {
                throw new IllegalArgumentException("Year of era must be positive: " + h(jVar, i11, i12, i13));
            }
            if (!pVar.equals(p.DUAL_DATING)) {
                i11 = oVar.f(jVar, i11).standardYear(pVar == p.AFTER_NEW_YEAR, oVar, jVar, i11, i12, i13);
            }
            return new h(jVar, i11, i12, i13);
        } else {
            throw new IllegalArgumentException("Month out of range: " + h(jVar, i11, i12, i13));
        }
    }

    private static String h(j jVar, int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar);
        sb2.append(CoreConstants.DASH_CHAR);
        String valueOf = String.valueOf(i11);
        for (int length = 4 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(h hVar) {
        int annoDomini = this.f41399a.annoDomini(this.f41400b);
        int annoDomini2 = hVar.f41399a.annoDomini(hVar.f41400b);
        if (annoDomini < annoDomini2) {
            return -1;
        }
        if (annoDomini > annoDomini2) {
            return 1;
        }
        int month = getMonth() - hVar.getMonth();
        if (month == 0) {
            month = b() - hVar.b();
        }
        if (month < 0) {
            return -1;
        }
        return month > 0 ? 1 : 0;
    }

    public int b() {
        return this.f41402d;
    }

    public j c() {
        return this.f41399a;
    }

    public int d() {
        return this.f41400b;
    }

    public int e(o oVar) {
        return oVar.c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f41399a == hVar.f41399a && this.f41400b == hVar.f41400b && this.f41401c == hVar.f41401c && this.f41402d == hVar.f41402d;
        }
        return false;
    }

    public int getMonth() {
        return this.f41401c;
    }

    public int hashCode() {
        int i11 = (this.f41400b * 1000) + (this.f41401c * 32) + this.f41402d;
        return this.f41399a == j.AD ? i11 : -i11;
    }

    public String toString() {
        return h(this.f41399a, this.f41400b, this.f41401c, this.f41402d);
    }
}
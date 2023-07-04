package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import j$.time.format.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes7.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: f  reason: collision with root package name */
    public static final DateTimeFormatter f32884f;

    /* renamed from: a  reason: collision with root package name */
    private final f.a f32885a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f32886b;

    /* renamed from: c  reason: collision with root package name */
    private final s f32887c;

    /* renamed from: d  reason: collision with root package name */
    private final j$.time.chrono.f f32888d;

    /* renamed from: e  reason: collision with root package name */
    private final j$.time.k f32889e;

    static {
        f fVar = new f();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        u uVar = u.EXCEEDS_PAD;
        f l11 = fVar.l(aVar, 4, 10, uVar);
        l11.e(CoreConstants.DASH_CHAR);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        l11.k(aVar2, 2);
        l11.e(CoreConstants.DASH_CHAR);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        l11.k(aVar3, 2);
        j$.time.chrono.g gVar = j$.time.chrono.g.f32874a;
        DateTimeFormatter s11 = l11.s(1, gVar);
        ISO_LOCAL_DATE = s11;
        f fVar2 = new f();
        fVar2.p();
        fVar2.a(s11);
        fVar2.h();
        fVar2.s(1, gVar);
        f fVar3 = new f();
        fVar3.p();
        fVar3.a(s11);
        fVar3.o();
        fVar3.h();
        fVar3.s(1, gVar);
        f fVar4 = new f();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        fVar4.k(aVar4, 2);
        fVar4.e(CoreConstants.COLON_CHAR);
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        fVar4.k(aVar5, 2);
        fVar4.o();
        fVar4.e(CoreConstants.COLON_CHAR);
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        fVar4.k(aVar6, 2);
        fVar4.o();
        fVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter s12 = fVar4.s(1, null);
        f fVar5 = new f();
        fVar5.p();
        fVar5.a(s12);
        fVar5.h();
        fVar5.s(1, null);
        f fVar6 = new f();
        fVar6.p();
        fVar6.a(s12);
        fVar6.o();
        fVar6.h();
        fVar6.s(1, null);
        f fVar7 = new f();
        fVar7.p();
        fVar7.a(s11);
        fVar7.e('T');
        fVar7.a(s12);
        DateTimeFormatter s13 = fVar7.s(1, gVar);
        f fVar8 = new f();
        fVar8.p();
        fVar8.a(s13);
        fVar8.h();
        DateTimeFormatter s14 = fVar8.s(1, gVar);
        f fVar9 = new f();
        fVar9.a(s14);
        fVar9.o();
        fVar9.e('[');
        fVar9.q();
        fVar9.m();
        fVar9.e(']');
        fVar9.s(1, gVar);
        f fVar10 = new f();
        fVar10.a(s13);
        fVar10.o();
        fVar10.h();
        fVar10.o();
        fVar10.e('[');
        fVar10.q();
        fVar10.m();
        fVar10.e(']');
        fVar10.s(1, gVar);
        f fVar11 = new f();
        fVar11.p();
        f l12 = fVar11.l(aVar, 4, 10, uVar);
        l12.e(CoreConstants.DASH_CHAR);
        l12.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        l12.o();
        l12.h();
        l12.s(1, gVar);
        f fVar12 = new f();
        fVar12.p();
        f l13 = fVar12.l(j$.time.temporal.j.f32961c, 4, 10, uVar);
        l13.f("-W");
        l13.k(j$.time.temporal.j.f32960b, 2);
        l13.e(CoreConstants.DASH_CHAR);
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        l13.k(aVar7, 1);
        l13.o();
        l13.h();
        l13.s(1, gVar);
        f fVar13 = new f();
        fVar13.p();
        fVar13.c();
        f32884f = fVar13.s(1, null);
        f fVar14 = new f();
        fVar14.p();
        fVar14.k(aVar, 4);
        fVar14.k(aVar2, 2);
        fVar14.k(aVar3, 2);
        fVar14.o();
        fVar14.g("+HHMMss", "Z");
        fVar14.s(1, gVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        f fVar15 = new f();
        fVar15.p();
        fVar15.r();
        fVar15.o();
        fVar15.i(aVar7, hashMap);
        fVar15.f(", ");
        fVar15.n();
        f l14 = fVar15.l(aVar3, 1, 2, u.NOT_NEGATIVE);
        l14.e(' ');
        l14.i(aVar2, hashMap2);
        l14.e(' ');
        l14.k(aVar, 4);
        l14.e(' ');
        l14.k(aVar4, 2);
        l14.e(CoreConstants.COLON_CHAR);
        l14.k(aVar5, 2);
        l14.o();
        l14.e(CoreConstants.COLON_CHAR);
        l14.k(aVar6, 2);
        l14.n();
        l14.e(' ');
        l14.g("+HHMM", "GMT");
        l14.s(2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(f.a aVar, Locale locale, s sVar, int i11, Set set, j$.time.chrono.f fVar, j$.time.k kVar) {
        Objects.requireNonNull(aVar, "printerParser");
        this.f32885a = aVar;
        Objects.requireNonNull(locale, "locale");
        this.f32886b = locale;
        Objects.requireNonNull(sVar, "decimalStyle");
        this.f32887c = sVar;
        t.a(i11, "resolverStyle");
        this.f32888d = fVar;
        this.f32889e = kVar;
    }

    public String a(j$.time.temporal.k kVar) {
        StringBuilder sb2 = new StringBuilder(32);
        try {
            this.f32885a.c(new q(kVar, this), sb2);
            return sb2.toString();
        } catch (IOException e11) {
            throw new j$.time.c(e11.getMessage(), e11);
        }
    }

    public j$.time.chrono.f b() {
        return this.f32888d;
    }

    public s c() {
        return this.f32887c;
    }

    public Locale d() {
        return this.f32886b;
    }

    public j$.time.k e() {
        return this.f32889e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.a f(boolean z11) {
        return this.f32885a.a(z11);
    }

    public String toString() {
        String aVar = this.f32885a.toString();
        return aVar.startsWith("[") ? aVar : aVar.substring(1, aVar.length() - 1);
    }
}
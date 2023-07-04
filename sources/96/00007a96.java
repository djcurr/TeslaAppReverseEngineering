package j$.time;

import j$.time.temporal.o;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import j$.time.temporal.x;

/* loaded from: classes7.dex */
public enum d implements j$.time.temporal.k {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a  reason: collision with root package name */
    private static final d[] f32875a = values();

    public static d i(int i11) {
        if (i11 < 1 || i11 > 7) {
            throw new c("Invalid value for DayOfWeek: " + i11);
        }
        return f32875a[i11 - 1];
    }

    @Override // j$.time.temporal.k
    public int b(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.DAY_OF_WEEK ? h() : super.b(lVar);
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.DAY_OF_WEEK : lVar != null && lVar.h(this);
    }

    @Override // j$.time.temporal.k
    public Object d(u uVar) {
        int i11 = t.f32969a;
        return uVar == o.f32964a ? j$.time.temporal.b.DAYS : super.d(uVar);
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return h();
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new w("Unsupported field: " + lVar);
        }
        return lVar.d(this);
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.DAY_OF_WEEK ? lVar.g() : super.g(lVar);
    }

    public int h() {
        return ordinal() + 1;
    }
}
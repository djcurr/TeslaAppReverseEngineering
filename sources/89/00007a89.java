package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import j$.time.temporal.x;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;

/* loaded from: classes7.dex */
public final class ZoneOffset extends k implements j$.time.temporal.k, Comparable<ZoneOffset> {

    /* renamed from: b  reason: collision with root package name */
    private final int f32866b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f32867c;

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap f32862d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap f32863e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = q(0);

    /* renamed from: f  reason: collision with root package name */
    public static final ZoneOffset f32864f = q(-64800);

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneOffset f32865g = q(64800);

    private ZoneOffset(int i11) {
        String sb2;
        this.f32866b = i11;
        if (i11 == 0) {
            sb2 = "Z";
        } else {
            int abs = Math.abs(i11);
            StringBuilder sb3 = new StringBuilder();
            int i12 = abs / 3600;
            int i13 = (abs / 60) % 60;
            sb3.append(i11 < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
            sb3.append(i12 < 10 ? "0" : "");
            sb3.append(i12);
            sb3.append(i13 < 10 ? ":0" : ":");
            sb3.append(i13);
            int i14 = abs % 60;
            if (i14 != 0) {
                sb3.append(i14 >= 10 ? ":" : ":0");
                sb3.append(i14);
            }
            sb2 = sb3.toString();
        }
        this.f32867c = sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.ZoneOffset o(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = j$.time.ZoneOffset.f32863e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L70
            r1 = 3
            if (r0 == r1) goto L8c
            r4 = 5
            if (r0 == r4) goto L66
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L5d
            r5 = 7
            if (r0 == r5) goto L50
            r1 = 9
            if (r0 != r1) goto L39
            int r0 = r(r7, r2, r3)
            int r1 = r(r7, r6, r2)
            int r2 = r(r7, r5, r2)
            goto L92
        L39:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L50:
            int r0 = r(r7, r2, r3)
            int r1 = r(r7, r1, r3)
            int r2 = r(r7, r4, r3)
            goto L92
        L5d:
            int r0 = r(r7, r2, r3)
            int r1 = r(r7, r6, r2)
            goto L6e
        L66:
            int r0 = r(r7, r2, r3)
            int r1 = r(r7, r1, r3)
        L6e:
            r2 = r3
            goto L92
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L8c:
            int r0 = r(r7, r2, r3)
            r1 = r3
            r2 = r1
        L92:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto Lb6
            if (r3 != r5) goto L9f
            goto Lb6
        L9f:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        Lb6:
            if (r3 != r5) goto Lc0
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = p(r7, r0, r1)
            return r7
        Lc0:
            j$.time.ZoneOffset r7 = p(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.o(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset p(int i11, int i12, int i13) {
        if (i11 < -18 || i11 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i11 + " is not in the range -18 to 18");
        }
        if (i11 > 0) {
            if (i12 < 0 || i13 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i11 < 0) {
            if (i12 > 0 || i13 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i12 > 0 && i13 < 0) || (i12 < 0 && i13 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i12 < -59 || i12 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i12 + " is not in the range -59 to 59");
        } else if (i13 < -59 || i13 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i13 + " is not in the range -59 to 59");
        } else if (Math.abs(i11) != 18 || (i12 | i13) == 0) {
            return q((i12 * 60) + (i11 * 3600) + i13);
        } else {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset q(int i11) {
        if (i11 < -64800 || i11 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i11 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i11);
            ConcurrentMap concurrentMap = f32862d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i11));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(valueOf);
                f32863e.putIfAbsent(zoneOffset2.f32867c, zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i11);
    }

    private static int r(CharSequence charSequence, int i11, boolean z11) {
        if (z11 && charSequence.charAt(i11 - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i11);
        char charAt2 = charSequence.charAt(i11 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    @Override // j$.time.temporal.k
    public int b(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f32866b;
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new w("Unsupported field: " + lVar);
        }
        return super.g(lVar).a(e(lVar), lVar);
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.OFFSET_SECONDS : lVar != null && lVar.h(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f32866b - this.f32866b;
    }

    @Override // j$.time.temporal.k
    public Object d(u uVar) {
        int i11 = t.f32969a;
        return (uVar == p.f32965a || uVar == q.f32966a) ? this : super.d(uVar);
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f32866b;
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new w("Unsupported field: " + lVar);
        }
        return lVar.d(this);
    }

    @Override // j$.time.k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f32866b == ((ZoneOffset) obj).f32866b;
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        return super.g(lVar);
    }

    @Override // j$.time.k
    public String h() {
        return this.f32867c;
    }

    @Override // j$.time.k
    public int hashCode() {
        return this.f32866b;
    }

    @Override // j$.time.k
    public j$.time.zone.c i() {
        return j$.time.zone.c.e(this);
    }

    public int n() {
        return this.f32866b;
    }

    @Override // j$.time.k
    public String toString() {
        return this.f32867c;
    }
}
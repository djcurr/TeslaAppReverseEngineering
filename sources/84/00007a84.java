package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.w;
import j$.time.temporal.x;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class Instant implements Comparable<Instant>, Serializable, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f32851a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32852b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32853a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f32854b;

        static {
            int[] iArr = new int[j$.time.temporal.b.values().length];
            f32854b = iArr;
            try {
                iArr[j$.time.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32854b[j$.time.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32854b[j$.time.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32854b[j$.time.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32854b[j$.time.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32854b[j$.time.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32854b[j$.time.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32854b[j$.time.temporal.b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[j$.time.temporal.a.values().length];
            f32853a = iArr2;
            try {
                iArr2[j$.time.temporal.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32853a[j$.time.temporal.a.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32853a[j$.time.temporal.a.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32853a[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    private Instant(long j11, int i11) {
        this.f32851a = j11;
        this.f32852b = i11;
    }

    private static Instant i(long j11, int i11) {
        if ((i11 | j11) == 0) {
            return EPOCH;
        }
        if (j11 < -31557014167219200L || j11 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j11, i11);
    }

    public static Instant now() {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j11) {
        return i(Math.floorDiv(j11, 1000L), ((int) Math.floorMod(j11, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j11, long j12) {
        return i(Math.addExact(j11, Math.floorDiv(j12, 1000000000L)), (int) Math.floorMod(j12, 1000000000L));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.h(this, zoneOffset);
    }

    public int b(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i11 = a.f32853a[((j$.time.temporal.a) lVar).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            j$.time.temporal.a.INSTANT_SECONDS.k(this.f32851a);
                        }
                        throw new w("Unsupported field: " + lVar);
                    }
                    return this.f32852b / 1000000;
                }
                return this.f32852b / 1000;
            }
            return this.f32852b;
        }
        return super.g(lVar).a(e((j$.time.temporal.a) lVar), lVar);
    }

    public boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.NANO_OF_SECOND || lVar == j$.time.temporal.a.MICRO_OF_SECOND || lVar == j$.time.temporal.a.MILLI_OF_SECOND : lVar != null && lVar.h(this);
    }

    public Object d(u uVar) {
        int i11 = t.f32969a;
        if (uVar == o.f32964a) {
            return j$.time.temporal.b.NANOS;
        }
        if (uVar == n.f32963a || uVar == m.f32962a || uVar == q.f32966a || uVar == p.f32965a || uVar == r.f32967a || uVar == s.f32968a) {
            return null;
        }
        return uVar.a(this);
    }

    public long e(j$.time.temporal.l lVar) {
        int i11;
        if (lVar instanceof j$.time.temporal.a) {
            int i12 = a.f32853a[((j$.time.temporal.a) lVar).ordinal()];
            if (i12 == 1) {
                i11 = this.f32852b;
            } else if (i12 == 2) {
                i11 = this.f32852b / 1000;
            } else if (i12 != 3) {
                if (i12 == 4) {
                    return this.f32851a;
                }
                throw new w("Unsupported field: " + lVar);
            } else {
                i11 = this.f32852b / 1000000;
            }
            return i11;
        }
        return lVar.d(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f32851a == instant.f32851a && this.f32852b == instant.f32852b;
        }
        return false;
    }

    public x g(j$.time.temporal.l lVar) {
        return super.g(lVar);
    }

    public long getEpochSecond() {
        return this.f32851a;
    }

    public int getNano() {
        return this.f32852b;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(Instant instant) {
        int compare = Long.compare(this.f32851a, instant.f32851a);
        return compare != 0 ? compare : this.f32852b - instant.f32852b;
    }

    public int hashCode() {
        long j11 = this.f32851a;
        return (this.f32852b * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public Instant plusMillis(long j11) {
        long j12 = j11 / 1000;
        long j13 = (j11 % 1000) * 1000000;
        if ((j12 | j13) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f32851a, j12), j13 / 1000000000), this.f32852b + (j13 % 1000000000));
    }

    public long toEpochMilli() {
        long multiplyExact;
        int i11;
        long j11 = this.f32851a;
        if (j11 >= 0 || this.f32852b <= 0) {
            multiplyExact = Math.multiplyExact(j11, 1000L);
            i11 = this.f32852b / 1000000;
        } else {
            multiplyExact = Math.multiplyExact(j11 + 1, 1000L);
            i11 = (this.f32852b / 1000000) - 1000;
        }
        return Math.addExact(multiplyExact, i11);
    }

    public String toString() {
        return DateTimeFormatter.f32884f.a(this);
    }
}
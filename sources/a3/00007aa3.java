package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class i implements g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i11) {
    }

    @Override // j$.time.format.g
    public boolean c(q qVar, StringBuilder sb2) {
        Long e11 = qVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.k d11 = qVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d11.c(aVar) ? Long.valueOf(qVar.d().e(aVar)) : null;
        int i11 = 0;
        if (e11 == null) {
            return false;
        }
        long longValue = e11.longValue();
        int k11 = aVar.k(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j11 = (longValue - 315569520000L) + 62167219200L;
            long floorDiv = Math.floorDiv(j11, 315569520000L) + 1;
            LocalDateTime m11 = LocalDateTime.m(Math.floorMod(j11, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (floorDiv > 0) {
                sb2.append('+');
                sb2.append(floorDiv);
            }
            sb2.append(m11);
            if (m11.i() == 0) {
                sb2.append(":00");
            }
        } else {
            long j12 = longValue + 62167219200L;
            long j13 = j12 / 315569520000L;
            long j14 = j12 % 315569520000L;
            LocalDateTime m12 = LocalDateTime.m(j14 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(m12);
            if (m12.i() == 0) {
                sb2.append(":00");
            }
            if (j13 < 0) {
                if (m12.k() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j13 - 1));
                } else if (j14 == 0) {
                    sb2.insert(length, j13);
                } else {
                    sb2.insert(length + 1, Math.abs(j13));
                }
            }
        }
        if (k11 > 0) {
            sb2.append(CoreConstants.DOT);
            int i12 = 100000000;
            while (true) {
                if (k11 <= 0 && i11 % 3 == 0 && i11 >= -2) {
                    break;
                }
                int i13 = k11 / i12;
                sb2.append((char) (i13 + 48));
                k11 -= i13 * i12;
                i12 /= 10;
                i11++;
            }
        }
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return true;
    }

    public String toString() {
        return "Instant()";
    }
}
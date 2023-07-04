package g3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: c  reason: collision with root package name */
    public static int f27528c;

    /* renamed from: a  reason: collision with root package name */
    p f27529a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<p> f27530b = new ArrayList<>();

    public m(p pVar, int i11) {
        this.f27529a = null;
        f27528c++;
        this.f27529a = pVar;
    }

    private long c(f fVar, long j11) {
        p pVar = fVar.f27513d;
        if (pVar instanceof k) {
            return j11;
        }
        int size = fVar.f27520k.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = fVar.f27520k.get(i11);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27513d != pVar) {
                    j12 = Math.min(j12, c(fVar2, fVar2.f27515f + j11));
                }
            }
        }
        if (fVar == pVar.f27548i) {
            long j13 = j11 - pVar.j();
            return Math.min(Math.min(j12, c(pVar.f27547h, j13)), j13 - pVar.f27547h.f27515f);
        }
        return j12;
    }

    private long d(f fVar, long j11) {
        p pVar = fVar.f27513d;
        if (pVar instanceof k) {
            return j11;
        }
        int size = fVar.f27520k.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = fVar.f27520k.get(i11);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27513d != pVar) {
                    j12 = Math.max(j12, d(fVar2, fVar2.f27515f + j11));
                }
            }
        }
        if (fVar == pVar.f27547h) {
            long j13 = j11 + pVar.j();
            return Math.max(Math.max(j12, d(pVar.f27548i, j13)), j13 - pVar.f27548i.f27515f);
        }
        return j12;
    }

    public void a(p pVar) {
        this.f27530b.add(pVar);
    }

    public long b(f3.f fVar, int i11) {
        long j11;
        int i12;
        p pVar = this.f27529a;
        if (pVar instanceof c) {
            if (((c) pVar).f27545f != i11) {
                return 0L;
            }
        } else if (i11 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i11 == 0 ? fVar.f25708d : fVar.f25710e).f27547h;
        f fVar3 = (i11 == 0 ? fVar.f25708d : fVar.f25710e).f27548i;
        boolean contains = pVar.f27547h.f27521l.contains(fVar2);
        boolean contains2 = this.f27529a.f27548i.f27521l.contains(fVar3);
        long j12 = this.f27529a.j();
        if (contains && contains2) {
            long d11 = d(this.f27529a.f27547h, 0L);
            long c11 = c(this.f27529a.f27548i, 0L);
            long j13 = d11 - j12;
            p pVar2 = this.f27529a;
            int i13 = pVar2.f27548i.f27515f;
            if (j13 >= (-i13)) {
                j13 += i13;
            }
            int i14 = pVar2.f27547h.f27515f;
            long j14 = ((-c11) - j12) - i14;
            if (j14 >= i14) {
                j14 -= i14;
            }
            float o11 = pVar2.f27541b.o(i11);
            float f11 = (float) (o11 > BitmapDescriptorFactory.HUE_RED ? (((float) j14) / o11) + (((float) j13) / (1.0f - o11)) : 0L);
            long j15 = (f11 * o11) + 0.5f + j12 + (f11 * (1.0f - o11)) + 0.5f;
            p pVar3 = this.f27529a;
            j11 = pVar3.f27547h.f27515f + j15;
            i12 = pVar3.f27548i.f27515f;
        } else if (contains) {
            f fVar4 = this.f27529a.f27547h;
            return Math.max(d(fVar4, fVar4.f27515f), this.f27529a.f27547h.f27515f + j12);
        } else if (contains2) {
            f fVar5 = this.f27529a.f27548i;
            return Math.max(-c(fVar5, fVar5.f27515f), (-this.f27529a.f27548i.f27515f) + j12);
        } else {
            p pVar4 = this.f27529a;
            j11 = pVar4.f27547h.f27515f + pVar4.j();
            i12 = this.f27529a.f27548i.f27515f;
        }
        return j11 - i12;
    }
}
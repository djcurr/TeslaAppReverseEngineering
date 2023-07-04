package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.b0;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a extends l {
    private static final long serialVersionUID = -5264909488983076587L;

    /* renamed from: a  reason: collision with root package name */
    private final transient q[] f41560a;

    /* renamed from: b  reason: collision with root package name */
    private final transient boolean f41561b;

    /* renamed from: c  reason: collision with root package name */
    private final transient List<q> f41562c;

    /* renamed from: d  reason: collision with root package name */
    private transient int f41563d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<q> list, boolean z11, boolean z12) {
        if (!list.isEmpty()) {
            q[] qVarArr = (q[]) list.toArray(new q[list.size()]);
            boolean z13 = false;
            for (q qVar : qVarArr) {
                z13 = z13 || qVar.d() < 0;
            }
            this.f41561b = z13;
            if (z11) {
                Arrays.sort(qVarArr);
            }
            if (z12) {
                k(qVarArr, list);
            }
            this.f41560a = qVarArr;
            this.f41562c = o(qVarArr, 0L, l.f(1));
            return;
        }
        throw new IllegalArgumentException("Missing timezone transitions.");
    }

    private static void k(q[] qVarArr, List<q> list) {
        int i11 = qVarArr[0].i();
        for (int i12 = 1; i12 < qVarArr.length; i12++) {
            if (i11 == qVarArr[i12].f()) {
                i11 = qVarArr[i12].i();
            } else {
                b0 l02 = b0.l0(qVarArr[i12].e(), m30.f.POSIX);
                throw new IllegalArgumentException("Model inconsistency detected at: " + l02 + " (" + qVarArr[i12].e() + ")  in transitions: " + list);
            }
        }
    }

    private static List<q> o(q[] qVarArr, long j11, long j12) {
        if (j11 <= j12) {
            int r11 = r(j11, qVarArr);
            int r12 = r(j12, qVarArr);
            if (r12 == 0) {
                return Collections.emptyList();
            }
            if (r11 > 0 && qVarArr[r11 - 1].e() == j11) {
                r11--;
            }
            int i11 = r12 - 1;
            if (qVarArr[i11].e() == j12) {
                i11--;
            }
            if (r11 > i11) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList((i11 - r11) + 1);
            while (r11 <= i11) {
                arrayList.add(qVarArr[r11]);
                r11++;
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException("Start after end.");
    }

    private static int r(long j11, q[] qVarArr) {
        int length = qVarArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) / 2;
            if (qVarArr[i12].e() <= j11) {
                i11 = i12 + 1;
            } else {
                length = i12 - 1;
            }
        }
        return i11;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private static int s(long j11, q[] qVarArr) {
        q qVar;
        int length = qVarArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) / 2;
            if (qVarArr[i12].e() + Math.max(qVar.i(), qVar.f()) <= j11) {
                i11 = i12 + 1;
            } else {
                length = i12 - 1;
            }
        }
        return i11;
    }

    private Object writeReplace() {
        return new SPX(this, 126);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return m(aVar, gVar, null);
    }

    @Override // net.time4j.tz.m
    public q b(net.time4j.base.f fVar) {
        int r11 = r(fVar.g(), this.f41560a);
        if (r11 == 0) {
            return null;
        }
        return this.f41560a[r11 - 1];
    }

    @Override // net.time4j.tz.m
    public boolean c() {
        return this.f41561b;
    }

    @Override // net.time4j.tz.m
    public p d() {
        return p.s(this.f41560a[0].f());
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return p(aVar, gVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.equals(this.f41560a, ((a) obj).f41560a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f41563d;
        if (i11 == 0) {
            int hashCode = Arrays.hashCode(this.f41560a);
            this.f41563d = hashCode;
            return hashCode;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(a aVar, int i11, int i12) {
        int min = Math.min(i11, this.f41560a.length);
        if (min != Math.min(i12, aVar.f41560a.length)) {
            return false;
        }
        for (int i13 = 0; i13 < min; i13++) {
            if (!this.f41560a[i13].equals(aVar.f41560a[i13])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q m(net.time4j.base.a aVar, net.time4j.base.g gVar, j jVar) {
        long j11 = l.j(aVar, gVar);
        int s11 = s(j11, this.f41560a);
        q[] qVarArr = this.f41560a;
        if (s11 == qVarArr.length) {
            if (jVar == null) {
                return null;
            }
            return jVar.k(aVar, j11);
        }
        q qVar = qVarArr[s11];
        if (qVar.k()) {
            if (qVar.e() + qVar.f() <= j11) {
                return qVar;
            }
        } else if (qVar.l() && qVar.e() + qVar.i() <= j11) {
            return qVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q n() {
        q[] qVarArr = this.f41560a;
        return qVarArr[qVarArr.length - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<p> p(net.time4j.base.a aVar, net.time4j.base.g gVar, j jVar) {
        long j11 = l.j(aVar, gVar);
        int s11 = s(j11, this.f41560a);
        q[] qVarArr = this.f41560a;
        if (s11 == qVarArr.length) {
            if (jVar == null) {
                return l.h(qVarArr[qVarArr.length - 1].i());
            }
            return jVar.t(aVar, j11);
        }
        q qVar = qVarArr[s11];
        if (qVar.k()) {
            if (qVar.e() + qVar.f() <= j11) {
                return Collections.emptyList();
            }
        } else if (qVar.l() && qVar.e() + qVar.i() <= j11) {
            return l.i(qVar.i(), qVar.f());
        }
        return l.h(qVar.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q(int i11) {
        int min = Math.min(i11, this.f41560a.length);
        q[] qVarArr = new q[min];
        System.arraycopy(this.f41560a, 0, qVarArr, 0, min);
        return Arrays.hashCode(qVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i11, ObjectOutput objectOutput) {
        SPX.z(this.f41560a, i11, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(a.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f41560a.length);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(ObjectOutput objectOutput) {
        t(this.f41560a.length, objectOutput);
    }
}
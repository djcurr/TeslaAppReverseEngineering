package net.time4j.history;

import ch.qos.logback.core.CoreConstants;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d */
    static final o f41410d = new o(n.BEGIN_OF_JANUARY, Integer.MAX_VALUE);

    /* renamed from: e */
    private static final Comparator<o> f41411e = new b();

    /* renamed from: a */
    private final List<o> f41412a;

    /* renamed from: b */
    private final n f41413b;

    /* renamed from: c */
    private final int f41414c;

    /* loaded from: classes5.dex */
    private static class b implements Comparator<o> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(o oVar, o oVar2) {
            if (oVar.f41414c < oVar2.f41414c) {
                return -1;
            }
            return oVar.f41414c > oVar2.f41414c ? 1 : 0;
        }
    }

    public o(n nVar, int i11) {
        this.f41412a = Collections.emptyList();
        this.f41413b = nVar;
        this.f41414c = i11;
    }

    public static o e(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt == 0) {
            n valueOf = n.valueOf(dataInput.readUTF());
            int readInt2 = dataInput.readInt();
            if (readInt2 == Integer.MAX_VALUE && valueOf == n.BEGIN_OF_JANUARY) {
                return f41410d;
            }
            return new o(valueOf, readInt2);
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(new o(n.valueOf(dataInput.readUTF()), dataInput.readInt()));
        }
        return new o(arrayList);
    }

    public o b(o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f41412a);
        if (arrayList.isEmpty()) {
            arrayList.add(this);
        }
        if (oVar.f41412a.isEmpty()) {
            arrayList.add(oVar);
        } else {
            arrayList.addAll(oVar.f41412a);
        }
        return new o(arrayList);
    }

    public int c(h hVar) {
        int annoDomini = hVar.c().annoDomini(hVar.d());
        int size = this.f41412a.size();
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = this.f41412a.get(i12);
            if (annoDomini >= i11 && annoDomini < oVar.f41414c) {
                return oVar.f41413b.displayedYear(this, hVar);
            }
            i11 = oVar.f41414c;
        }
        return this.f41413b.displayedYear(this, hVar);
    }

    public h d(j jVar, int i11) {
        return f(jVar, i11).newYear(jVar, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f41412a.equals(oVar.f41412a) && this.f41413b == oVar.f41413b && this.f41414c == oVar.f41414c;
        }
        return false;
    }

    public n f(j jVar, int i11) {
        int annoDomini = jVar.annoDomini(i11);
        int size = this.f41412a.size();
        int i12 = Integer.MIN_VALUE;
        n nVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            o oVar = this.f41412a.get(i13);
            if (annoDomini >= i12 && annoDomini < oVar.f41414c) {
                return oVar.f41413b;
            }
            i12 = oVar.f41414c;
            nVar = oVar.f41413b;
        }
        return (annoDomini == i12 && jVar == j.BYZANTINE && nVar == n.BEGIN_OF_SEPTEMBER) ? nVar : this.f41413b;
    }

    public void g(DataOutput dataOutput) {
        int size = this.f41412a.size();
        dataOutput.writeInt(size);
        if (size == 0) {
            dataOutput.writeUTF(this.f41413b.name());
            dataOutput.writeInt(this.f41414c);
            return;
        }
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = this.f41412a.get(i11);
            dataOutput.writeUTF(oVar.f41413b.name());
            dataOutput.writeInt(oVar.f41414c);
        }
    }

    public int hashCode() {
        return (this.f41412a.hashCode() * 17) + (this.f41413b.hashCode() * 37) + this.f41414c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f41412a.isEmpty()) {
            sb2.append('[');
            sb2.append(this.f41413b);
            if (this.f41414c != Integer.MAX_VALUE) {
                sb2.append("->");
                sb2.append(this.f41414c);
            }
        } else {
            boolean z11 = true;
            for (o oVar : this.f41412a) {
                if (z11) {
                    sb2.append('[');
                    z11 = false;
                } else {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
                sb2.append(oVar.f41413b);
                sb2.append("->");
                sb2.append(oVar.f41414c);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    o(List<o> list) {
        Collections.sort(list, f41411e);
        Iterator<o> it2 = list.iterator();
        o oVar = null;
        while (it2.hasNext()) {
            o next = it2.next();
            if (oVar == null || next.f41414c != oVar.f41414c) {
                oVar = next;
            } else if (next.f41413b == oVar.f41413b) {
                it2.remove();
            } else {
                throw new IllegalArgumentException("Multiple strategies with overlapping validity range: " + list);
            }
        }
        this.f41412a = Collections.unmodifiableList(list);
        this.f41413b = n.BEGIN_OF_JANUARY;
        this.f41414c = Integer.MAX_VALUE;
    }
}
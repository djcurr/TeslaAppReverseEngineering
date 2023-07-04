package hd;

import hd.d;

/* loaded from: classes.dex */
public class b implements h {

    /* loaded from: classes.dex */
    class a implements g {
        a(b bVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d.a aVar, d.a aVar2) {
            long timestamp = aVar.getTimestamp();
            long timestamp2 = aVar2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            return timestamp2 == timestamp ? 0 : 1;
        }
    }

    @Override // hd.h
    public g get() {
        return new a(this);
    }
}
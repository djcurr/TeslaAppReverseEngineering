package lf;

import java.util.Collections;
import java.util.List;
import md.k;
import nf.i;
import nf.j;

/* loaded from: classes3.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final c f37179a;

    /* loaded from: classes3.dex */
    private static class b implements c {
        private b() {
        }

        @Override // lf.f.c
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // lf.f.c
        public int b() {
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        List<Integer> a();

        int b();
    }

    public f() {
        this(new b());
    }

    @Override // lf.d
    public int a(int i11) {
        List<Integer> a11 = this.f37179a.a();
        if (a11 == null || a11.isEmpty()) {
            return i11 + 1;
        }
        for (int i12 = 0; i12 < a11.size(); i12++) {
            if (a11.get(i12).intValue() > i11) {
                return a11.get(i12).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // lf.d
    public j b(int i11) {
        return i.d(i11, i11 >= this.f37179a.b(), false);
    }

    public f(c cVar) {
        this.f37179a = (c) k.g(cVar);
    }
}
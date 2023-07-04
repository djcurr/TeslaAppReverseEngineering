package s;

import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends v0<b> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b> f49771a = new ArrayList();

        a(List<b> list) {
            for (b bVar : list) {
                this.f49771a.add(bVar);
            }
        }

        public List<a0> a() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f49771a) {
                a0 a11 = bVar.a();
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            return arrayList;
        }

        public List<a0> b() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f49771a) {
                a0 b11 = bVar.b();
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            return arrayList;
        }

        public List<a0> c() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f49771a) {
                a0 c11 = bVar.c();
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            return arrayList;
        }

        public List<a0> d() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f49771a) {
                a0 d11 = bVar.d();
                if (d11 != null) {
                    arrayList.add(d11);
                }
            }
            return arrayList;
        }
    }

    public c(b... bVarArr) {
        a(Arrays.asList(bVarArr));
    }

    public static c e() {
        return new c(new b[0]);
    }

    @Override // androidx.camera.core.impl.v0
    /* renamed from: b */
    public v0<b> clone() {
        c e11 = e();
        e11.a(c());
        return e11;
    }

    public a d() {
        return new a(c());
    }
}
package na;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import na.n;

/* loaded from: classes.dex */
class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<Model, Data>> f40740a;

    /* renamed from: b  reason: collision with root package name */
    private final v3.f<List<Throwable>> f40741b;

    /* loaded from: classes.dex */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f40742a;

        /* renamed from: b  reason: collision with root package name */
        private final v3.f<List<Throwable>> f40743b;

        /* renamed from: c  reason: collision with root package name */
        private int f40744c;

        /* renamed from: d  reason: collision with root package name */
        private com.bumptech.glide.h f40745d;

        /* renamed from: e  reason: collision with root package name */
        private d.a<? super Data> f40746e;

        /* renamed from: f  reason: collision with root package name */
        private List<Throwable> f40747f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f40748g;

        a(List<com.bumptech.glide.load.data.d<Data>> list, v3.f<List<Throwable>> fVar) {
            this.f40743b = fVar;
            bb.j.c(list);
            this.f40742a = list;
            this.f40744c = 0;
        }

        private void f() {
            if (this.f40748g) {
                return;
            }
            if (this.f40744c < this.f40742a.size() - 1) {
                this.f40744c++;
                d(this.f40745d, this.f40746e);
                return;
            }
            bb.j.d(this.f40747f);
            this.f40746e.b(new GlideException("Fetch failed", new ArrayList(this.f40747f)));
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f40742a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void b(Exception exc) {
            ((List) bb.j.d(this.f40747f)).add(exc);
            f();
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a c() {
            return this.f40742a.get(0).c();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f40748g = true;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f40742a) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            List<Throwable> list = this.f40747f;
            if (list != null) {
                this.f40743b.a(list);
            }
            this.f40747f = null;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f40742a) {
                dVar.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            this.f40745d = hVar;
            this.f40746e = aVar;
            this.f40747f = this.f40743b.b();
            this.f40742a.get(this.f40744c).d(hVar, this);
            if (this.f40748g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(Data data) {
            if (data != null) {
                this.f40746e.e(data);
            } else {
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(List<n<Model, Data>> list, v3.f<List<Throwable>> fVar) {
        this.f40740a = list;
        this.f40741b = fVar;
    }

    @Override // na.n
    public boolean a(Model model) {
        for (n<Model, Data> nVar : this.f40740a) {
            if (nVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // na.n
    public n.a<Data> b(Model model, int i11, int i12, ha.e eVar) {
        n.a<Data> b11;
        int size = this.f40740a.size();
        ArrayList arrayList = new ArrayList(size);
        ha.b bVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            n<Model, Data> nVar = this.f40740a.get(i13);
            if (nVar.a(model) && (b11 = nVar.b(model, i11, i12, eVar)) != null) {
                bVar = b11.f40733a;
                arrayList.add(b11.f40735c);
            }
        }
        if (arrayList.isEmpty() || bVar == null) {
            return null;
        }
        return new n.a<>(bVar, new a(arrayList, this.f40741b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f40740a.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
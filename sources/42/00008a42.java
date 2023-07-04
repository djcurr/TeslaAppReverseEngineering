package na;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final ha.b f40733a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ha.b> f40734b;

        /* renamed from: c  reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f40735c;

        public a(ha.b bVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(bVar, Collections.emptyList(), dVar);
        }

        public a(ha.b bVar, List<ha.b> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f40733a = (ha.b) bb.j.d(bVar);
            this.f40734b = (List) bb.j.d(list);
            this.f40735c = (com.bumptech.glide.load.data.d) bb.j.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i11, int i12, ha.e eVar);
}
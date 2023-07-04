package na;

import com.bumptech.glide.load.data.d;
import na.n;

/* loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    private static final v<?> f40766a = new v<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        private static final a<?> f40767a = new a<>();

        public static <T> a<T> b() {
            return (a<T>) f40767a;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Model, Model> c(r rVar) {
            return v.c();
        }
    }

    /* loaded from: classes.dex */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a  reason: collision with root package name */
        private final Model f40768a;

        b(Model model) {
            this.f40768a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f40768a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(com.bumptech.glide.h hVar, d.a<? super Model> aVar) {
            aVar.e((Model) this.f40768a);
        }
    }

    public static <T> v<T> c() {
        return (v<T>) f40766a;
    }

    @Override // na.n
    public boolean a(Model model) {
        return true;
    }

    @Override // na.n
    public n.a<Model> b(Model model, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(model), new b(model));
    }
}
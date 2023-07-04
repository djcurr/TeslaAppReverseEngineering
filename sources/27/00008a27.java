package na;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import na.n;

/* loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Data> f40697a;

    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    /* loaded from: classes.dex */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final String f40698a;

        /* renamed from: b  reason: collision with root package name */
        private final a<Data> f40699b;

        /* renamed from: c  reason: collision with root package name */
        private Data f40700c;

        b(String str, a<Data> aVar) {
            this.f40698a = str;
            this.f40699b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f40699b.a();
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
            try {
                this.f40699b.b(this.f40700c);
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void d(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            try {
                Data c11 = this.f40699b.c(this.f40698a);
                this.f40700c = c11;
                aVar.e(c11);
            } catch (IllegalArgumentException e11) {
                aVar.b(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final a<InputStream> f40701a = new a(this);

        /* loaded from: classes.dex */
        class a implements a<InputStream> {
            a(c cVar) {
            }

            @Override // na.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // na.e.a
            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // na.e.a
            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Model, InputStream> c(r rVar) {
            return new e(this.f40701a);
        }
    }

    public e(a<Data> aVar) {
        this.f40697a = aVar;
    }

    @Override // na.n
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // na.n
    public n.a<Data> b(Model model, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(model), new b(model.toString(), this.f40697a));
    }
}
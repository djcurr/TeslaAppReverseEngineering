package na;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import na.n;

/* loaded from: classes.dex */
public class f<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final d<Data> f40702a;

    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final d<Data> f40703a;

        public a(d<Data> dVar) {
            this.f40703a = dVar;
        }

        @Override // na.o
        public final void a() {
        }

        @Override // na.o
        public final n<File, Data> c(r rVar) {
            return new f(this.f40703a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // na.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // na.f.d
            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // na.f.d
            /* renamed from: e */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final File f40704a;

        /* renamed from: b  reason: collision with root package name */
        private final d<Data> f40705b;

        /* renamed from: c  reason: collision with root package name */
        private Data f40706c;

        c(File file, d<Data> dVar) {
            this.f40704a = file;
            this.f40705b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f40705b.a();
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
            Data data = this.f40706c;
            if (data != null) {
                try {
                    this.f40705b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void d(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            try {
                Data c11 = this.f40705b.c(this.f40704a);
                this.f40706c = c11;
                aVar.e(c11);
            } catch (FileNotFoundException e11) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e11);
                }
                aVar.b(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* loaded from: classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            @Override // na.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // na.f.d
            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // na.f.d
            /* renamed from: e */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f40702a = dVar;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<Data> b(File file, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(file), new c(file, this.f40702a));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
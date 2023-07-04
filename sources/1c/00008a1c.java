package na;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import na.n;

/* loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0800b<Data> f40693a;

    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: na.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0799a implements InterfaceC0800b<ByteBuffer> {
            C0799a(a aVar) {
            }

            @Override // na.b.InterfaceC0800b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // na.b.InterfaceC0800b
            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<byte[], ByteBuffer> c(r rVar) {
            return new b(new C0799a(this));
        }
    }

    /* renamed from: na.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0800b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f40694a;

        /* renamed from: b  reason: collision with root package name */
        private final InterfaceC0800b<Data> f40695b;

        c(byte[] bArr, InterfaceC0800b<Data> interfaceC0800b) {
            this.f40694a = bArr;
            this.f40695b = interfaceC0800b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f40695b.a();
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
        public void d(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            aVar.e((Data) this.f40695b.b(this.f40694a));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* loaded from: classes.dex */
        class a implements InterfaceC0800b<InputStream> {
            a(d dVar) {
            }

            @Override // na.b.InterfaceC0800b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // na.b.InterfaceC0800b
            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<byte[], InputStream> c(r rVar) {
            return new b(new a(this));
        }
    }

    public b(InterfaceC0800b<Data> interfaceC0800b) {
        this.f40693a = interfaceC0800b;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<Data> b(byte[] bArr, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(bArr), new c(bArr, this.f40693a));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }
}
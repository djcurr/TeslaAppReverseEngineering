package na;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import na.n;

/* loaded from: classes.dex */
public class d implements n<File, ByteBuffer> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        private final File f40696a;

        a(File file) {
            this.f40696a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void d(com.bumptech.glide.h hVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(bb.a.a(this.f40696a));
            } catch (IOException e11) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e11);
                }
                aVar.b(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<File, ByteBuffer> c(r rVar) {
            return new d();
        }
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<ByteBuffer> b(File file, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(file), new a(file));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
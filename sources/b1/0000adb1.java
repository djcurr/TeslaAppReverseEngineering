package qa;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f48040a;

    /* renamed from: qa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1023a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f48040a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: b */
    public ByteBuffer a() {
        this.f48040a.position(0);
        return this.f48040a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
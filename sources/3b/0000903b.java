package om;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import om.h;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    private final Map<Class<?>, lm.c<?>> f42764a;

    /* renamed from: b */
    private final Map<Class<?>, lm.e<?>> f42765b;

    /* renamed from: c */
    private final lm.c<Object> f42766c;

    /* loaded from: classes3.dex */
    public static final class a implements mm.b<a> {

        /* renamed from: d */
        private static final lm.c<Object> f42767d = new lm.c() { // from class: om.g
            @Override // lm.c
            public final void encode(Object obj, Object obj2) {
                h.a.a(obj, (lm.d) obj2);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, lm.c<?>> f42768a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, lm.e<?>> f42769b = new HashMap();

        /* renamed from: c */
        private lm.c<Object> f42770c = f42767d;

        public static /* synthetic */ void a(Object obj, lm.d dVar) {
            d(obj, dVar);
        }

        public static /* synthetic */ void d(Object obj, lm.d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f42768a), new HashMap(this.f42769b), this.f42770c);
        }

        public a c(mm.a aVar) {
            aVar.configure(this);
            return this;
        }

        @Override // mm.b
        /* renamed from: e */
        public <U> a registerEncoder(Class<U> cls, lm.c<? super U> cVar) {
            this.f42768a.put(cls, cVar);
            this.f42769b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, lm.c<?>> map, Map<Class<?>, lm.e<?>> map2, lm.c<Object> cVar) {
        this.f42764a = map;
        this.f42765b = map2;
        this.f42766c = cVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f42764a, this.f42765b, this.f42766c).o(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
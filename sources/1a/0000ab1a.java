package pn;

import com.google.gson.JsonSyntaxException;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements v {

    /* renamed from: a  reason: collision with root package name */
    private final on.c f46730a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.gson.d f46731b;

    /* renamed from: c  reason: collision with root package name */
    private final on.d f46732c;

    /* renamed from: d  reason: collision with root package name */
    private final e f46733d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f46734d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f46735e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f46736f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ com.google.gson.e f46737g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f46738h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f46739i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, String str, boolean z11, boolean z12, Field field, boolean z13, u uVar, com.google.gson.e eVar, com.google.gson.reflect.a aVar, boolean z14) {
            super(str, z11, z12);
            this.f46734d = field;
            this.f46735e = z13;
            this.f46736f = uVar;
            this.f46737g = eVar;
            this.f46738h = aVar;
            this.f46739i = z14;
        }

        @Override // pn.k.c
        void a(tn.a aVar, Object obj) {
            Object b11 = this.f46736f.b(aVar);
            if (b11 == null && this.f46739i) {
                return;
            }
            this.f46734d.set(obj, b11);
        }

        @Override // pn.k.c
        void b(com.google.gson.stream.b bVar, Object obj) {
            (this.f46735e ? this.f46736f : new m(this.f46737g, this.f46736f, this.f46738h.getType())).d(bVar, this.f46734d.get(obj));
        }

        @Override // pn.k.c
        public boolean c(Object obj) {
            return this.f46743b && this.f46734d.get(obj) != obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        private final on.i<T> f46740a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, c> f46741b;

        b(on.i<T> iVar, Map<String, c> map) {
            this.f46740a = iVar;
            this.f46741b = map;
        }

        @Override // com.google.gson.u
        public T b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            T construct = this.f46740a.construct();
            try {
                aVar.g();
                while (aVar.R()) {
                    c cVar = this.f46741b.get(aVar.D0());
                    if (cVar != null && cVar.f46744c) {
                        cVar.a(aVar, construct);
                    }
                    aVar.y1();
                }
                aVar.C();
                return construct;
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            } catch (IllegalStateException e12) {
                throw new JsonSyntaxException(e12);
            }
        }

        @Override // com.google.gson.u
        public void d(com.google.gson.stream.b bVar, T t11) {
            if (t11 == null) {
                bVar.n0();
                return;
            }
            bVar.l();
            try {
                for (c cVar : this.f46741b.values()) {
                    if (cVar.c(t11)) {
                        bVar.a0(cVar.f46742a);
                        cVar.b(bVar, t11);
                    }
                }
                bVar.C();
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f46742a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f46743b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f46744c;

        protected c(String str, boolean z11, boolean z12) {
            this.f46742a = str;
            this.f46743b = z11;
            this.f46744c = z12;
        }

        abstract void a(tn.a aVar, Object obj);

        abstract void b(com.google.gson.stream.b bVar, Object obj);

        abstract boolean c(Object obj);
    }

    public k(on.c cVar, com.google.gson.d dVar, on.d dVar2, e eVar) {
        this.f46730a = cVar;
        this.f46731b = dVar;
        this.f46732c = dVar2;
        this.f46733d = eVar;
    }

    private c b(com.google.gson.e eVar, Field field, String str, com.google.gson.reflect.a<?> aVar, boolean z11, boolean z12) {
        boolean a11 = on.k.a(aVar.getRawType());
        nn.b bVar = (nn.b) field.getAnnotation(nn.b.class);
        u<?> b11 = bVar != null ? this.f46733d.b(this.f46730a, eVar, aVar, bVar) : null;
        boolean z13 = b11 != null;
        if (b11 == null) {
            b11 = eVar.k(aVar);
        }
        return new a(this, str, z11, z12, field, z13, b11, eVar, aVar, a11);
    }

    static boolean d(Field field, boolean z11, on.d dVar) {
        return (dVar.c(field.getType(), z11) || dVar.f(field, z11)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    private Map<String, c> e(com.google.gson.e eVar, com.google.gson.reflect.a<?> aVar, Class<?> cls) {
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        com.google.gson.reflect.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z11 = false;
            int i11 = 0;
            while (i11 < length) {
                Field field = declaredFields[i11];
                boolean c11 = c(field, true);
                boolean c12 = c(field, z11);
                if (c11 || c12) {
                    rn.a.b(field);
                    Type p11 = on.b.p(aVar2.getType(), cls2, field.getGenericType());
                    List<String> f11 = f(field);
                    int size = f11.size();
                    c cVar2 = null;
                    int i12 = z11;
                    while (i12 < size) {
                        String str = f11.get(i12);
                        boolean z12 = i12 != 0 ? z11 : c11;
                        int i13 = i12;
                        c cVar3 = cVar2;
                        int i14 = size;
                        List<String> list = f11;
                        Field field2 = field;
                        cVar2 = cVar3 == null ? (c) linkedHashMap.put(str, b(eVar, field, str, com.google.gson.reflect.a.get(p11), z12, c12)) : cVar3;
                        c11 = z12;
                        f11 = list;
                        size = i14;
                        field = field2;
                        z11 = false;
                        i12 = i13 + 1;
                    }
                    if (cVar2 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar.f46742a);
                    }
                }
                i11++;
                z11 = false;
            }
            aVar2 = com.google.gson.reflect.a.get(on.b.p(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        nn.c cVar = (nn.c) field.getAnnotation(nn.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f46731b.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.v
    public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new b(this.f46730a.a(aVar), e(eVar, aVar, rawType));
        }
        return null;
    }

    public boolean c(Field field, boolean z11) {
        return d(field, z11, this.f46732c);
    }
}
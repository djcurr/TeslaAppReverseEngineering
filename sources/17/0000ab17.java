package pn;

import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j extends u<Object> {

    /* renamed from: c  reason: collision with root package name */
    private static final v f46725c = f(s.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    private final com.google.gson.e f46726a;

    /* renamed from: b  reason: collision with root package name */
    private final t f46727b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f46728a;

        a(t tVar) {
            this.f46728a = tVar;
        }

        @Override // com.google.gson.v
        public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new j(eVar, this.f46728a, null);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f46729a;

        static {
            int[] iArr = new int[com.google.gson.stream.a.values().length];
            f46729a = iArr;
            try {
                iArr[com.google.gson.stream.a.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46729a[com.google.gson.stream.a.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46729a[com.google.gson.stream.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46729a[com.google.gson.stream.a.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46729a[com.google.gson.stream.a.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46729a[com.google.gson.stream.a.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ j(com.google.gson.e eVar, t tVar, a aVar) {
        this(eVar, tVar);
    }

    public static v e(t tVar) {
        if (tVar == s.DOUBLE) {
            return f46725c;
        }
        return f(tVar);
    }

    private static v f(t tVar) {
        return new a(tVar);
    }

    @Override // com.google.gson.u
    public Object b(tn.a aVar) {
        switch (b.f46729a[aVar.Q0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.R()) {
                    arrayList.add(b(aVar));
                }
                aVar.p();
                return arrayList;
            case 2:
                on.h hVar = new on.h();
                aVar.g();
                while (aVar.R()) {
                    hVar.put(aVar.D0(), b(aVar));
                }
                aVar.C();
                return hVar;
            case 3:
                return aVar.J0();
            case 4:
                return this.f46727b.readNumber(aVar);
            case 5:
                return Boolean.valueOf(aVar.p0());
            case 6:
                aVar.G0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.u
    public void d(com.google.gson.stream.b bVar, Object obj) {
        if (obj == null) {
            bVar.n0();
            return;
        }
        u l11 = this.f46726a.l(obj.getClass());
        if (l11 instanceof j) {
            bVar.l();
            bVar.C();
            return;
        }
        l11.d(bVar, obj);
    }

    private j(com.google.gson.e eVar, t tVar) {
        this.f46726a = eVar;
        this.f46727b = tVar;
    }
}
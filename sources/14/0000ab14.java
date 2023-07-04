package pn;

import com.google.gson.JsonSyntaxException;
import com.google.gson.s;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;

/* loaded from: classes2.dex */
public final class i extends u<Number> {

    /* renamed from: b  reason: collision with root package name */
    private static final v f46721b = f(s.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    private final t f46722a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f46724a;

        static {
            int[] iArr = new int[com.google.gson.stream.a.values().length];
            f46724a = iArr;
            try {
                iArr[com.google.gson.stream.a.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46724a[com.google.gson.stream.a.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46724a[com.google.gson.stream.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private i(t tVar) {
        this.f46722a = tVar;
    }

    public static v e(t tVar) {
        if (tVar == s.LAZILY_PARSED_NUMBER) {
            return f46721b;
        }
        return f(tVar);
    }

    private static v f(t tVar) {
        return new a();
    }

    @Override // com.google.gson.u
    /* renamed from: g */
    public Number b(tn.a aVar) {
        com.google.gson.stream.a Q0 = aVar.Q0();
        int i11 = b.f46724a[Q0.ordinal()];
        if (i11 == 1) {
            aVar.G0();
            return null;
        } else if (i11 != 2 && i11 != 3) {
            throw new JsonSyntaxException("Expecting number, got: " + Q0 + "; at path " + aVar.getPath());
        } else {
            return this.f46722a.readNumber(aVar);
        }
    }

    @Override // com.google.gson.u
    /* renamed from: h */
    public void d(com.google.gson.stream.b bVar, Number number) {
        bVar.R0(number);
    }
}
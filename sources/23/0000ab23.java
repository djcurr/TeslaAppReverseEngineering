package pn;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
public final class n {
    public static final com.google.gson.u<BigInteger> A;
    public static final com.google.gson.u<on.g> B;
    public static final com.google.gson.v C;
    public static final com.google.gson.u<StringBuilder> D;
    public static final com.google.gson.v E;
    public static final com.google.gson.u<StringBuffer> F;
    public static final com.google.gson.v G;
    public static final com.google.gson.u<URL> H;
    public static final com.google.gson.v I;
    public static final com.google.gson.u<URI> J;
    public static final com.google.gson.v K;
    public static final com.google.gson.u<InetAddress> L;
    public static final com.google.gson.v M;
    public static final com.google.gson.u<UUID> N;
    public static final com.google.gson.v O;
    public static final com.google.gson.u<Currency> P;
    public static final com.google.gson.v Q;
    public static final com.google.gson.u<Calendar> R;
    public static final com.google.gson.v S;
    public static final com.google.gson.u<Locale> T;
    public static final com.google.gson.v U;
    public static final com.google.gson.u<com.google.gson.k> V;
    public static final com.google.gson.v W;
    public static final com.google.gson.v X;

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.gson.u<Class> f46761a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.gson.v f46762b;

    /* renamed from: c  reason: collision with root package name */
    public static final com.google.gson.u<BitSet> f46763c;

    /* renamed from: d  reason: collision with root package name */
    public static final com.google.gson.v f46764d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.gson.u<Boolean> f46765e;

    /* renamed from: f  reason: collision with root package name */
    public static final com.google.gson.u<Boolean> f46766f;

    /* renamed from: g  reason: collision with root package name */
    public static final com.google.gson.v f46767g;

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.gson.u<Number> f46768h;

    /* renamed from: i  reason: collision with root package name */
    public static final com.google.gson.v f46769i;

    /* renamed from: j  reason: collision with root package name */
    public static final com.google.gson.u<Number> f46770j;

    /* renamed from: k  reason: collision with root package name */
    public static final com.google.gson.v f46771k;

    /* renamed from: l  reason: collision with root package name */
    public static final com.google.gson.u<Number> f46772l;

    /* renamed from: m  reason: collision with root package name */
    public static final com.google.gson.v f46773m;

    /* renamed from: n  reason: collision with root package name */
    public static final com.google.gson.u<AtomicInteger> f46774n;

    /* renamed from: o  reason: collision with root package name */
    public static final com.google.gson.v f46775o;

    /* renamed from: p  reason: collision with root package name */
    public static final com.google.gson.u<AtomicBoolean> f46776p;

    /* renamed from: q  reason: collision with root package name */
    public static final com.google.gson.v f46777q;

    /* renamed from: r  reason: collision with root package name */
    public static final com.google.gson.u<AtomicIntegerArray> f46778r;

    /* renamed from: s  reason: collision with root package name */
    public static final com.google.gson.v f46779s;

    /* renamed from: t  reason: collision with root package name */
    public static final com.google.gson.u<Number> f46780t;

    /* renamed from: u  reason: collision with root package name */
    public static final com.google.gson.u<Number> f46781u;

    /* renamed from: v  reason: collision with root package name */
    public static final com.google.gson.u<Number> f46782v;

    /* renamed from: w  reason: collision with root package name */
    public static final com.google.gson.u<Character> f46783w;

    /* renamed from: x  reason: collision with root package name */
    public static final com.google.gson.v f46784x;

    /* renamed from: y  reason: collision with root package name */
    public static final com.google.gson.u<String> f46785y;

    /* renamed from: z  reason: collision with root package name */
    public static final com.google.gson.u<BigDecimal> f46786z;

    /* loaded from: classes2.dex */
    class a extends com.google.gson.u<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public AtomicIntegerArray b(tn.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.R()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.u0()));
                } catch (NumberFormatException e11) {
                    throw new JsonSyntaxException(e11);
                }
            }
            aVar.p();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicIntegerArray.set(i11, ((Integer) arrayList.get(i11)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, AtomicIntegerArray atomicIntegerArray) {
            bVar.j();
            int length = atomicIntegerArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                bVar.P0(atomicIntegerArray.get(i11));
            }
            bVar.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a0 implements com.google.gson.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f46787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f46788b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* loaded from: classes2.dex */
        class a<T1> extends com.google.gson.u<T1> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f46789a;

            a(Class cls) {
                this.f46789a = cls;
            }

            @Override // com.google.gson.u
            public T1 b(tn.a aVar) {
                T1 t12 = (T1) a0.this.f46788b.b(aVar);
                if (t12 == null || this.f46789a.isInstance(t12)) {
                    return t12;
                }
                throw new JsonSyntaxException("Expected a " + this.f46789a.getName() + " but was " + t12.getClass().getName() + "; at path " + aVar.L());
            }

            @Override // com.google.gson.u
            public void d(com.google.gson.stream.b bVar, T1 t12) {
                a0.this.f46788b.d(bVar, t12);
            }
        }

        a0(Class cls, com.google.gson.u uVar) {
            this.f46787a = cls;
            this.f46788b = uVar;
        }

        @Override // com.google.gson.v
        public <T2> com.google.gson.u<T2> a(com.google.gson.e eVar, com.google.gson.reflect.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.f46787a.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f46787a.getName() + ",adapter=" + this.f46788b + "]";
        }
    }

    /* loaded from: classes2.dex */
    class b extends com.google.gson.u<Number> {
        b() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Number b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            try {
                return Long.valueOf(aVar.C0());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            bVar.R0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b0 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f46791a;

        static {
            int[] iArr = new int[com.google.gson.stream.a.values().length];
            f46791a = iArr;
            try {
                iArr[com.google.gson.stream.a.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46791a[com.google.gson.stream.a.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46791a[com.google.gson.stream.a.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46791a[com.google.gson.stream.a.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46791a[com.google.gson.stream.a.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46791a[com.google.gson.stream.a.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46791a[com.google.gson.stream.a.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46791a[com.google.gson.stream.a.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46791a[com.google.gson.stream.a.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f46791a[com.google.gson.stream.a.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class c extends com.google.gson.u<Number> {
        c() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Number b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return Float.valueOf((float) aVar.t0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            bVar.R0(number);
        }
    }

    /* loaded from: classes2.dex */
    class c0 extends com.google.gson.u<Boolean> {
        c0() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Boolean b(tn.a aVar) {
            com.google.gson.stream.a Q0 = aVar.Q0();
            if (Q0 == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            } else if (Q0 == com.google.gson.stream.a.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.J0()));
            } else {
                return Boolean.valueOf(aVar.p0());
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Boolean bool) {
            bVar.Q0(bool);
        }
    }

    /* loaded from: classes2.dex */
    class d extends com.google.gson.u<Number> {
        d() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Number b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return Double.valueOf(aVar.t0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            bVar.R0(number);
        }
    }

    /* loaded from: classes2.dex */
    class d0 extends com.google.gson.u<Boolean> {
        d0() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Boolean b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return Boolean.valueOf(aVar.J0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Boolean bool) {
            bVar.S0(bool == null ? Address.ADDRESS_NULL_PLACEHOLDER : bool.toString());
        }
    }

    /* loaded from: classes2.dex */
    class e extends com.google.gson.u<Character> {
        e() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Character b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            String J0 = aVar.J0();
            if (J0.length() == 1) {
                return Character.valueOf(J0.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + J0 + "; at " + aVar.L());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Character ch2) {
            bVar.S0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* loaded from: classes2.dex */
    class e0 extends com.google.gson.u<Number> {
        e0() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Number b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            try {
                int u02 = aVar.u0();
                if (u02 <= 255 && u02 >= -128) {
                    return Byte.valueOf((byte) u02);
                }
                throw new JsonSyntaxException("Lossy conversion from " + u02 + " to byte; at path " + aVar.L());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            bVar.R0(number);
        }
    }

    /* loaded from: classes2.dex */
    class f extends com.google.gson.u<String> {
        f() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public String b(tn.a aVar) {
            com.google.gson.stream.a Q0 = aVar.Q0();
            if (Q0 == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            } else if (Q0 == com.google.gson.stream.a.BOOLEAN) {
                return Boolean.toString(aVar.p0());
            } else {
                return aVar.J0();
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, String str) {
            bVar.S0(str);
        }
    }

    /* loaded from: classes2.dex */
    class f0 extends com.google.gson.u<Number> {
        f0() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Number b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            try {
                int u02 = aVar.u0();
                if (u02 <= 65535 && u02 >= -32768) {
                    return Short.valueOf((short) u02);
                }
                throw new JsonSyntaxException("Lossy conversion from " + u02 + " to short; at path " + aVar.L());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            bVar.R0(number);
        }
    }

    /* loaded from: classes2.dex */
    class g extends com.google.gson.u<BigDecimal> {
        g() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public BigDecimal b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            String J0 = aVar.J0();
            try {
                return new BigDecimal(J0);
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException("Failed parsing '" + J0 + "' as BigDecimal; at path " + aVar.L(), e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, BigDecimal bigDecimal) {
            bVar.R0(bigDecimal);
        }
    }

    /* loaded from: classes2.dex */
    class g0 extends com.google.gson.u<Number> {
        g0() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Number b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.u0());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Number number) {
            bVar.R0(number);
        }
    }

    /* loaded from: classes2.dex */
    class h extends com.google.gson.u<BigInteger> {
        h() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public BigInteger b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            String J0 = aVar.J0();
            try {
                return new BigInteger(J0);
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException("Failed parsing '" + J0 + "' as BigInteger; at path " + aVar.L(), e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, BigInteger bigInteger) {
            bVar.R0(bigInteger);
        }
    }

    /* loaded from: classes2.dex */
    class h0 extends com.google.gson.u<AtomicInteger> {
        h0() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public AtomicInteger b(tn.a aVar) {
            try {
                return new AtomicInteger(aVar.u0());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, AtomicInteger atomicInteger) {
            bVar.P0(atomicInteger.get());
        }
    }

    /* loaded from: classes2.dex */
    class i extends com.google.gson.u<on.g> {
        i() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public on.g b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return new on.g(aVar.J0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, on.g gVar) {
            bVar.R0(gVar);
        }
    }

    /* loaded from: classes2.dex */
    class i0 extends com.google.gson.u<AtomicBoolean> {
        i0() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public AtomicBoolean b(tn.a aVar) {
            return new AtomicBoolean(aVar.p0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, AtomicBoolean atomicBoolean) {
            bVar.X0(atomicBoolean.get());
        }
    }

    /* loaded from: classes2.dex */
    class j extends com.google.gson.u<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public StringBuilder b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return new StringBuilder(aVar.J0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, StringBuilder sb2) {
            bVar.S0(sb2 == null ? null : sb2.toString());
        }
    }

    /* loaded from: classes2.dex */
    private static final class j0<T extends Enum<T>> extends com.google.gson.u<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f46792a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f46793b = new HashMap();

        /* loaded from: classes2.dex */
        class a implements PrivilegedAction<Field[]> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f46794a;

            a(j0 j0Var, Class cls) {
                this.f46794a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.f46794a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j0(Class<T> cls) {
            Field[] fieldArr;
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(this, cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    nn.c cVar = (nn.c) field.getAnnotation(nn.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f46792a.put(str, r42);
                        }
                    }
                    this.f46792a.put(name, r42);
                    this.f46793b.put(r42, name);
                }
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public T b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return this.f46792a.get(aVar.J0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, T t11) {
            bVar.S0(t11 == null ? null : this.f46793b.get(t11));
        }
    }

    /* loaded from: classes2.dex */
    class k extends com.google.gson.u<Class> {
        k() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Class b(tn.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes2.dex */
    class l extends com.google.gson.u<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public StringBuffer b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return new StringBuffer(aVar.J0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, StringBuffer stringBuffer) {
            bVar.S0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: classes2.dex */
    class m extends com.google.gson.u<URL> {
        m() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public URL b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            String J0 = aVar.J0();
            if (Address.ADDRESS_NULL_PLACEHOLDER.equals(J0)) {
                return null;
            }
            return new URL(J0);
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, URL url) {
            bVar.S0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: pn.n$n  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0998n extends com.google.gson.u<URI> {
        C0998n() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public URI b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            try {
                String J0 = aVar.J0();
                if (Address.ADDRESS_NULL_PLACEHOLDER.equals(J0)) {
                    return null;
                }
                return new URI(J0);
            } catch (URISyntaxException e11) {
                throw new JsonIOException(e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, URI uri) {
            bVar.S0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* loaded from: classes2.dex */
    class o extends com.google.gson.u<InetAddress> {
        o() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public InetAddress b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            return InetAddress.getByName(aVar.J0());
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, InetAddress inetAddress) {
            bVar.S0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: classes2.dex */
    class p extends com.google.gson.u<UUID> {
        p() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public UUID b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            String J0 = aVar.J0();
            try {
                return UUID.fromString(J0);
            } catch (IllegalArgumentException e11) {
                throw new JsonSyntaxException("Failed parsing '" + J0 + "' as UUID; at path " + aVar.L(), e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, UUID uuid) {
            bVar.S0(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: classes2.dex */
    class q extends com.google.gson.u<Currency> {
        q() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Currency b(tn.a aVar) {
            String J0 = aVar.J0();
            try {
                return Currency.getInstance(J0);
            } catch (IllegalArgumentException e11) {
                throw new JsonSyntaxException("Failed parsing '" + J0 + "' as Currency; at path " + aVar.L(), e11);
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Currency currency) {
            bVar.S0(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes2.dex */
    class r extends com.google.gson.u<Calendar> {
        r() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Calendar b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            aVar.g();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (aVar.Q0() != com.google.gson.stream.a.END_OBJECT) {
                String D0 = aVar.D0();
                int u02 = aVar.u0();
                if ("year".equals(D0)) {
                    i11 = u02;
                } else if ("month".equals(D0)) {
                    i12 = u02;
                } else if ("dayOfMonth".equals(D0)) {
                    i13 = u02;
                } else if ("hourOfDay".equals(D0)) {
                    i14 = u02;
                } else if ("minute".equals(D0)) {
                    i15 = u02;
                } else if ("second".equals(D0)) {
                    i16 = u02;
                }
            }
            aVar.C();
            return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Calendar calendar) {
            if (calendar == null) {
                bVar.n0();
                return;
            }
            bVar.l();
            bVar.a0("year");
            bVar.P0(calendar.get(1));
            bVar.a0("month");
            bVar.P0(calendar.get(2));
            bVar.a0("dayOfMonth");
            bVar.P0(calendar.get(5));
            bVar.a0("hourOfDay");
            bVar.P0(calendar.get(11));
            bVar.a0("minute");
            bVar.P0(calendar.get(12));
            bVar.a0("second");
            bVar.P0(calendar.get(13));
            bVar.C();
        }
    }

    /* loaded from: classes2.dex */
    class s extends com.google.gson.u<Locale> {
        s() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Locale b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.J0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Locale locale) {
            bVar.S0(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: classes2.dex */
    class t extends com.google.gson.u<com.google.gson.k> {
        t() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public com.google.gson.k b(tn.a aVar) {
            if (aVar instanceof pn.f) {
                return ((pn.f) aVar).F1();
            }
            switch (b0.f46791a[aVar.Q0().ordinal()]) {
                case 1:
                    return new com.google.gson.o(new on.g(aVar.J0()));
                case 2:
                    return new com.google.gson.o(aVar.J0());
                case 3:
                    return new com.google.gson.o(Boolean.valueOf(aVar.p0()));
                case 4:
                    aVar.G0();
                    return com.google.gson.l.f17206a;
                case 5:
                    com.google.gson.h hVar = new com.google.gson.h();
                    aVar.a();
                    while (aVar.R()) {
                        hVar.m(b(aVar));
                    }
                    aVar.p();
                    return hVar;
                case 6:
                    com.google.gson.m mVar = new com.google.gson.m();
                    aVar.g();
                    while (aVar.R()) {
                        mVar.m(aVar.D0(), b(aVar));
                    }
                    aVar.C();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, com.google.gson.k kVar) {
            if (kVar != null && !kVar.i()) {
                if (kVar.k()) {
                    com.google.gson.o d11 = kVar.d();
                    if (d11.s()) {
                        bVar.R0(d11.p());
                        return;
                    } else if (d11.q()) {
                        bVar.X0(d11.m());
                        return;
                    } else {
                        bVar.S0(d11.f());
                        return;
                    }
                } else if (kVar.h()) {
                    bVar.j();
                    Iterator<com.google.gson.k> it2 = kVar.b().iterator();
                    while (it2.hasNext()) {
                        d(bVar, it2.next());
                    }
                    bVar.p();
                    return;
                } else if (kVar.j()) {
                    bVar.l();
                    for (Map.Entry<String, com.google.gson.k> entry : kVar.c().o()) {
                        bVar.a0(entry.getKey());
                        d(bVar, entry.getValue());
                    }
                    bVar.C();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
                }
            }
            bVar.n0();
        }
    }

    /* loaded from: classes2.dex */
    class u implements com.google.gson.v {
        u() {
        }

        @Override // com.google.gson.v
        public <T> com.google.gson.u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            Class rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = (Class<? super Object>) rawType.getSuperclass();
            }
            return new j0(rawType);
        }
    }

    /* loaded from: classes2.dex */
    class v extends com.google.gson.u<BitSet> {
        v() {
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public BitSet b(tn.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.a();
            com.google.gson.stream.a Q0 = aVar.Q0();
            int i11 = 0;
            while (Q0 != com.google.gson.stream.a.END_ARRAY) {
                int i12 = b0.f46791a[Q0.ordinal()];
                boolean z11 = true;
                if (i12 == 1 || i12 == 2) {
                    int u02 = aVar.u0();
                    if (u02 == 0) {
                        z11 = false;
                    } else if (u02 != 1) {
                        throw new JsonSyntaxException("Invalid bitset value " + u02 + ", expected 0 or 1; at path " + aVar.L());
                    }
                } else if (i12 == 3) {
                    z11 = aVar.p0();
                } else {
                    throw new JsonSyntaxException("Invalid bitset value type: " + Q0 + "; at path " + aVar.getPath());
                }
                if (z11) {
                    bitSet.set(i11);
                }
                i11++;
                Q0 = aVar.Q0();
            }
            aVar.p();
            return bitSet;
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, BitSet bitSet) {
            bVar.j();
            int length = bitSet.length();
            for (int i11 = 0; i11 < length; i11++) {
                bVar.P0(bitSet.get(i11) ? 1L : 0L);
            }
            bVar.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class w implements com.google.gson.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f46795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f46796b;

        w(com.google.gson.reflect.a aVar, com.google.gson.u uVar) {
            this.f46795a = aVar;
            this.f46796b = uVar;
        }

        @Override // com.google.gson.v
        public <T> com.google.gson.u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.equals(this.f46795a)) {
                return this.f46796b;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class x implements com.google.gson.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f46797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f46798b;

        x(Class cls, com.google.gson.u uVar) {
            this.f46797a = cls;
            this.f46798b = uVar;
        }

        @Override // com.google.gson.v
        public <T> com.google.gson.u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == this.f46797a) {
                return this.f46798b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f46797a.getName() + ",adapter=" + this.f46798b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class y implements com.google.gson.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f46799a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f46800b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f46801c;

        y(Class cls, Class cls2, com.google.gson.u uVar) {
            this.f46799a = cls;
            this.f46800b = cls2;
            this.f46801c = uVar;
        }

        @Override // com.google.gson.v
        public <T> com.google.gson.u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f46799a || rawType == this.f46800b) {
                return this.f46801c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f46800b.getName() + Marker.ANY_NON_NULL_MARKER + this.f46799a.getName() + ",adapter=" + this.f46801c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class z implements com.google.gson.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f46802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f46803b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u f46804c;

        z(Class cls, Class cls2, com.google.gson.u uVar) {
            this.f46802a = cls;
            this.f46803b = cls2;
            this.f46804c = uVar;
        }

        @Override // com.google.gson.v
        public <T> com.google.gson.u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f46802a || rawType == this.f46803b) {
                return this.f46804c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f46802a.getName() + Marker.ANY_NON_NULL_MARKER + this.f46803b.getName() + ",adapter=" + this.f46804c + "]";
        }
    }

    static {
        com.google.gson.u<Class> a11 = new k().a();
        f46761a = a11;
        f46762b = b(Class.class, a11);
        com.google.gson.u<BitSet> a12 = new v().a();
        f46763c = a12;
        f46764d = b(BitSet.class, a12);
        c0 c0Var = new c0();
        f46765e = c0Var;
        f46766f = new d0();
        f46767g = c(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f46768h = e0Var;
        f46769i = c(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f46770j = f0Var;
        f46771k = c(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f46772l = g0Var;
        f46773m = c(Integer.TYPE, Integer.class, g0Var);
        com.google.gson.u<AtomicInteger> a13 = new h0().a();
        f46774n = a13;
        f46775o = b(AtomicInteger.class, a13);
        com.google.gson.u<AtomicBoolean> a14 = new i0().a();
        f46776p = a14;
        f46777q = b(AtomicBoolean.class, a14);
        com.google.gson.u<AtomicIntegerArray> a15 = new a().a();
        f46778r = a15;
        f46779s = b(AtomicIntegerArray.class, a15);
        f46780t = new b();
        f46781u = new c();
        f46782v = new d();
        e eVar = new e();
        f46783w = eVar;
        f46784x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f46785y = fVar;
        f46786z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        C0998n c0998n = new C0998n();
        J = c0998n;
        K = b(URI.class, c0998n);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = b(UUID.class, pVar);
        com.google.gson.u<Currency> a16 = new q().a();
        P = a16;
        Q = b(Currency.class, a16);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = e(com.google.gson.k.class, tVar);
        X = new u();
    }

    public static <TT> com.google.gson.v a(com.google.gson.reflect.a<TT> aVar, com.google.gson.u<TT> uVar) {
        return new w(aVar, uVar);
    }

    public static <TT> com.google.gson.v b(Class<TT> cls, com.google.gson.u<TT> uVar) {
        return new x(cls, uVar);
    }

    public static <TT> com.google.gson.v c(Class<TT> cls, Class<TT> cls2, com.google.gson.u<? super TT> uVar) {
        return new y(cls, cls2, uVar);
    }

    public static <TT> com.google.gson.v d(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.u<? super TT> uVar) {
        return new z(cls, cls2, uVar);
    }

    public static <T1> com.google.gson.v e(Class<T1> cls, com.google.gson.u<T1> uVar) {
        return new a0(cls, uVar);
    }
}
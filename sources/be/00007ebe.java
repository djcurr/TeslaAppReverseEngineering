package kotlin.reflect.jvm.internal.impl.protobuf;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* loaded from: classes5.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35001a;

        static {
            int[] iArr = new int[w.c.values().length];
            f35001a = iArr;
            try {
                iArr[w.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35001a[w.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.AbstractC0651a<BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f35002a = kotlin.reflect.jvm.internal.impl.protobuf.d.f34970a;

        @Override // 
        /* renamed from: d */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.d e() {
            return this.f35002a;
        }

        public abstract BuilderType f(MessageType messagetype);

        public final BuilderType g(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f35002a = dVar;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements p {

        /* renamed from: b  reason: collision with root package name */
        private g<e> f35003b = g.g();

        /* renamed from: c  reason: collision with root package name */
        private boolean f35004c;

        /* JADX INFO: Access modifiers changed from: private */
        public g<e> i() {
            this.f35003b.q();
            this.f35004c = false;
            return this.f35003b;
        }

        private void j() {
            if (this.f35004c) {
                return;
            }
            this.f35003b = this.f35003b.clone();
            this.f35004c = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void k(MessageType messagetype) {
            j();
            this.f35003b.r(((d) messagetype).f35005a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e implements g.b<e> {

        /* renamed from: a  reason: collision with root package name */
        final i.b<?> f35010a;

        /* renamed from: b  reason: collision with root package name */
        final int f35011b;

        /* renamed from: c  reason: collision with root package name */
        final w.b f35012c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f35013d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f35014e;

        e(i.b<?> bVar, int i11, w.b bVar2, boolean z11, boolean z12) {
            this.f35010a = bVar;
            this.f35011b = i11;
            this.f35012c = bVar2;
            this.f35013d = z11;
            this.f35014e = z12;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.f35011b - eVar.f35011b;
        }

        public i.b<?> b() {
            return this.f35010a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.c getLiteJavaType() {
            return this.f35012c.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.b getLiteType() {
            return this.f35012c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int getNumber() {
            return this.f35011b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isPacked() {
            return this.f35014e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isRepeated() {
            return this.f35013d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public o.a u0(o.a aVar, o oVar) {
            return ((b) aVar).f((h) oVar);
        }
    }

    /* loaded from: classes5.dex */
    public static class f<ContainingType extends o, Type> {

        /* renamed from: a  reason: collision with root package name */
        final ContainingType f35015a;

        /* renamed from: b  reason: collision with root package name */
        final Type f35016b;

        /* renamed from: c  reason: collision with root package name */
        final o f35017c;

        /* renamed from: d  reason: collision with root package name */
        final e f35018d;

        /* renamed from: e  reason: collision with root package name */
        final Method f35019e;

        f(ContainingType containingtype, Type type, o oVar, e eVar, Class cls) {
            if (containingtype != null) {
                if (eVar.getLiteType() == w.b.MESSAGE && oVar == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f35015a = containingtype;
                this.f35016b = type;
                this.f35017c = oVar;
                this.f35018d = eVar;
                if (i.a.class.isAssignableFrom(cls)) {
                    this.f35019e = h.e(cls, CoreConstants.VALUE_OF, Integer.TYPE);
                    return;
                } else {
                    this.f35019e = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        Object a(Object obj) {
            if (this.f35018d.isRepeated()) {
                if (this.f35018d.getLiteJavaType() == w.c.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(e(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return e(obj);
        }

        public ContainingType b() {
            return this.f35015a;
        }

        public o c() {
            return this.f35017c;
        }

        public int d() {
            return this.f35018d.getNumber();
        }

        Object e(Object obj) {
            return this.f35018d.getLiteJavaType() == w.c.ENUM ? h.f(this.f35019e, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f35018d.getLiteJavaType() == w.c.ENUM ? Integer.valueOf(((i.a) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h() {
    }

    static Method e(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e11) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static <ContainingType extends o, Type> f<ContainingType, Type> h(ContainingType containingtype, o oVar, i.b<?> bVar, int i11, w.b bVar2, boolean z11, Class cls) {
        return new f<>(containingtype, Collections.emptyList(), oVar, new e(bVar, i11, bVar2, true, z11), cls);
    }

    public static <ContainingType extends o, Type> f<ContainingType, Type> i(ContainingType containingtype, Type type, o oVar, i.b<?> bVar, int i11, w.b bVar2, Class cls) {
        return new f<>(containingtype, type, oVar, new e(bVar, i11, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.o> boolean k(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.h.e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.h.k(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<? extends o> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i11) {
        return eVar.P(i11, codedOutputStream);
    }

    /* loaded from: classes5.dex */
    public static abstract class d<MessageType extends d<MessageType>> extends h implements p {

        /* renamed from: a  reason: collision with root package name */
        private final g<e> f35005a;

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes5.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            private final Iterator<Map.Entry<e, Object>> f35006a;

            /* renamed from: b  reason: collision with root package name */
            private Map.Entry<e, Object> f35007b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f35008c;

            /* synthetic */ a(d dVar, boolean z11, a aVar) {
                this(z11);
            }

            public void a(int i11, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<e, Object> entry = this.f35007b;
                    if (entry == null || entry.getKey().getNumber() >= i11) {
                        return;
                    }
                    e key = this.f35007b.getKey();
                    if (this.f35008c && key.getLiteJavaType() == w.c.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.f0(key.getNumber(), (o) this.f35007b.getValue());
                    } else {
                        g.z(key, this.f35007b.getValue(), codedOutputStream);
                    }
                    if (this.f35006a.hasNext()) {
                        this.f35007b = this.f35006a.next();
                    } else {
                        this.f35007b = null;
                    }
                }
            }

            private a(boolean z11) {
                Iterator<Map.Entry<e, Object>> p11 = d.this.f35005a.p();
                this.f35006a = p11;
                if (p11.hasNext()) {
                    this.f35007b = p11.next();
                }
                this.f35008c = z11;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d() {
            this.f35005a = g.t();
        }

        private void t(f<MessageType, ?> fVar) {
            if (fVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public void g() {
            this.f35005a.q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public boolean j(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i11) {
            return h.k(this.f35005a, getDefaultInstanceForType(), eVar, codedOutputStream, fVar, i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean m() {
            return this.f35005a.n();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public int n() {
            return this.f35005a.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type o(f<MessageType, Type> fVar) {
            t(fVar);
            Object h11 = this.f35005a.h(fVar.f35018d);
            if (h11 == null) {
                return fVar.f35016b;
            }
            return (Type) fVar.a(h11);
        }

        public final <Type> Type p(f<MessageType, List<Type>> fVar, int i11) {
            t(fVar);
            return (Type) fVar.e(this.f35005a.i(fVar.f35018d, i11));
        }

        public final <Type> int q(f<MessageType, List<Type>> fVar) {
            t(fVar);
            return this.f35005a.j(fVar.f35018d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean r(f<MessageType, Type> fVar) {
            t(fVar);
            return this.f35005a.m(fVar.f35018d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d<MessageType>.a s() {
            return new a(this, false, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d(c<MessageType, ?> cVar) {
            this.f35005a = cVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(b bVar) {
    }
}
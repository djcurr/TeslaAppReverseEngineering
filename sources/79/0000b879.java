package v00;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import n10.v;
import t00.k;
import wz.b0;
import wz.w;
import wz.y0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f53848a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f53849b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f53850c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f53851d;

    /* renamed from: e  reason: collision with root package name */
    private static final Set<String> f53852e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f53853f;

    /* renamed from: g  reason: collision with root package name */
    private static final Set<String> f53854g;

    static {
        Set<String> n11;
        Set m11;
        Set m12;
        Set m13;
        Set m14;
        Set m15;
        Set<String> m16;
        Set m17;
        Set m18;
        Set m19;
        Set m21;
        Set m22;
        Set<String> m23;
        Set m24;
        Set<String> m25;
        Set m26;
        Set<String> m27;
        i iVar = new i();
        f53848a = iVar;
        v vVar = v.f40228a;
        n11 = y0.n(vVar.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f53849b = n11;
        m11 = y0.m(iVar.b(), vVar.f("List", "sort(Ljava/util/Comparator;)V"));
        m12 = y0.m(m11, vVar.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        m13 = y0.m(m12, vVar.e("Double", "isInfinite()Z", "isNaN()Z"));
        m14 = y0.m(m13, vVar.e("Float", "isInfinite()Z", "isNaN()Z"));
        m15 = y0.m(m14, vVar.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        m16 = y0.m(m15, vVar.e("CharSequence", "isEmpty()Z"));
        f53850c = m16;
        m17 = y0.m(vVar.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), vVar.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V"));
        m18 = y0.m(m17, vVar.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"));
        m19 = y0.m(m18, vVar.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        m21 = y0.m(m19, vVar.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"));
        m22 = y0.m(m21, vVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V"));
        m23 = y0.m(m22, vVar.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f53851d = m23;
        m24 = y0.m(vVar.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), vVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"));
        m25 = y0.m(m24, vVar.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        f53852e = m25;
        Set<String> a11 = iVar.a();
        String[] b11 = vVar.b("D");
        m26 = y0.m(a11, vVar.e("Float", (String[]) Arrays.copyOf(b11, b11.length)));
        String[] b12 = vVar.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        m27 = y0.m(m26, vVar.e("String", (String[]) Arrays.copyOf(b12, b12.length)));
        f53853f = m27;
        String[] b13 = vVar.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f53854g = vVar.e("Throwable", (String[]) Arrays.copyOf(b13, b13.length));
    }

    private i() {
    }

    private final Set<String> a() {
        List<b20.e> l11;
        v vVar = v.f40228a;
        b20.e eVar = b20.e.BYTE;
        l11 = w.l(b20.e.BOOLEAN, eVar, b20.e.DOUBLE, b20.e.FLOAT, eVar, b20.e.INT, b20.e.LONG, b20.e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (b20.e eVar2 : l11) {
            String b11 = eVar2.getWrapperFqName().g().b();
            s.f(b11, "it.wrapperFqName.shortName().asString()");
            String[] b12 = vVar.b("Ljava/lang/String;");
            b0.z(linkedHashSet, vVar.e(b11, (String[]) Arrays.copyOf(b12, b12.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        List<b20.e> l11;
        v vVar = v.f40228a;
        l11 = w.l(b20.e.BOOLEAN, b20.e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (b20.e eVar : l11) {
            String b11 = eVar.getWrapperFqName().g().b();
            s.f(b11, "it.wrapperFqName.shortName().asString()");
            b0.z(linkedHashSet, vVar.e(b11, eVar.getJavaKeywordName() + "Value()" + eVar.getDesc()));
        }
        return linkedHashSet;
    }

    public final Set<String> c() {
        return f53849b;
    }

    public final Set<String> d() {
        return f53853f;
    }

    public final Set<String> e() {
        return f53850c;
    }

    public final Set<String> f() {
        return f53852e;
    }

    public final Set<String> g() {
        return f53854g;
    }

    public final Set<String> h() {
        return f53851d;
    }

    public final boolean i(u10.d fqName) {
        s.g(fqName, "fqName");
        return s.c(fqName, k.a.f51336h) || k.e(fqName);
    }

    public final boolean j(u10.d fqName) {
        s.g(fqName, "fqName");
        if (i(fqName)) {
            return true;
        }
        u10.b o11 = c.f53787a.o(fqName);
        if (o11 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(o11.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
package n10;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import wz.e0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f40228a = new v();

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40229a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(String it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return v.f40228a.c(it2);
        }
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str) {
        if (str.length() > 1) {
            return Matrix.MATRIX_TYPE_RANDOM_LT + str + ';';
        }
        return str;
    }

    public final String[] b(String... signatures) {
        kotlin.jvm.internal.s.g(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public final Set<String> d(String internalName, String... signatures) {
        kotlin.jvm.internal.s.g(internalName, "internalName");
        kotlin.jvm.internal.s.g(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + CoreConstants.DOT + str);
        }
        return linkedHashSet;
    }

    public final Set<String> e(String name, String... signatures) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set<String> f(String name, String... signatures) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        return kotlin.jvm.internal.s.p("java/util/function/", name);
    }

    public final String h(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        return kotlin.jvm.internal.s.p("java/lang/", name);
    }

    public final String i(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        return kotlin.jvm.internal.s.p("java/util/", name);
    }

    public final String j(String name, List<String> parameters, String ret) {
        String l02;
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(parameters, "parameters");
        kotlin.jvm.internal.s.g(ret, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        l02 = e0.l0(parameters, "", null, null, 0, null, a.f40229a, 30, null);
        sb2.append(l02);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        sb2.append(c(ret));
        return sb2.toString();
    }

    public final String k(String internalName, String jvmDescriptor) {
        kotlin.jvm.internal.s.g(internalName, "internalName");
        kotlin.jvm.internal.s.g(jvmDescriptor, "jvmDescriptor");
        return internalName + CoreConstants.DOT + jvmDescriptor;
    }
}
package t10;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import m00.l;
import s10.a;
import vz.b0;
import wz.e0;
import wz.k0;
import wz.r0;
import wz.w;
import wz.x;
import wz.x0;

/* loaded from: classes5.dex */
public final class f implements r10.c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f51551e;

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f51552f;

    /* renamed from: a  reason: collision with root package name */
    private final a.e f51553a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f51554b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Integer> f51555c;

    /* renamed from: d  reason: collision with root package name */
    private final List<a.e.c> f51556d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f51557a;

        static {
            int[] iArr = new int[a.e.c.EnumC1106c.values().length];
            iArr[a.e.c.EnumC1106c.NONE.ordinal()] = 1;
            iArr[a.e.c.EnumC1106c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[a.e.c.EnumC1106c.DESC_TO_CLASS_ID.ordinal()] = 3;
            f51557a = iArr;
        }
    }

    static {
        List l11;
        String l02;
        List<String> l12;
        Iterable<k0> U0;
        int t11;
        int e11;
        int d11;
        new a(null);
        l11 = w.l('k', 'o', 't', 'l', 'i', 'n');
        l02 = e0.l0(l11, "", null, null, 0, null, null, 62, null);
        f51551e = l02;
        l12 = w.l(s.p(l02, "/Any"), s.p(l02, "/Nothing"), s.p(l02, "/Unit"), s.p(l02, "/Throwable"), s.p(l02, "/Number"), s.p(l02, "/Byte"), s.p(l02, "/Double"), s.p(l02, "/Float"), s.p(l02, "/Int"), s.p(l02, "/Long"), s.p(l02, "/Short"), s.p(l02, "/Boolean"), s.p(l02, "/Char"), s.p(l02, "/CharSequence"), s.p(l02, "/String"), s.p(l02, "/Comparable"), s.p(l02, "/Enum"), s.p(l02, "/Array"), s.p(l02, "/ByteArray"), s.p(l02, "/DoubleArray"), s.p(l02, "/FloatArray"), s.p(l02, "/IntArray"), s.p(l02, "/LongArray"), s.p(l02, "/ShortArray"), s.p(l02, "/BooleanArray"), s.p(l02, "/CharArray"), s.p(l02, "/Cloneable"), s.p(l02, "/Annotation"), s.p(l02, "/collections/Iterable"), s.p(l02, "/collections/MutableIterable"), s.p(l02, "/collections/Collection"), s.p(l02, "/collections/MutableCollection"), s.p(l02, "/collections/List"), s.p(l02, "/collections/MutableList"), s.p(l02, "/collections/Set"), s.p(l02, "/collections/MutableSet"), s.p(l02, "/collections/Map"), s.p(l02, "/collections/MutableMap"), s.p(l02, "/collections/Map.Entry"), s.p(l02, "/collections/MutableMap.MutableEntry"), s.p(l02, "/collections/Iterator"), s.p(l02, "/collections/MutableIterator"), s.p(l02, "/collections/ListIterator"), s.p(l02, "/collections/MutableListIterator"));
        f51552f = l12;
        U0 = e0.U0(l12);
        t11 = x.t(U0, 10);
        e11 = r0.e(t11);
        d11 = l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (k0 k0Var : U0) {
            linkedHashMap.put((String) k0Var.d(), Integer.valueOf(k0Var.c()));
        }
    }

    public f(a.e types, String[] strings) {
        Set<Integer> S0;
        s.g(types, "types");
        s.g(strings, "strings");
        this.f51553a = types;
        this.f51554b = strings;
        List<Integer> r11 = types.r();
        if (r11.isEmpty()) {
            S0 = x0.d();
        } else {
            s.f(r11, "");
            S0 = e0.S0(r11);
        }
        this.f51555c = S0;
        ArrayList arrayList = new ArrayList();
        List<a.e.c> s11 = c().s();
        arrayList.ensureCapacity(s11.size());
        for (a.e.c cVar : s11) {
            int z11 = cVar.z();
            for (int i11 = 0; i11 < z11; i11++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        b0 b0Var = b0.f54756a;
        this.f51556d = arrayList;
    }

    @Override // r10.c
    public boolean a(int i11) {
        return this.f51555c.contains(Integer.valueOf(i11));
    }

    @Override // r10.c
    public String b(int i11) {
        return getString(i11);
    }

    public final a.e c() {
        return this.f51553a;
    }

    @Override // r10.c
    public String getString(int i11) {
        String string;
        a.e.c cVar = this.f51556d.get(i11);
        if (cVar.K()) {
            string = cVar.C();
        } else {
            if (cVar.I()) {
                List<String> list = f51552f;
                int size = list.size() - 1;
                int y11 = cVar.y();
                if (y11 >= 0 && y11 <= size) {
                    string = list.get(cVar.y());
                }
            }
            string = this.f51554b[i11];
        }
        if (cVar.F() >= 2) {
            List<Integer> substringIndexList = cVar.G();
            s.f(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            s.f(begin, "begin");
            if (begin.intValue() >= 0) {
                int intValue = begin.intValue();
                s.f(end, "end");
                if (intValue <= end.intValue() && end.intValue() <= string.length()) {
                    s.f(string, "string");
                    string = string.substring(begin.intValue(), end.intValue());
                    s.f(string, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        String string2 = string;
        if (cVar.A() >= 2) {
            List<Integer> replaceCharList = cVar.B();
            s.f(replaceCharList, "replaceCharList");
            s.f(string2, "string");
            string2 = v.C(string2, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue(), false, 4, null);
        }
        String string3 = string2;
        a.e.c.EnumC1106c x11 = cVar.x();
        if (x11 == null) {
            x11 = a.e.c.EnumC1106c.NONE;
        }
        int i12 = b.f51557a[x11.ordinal()];
        if (i12 == 2) {
            s.f(string3, "string");
            string3 = v.C(string3, CoreConstants.DOLLAR, CoreConstants.DOT, false, 4, null);
        } else if (i12 == 3) {
            if (string3.length() >= 2) {
                s.f(string3, "string");
                string3 = string3.substring(1, string3.length() - 1);
                s.f(string3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            String string4 = string3;
            s.f(string4, "string");
            string3 = v.C(string4, CoreConstants.DOLLAR, CoreConstants.DOT, false, 4, null);
        }
        s.f(string3, "string");
        return string3;
    }
}
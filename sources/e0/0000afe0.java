package r10;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.s;
import p10.o;
import p10.p;
import vz.u;
import wz.e0;

/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final p f49059a;

    /* renamed from: b  reason: collision with root package name */
    private final o f49060b;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f49061a;

        static {
            int[] iArr = new int[o.c.EnumC0975c.values().length];
            iArr[o.c.EnumC0975c.CLASS.ordinal()] = 1;
            iArr[o.c.EnumC0975c.PACKAGE.ordinal()] = 2;
            iArr[o.c.EnumC0975c.LOCAL.ordinal()] = 3;
            f49061a = iArr;
        }
    }

    public d(p strings, o qualifiedNames) {
        s.g(strings, "strings");
        s.g(qualifiedNames, "qualifiedNames");
        this.f49059a = strings;
        this.f49060b = qualifiedNames;
    }

    private final u<List<String>, List<String>, Boolean> c(int i11) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z11 = false;
        while (i11 != -1) {
            o.c p11 = this.f49060b.p(i11);
            String p12 = this.f49059a.p(p11.t());
            o.c.EnumC0975c r11 = p11.r();
            s.e(r11);
            int i12 = a.f49061a[r11.ordinal()];
            if (i12 == 1) {
                linkedList2.addFirst(p12);
            } else if (i12 == 2) {
                linkedList.addFirst(p12);
            } else if (i12 == 3) {
                linkedList2.addFirst(p12);
                z11 = true;
            }
            i11 = p11.s();
        }
        return new u<>(linkedList, linkedList2, Boolean.valueOf(z11));
    }

    @Override // r10.c
    public boolean a(int i11) {
        return c(i11).f().booleanValue();
    }

    @Override // r10.c
    public String b(int i11) {
        String l02;
        String l03;
        u<List<String>, List<String>, Boolean> c11 = c(i11);
        List<String> a11 = c11.a();
        l02 = e0.l0(c11.b(), ".", null, null, 0, null, null, 62, null);
        if (a11.isEmpty()) {
            return l02;
        }
        StringBuilder sb2 = new StringBuilder();
        l03 = e0.l0(a11, "/", null, null, 0, null, null, 62, null);
        sb2.append(l03);
        sb2.append('/');
        sb2.append(l02);
        return sb2.toString();
    }

    @Override // r10.c
    public String getString(int i11) {
        String p11 = this.f49059a.p(i11);
        s.f(p11, "strings.getString(index)");
        return p11;
    }
}
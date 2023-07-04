package b7;

import com.adyen.checkout.components.model.payments.request.Installments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import v6.q;
import v6.r;
import v6.s;
import v6.t;
import v6.z;
import wz.e0;
import wz.w;
import wz.x;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f7525a = new f();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7526a;

        static {
            int[] iArr = new int[s.values().length];
            iArr[s.REGULAR.ordinal()] = 1;
            iArr[s.REVOLVING.ordinal()] = 2;
            iArr[s.ONE_TIME.ordinal()] = 3;
            f7526a = iArr;
        }
    }

    private f() {
    }

    private final List<r> c(t tVar) {
        int t11;
        List<r> i11;
        if (tVar == null) {
            i11 = w.i();
            return i11;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(z.checkout_card_installments_option_one_time, null, s.ONE_TIME));
        if (tVar.a()) {
            arrayList.add(new r(z.checkout_card_installments_option_revolving, 1, s.REVOLVING));
        }
        List<Integer> b11 = tVar.b();
        t11 = x.t(b11, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (Number number : b11) {
            arrayList2.add(new r(z.checkout_card_installments_option_regular, Integer.valueOf(number.intValue()), s.REGULAR));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean a(q installmentConfiguration) {
        List Y;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.s.g(installmentConfiguration, "installmentConfiguration");
        ArrayList arrayList = new ArrayList();
        arrayList.add(installmentConfiguration.b());
        arrayList.addAll(installmentConfiguration.a());
        Y = e0.Y(arrayList);
        boolean z13 = false;
        if (!(Y instanceof Collection) || !Y.isEmpty()) {
            Iterator it2 = Y.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                List<Integer> b11 = ((t) it2.next()).b();
                if (!(b11 instanceof Collection) || !b11.isEmpty()) {
                    for (Number number : b11) {
                        if (number.intValue() <= 1) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            z12 = true;
                            continue;
                            break;
                        }
                    }
                }
                z12 = false;
                continue;
                if (z12) {
                    z13 = true;
                    break;
                }
            }
        }
        return !z13;
    }

    public final boolean b(List<t.a> list) {
        boolean z11;
        boolean z12 = false;
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                x6.a c11 = ((t.a) obj).c();
                Object obj2 = linkedHashMap.get(c11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(c11, obj2);
                }
                ((List) obj2).add(obj);
            }
            Collection values = linkedHashMap.values();
            if (values != null && !values.isEmpty()) {
                Iterator it2 = values.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((List) it2.next()).size() > 1) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        z12 = true;
                        break;
                    }
                }
            }
        }
        return !z12;
    }

    public final Installments d(r rVar) {
        s a11 = rVar == null ? null : rVar.a();
        int i11 = a11 == null ? -1 : a.f7526a[a11.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return new Installments(rVar.a().getType(), rVar.b());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<v6.r> e(v6.q r6, x6.a r7, boolean r8) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            java.util.List r1 = r6.a()
        L9:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r3
        L10:
            if (r6 != 0) goto L14
            r4 = r0
            goto L18
        L14:
            v6.t$c r4 = r6.b()
        L18:
            if (r4 == 0) goto L1c
            r4 = r2
            goto L1d
        L1c:
            r4 = r3
        L1d:
            if (r1 == 0) goto L53
            if (r8 == 0) goto L53
            if (r6 != 0) goto L25
        L23:
            r8 = r3
            goto L4f
        L25:
            java.util.List r8 = r6.a()
            if (r8 != 0) goto L2c
            goto L23
        L2c:
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L33
            goto L23
        L33:
            java.util.Iterator r8 = r8.iterator()
        L37:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r8.next()
            v6.t$a r1 = (v6.t.a) r1
            x6.a r1 = r1.c()
            if (r1 != r7) goto L4b
            r1 = r2
            goto L4c
        L4b:
            r1 = r3
        L4c:
            if (r1 == 0) goto L37
            r8 = r2
        L4f:
            if (r8 == 0) goto L53
            r8 = r2
            goto L54
        L53:
            r8 = r3
        L54:
            if (r8 == 0) goto L84
            if (r6 != 0) goto L59
            goto L7f
        L59:
            java.util.List r6 = r6.a()
            if (r6 != 0) goto L60
            goto L7f
        L60:
            java.util.Iterator r6 = r6.iterator()
        L64:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r6.next()
            r1 = r8
            v6.t$a r1 = (v6.t.a) r1
            x6.a r1 = r1.c()
            if (r1 != r7) goto L79
            r1 = r2
            goto L7a
        L79:
            r1 = r3
        L7a:
            if (r1 == 0) goto L64
            r0 = r8
        L7d:
            v6.t$a r0 = (v6.t.a) r0
        L7f:
            java.util.List r6 = r5.c(r0)
            goto L96
        L84:
            if (r4 == 0) goto L92
            if (r6 != 0) goto L89
            goto L8d
        L89:
            v6.t$c r0 = r6.b()
        L8d:
            java.util.List r6 = r5.c(r0)
            goto L96
        L92:
            java.util.List r6 = wz.u.i()
        L96:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.f.e(v6.q, x6.a, boolean):java.util.List");
    }
}
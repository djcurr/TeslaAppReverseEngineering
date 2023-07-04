package b7;

import com.adyen.checkout.card.api.model.AddressItem;
import com.adyen.checkout.components.model.payments.request.Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import v6.a;
import wz.e0;
import wz.w;
import wz.x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7519a = new a();

    /* renamed from: b7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0148a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7520a;

        static {
            int[] iArr = new int[v6.c.values().length];
            iArr[v6.c.FULL_ADDRESS.ordinal()] = 1;
            iArr[v6.c.POSTAL_CODE.ordinal()] = 2;
            f7520a = iArr;
        }
    }

    private a() {
    }

    private final List<a7.a> g(List<AddressItem> list) {
        int t11;
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (AddressItem addressItem : list) {
            String name = addressItem.getName();
            String str = "";
            if (name == null) {
                name = "";
            }
            String id2 = addressItem.getId();
            if (id2 != null) {
                str = id2;
            }
            arrayList.add(new a7.a(name, str, false));
        }
        return arrayList;
    }

    public static /* synthetic */ List i(a aVar, List list, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return aVar.h(list, str);
    }

    public final v6.c a(v6.a aVar, e7.a addressVisibility) {
        s.g(addressVisibility, "addressVisibility");
        if (aVar != null) {
            return v6.c.Companion.a(aVar);
        }
        return v6.c.Companion.b(addressVisibility);
    }

    public final List<a7.a> b(v6.a aVar, List<AddressItem> countryList) {
        List<a7.a> i11;
        s.g(countryList, "countryList");
        if (aVar instanceof a.C1214a) {
            a.C1214a c1214a = (a.C1214a) aVar;
            if (!c1214a.b().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : countryList) {
                    AddressItem addressItem = (AddressItem) obj;
                    List<String> b11 = c1214a.b();
                    boolean z11 = false;
                    if (!(b11 instanceof Collection) || !b11.isEmpty()) {
                        Iterator<T> it2 = b11.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (s.c((String) it2.next(), addressItem.getId())) {
                                    z11 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z11) {
                        arrayList.add(obj);
                    }
                }
                countryList = arrayList;
            }
            String a11 = c1214a.a();
            if (a11 == null) {
                a11 = "";
            }
            return h(g(countryList), a11);
        }
        i11 = w.i();
        return i11;
    }

    public final List<a7.a> c(List<AddressItem> stateList) {
        s.g(stateList, "stateList");
        return i(this, g(stateList), null, 2, null);
    }

    public final boolean d(v6.c addressFormUIState) {
        s.g(addressFormUIState, "addressFormUIState");
        return addressFormUIState != v6.c.NONE;
    }

    public final Address e(v6.e addressOutputData, v6.c addressFormUIState) {
        Address address;
        s.g(addressOutputData, "addressOutputData");
        s.g(addressFormUIState, "addressFormUIState");
        int i11 = C0148a.f7520a[addressFormUIState.ordinal()];
        String str = Address.ADDRESS_NULL_PLACEHOLDER;
        if (i11 == 1) {
            address = new Address();
            String b11 = addressOutputData.e().b();
            if (b11.length() == 0) {
                b11 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            address.setPostalCode(b11);
            String b12 = addressOutputData.g().b();
            if (b12.length() == 0) {
                b12 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            address.setStreet(b12);
            String b13 = addressOutputData.f().b();
            if (b13.length() == 0) {
                b13 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            address.setStateOrProvince(b13);
            String f11 = f7519a.f(addressOutputData.d().b(), addressOutputData.a().b());
            if (f11.length() == 0) {
                f11 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            address.setHouseNumberOrName(f11);
            String b14 = addressOutputData.b().b();
            if (!(b14.length() == 0)) {
                str = b14;
            }
            address.setCity(str);
            address.setCountry(addressOutputData.c().b());
        } else if (i11 != 2) {
            return null;
        } else {
            address = new Address();
            address.setPostalCode(addressOutputData.e().b());
            address.setStreet(Address.ADDRESS_NULL_PLACEHOLDER);
            address.setStateOrProvince(Address.ADDRESS_NULL_PLACEHOLDER);
            address.setHouseNumberOrName(Address.ADDRESS_NULL_PLACEHOLDER);
            address.setCity(Address.ADDRESS_NULL_PLACEHOLDER);
            address.setCountry("ZZ");
        }
        return address;
    }

    public final String f(String houseNumberOrName, String apartmentSuite) {
        List l11;
        String l02;
        s.g(houseNumberOrName, "houseNumberOrName");
        s.g(apartmentSuite, "apartmentSuite");
        l11 = w.l(houseNumberOrName, apartmentSuite);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l11) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        l02 = e0.l0(arrayList, " ", null, null, 0, null, null, 62, null);
        return l02;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<a7.a> h(java.util.List<a7.a> r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.s.g(r12, r0)
            boolean r0 = r12 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L13
        L11:
            r0 = r2
            goto L2e
        L13:
            java.util.Iterator r0 = r12.iterator()
        L17:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r0.next()
            a7.a r3 = (a7.a) r3
            java.lang.String r3 = r3.d()
            boolean r3 = kotlin.jvm.internal.s.c(r3, r13)
            if (r3 == 0) goto L17
            r0 = r1
        L2e:
            r3 = 10
            if (r0 == 0) goto L72
            if (r13 != 0) goto L36
        L34:
            r0 = r2
            goto L42
        L36:
            int r0 = r13.length()
            if (r0 <= 0) goto L3e
            r0 = r1
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 != r1) goto L34
            r0 = r1
        L42:
            if (r0 == 0) goto L72
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = wz.u.t(r12, r3)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L51:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r12.next()
            r2 = r1
            a7.a r2 = (a7.a) r2
            r3 = 0
            r4 = 0
            java.lang.String r1 = r2.d()
            boolean r5 = kotlin.jvm.internal.s.c(r1, r13)
            r6 = 3
            r7 = 0
            a7.a r1 = a7.a.c(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
            goto L51
        L72:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r13 = wz.u.t(r12, r3)
            r0.<init>(r13)
            java.util.Iterator r12 = r12.iterator()
            r13 = r2
        L80:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r12.next()
            int r4 = r13 + 1
            if (r13 >= 0) goto L91
            wz.u.s()
        L91:
            r5 = r3
            a7.a r5 = (a7.a) r5
            if (r13 != 0) goto L98
            r8 = r1
            goto L99
        L98:
            r8 = r2
        L99:
            r6 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            a7.a r13 = a7.a.c(r5, r6, r7, r8, r9, r10)
            r0.add(r13)
            r13 = r4
            goto L80
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.a.h(java.util.List, java.lang.String):java.util.List");
    }
}
package b7;

import com.adyen.checkout.card.ui.AddressFormInput;
import j7.f;
import kotlin.jvm.internal.s;
import v6.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f7521a = new b();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7522a;

        static {
            int[] iArr = new int[v6.c.values().length];
            iArr[v6.c.FULL_ADDRESS.ordinal()] = 1;
            iArr[v6.c.POSTAL_CODE.ordinal()] = 2;
            f7522a = iArr;
        }
    }

    private b() {
    }

    private final j7.a<String> b(String str, boolean z11) {
        if (!(str.length() > 0) && z11) {
            return new j7.a<>(str, new f.a(z.checkout_address_form_field_not_valid));
        }
        return new j7.a<>(str, f.b.f33276a);
    }

    private final v6.e c(v6.d dVar) {
        AddressFormInput.b a11 = AddressFormInput.b.Companion.a(dVar.c());
        b bVar = f7521a;
        return new v6.e(bVar.b(dVar.e(), a11.getPostalCode$card_release().b()), bVar.b(dVar.g(), a11.getStreet$card_release().b()), bVar.b(dVar.f(), a11.getStateProvince$card_release().b()), bVar.b(dVar.d(), a11.getHouseNumber$card_release().b()), bVar.b(dVar.a(), a11.getApartmentSuite$card_release().b()), bVar.b(dVar.b(), a11.getCity$card_release().b()), bVar.b(dVar.c(), a11.getCountry$card_release().b()));
    }

    private final v6.e e(v6.d dVar) {
        j7.a<String> b11 = f7521a.b(dVar.e(), true);
        String g11 = dVar.g();
        f.b bVar = f.b.f33276a;
        return new v6.e(b11, new j7.a(g11, bVar), new j7.a(dVar.f(), bVar), new j7.a(dVar.d(), bVar), new j7.a(dVar.a(), bVar), new j7.a(dVar.b(), bVar), new j7.a(dVar.c(), bVar));
    }

    public final v6.e a(v6.d addressInputModel) {
        s.g(addressInputModel, "addressInputModel");
        String e11 = addressInputModel.e();
        f.b bVar = f.b.f33276a;
        return new v6.e(new j7.a(e11, bVar), new j7.a(addressInputModel.g(), bVar), new j7.a(addressInputModel.f(), bVar), new j7.a(addressInputModel.d(), bVar), new j7.a(addressInputModel.a(), bVar), new j7.a(addressInputModel.b(), bVar), new j7.a(addressInputModel.c(), bVar));
    }

    public final v6.e d(v6.d addressInputModel, v6.c addressFormUIState) {
        s.g(addressInputModel, "addressInputModel");
        s.g(addressFormUIState, "addressFormUIState");
        int i11 = a.f7522a[addressFormUIState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return a(addressInputModel);
            }
            return e(addressInputModel);
        }
        return c(addressInputModel);
    }
}
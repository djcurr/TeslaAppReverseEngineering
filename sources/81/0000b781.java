package u6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import t6.s;
import t6.t;

/* loaded from: classes.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final View f53327a;

    /* renamed from: b  reason: collision with root package name */
    public final AdyenTextInputEditText f53328b;

    /* renamed from: c  reason: collision with root package name */
    public final AdyenTextInputEditText f53329c;

    /* renamed from: d  reason: collision with root package name */
    public final AdyenTextInputEditText f53330d;

    /* renamed from: e  reason: collision with root package name */
    public final AdyenTextInputEditText f53331e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout f53332f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout f53333g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f53334h;

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout f53335i;

    private a(View view, AdyenTextInputEditText adyenTextInputEditText, AdyenTextInputEditText adyenTextInputEditText2, AdyenTextInputEditText adyenTextInputEditText3, AdyenTextInputEditText adyenTextInputEditText4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4) {
        this.f53327a = view;
        this.f53328b = adyenTextInputEditText;
        this.f53329c = adyenTextInputEditText2;
        this.f53330d = adyenTextInputEditText3;
        this.f53331e = adyenTextInputEditText4;
        this.f53332f = textInputLayout;
        this.f53333g = textInputLayout2;
        this.f53334h = textInputLayout3;
        this.f53335i = textInputLayout4;
    }

    public static a a(View view) {
        int i11 = s.f51700a;
        AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) view.findViewById(i11);
        if (adyenTextInputEditText != null) {
            i11 = s.f51701b;
            AdyenTextInputEditText adyenTextInputEditText2 = (AdyenTextInputEditText) view.findViewById(i11);
            if (adyenTextInputEditText2 != null) {
                i11 = s.f51702c;
                AdyenTextInputEditText adyenTextInputEditText3 = (AdyenTextInputEditText) view.findViewById(i11);
                if (adyenTextInputEditText3 != null) {
                    i11 = s.f51703d;
                    AdyenTextInputEditText adyenTextInputEditText4 = (AdyenTextInputEditText) view.findViewById(i11);
                    if (adyenTextInputEditText4 != null) {
                        i11 = s.textInputLayout_bankAccountNumber;
                        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(i11);
                        if (textInputLayout != null) {
                            i11 = s.textInputLayout_holderName;
                            TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(i11);
                            if (textInputLayout2 != null) {
                                i11 = s.textInputLayout_shopperEmail;
                                TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(i11);
                                if (textInputLayout3 != null) {
                                    i11 = s.textInputLayout_sortCode;
                                    TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(i11);
                                    if (textInputLayout4 != null) {
                                        return new a(view, adyenTextInputEditText, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(t.bacs_direct_debit_confirmation_view, viewGroup);
        return a(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.f53327a;
    }
}
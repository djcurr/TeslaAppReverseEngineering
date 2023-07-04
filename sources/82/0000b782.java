package u6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import t6.s;
import t6.t;

/* loaded from: classes.dex */
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final View f53336a;

    /* renamed from: b  reason: collision with root package name */
    public final AdyenTextInputEditText f53337b;

    /* renamed from: c  reason: collision with root package name */
    public final AdyenTextInputEditText f53338c;

    /* renamed from: d  reason: collision with root package name */
    public final AdyenTextInputEditText f53339d;

    /* renamed from: e  reason: collision with root package name */
    public final AdyenTextInputEditText f53340e;

    /* renamed from: f  reason: collision with root package name */
    public final SwitchCompat f53341f;

    /* renamed from: g  reason: collision with root package name */
    public final SwitchCompat f53342g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f53343h;

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout f53344i;

    /* renamed from: j  reason: collision with root package name */
    public final TextInputLayout f53345j;

    /* renamed from: k  reason: collision with root package name */
    public final TextInputLayout f53346k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f53347l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f53348m;

    private b(View view, AdyenTextInputEditText adyenTextInputEditText, AdyenTextInputEditText adyenTextInputEditText2, AdyenTextInputEditText adyenTextInputEditText3, AdyenTextInputEditText adyenTextInputEditText4, SwitchCompat switchCompat, SwitchCompat switchCompat2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2) {
        this.f53336a = view;
        this.f53337b = adyenTextInputEditText;
        this.f53338c = adyenTextInputEditText2;
        this.f53339d = adyenTextInputEditText3;
        this.f53340e = adyenTextInputEditText4;
        this.f53341f = switchCompat;
        this.f53342g = switchCompat2;
        this.f53343h = textInputLayout;
        this.f53344i = textInputLayout2;
        this.f53345j = textInputLayout3;
        this.f53346k = textInputLayout4;
        this.f53347l = textView;
        this.f53348m = textView2;
    }

    public static b a(View view) {
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
                        i11 = s.f51704e;
                        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(i11);
                        if (switchCompat != null) {
                            i11 = s.f51705f;
                            SwitchCompat switchCompat2 = (SwitchCompat) view.findViewById(i11);
                            if (switchCompat2 != null) {
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
                                                i11 = s.textView_errorConsentAccount;
                                                TextView textView = (TextView) view.findViewById(i11);
                                                if (textView != null) {
                                                    i11 = s.textView_errorConsentAmount;
                                                    TextView textView2 = (TextView) view.findViewById(i11);
                                                    if (textView2 != null) {
                                                        return new b(view, adyenTextInputEditText, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, switchCompat, switchCompat2, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2);
                                                    }
                                                }
                                            }
                                        }
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

    public static b b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(t.bacs_direct_debit_input_view, viewGroup);
        return a(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.f53336a;
    }
}
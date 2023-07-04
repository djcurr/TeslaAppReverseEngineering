package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.adyen.checkout.components.model.payments.request.Address;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.text.a0;
import com.facebook.react.views.text.c0;
import com.facebook.react.views.text.e0;
import com.facebook.react.views.text.r;
import com.facebook.react.views.text.t;
import com.facebook.react.views.text.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

@fg.a(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactTextInputManager extends BaseViewManager<com.facebook.react.views.textinput.c, com.facebook.react.uimanager.i> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;
    protected t mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new a();
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_FIELDS = {"mCursorDrawable", "mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    private static final String[] DRAWABLE_RESOURCES = {"mCursorDrawableRes", "mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};

    /* loaded from: classes3.dex */
    class a extends HashMap<String, String> {
        a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put("email", "emailAddress");
            put("gender", "gender");
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f12716a;

        b(ReactTextInputManager reactTextInputManager, boolean z11) {
            this.f12716a = z11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return this.f12716a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f12717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.textinput.c f12718b;

        c(ReactTextInputManager reactTextInputManager, n0 n0Var, com.facebook.react.views.textinput.c cVar) {
            this.f12717a = n0Var;
            this.f12718b = cVar;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            int c11 = this.f12717a.c();
            com.facebook.react.uimanager.events.d eventDispatcher = ReactTextInputManager.getEventDispatcher(this.f12717a, this.f12718b);
            if (z11) {
                eventDispatcher.g(new i(c11, this.f12718b.getId()));
                return;
            }
            eventDispatcher.g(new com.facebook.react.views.textinput.f(c11, this.f12718b.getId()));
            eventDispatcher.g(new com.facebook.react.views.textinput.g(c11, this.f12718b.getId(), this.f12718b.getText().toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.textinput.c f12719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f12720b;

        d(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar, n0 n0Var) {
            this.f12719a = cVar;
            this.f12720b = n0Var;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if ((i11 & 255) != 0 || i11 == 0) {
                boolean blurOnSubmit = this.f12719a.getBlurOnSubmit();
                boolean n11 = this.f12719a.n();
                ReactTextInputManager.getEventDispatcher(this.f12720b, this.f12719a).g(new n(this.f12720b.c(), this.f12719a.getId(), this.f12719a.getText().toString()));
                if (blurOnSubmit) {
                    this.f12719a.clearFocus();
                }
                return blurOnSubmit || !n11 || i11 == 5 || i11 == 7;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    private static class e implements com.facebook.react.views.textinput.a {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f12721a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f12722b;

        /* renamed from: c  reason: collision with root package name */
        private int f12723c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f12724d = 0;

        /* renamed from: e  reason: collision with root package name */
        private int f12725e;

        public e(com.facebook.react.views.textinput.c cVar) {
            this.f12721a = cVar;
            ReactContext d11 = t0.d(cVar);
            this.f12722b = ReactTextInputManager.getEventDispatcher(d11, cVar);
            this.f12725e = t0.e(d11);
        }

        @Override // com.facebook.react.views.textinput.a
        public void a() {
            if (this.f12722b == null) {
                return;
            }
            int width = this.f12721a.getWidth();
            int height = this.f12721a.getHeight();
            if (this.f12721a.getLayout() != null) {
                width = this.f12721a.getCompoundPaddingLeft() + this.f12721a.getLayout().getWidth() + this.f12721a.getCompoundPaddingRight();
                height = this.f12721a.getCompoundPaddingTop() + this.f12721a.getLayout().getHeight() + this.f12721a.getCompoundPaddingBottom();
            }
            if (width == this.f12723c && height == this.f12724d) {
                return;
            }
            this.f12724d = height;
            this.f12723c = width;
            this.f12722b.g(new com.facebook.react.views.textinput.b(this.f12725e, this.f12721a.getId(), com.facebook.react.uimanager.p.a(width), com.facebook.react.uimanager.p.a(height)));
        }
    }

    /* loaded from: classes3.dex */
    private static class f implements o {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f12726a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f12727b;

        /* renamed from: c  reason: collision with root package name */
        private int f12728c;

        /* renamed from: d  reason: collision with root package name */
        private int f12729d;

        /* renamed from: e  reason: collision with root package name */
        private int f12730e;

        public f(com.facebook.react.views.textinput.c cVar) {
            this.f12726a = cVar;
            ReactContext d11 = t0.d(cVar);
            this.f12727b = ReactTextInputManager.getEventDispatcher(d11, cVar);
            this.f12730e = t0.e(d11);
        }

        @Override // com.facebook.react.views.textinput.o
        public void a(int i11, int i12, int i13, int i14) {
            if (this.f12728c == i11 && this.f12729d == i12) {
                return;
            }
            this.f12727b.g(wg.g.b(this.f12730e, this.f12726a.getId(), com.facebook.react.views.scroll.b.SCROLL, i11, i12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, this.f12726a.getWidth(), this.f12726a.getHeight()));
            this.f12728c = i11;
            this.f12729d = i12;
        }
    }

    /* loaded from: classes3.dex */
    private class g implements p {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f12731a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f12732b;

        /* renamed from: c  reason: collision with root package name */
        private int f12733c;

        /* renamed from: d  reason: collision with root package name */
        private int f12734d;

        /* renamed from: e  reason: collision with root package name */
        private int f12735e;

        public g(ReactTextInputManager reactTextInputManager, com.facebook.react.views.textinput.c cVar) {
            this.f12731a = cVar;
            ReactContext d11 = t0.d(cVar);
            this.f12732b = ReactTextInputManager.getEventDispatcher(d11, cVar);
            this.f12735e = t0.e(d11);
        }

        @Override // com.facebook.react.views.textinput.p
        public void a(int i11, int i12) {
            int min = Math.min(i11, i12);
            int max = Math.max(i11, i12);
            if (this.f12733c == min && this.f12734d == max) {
                return;
            }
            this.f12732b.g(new l(this.f12735e, this.f12731a.getId(), min, max));
            this.f12733c = min;
            this.f12734d = max;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class h implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f12736a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.react.views.textinput.c f12737b;

        /* renamed from: c  reason: collision with root package name */
        private String f12738c = null;

        /* renamed from: d  reason: collision with root package name */
        private int f12739d;

        /* loaded from: classes3.dex */
        class a implements d.b {
            a() {
            }

            @Override // com.facebook.react.uimanager.d.b
            public WritableMap a() {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", h.this.f12737b.m());
                writableNativeMap.putInt("opaqueCacheId", h.this.f12737b.getId());
                return writableNativeMap;
            }
        }

        public h(ReactTextInputManager reactTextInputManager, ReactContext reactContext, com.facebook.react.views.textinput.c cVar) {
            this.f12736a = ReactTextInputManager.getEventDispatcher(reactContext, cVar);
            this.f12737b = cVar;
            this.f12739d = t0.e(reactContext);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f12738c = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (this.f12737b.K) {
                return;
            }
            if (i13 == 0 && i12 == 0) {
                return;
            }
            wf.a.c(this.f12738c);
            String substring = charSequence.toString().substring(i11, i11 + i13);
            int i14 = i11 + i12;
            String substring2 = this.f12738c.substring(i11, i14);
            if (i13 == i12 && substring.equals(substring2)) {
                return;
            }
            if (this.f12737b.getFabricViewStateManager().b()) {
                this.f12737b.getFabricViewStateManager().c(new a());
            }
            this.f12736a.g(new com.facebook.react.views.textinput.e(this.f12739d, this.f12737b.getId(), charSequence.toString(), this.f12737b.m()));
            this.f12736a.g(new com.facebook.react.views.textinput.h(this.f12739d, this.f12737b.getId(), substring, substring2, i11, i14));
        }
    }

    private static void checkPasswordType(com.facebook.react.views.textinput.c cVar) {
        if ((cVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (cVar.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(cVar, 128, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.react.uimanager.events.d getEventDispatcher(ReactContext reactContext, com.facebook.react.views.textinput.c cVar) {
        return t0.c(reactContext, cVar.getId());
    }

    private r getReactTextUpdate(String str, int i11, int i12, int i13) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) e0.apply(str, e0.UNSET));
        return new r(spannableStringBuilder, i11, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, i12, i13);
    }

    private void setAutofillHints(com.facebook.react.views.textinput.c cVar, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cVar.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase().contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(com.facebook.react.views.textinput.c cVar, int i11, int i12) {
        cVar.setStagedInputType(((~i11) & cVar.getStagedInputType()) | i12);
    }

    protected EditText createInternalEditText(n0 n0Var) {
        return new EditText(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.e("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(yf.c.a().b("topSubmitEditing", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topTextInput", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onTextInput", "captured", "onTextInputCapture"))).b("topFocus", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.a().b(com.facebook.react.views.scroll.b.getJSEventName(com.facebook.react.views.scroll.b.SCROLL), yf.c.d("registrationName", "onScroll")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return yf.c.d("AutoCapitalizationType", yf.c.g(PermissionsResponse.SCOPE_NONE, 0, "characters", 4096, "words", Integer.valueOf((int) PKIFailureInfo.certRevoked), "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.i> getShadowNodeClass() {
        return m.class;
    }

    @ng.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setAllowFontScaling(z11);
    }

    @ng.a(name = "autoCapitalize")
    public void setAutoCapitalize(com.facebook.react.views.textinput.c cVar, Dynamic dynamic) {
        int i11 = 16384;
        if (dynamic.getType() == ReadableType.Number) {
            i11 = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals(PermissionsResponse.SCOPE_NONE)) {
                i11 = 0;
            } else if (asString.equals("characters")) {
                i11 = 4096;
            } else if (asString.equals("words")) {
                i11 = PKIFailureInfo.certRevoked;
            } else {
                asString.equals("sentences");
            }
        }
        updateStagedInputTypeFlag(cVar, AUTOCAPITALIZE_FLAGS, i11);
    }

    @ng.a(name = "autoCorrect")
    public void setAutoCorrect(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        int i11;
        if (bool != null) {
            i11 = bool.booleanValue() ? 32768 : PKIFailureInfo.signerNotTrusted;
        } else {
            i11 = 0;
        }
        updateStagedInputTypeFlag(cVar, 557056, i11);
    }

    @ng.a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setAutoFocus(z11);
    }

    @ng.a(name = "blurOnSubmit")
    public void setBlurOnSubmit(com.facebook.react.views.textinput.c cVar, Boolean bool) {
        cVar.setBlurOnSubmit(bool);
    }

    @ng.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(com.facebook.react.views.textinput.c cVar, int i11, Integer num) {
        cVar.z(SPACING_TYPES[i11], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(com.facebook.react.views.textinput.c cVar, int i11, float f11) {
        if (!com.facebook.yoga.g.a(f11)) {
            f11 = com.facebook.react.uimanager.p.c(f11);
        }
        if (i11 == 0) {
            cVar.setBorderRadius(f11);
        } else {
            cVar.A(f11, i11 - 1);
        }
    }

    @ng.a(name = "borderStyle")
    public void setBorderStyle(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setBorderStyle(str);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(com.facebook.react.views.textinput.c cVar, int i11, float f11) {
        if (!com.facebook.yoga.g.a(f11)) {
            f11 = com.facebook.react.uimanager.p.c(f11);
        }
        cVar.B(SPACING_TYPES[i11], f11);
    }

    @ng.a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(com.facebook.react.views.textinput.c cVar, boolean z11) {
        if (cVar.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        cVar.setCursorVisible(!z11);
    }

    @ng.a(customType = "Color", name = "color")
    public void setColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            ColorStateList b11 = com.facebook.react.views.text.d.b(cVar.getContext());
            if (b11 != null) {
                cVar.setTextColor(b11);
                return;
            }
            Context context = cVar.getContext();
            String str = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get default text color from View Context: ");
            sb2.append(context != null ? context.getClass().getCanonicalName() : Address.ADDRESS_NULL_PLACEHOLDER);
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb2.toString()));
            return;
        }
        cVar.setTextColor(num.intValue());
    }

    @ng.a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setOnLongClickListener(new b(this, z11));
    }

    @ng.a(customType = "Color", name = "cursorColor")
    public void setCursorColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        int i11;
        if (num == null) {
            return;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            Drawable textCursorDrawable = cVar.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
                cVar.setTextCursorDrawable(textCursorDrawable);
            }
        } else if (i12 == 28) {
        } else {
            int i13 = 0;
            while (true) {
                String[] strArr = DRAWABLE_RESOURCES;
                if (i13 >= strArr.length) {
                    return;
                }
                try {
                    Field declaredField = TextView.class.getDeclaredField(strArr[i13]);
                    declaredField.setAccessible(true);
                    i11 = declaredField.getInt(cVar);
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                }
                if (i11 == 0) {
                    return;
                }
                Drawable mutate = androidx.core.content.b.getDrawable(cVar.getContext(), i11).mutate();
                mutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(cVar);
                Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_FIELDS[i13]);
                declaredField3.setAccessible(true);
                if (strArr[i13] == "mCursorDrawableRes") {
                    declaredField3.set(obj, new Drawable[]{mutate, mutate});
                } else {
                    declaredField3.set(obj, mutate);
                }
                i13++;
            }
        }
    }

    @ng.a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setDisableFullscreenUI(z11);
    }

    @ng.a(defaultBoolean = true, name = "editable")
    public void setEditable(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setEnabled(z11);
    }

    @ng.a(name = "fontFamily")
    public void setFontFamily(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontFamily(str);
    }

    @ng.a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(com.facebook.react.views.textinput.c cVar, float f11) {
        cVar.setFontSize(f11);
    }

    @ng.a(name = "fontStyle")
    public void setFontStyle(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontStyle(str);
    }

    @ng.a(name = "fontWeight")
    public void setFontWeight(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setFontWeight(str);
    }

    @ng.a(name = "importantForAutofill")
    public void setImportantForAutofill(com.facebook.react.views.textinput.c cVar, String str) {
        int i11;
        if ("no".equals(str)) {
            i11 = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i11 = 8;
        } else if ("yes".equals(str)) {
            i11 = 1;
        } else {
            i11 = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(cVar, i11);
    }

    @ng.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setIncludeFontPadding(z11);
    }

    @ng.a(name = "inlineImageLeft")
    public void setInlineImageLeft(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setCompoundDrawablesWithIntrinsicBounds(vg.c.b().d(cVar.getContext(), str), 0, 0, 0);
    }

    @ng.a(name = "inlineImagePadding")
    public void setInlineImagePadding(com.facebook.react.views.textinput.c cVar, int i11) {
        cVar.setCompoundDrawablePadding(i11);
    }

    @ng.a(name = "keyboardType")
    public void setKeyboardType(com.facebook.react.views.textinput.c cVar, String str) {
        int i11;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i11 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i11 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i11 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i11 = 33;
            if (shouldHideCursorForEmailTextInput()) {
                cVar.setCursorVisible(false);
            }
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i11 = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i11 = 144;
        } else {
            i11 = "url".equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(cVar, 15, i11);
        checkPasswordType(cVar);
    }

    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "letterSpacing")
    public void setLetterSpacing(com.facebook.react.views.textinput.c cVar, float f11) {
        cVar.setLetterSpacingPt(f11);
    }

    @ng.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(com.facebook.react.views.textinput.c cVar, float f11) {
        cVar.setMaxFontSizeMultiplier(f11);
    }

    @ng.a(name = "maxLength")
    public void setMaxLength(com.facebook.react.views.textinput.c cVar, Integer num) {
        InputFilter[] filters = cVar.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i11 = 0; i11 < filters.length; i11++) {
                    if (!(filters[i11] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i11]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z11 = false;
            for (int i12 = 0; i12 < filters.length; i12++) {
                if (filters[i12] instanceof InputFilter.LengthFilter) {
                    filters[i12] = new InputFilter.LengthFilter(num.intValue());
                    z11 = true;
                }
            }
            if (!z11) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        cVar.setFilters(inputFilterArr);
    }

    @ng.a(defaultBoolean = false, name = "multiline")
    public void setMultiline(com.facebook.react.views.textinput.c cVar, boolean z11) {
        updateStagedInputTypeFlag(cVar, z11 ? 0 : 131072, z11 ? 131072 : 0);
    }

    @ng.a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(com.facebook.react.views.textinput.c cVar, int i11) {
        cVar.setLines(i11);
    }

    @ng.a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(com.facebook.react.views.textinput.c cVar, boolean z11) {
        if (z11) {
            cVar.setContentSizeWatcher(new e(cVar));
        } else {
            cVar.setContentSizeWatcher(null);
        }
    }

    @ng.a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setOnKeyPress(z11);
    }

    @ng.a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(com.facebook.react.views.textinput.c cVar, boolean z11) {
        if (z11) {
            cVar.setScrollWatcher(new f(cVar));
        } else {
            cVar.setScrollWatcher(null);
        }
    }

    @ng.a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(com.facebook.react.views.textinput.c cVar, boolean z11) {
        if (z11) {
            cVar.setSelectionWatcher(new g(this, cVar));
        } else {
            cVar.setSelectionWatcher(null);
        }
    }

    @ng.a(name = "placeholder")
    public void setPlaceholder(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setHint(str);
    }

    @ng.a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setHintTextColor(com.facebook.react.views.text.d.d(cVar.getContext()));
        } else {
            cVar.setHintTextColor(num.intValue());
        }
    }

    @ng.a(name = "returnKeyLabel")
    public void setReturnKeyLabel(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ng.a(name = "returnKeyType")
    public void setReturnKeyType(com.facebook.react.views.textinput.c cVar, String str) {
        cVar.setReturnKeyType(str);
    }

    @ng.a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(com.facebook.react.views.textinput.c cVar, boolean z11) {
        updateStagedInputTypeFlag(cVar, 144, z11 ? 128 : 0);
        checkPasswordType(cVar);
    }

    @ng.a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setSelectAllOnFocus(z11);
    }

    @ng.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        if (num == null) {
            cVar.setHighlightColor(com.facebook.react.views.text.d.c(cVar.getContext()));
        } else {
            cVar.setHighlightColor(num.intValue());
        }
        setCursorColor(cVar, num);
    }

    @ng.a(name = "textAlign")
    public void setTextAlign(com.facebook.react.views.textinput.c cVar, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                cVar.setJustificationMode(1);
            }
            cVar.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            cVar.setJustificationMode(0);
        }
        if (str != null && !"auto".equals(str)) {
            if ("left".equals(str)) {
                cVar.setGravityHorizontal(3);
                return;
            } else if ("right".equals(str)) {
                cVar.setGravityHorizontal(5);
                return;
            } else if ("center".equals(str)) {
                cVar.setGravityHorizontal(1);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
            }
        }
        cVar.setGravityHorizontal(0);
    }

    @ng.a(name = "textAlignVertical")
    public void setTextAlignVertical(com.facebook.react.views.textinput.c cVar, String str) {
        if (str != null && !"auto".equals(str)) {
            if ("top".equals(str)) {
                cVar.setGravityVertical(48);
                return;
            } else if ("bottom".equals(str)) {
                cVar.setGravityVertical(80);
                return;
            } else if ("center".equals(str)) {
                cVar.setGravityVertical(16);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
            }
        }
        cVar.setGravityVertical(0);
    }

    @ng.a(name = "autoComplete")
    public void setTextContentType(com.facebook.react.views.textinput.c cVar, String str) {
        if (str == null) {
            setImportantForAutofill(cVar, 2);
        } else if ("off".equals(str)) {
            setImportantForAutofill(cVar, 2);
        } else {
            Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                setAutofillHints(cVar, map.get(str));
                return;
            }
            throw new JSApplicationIllegalArgumentException("Invalid autoComplete: " + str);
        }
    }

    @ng.a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(com.facebook.react.views.textinput.c cVar, Integer num) {
        Drawable background = cVar.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e11) {
                nd.a.k(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e11);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ng.a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(com.facebook.react.views.textinput.c cVar, boolean z11) {
        cVar.setShowSoftInputOnFocus(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.textinput.c cVar) {
        cVar.setEventDispatcher(getEventDispatcher(n0Var, cVar));
        cVar.addTextChangedListener(new h(this, n0Var, cVar));
        cVar.setOnFocusChangeListener(new c(this, n0Var, cVar));
        cVar.setOnEditorActionListener(new d(this, cVar, n0Var));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.h createShadowNodeInstance() {
        return new m();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.textinput.c createViewInstance(n0 n0Var) {
        com.facebook.react.views.textinput.c cVar = new com.facebook.react.views.textinput.c(n0Var);
        cVar.setInputType(cVar.getInputType() & (-131073));
        cVar.setReturnKeyType("done");
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(com.facebook.react.views.textinput.c cVar) {
        super.onAfterUpdateTransaction((ReactTextInputManager) cVar);
        cVar.u();
        cVar.k();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(com.facebook.react.views.textinput.c cVar, int i11, int i12, int i13, int i14) {
        cVar.setPadding(i11, i12, i13, i14);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(com.facebook.react.views.textinput.c cVar, Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            int f11 = (int) rVar.f();
            int h11 = (int) rVar.h();
            int g11 = (int) rVar.g();
            int e11 = (int) rVar.e();
            if (f11 != -1 || h11 != -1 || g11 != -1 || e11 != -1) {
                if (f11 == -1) {
                    f11 = cVar.getPaddingLeft();
                }
                if (h11 == -1) {
                    h11 = cVar.getPaddingTop();
                }
                if (g11 == -1) {
                    g11 = cVar.getPaddingRight();
                }
                if (e11 == -1) {
                    e11 = cVar.getPaddingBottom();
                }
                cVar.setPadding(f11, h11, g11, e11);
            }
            if (rVar.b()) {
                a0.g(rVar.k(), cVar);
            }
            boolean z11 = cVar.getSelectionStart() == cVar.getSelectionEnd();
            int j11 = rVar.j();
            int i11 = rVar.i();
            if ((j11 == -1 || i11 == -1) && z11) {
                j11 = rVar.k().length() - ((cVar.getText() != null ? cVar.getText().length() : 0) - cVar.getSelectionStart());
                i11 = j11;
            }
            cVar.t(rVar);
            cVar.q(rVar.c(), j11, i11);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.textinput.c cVar, com.facebook.react.uimanager.e0 e0Var, m0 m0Var) {
        ReadableNativeMap b11;
        cVar.getFabricViewStateManager().e(m0Var);
        if (m0Var == null || (b11 = m0Var.b()) == null || !b11.hasKey("attributedString")) {
            return null;
        }
        ReadableNativeMap map = b11.getMap("attributedString");
        ReadableNativeMap map2 = b11.getMap("paragraphAttributes");
        if (map != null && map2 != null) {
            return r.a(c0.e(cVar.getContext(), map, this.mReactTextViewManagerCallback), b11.getInt("mostRecentEventCount"), y.m(e0Var, c0.f(map)), y.n(map2.getString("textBreakStrategy")), y.i(e0Var), map.getArray("fragments").toArrayList().size() > 1);
        }
        throw new IllegalArgumentException("Invalid TextInput State was received as a parameters");
    }

    public com.facebook.react.views.text.h createShadowNodeInstance(t tVar) {
        return new m(tVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.textinput.c cVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            receiveCommand(cVar, "focus", readableArray);
        } else if (i11 == 2) {
            receiveCommand(cVar, "blur", readableArray);
        } else if (i11 != 4) {
        } else {
            receiveCommand(cVar, "setTextAndSelection", readableArray);
        }
    }

    private void setImportantForAutofill(com.facebook.react.views.textinput.c cVar, int i11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        cVar.setImportantForAutofill(i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.textinput.c cVar, String str, ReadableArray readableArray) {
        char c11;
        str.hashCode();
        switch (str.hashCode()) {
            case -1699362314:
                if (str.equals("blurTextInput")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 1427010500:
                if (str.equals("setTextAndSelection")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1690703013:
                if (str.equals("focusTextInput")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 1:
                cVar.j();
                return;
            case 2:
            case 4:
                cVar.w();
                return;
            case 3:
                int i11 = readableArray.getInt(0);
                if (i11 == -1) {
                    return;
                }
                int i12 = readableArray.getInt(2);
                int i13 = readableArray.getInt(3);
                if (i13 == -1) {
                    i13 = i12;
                }
                if (!readableArray.isNull(1)) {
                    cVar.s(getReactTextUpdate(readableArray.getString(1), i11, i12, i13));
                }
                cVar.q(i11, i12, i13);
                return;
            default:
                return;
        }
    }
}
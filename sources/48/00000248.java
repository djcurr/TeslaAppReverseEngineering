package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class SearchView extends g0 implements l.c {

    /* renamed from: y3  reason: collision with root package name */
    static final n f1571y3;
    final ImageView A;
    private final View B;
    private p C;
    private Rect E;
    private Rect F;
    private int[] G;
    private int[] H;
    private final ImageView K;
    private final Drawable L;
    private final int O;
    private final int P;
    private final Intent Q;
    private boolean Q1;
    private int Q2;
    private final Intent R;
    private final CharSequence T;
    private boolean V1;

    /* renamed from: b1  reason: collision with root package name */
    private l f1572b1;

    /* renamed from: b2  reason: collision with root package name */
    z3.a f1573b2;

    /* renamed from: g1  reason: collision with root package name */
    private k f1574g1;

    /* renamed from: g2  reason: collision with root package name */
    private boolean f1575g2;

    /* renamed from: i3  reason: collision with root package name */
    private boolean f1576i3;

    /* renamed from: j3  reason: collision with root package name */
    private CharSequence f1577j3;

    /* renamed from: k3  reason: collision with root package name */
    private CharSequence f1578k3;

    /* renamed from: l3  reason: collision with root package name */
    private boolean f1579l3;

    /* renamed from: m3  reason: collision with root package name */
    private int f1580m3;

    /* renamed from: n3  reason: collision with root package name */
    SearchableInfo f1581n3;

    /* renamed from: o3  reason: collision with root package name */
    private Bundle f1582o3;

    /* renamed from: p  reason: collision with root package name */
    final SearchAutoComplete f1583p;

    /* renamed from: p1  reason: collision with root package name */
    View.OnFocusChangeListener f1584p1;

    /* renamed from: p2  reason: collision with root package name */
    private CharSequence f1585p2;

    /* renamed from: p3  reason: collision with root package name */
    private final Runnable f1586p3;

    /* renamed from: q  reason: collision with root package name */
    private final View f1587q;

    /* renamed from: q3  reason: collision with root package name */
    private Runnable f1588q3;

    /* renamed from: r3  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1589r3;

    /* renamed from: s3  reason: collision with root package name */
    private final View.OnClickListener f1590s3;

    /* renamed from: t  reason: collision with root package name */
    private final View f1591t;

    /* renamed from: t3  reason: collision with root package name */
    View.OnKeyListener f1592t3;

    /* renamed from: u3  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1593u3;

    /* renamed from: v3  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1594v3;

    /* renamed from: w  reason: collision with root package name */
    private final View f1595w;

    /* renamed from: w3  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1596w3;

    /* renamed from: x  reason: collision with root package name */
    final ImageView f1597x;

    /* renamed from: x1  reason: collision with root package name */
    private m f1598x1;

    /* renamed from: x2  reason: collision with root package name */
    private boolean f1599x2;

    /* renamed from: x3  reason: collision with root package name */
    private TextWatcher f1600x3;

    /* renamed from: y  reason: collision with root package name */
    final ImageView f1601y;

    /* renamed from: y1  reason: collision with root package name */
    private View.OnClickListener f1602y1;

    /* renamed from: y2  reason: collision with root package name */
    private boolean f1603y2;

    /* renamed from: z  reason: collision with root package name */
    final ImageView f1604z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: d  reason: collision with root package name */
        private int f1605d;

        /* renamed from: e  reason: collision with root package name */
        private SearchView f1606e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1607f;

        /* renamed from: g  reason: collision with root package name */
        final Runnable f1608g;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, g.a.f27054p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i11 = configuration.screenWidthDp;
            int i12 = configuration.screenHeightDp;
            if (i11 < 960 || i12 < 720 || configuration.orientation != 2) {
                if (i11 < 600) {
                    return (i11 < 640 || i12 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1571y3.c(this);
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.f1607f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1607f = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1605d <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1607f) {
                removeCallbacks(this.f1608g);
                post(this.f1608g);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z11, int i11, Rect rect) {
            super.onFocusChanged(z11, i11, rect);
            this.f1606e.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
            if (i11 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1606e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i11, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z11) {
            super.onWindowFocusChanged(z11);
            if (z11 && this.f1606e.hasFocus() && getVisibility() == 0) {
                this.f1607f = true;
                if (SearchView.M(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z11) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z11) {
                this.f1607f = false;
                removeCallbacks(this.f1608g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1607f = false;
                removeCallbacks(this.f1608g);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1607f = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1606e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i11) {
            super.setThreshold(i11);
            this.f1605d = i11;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f1608g = new a();
            this.f1605d = getThreshold();
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchView.this.Y(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z3.a aVar = SearchView.this.f1573b2;
            if (aVar instanceof o0) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1584p1;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z11);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            SearchView.this.B();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1597x) {
                searchView.V();
            } else if (view == searchView.f1604z) {
                searchView.R();
            } else if (view == searchView.f1601y) {
                searchView.W();
            } else if (view == searchView.A) {
                searchView.a0();
            } else if (view == searchView.f1583p) {
                searchView.H();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i11, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1581n3 == null) {
                return false;
            }
            if (searchView.f1583p.isPopupShowing() && SearchView.this.f1583p.getListSelection() != -1) {
                return SearchView.this.X(view, i11, keyEvent);
            }
            if (!SearchView.this.f1583p.b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i11 == 66) {
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.P(0, null, searchView2.f1583p.getText().toString());
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            SearchView.this.S(i11, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            SearchView.this.T(i11);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i11);

        boolean b(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        private Method f1620a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1621b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1622c;

        n() {
            this.f1620a = null;
            this.f1621b = null;
            this.f1622c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1620a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1621b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1622c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1621b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1620a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1622c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o extends a4.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f1623c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public o[] newArray(int i11) {
                return new o[i11];
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1623c + "}";
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeValue(Boolean.valueOf(this.f1623c));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1623c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1624a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1625b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1626c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1627d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1628e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1629f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1628e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1625b = new Rect();
            this.f1627d = new Rect();
            this.f1626c = new Rect();
            a(rect, rect2);
            this.f1624a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1625b.set(rect);
            this.f1627d.set(rect);
            Rect rect3 = this.f1627d;
            int i11 = this.f1628e;
            rect3.inset(-i11, -i11);
            this.f1626c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z11;
            boolean z12;
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z13 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z12 = this.f1629f;
                    if (z12 && !this.f1627d.contains(x11, y11)) {
                        z13 = z12;
                        z11 = false;
                    }
                } else {
                    if (action == 3) {
                        z12 = this.f1629f;
                        this.f1629f = false;
                    }
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                z11 = true;
            } else {
                if (this.f1625b.contains(x11, y11)) {
                    this.f1629f = true;
                    z11 = true;
                }
                z11 = true;
                z13 = false;
            }
            if (z13) {
                if (z11 && !this.f1626c.contains(x11, y11)) {
                    motionEvent.setLocation(this.f1624a.getWidth() / 2, this.f1624a.getHeight() / 2);
                } else {
                    Rect rect = this.f1626c;
                    motionEvent.setLocation(x11 - rect.left, y11 - rect.top);
                }
                return this.f1624a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f1571y3 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i11, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1578k3);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1582o3;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i11 != 0) {
            intent.putExtra("action_key", i11);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1581n3.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i11, String str) {
        int i12;
        String o11;
        try {
            String o12 = o0.o(cursor, "suggest_intent_action");
            if (o12 == null) {
                o12 = this.f1581n3.getSuggestIntentAction();
            }
            if (o12 == null) {
                o12 = "android.intent.action.SEARCH";
            }
            String str2 = o12;
            String o13 = o0.o(cursor, "suggest_intent_data");
            if (o13 == null) {
                o13 = this.f1581n3.getSuggestIntentData();
            }
            if (o13 != null && (o11 = o0.o(cursor, "suggest_intent_data_id")) != null) {
                o13 = o13 + "/" + Uri.encode(o11);
            }
            return C(str2, o13 == null ? null : Uri.parse(o13), o0.o(cursor, "suggest_intent_extra_data"), o0.o(cursor, "suggest_intent_query"), i11, str);
        } catch (RuntimeException e11) {
            try {
                i12 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i12 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i12 + " returned exception.", e11);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1582o3;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f1583p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.G);
        getLocationInWindow(this.H);
        int[] iArr = this.G;
        int i11 = iArr[1];
        int[] iArr2 = this.H;
        int i12 = i11 - iArr2[1];
        int i13 = iArr[0] - iArr2[0];
        rect.set(i13, i12, view.getWidth() + i13, view.getHeight() + i12);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.Q1 || this.L == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1583p.getTextSize() * 1.25d);
        this.L.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.L), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f1581n3;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1581n3.getVoiceSearchLaunchWebSearch()) {
            intent = this.Q;
        } else if (this.f1581n3.getVoiceSearchLaunchRecognizer()) {
            intent = this.R;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f1575g2 || this.f1576i3) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e11) {
            Log.e("SearchView", "Failed launch activity: " + intent, e11);
        }
    }

    private boolean Q(int i11, int i12, String str) {
        Cursor d11 = this.f1573b2.d();
        if (d11 == null || !d11.moveToPosition(i11)) {
            return false;
        }
        O(D(d11, i12, str));
        return true;
    }

    private void b0() {
        post(this.f1586p3);
    }

    private void c0(int i11) {
        Editable text = this.f1583p.getText();
        Cursor d11 = this.f1573b2.d();
        if (d11 == null) {
            return;
        }
        if (d11.moveToPosition(i11)) {
            CharSequence b11 = this.f1573b2.b(d11);
            if (b11 != null) {
                setQuery(b11);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private void e0() {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f1583p.getText());
        if (!z12 && (!this.Q1 || this.f1579l3)) {
            z11 = false;
        }
        this.f1604z.setVisibility(z11 ? 0 : 8);
        Drawable drawable = this.f1604z.getDrawable();
        if (drawable != null) {
            drawable.setState(z12 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1583p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(g.d.f27080g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(g.d.f27081h);
    }

    private void h0() {
        this.f1583p.setThreshold(this.f1581n3.getSuggestThreshold());
        this.f1583p.setImeOptions(this.f1581n3.getImeOptions());
        int inputType = this.f1581n3.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1581n3.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | PKIFailureInfo.signerNotTrusted;
            }
        }
        this.f1583p.setInputType(inputType);
        z3.a aVar = this.f1573b2;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1581n3.getSuggestAuthority() != null) {
            o0 o0Var = new o0(getContext(), this, this.f1581n3, this.f1589r3);
            this.f1573b2 = o0Var;
            this.f1583p.setAdapter(o0Var);
            ((o0) this.f1573b2).x(this.f1599x2 ? 2 : 1);
        }
    }

    private void i0() {
        this.f1595w.setVisibility((N() && (this.f1601y.getVisibility() == 0 || this.A.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z11) {
        this.f1601y.setVisibility((this.f1575g2 && N() && hasFocus() && (z11 || !this.f1576i3)) ? 0 : 8);
    }

    private void k0(boolean z11) {
        this.V1 = z11;
        int i11 = 0;
        int i12 = z11 ? 0 : 8;
        boolean z12 = !TextUtils.isEmpty(this.f1583p.getText());
        this.f1597x.setVisibility(i12);
        j0(z12);
        this.f1587q.setVisibility(z11 ? 8 : 0);
        if (this.K.getDrawable() == null || this.Q1) {
            i11 = 8;
        }
        this.K.setVisibility(i11);
        e0();
        l0(!z12);
        i0();
    }

    private void l0(boolean z11) {
        int i11 = 8;
        if (this.f1576i3 && !L() && z11) {
            this.f1601y.setVisibility(8);
            i11 = 0;
        }
        this.A.setVisibility(i11);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1583p.setText(charSequence);
        this.f1583p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        int i11;
        if (this.B.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1591t.getPaddingLeft();
            Rect rect = new Rect();
            boolean b11 = a1.b(this);
            int dimensionPixelSize = this.Q1 ? resources.getDimensionPixelSize(g.d.f27078e) + resources.getDimensionPixelSize(g.d.f27079f) : 0;
            this.f1583p.getDropDownBackground().getPadding(rect);
            if (b11) {
                i11 = -rect.left;
            } else {
                i11 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1583p.setDropDownHorizontalOffset(i11);
            this.f1583p.setDropDownWidth((((this.B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1583p.refreshAutoCompleteResults();
            return;
        }
        n nVar = f1571y3;
        nVar.b(this.f1583p);
        nVar.a(this.f1583p);
    }

    public boolean L() {
        return this.V1;
    }

    void P(int i11, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i11, str));
    }

    void R() {
        if (TextUtils.isEmpty(this.f1583p.getText())) {
            if (this.Q1) {
                k kVar = this.f1574g1;
                if (kVar == null || !kVar.a()) {
                    clearFocus();
                    k0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f1583p.setText("");
        this.f1583p.requestFocus();
        this.f1583p.setImeVisibility(true);
    }

    boolean S(int i11, int i12, String str) {
        m mVar = this.f1598x1;
        if (mVar == null || !mVar.b(i11)) {
            Q(i11, 0, null);
            this.f1583p.setImeVisibility(false);
            G();
            return true;
        }
        return false;
    }

    boolean T(int i11) {
        m mVar = this.f1598x1;
        if (mVar == null || !mVar.a(i11)) {
            c0(i11);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f1583p.requestFocus();
        this.f1583p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1602y1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f1583p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.f1572b1;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.f1581n3 != null) {
                P(0, null, text.toString());
            }
            this.f1583p.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i11, KeyEvent keyEvent) {
        if (this.f1581n3 != null && this.f1573b2 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i11 == 66 || i11 == 84 || i11 == 61) {
                return S(this.f1583p.getListSelection(), 0, null);
            }
            if (i11 == 21 || i11 == 22) {
                this.f1583p.setSelection(i11 == 21 ? 0 : this.f1583p.length());
                this.f1583p.setListSelection(0);
                this.f1583p.clearListSelection();
                this.f1583p.a();
                return true;
            } else if (i11 == 19) {
                this.f1583p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f1583p.getText();
        this.f1578k3 = text;
        boolean z11 = !TextUtils.isEmpty(text);
        j0(z11);
        l0(!z11);
        e0();
        i0();
        if (this.f1572b1 != null && !TextUtils.equals(charSequence, this.f1577j3)) {
            this.f1572b1.a(charSequence.toString());
        }
        this.f1577j3 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f1583p.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.f1581n3;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.Q, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.R, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // l.c
    public void b() {
        if (this.f1579l3) {
            return;
        }
        this.f1579l3 = true;
        int imeOptions = this.f1583p.getImeOptions();
        this.f1580m3 = imeOptions;
        this.f1583p.setImeOptions(imeOptions | 33554432);
        this.f1583p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1603y2 = true;
        super.clearFocus();
        this.f1583p.clearFocus();
        this.f1583p.setImeVisibility(false);
        this.f1603y2 = false;
    }

    public void d0(CharSequence charSequence, boolean z11) {
        this.f1583p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1583p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1578k3 = charSequence;
        }
        if (!z11 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // l.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f1583p.setImeOptions(this.f1580m3);
        this.f1579l3 = false;
    }

    void f0() {
        int[] iArr = this.f1583p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1591t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1595w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1583p.getImeOptions();
    }

    public int getInputType() {
        return this.f1583p.getInputType();
    }

    public int getMaxWidth() {
        return this.Q2;
    }

    public CharSequence getQuery() {
        return this.f1583p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1585p2;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1581n3;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.f1581n3.getHintId());
        }
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.O;
    }

    public z3.a getSuggestionsAdapter() {
        return this.f1573b2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1586p3);
        post(this.f1588q3);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            I(this.f1583p, this.E);
            Rect rect = this.F;
            Rect rect2 = this.E;
            rect.set(rect2.left, 0, rect2.right, i14 - i12);
            p pVar = this.C;
            if (pVar == null) {
                p pVar2 = new p(this.F, this.E, this.f1583p);
                this.C = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.F, this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        if (L()) {
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            int i14 = this.Q2;
            size = i14 > 0 ? Math.min(i14, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.Q2;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i13 = this.Q2) > 0) {
            size = Math.min(i13, size);
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        k0(oVar.f1623c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f1623c = L();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i11, Rect rect) {
        if (!this.f1603y2 && isFocusable()) {
            if (!L()) {
                boolean requestFocus = this.f1583p.requestFocus(i11, rect);
                if (requestFocus) {
                    k0(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i11, rect);
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1582o3 = bundle;
    }

    public void setIconified(boolean z11) {
        if (z11) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z11) {
        if (this.Q1 == z11) {
            return;
        }
        this.Q1 = z11;
        k0(z11);
        g0();
    }

    public void setImeOptions(int i11) {
        this.f1583p.setImeOptions(i11);
    }

    public void setInputType(int i11) {
        this.f1583p.setInputType(i11);
    }

    public void setMaxWidth(int i11) {
        this.Q2 = i11;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f1574g1 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1584p1 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.f1572b1 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1602y1 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f1598x1 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1585p2 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z11) {
        this.f1599x2 = z11;
        z3.a aVar = this.f1573b2;
        if (aVar instanceof o0) {
            ((o0) aVar).x(z11 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1581n3 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.f1576i3 = K;
        if (K) {
            this.f1583p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z11) {
        this.f1575g2 = z11;
        k0(L());
    }

    public void setSuggestionsAdapter(z3.a aVar) {
        this.f1573b2 = aVar;
        this.f1583p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.f1586p3 = new b();
        this.f1588q3 = new c();
        this.f1589r3 = new WeakHashMap<>();
        f fVar = new f();
        this.f1590s3 = fVar;
        this.f1592t3 = new g();
        h hVar = new h();
        this.f1593u3 = hVar;
        i iVar = new i();
        this.f1594v3 = iVar;
        j jVar = new j();
        this.f1596w3 = jVar;
        this.f1600x3 = new a();
        u0 v11 = u0.v(context, attributeSet, g.j.T1, i11, 0);
        LayoutInflater.from(context).inflate(v11.n(g.j.f27197d2, g.g.f27158r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(g.f.D);
        this.f1583p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1587q = findViewById(g.f.f27140z);
        View findViewById = findViewById(g.f.C);
        this.f1591t = findViewById;
        View findViewById2 = findViewById(g.f.J);
        this.f1595w = findViewById2;
        ImageView imageView = (ImageView) findViewById(g.f.f27138x);
        this.f1597x = imageView;
        ImageView imageView2 = (ImageView) findViewById(g.f.A);
        this.f1601y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(g.f.f27139y);
        this.f1604z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(g.f.E);
        this.A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(g.f.B);
        this.K = imageView5;
        androidx.core.view.a0.z0(findViewById, v11.g(g.j.f27202e2));
        androidx.core.view.a0.z0(findViewById2, v11.g(g.j.f27222i2));
        int i12 = g.j.f27217h2;
        imageView.setImageDrawable(v11.g(i12));
        imageView2.setImageDrawable(v11.g(g.j.f27187b2));
        imageView3.setImageDrawable(v11.g(g.j.Y1));
        imageView4.setImageDrawable(v11.g(g.j.f27232k2));
        imageView5.setImageDrawable(v11.g(i12));
        this.L = v11.g(g.j.f27212g2);
        w0.a(imageView, getResources().getString(g.h.f27174n));
        this.O = v11.n(g.j.f27227j2, g.g.f27157q);
        this.P = v11.n(g.j.Z1, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1600x3);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1592t3);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v11.a(g.j.f27192c2, true));
        int f11 = v11.f(g.j.V1, -1);
        if (f11 != -1) {
            setMaxWidth(f11);
        }
        this.T = v11.p(g.j.f27182a2);
        this.f1585p2 = v11.p(g.j.f27207f2);
        int k11 = v11.k(g.j.X1, -1);
        if (k11 != -1) {
            setImeOptions(k11);
        }
        int k12 = v11.k(g.j.W1, -1);
        if (k12 != -1) {
            setInputType(k12);
        }
        setFocusable(v11.a(g.j.U1, true));
        v11.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.Q = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.R = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.Q1);
        g0();
    }
}
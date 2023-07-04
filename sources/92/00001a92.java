package com.facebook.react.views.textinput;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.a0;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.y0;
import com.facebook.react.views.text.r;
import com.facebook.react.views.text.t;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class m extends com.facebook.react.views.text.h implements com.facebook.yoga.m {
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private EditText f12789a0;

    /* renamed from: b0  reason: collision with root package name */
    private k f12790b0;

    /* renamed from: c0  reason: collision with root package name */
    private String f12791c0;

    /* renamed from: d0  reason: collision with root package name */
    private String f12792d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f12793e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f12794f0;

    public m(t tVar) {
        super(tVar);
        this.Z = -1;
        this.f12791c0 = null;
        this.f12792d0 = null;
        this.f12793e0 = -1;
        this.f12794f0 = -1;
        this.H = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        u1();
    }

    private void u1() {
        S0(this);
    }

    @Override // com.facebook.yoga.m
    public long B(com.facebook.yoga.p pVar, float f11, com.facebook.yoga.n nVar, float f12, com.facebook.yoga.n nVar2) {
        EditText editText = (EditText) wf.a.c(this.f12789a0);
        k kVar = this.f12790b0;
        if (kVar != null) {
            kVar.a(editText);
        } else {
            editText.setTextSize(0, this.A.c());
            int i11 = this.F;
            if (i11 != -1) {
                editText.setLines(i11);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                int breakStrategy = editText.getBreakStrategy();
                int i12 = this.H;
                if (breakStrategy != i12) {
                    editText.setBreakStrategy(i12);
                }
            }
        }
        editText.setHint(s1());
        editText.measure(com.facebook.react.views.view.c.a(f11, nVar), com.facebook.react.views.view.c.a(f12, nVar2));
        return com.facebook.yoga.o.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.d0
    public void U0(int i11, float f11) {
        super.U0(i11, f11);
        w0();
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public void p(n0 n0Var) {
        super.p(n0Var);
        EditText r12 = r1();
        G0(4, a0.K(r12));
        G0(1, r12.getPaddingTop());
        G0(5, a0.J(r12));
        G0(3, r12.getPaddingBottom());
        this.f12789a0 = r12;
        r12.setPadding(0, 0, 0, 0);
        this.f12789a0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    protected EditText r1() {
        return new EditText(R());
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public void s(Object obj) {
        wf.a.a(obj instanceof k);
        this.f12790b0 = (k) obj;
        H();
    }

    public String s1() {
        return this.f12792d0;
    }

    @ng.a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i11) {
        this.Z = i11;
    }

    @ng.a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f12792d0 = str;
        w0();
    }

    @ng.a(name = BaseSheetViewModel.SAVE_SELECTION)
    public void setSelection(ReadableMap readableMap) {
        this.f12794f0 = -1;
        this.f12793e0 = -1;
        if (readableMap != null && readableMap.hasKey("start") && readableMap.hasKey("end")) {
            this.f12793e0 = readableMap.getInt("start");
            this.f12794f0 = readableMap.getInt("end");
            w0();
        }
    }

    @ng.a(name = TextBundle.TEXT_ENTRY)
    public void setText(String str) {
        this.f12791c0 = str;
        if (str != null) {
            if (this.f12793e0 > str.length()) {
                this.f12793e0 = str.length();
            }
            if (this.f12794f0 > str.length()) {
                this.f12794f0 = str.length();
            }
        } else {
            this.f12793e0 = -1;
            this.f12794f0 = -1;
        }
        w0();
    }

    @Override // com.facebook.react.views.text.h
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str != null && !"simple".equals(str)) {
            if ("highQuality".equals(str)) {
                this.H = 1;
                return;
            } else if ("balanced".equals(str)) {
                this.H = 2;
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
        }
        this.H = 0;
    }

    @Override // com.facebook.react.uimanager.d0
    public boolean t0() {
        return true;
    }

    public String t1() {
        return this.f12791c0;
    }

    @Override // com.facebook.react.uimanager.d0
    public boolean u0() {
        return true;
    }

    @Override // com.facebook.react.uimanager.d0
    public void y0(y0 y0Var) {
        super.y0(y0Var);
        if (this.Z != -1) {
            y0Var.Q(L(), new r(q1(this, t1(), false, null), this.Z, this.X, j0(0), j0(1), j0(2), j0(3), this.G, this.H, this.J, this.f12793e0, this.f12794f0));
        }
    }

    public m() {
        this(null);
    }
}
package com.tesla.share;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.h;
import androidx.fragment.app.q;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wu.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tesla/share/a;", "Landroidx/fragment/app/e;", "<init>", "()V", "g", "a", "share_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class a extends e {

    /* renamed from: g */
    public static final C0399a f21972g = new C0399a(null);

    /* renamed from: a */
    private xu.a f21973a;

    /* renamed from: b */
    private String f21974b;

    /* renamed from: d */
    private int f21976d;

    /* renamed from: e */
    private Runnable f21977e;

    /* renamed from: c */
    private C0399a.EnumC0400a f21975c = C0399a.EnumC0400a.ALERT;

    /* renamed from: f */
    private final Handler f21978f = new Handler(Looper.getMainLooper());

    /* renamed from: com.tesla.share.a$a */
    /* loaded from: classes6.dex */
    public static final class C0399a {

        /* renamed from: com.tesla.share.a$a$a */
        /* loaded from: classes6.dex */
        public enum EnumC0400a {
            ALERT,
            ERROR,
            SUCCESS,
            PROCESSING,
            TIMEOUT
        }

        private C0399a() {
        }

        public /* synthetic */ C0399a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(q fragmentManager, EnumC0400a dialogType, String message, int i11) {
            s.g(fragmentManager, "fragmentManager");
            s.g(dialogType, "dialogType");
            s.g(message, "message");
            Fragment h02 = fragmentManager.h0("share_dialog_fragment");
            if (h02 != null && h02.isResumed()) {
                ((a) h02).i(dialogType, message, i11);
                return;
            }
            a aVar = new a();
            aVar.setArguments(r3.b.a(v.a("type", dialogType), v.a("msg", message), v.a("timeout_seconds", Integer.valueOf(i11))));
            fragmentManager.m().e(aVar, "share_dialog_fragment").k();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21979a;

        static {
            int[] iArr = new int[C0399a.EnumC0400a.values().length];
            iArr[C0399a.EnumC0400a.ALERT.ordinal()] = 1;
            iArr[C0399a.EnumC0400a.ERROR.ordinal()] = 2;
            iArr[C0399a.EnumC0400a.SUCCESS.ordinal()] = 3;
            iArr[C0399a.EnumC0400a.PROCESSING.ordinal()] = 4;
            iArr[C0399a.EnumC0400a.TIMEOUT.ordinal()] = 5;
            f21979a = iArr;
        }
    }

    public static /* synthetic */ void a(a aVar) {
        k(aVar);
    }

    private final xu.a e() {
        xu.a aVar = this.f21973a;
        s.e(aVar);
        return aVar;
    }

    private final void f() {
        e().f57730d.setVisibility(8);
    }

    private final void g() {
        h(wu.a.ic_error);
    }

    private final void h(int i11) {
        ImageView imageView = e().f57729c;
        imageView.setImageResource(i11);
        imageView.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.tesla.share.a.C0399a.EnumC0400a r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.l(r3)
            xu.a r3 = r2.e()
            android.widget.TextView r3 = r3.f57728b
            r3.setText(r4)
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L19
            boolean r4 = kotlin.text.m.w(r4)
            if (r4 == 0) goto L17
            goto L19
        L17:
            r4 = r0
            goto L1a
        L19:
            r4 = r1
        L1a:
            if (r4 == 0) goto L1e
            r0 = 8
        L1e:
            r3.setVisibility(r0)
            java.lang.Runnable r3 = r2.f21977e
            if (r3 != 0) goto L26
            goto L2b
        L26:
            android.os.Handler r4 = r2.f21978f
            r4.removeCallbacks(r3)
        L2b:
            wu.f r3 = new wu.f
            r3.<init>()
            android.os.Handler r4 = r2.f21978f
            int r5 = m00.j.d(r5, r1)
            int r5 = r5 * 1000
            long r0 = (long) r5
            r4.postDelayed(r3, r0)
            r2.f21977e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.share.a.i(com.tesla.share.a$a$a, java.lang.String, int):void");
    }

    public static final void k(a this$0) {
        s.g(this$0, "this$0");
        if (!this$0.isResumed() || this$0.isRemoving()) {
            return;
        }
        this$0.dismiss();
        h activity = this$0.getActivity();
        if (activity != null) {
            activity.finishAndRemoveTask();
        }
        this$0.f21977e = null;
    }

    private final void l(C0399a.EnumC0400a enumC0400a) {
        int i11 = b.f21979a[enumC0400a.ordinal()];
        if (i11 == 1) {
            g();
            f();
            e().f57731e.setText(d.f56193i);
        } else if (i11 == 2) {
            g();
            f();
            e().f57731e.setText(d.f56192h);
        } else if (i11 == 3) {
            h(wu.a.ic_success);
            f();
            e().f57731e.setText(d.f56195k);
        } else if (i11 == 4) {
            e().f57730d.setVisibility(0);
            e().f57729c.setVisibility(8);
            e().f57731e.setText(d.f56194j);
        } else if (i11 != 5) {
        } else {
            g();
            f();
            e().f57731e.setText(d.f56192h);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("type");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.tesla.share.ShareDialogFragment.Companion.DialogType");
            this.f21975c = (C0399a.EnumC0400a) serializable;
            this.f21974b = arguments.getString("msg");
            this.f21976d = arguments.getInt("timeout_seconds");
            return;
        }
        throw new IllegalStateException("Arguments missing");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        s.g(inflater, "inflater");
        this.f21973a = xu.a.c(inflater, viewGroup, false);
        i(this.f21975c, this.f21974b, this.f21976d);
        return e().getRoot();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Runnable runnable = this.f21977e;
        if (runnable != null) {
            this.f21978f.removeCallbacks(runnable);
        }
        this.f21973a = null;
        h activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finishAffinity();
    }
}
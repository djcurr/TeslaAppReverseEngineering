package com.plaid.internal;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class u9 extends com.google.android.material.bottomsheet.b {

    /* renamed from: a  reason: collision with root package name */
    public final a f19584a;

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<View, vz.b0> {
        public b() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(View view) {
            View it2 = view;
            kotlin.jvm.internal.s.g(it2, "it");
            u9 u9Var = u9.this;
            u9Var.f19584a.f19589e.invoke(u9Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<View, vz.b0> {
        public c() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(View view) {
            View it2 = view;
            kotlin.jvm.internal.s.g(it2, "it");
            u9 u9Var = u9.this;
            u9Var.f19584a.f19591g.invoke(u9Var);
            return vz.b0.f54756a;
        }
    }

    public u9(a attributes) {
        kotlin.jvm.internal.s.g(attributes, "attributes");
        this.f19584a = attributes;
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.i, androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(requireContext(), R.style.PlaidBottomSheetDialogTheme);
        Context context = aVar.getContext();
        kotlin.jvm.internal.s.f(context, "context");
        g8 g8Var = new g8(context, null, 0);
        g8Var.setImage(this.f19584a.f19585a);
        g8Var.setTitle(this.f19584a.f19586b);
        String str = this.f19584a.f19587c;
        if (str != null) {
            g8Var.setSummary(str);
        }
        g8Var.a(this.f19584a.f19588d, new b());
        String str2 = this.f19584a.f19590f;
        if (str2 != null) {
            g8Var.b(str2, new c());
        }
        aVar.setContentView(g8Var);
        return aVar;
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f19585a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19586b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19587c;

        /* renamed from: d  reason: collision with root package name */
        public final String f19588d;

        /* renamed from: e  reason: collision with root package name */
        public final h00.l<u9, vz.b0> f19589e;

        /* renamed from: f  reason: collision with root package name */
        public final String f19590f;

        /* renamed from: g  reason: collision with root package name */
        public final h00.l<u9, vz.b0> f19591g;

        public a() {
            this(null, null, null, null, null, null, null, 127);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Drawable drawable, String str, String str2, String str3, h00.l<? super u9, vz.b0> primaryButtonListener, String str4, h00.l<? super u9, vz.b0> secondaryButtonListener) {
            kotlin.jvm.internal.s.g(primaryButtonListener, "primaryButtonListener");
            kotlin.jvm.internal.s.g(secondaryButtonListener, "secondaryButtonListener");
            this.f19585a = drawable;
            this.f19586b = str;
            this.f19587c = str2;
            this.f19588d = str3;
            this.f19589e = primaryButtonListener;
            this.f19590f = str4;
            this.f19591g = secondaryButtonListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(this.f19585a, aVar.f19585a) && kotlin.jvm.internal.s.c(this.f19586b, aVar.f19586b) && kotlin.jvm.internal.s.c(this.f19587c, aVar.f19587c) && kotlin.jvm.internal.s.c(this.f19588d, aVar.f19588d) && kotlin.jvm.internal.s.c(this.f19589e, aVar.f19589e) && kotlin.jvm.internal.s.c(this.f19590f, aVar.f19590f) && kotlin.jvm.internal.s.c(this.f19591g, aVar.f19591g);
            }
            return false;
        }

        public int hashCode() {
            Drawable drawable = this.f19585a;
            int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
            String str = this.f19586b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f19587c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f19588d;
            int hashCode4 = (this.f19589e.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            String str4 = this.f19590f;
            return this.f19591g.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder a11 = g4.a("Attributes(image=");
            a11.append(this.f19585a);
            a11.append(", title=");
            a11.append((Object) this.f19586b);
            a11.append(", summary=");
            a11.append((Object) this.f19587c);
            a11.append(", primaryButtonTitle=");
            a11.append((Object) this.f19588d);
            a11.append(", primaryButtonListener=");
            a11.append(this.f19589e);
            a11.append(", secondaryButtonTitle=");
            a11.append((Object) this.f19590f);
            a11.append(", secondaryButtonListener=");
            a11.append(this.f19591g);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }

        public /* synthetic */ a(Drawable drawable, String str, String str2, String str3, h00.l lVar, String str4, h00.l lVar2, int i11) {
            this(null, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? s9.f19435a : lVar, (i11 & 32) == 0 ? str4 : null, (i11 & 64) != 0 ? t9.f19527a : lVar2);
        }
    }
}
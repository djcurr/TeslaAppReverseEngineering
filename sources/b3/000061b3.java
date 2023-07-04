package com.tesla.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import av.h;
import av.j;
import av.n;
import com.tesla.widget.VehicleStatusWidgetConfigureActivity;
import cv.i;
import h00.p;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import lt.w2;
import v20.e1;
import v20.j0;
import v20.o0;
import vz.b0;
import vz.k;
import vz.m;
import vz.r;
import wz.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "a", "b", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleStatusWidgetConfigureActivity extends androidx.appcompat.app.d {

    /* renamed from: a */
    private int f21992a;

    /* renamed from: b */
    private dv.b f21993b;

    /* renamed from: c */
    private final k f21994c;

    /* renamed from: d */
    private final k f21995d;

    /* renamed from: e */
    private final k f21996e;

    /* loaded from: classes6.dex */
    public final class a extends RecyclerView.h<b> {

        /* renamed from: a */
        private final List<cu.a> f21997a;

        /* renamed from: b */
        final /* synthetic */ VehicleStatusWidgetConfigureActivity f21998b;

        public a(VehicleStatusWidgetConfigureActivity this$0, List<cu.a> vehicles) {
            s.g(this$0, "this$0");
            s.g(vehicles, "vehicles");
            this.f21998b = this$0;
            this.f21997a = vehicles;
        }

        public static /* synthetic */ void a(VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, a aVar, b bVar, View view) {
            d(vehicleStatusWidgetConfigureActivity, aVar, bVar, view);
        }

        public static final void d(VehicleStatusWidgetConfigureActivity this$0, a this$1, b this_apply, View view) {
            s.g(this$0, "this$0");
            s.g(this$1, "this$1");
            s.g(this_apply, "$this_apply");
            this$0.u(this$1.f21997a.get(this_apply.getAdapterPosition()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: b */
        public void onBindViewHolder(b holder, int i11) {
            s.g(holder, "holder");
            holder.a(this.f21997a.get(i11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: c */
        public b mo98onCreateViewHolder(ViewGroup parent, int i11) {
            s.g(parent, "parent");
            VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity = this.f21998b;
            dv.a c11 = dv.a.c(LayoutInflater.from(parent.getContext()), parent, false);
            s.f(c11, "inflate(\n          Layou…          false\n        )");
            final b bVar = new b(vehicleStatusWidgetConfigureActivity, c11);
            final VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity2 = this.f21998b;
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: av.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VehicleStatusWidgetConfigureActivity.a.a(vehicleStatusWidgetConfigureActivity2, this, bVar, view);
                }
            });
            return bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f21997a.size();
        }
    }

    /* loaded from: classes6.dex */
    public final class b extends RecyclerView.e0 {

        /* renamed from: a */
        private final dv.a f21999a;

        /* renamed from: b */
        private final Context f22000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VehicleStatusWidgetConfigureActivity this$0, dv.a vehicleBinding) {
            super(vehicleBinding.getRoot());
            s.g(this$0, "this$0");
            s.g(vehicleBinding, "vehicleBinding");
            this.f21999a = vehicleBinding;
            this.f22000b = this.itemView.getContext();
        }

        public final void a(cu.a vehicle) {
            Object obj;
            s.g(vehicle, "vehicle");
            int e11 = n.e(vehicle);
            Context context = this.f22000b;
            s.f(context, "context");
            String d11 = n.d(vehicle, context);
            if (d11 == null) {
                obj = null;
            } else {
                File file = new File(d11);
                if (file.exists()) {
                    obj = com.bumptech.glide.c.D(this.f21999a.f24250b).mo106load(file).error(e11).placeholder(e11).fallback(e11).into(this.f21999a.f24250b);
                    s.f(obj, "{\n          Glide.with(v…g.vehicleImage)\n        }");
                } else {
                    this.f21999a.f24250b.setImageResource(e11);
                    obj = b0.f54756a;
                }
            }
            if (obj == null) {
                this.f21999a.f24250b.setImageResource(e11);
            }
            TextView textView = this.f21999a.f24251c;
            w2 g11 = vehicle.g();
            String k11 = g11 == null ? null : et.a.k(g11);
            if (k11 == null) {
                String e12 = vehicle.e();
                String str = e12.length() > 0 ? e12 : null;
                k11 = str == null ? this.f22000b.getString(h.f6985g) : str;
            }
            textView.setText(k11);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onCreate$1", f = "VehicleStatusWidgetConfigureActivity.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a */
        int f22001a;

        @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onCreate$1$vehicles$1", f = "VehicleStatusWidgetConfigureActivity.kt", l = {69}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        public static final class a extends l implements p<o0, zz.d<? super List<? extends cu.a>>, Object> {

            /* renamed from: a */
            int f22003a;

            /* renamed from: b */
            final /* synthetic */ VehicleStatusWidgetConfigureActivity f22004b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f22004b = vehicleStatusWidgetConfigureActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f22004b, dVar);
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo160invoke(o0 o0Var, zz.d<? super List<? extends cu.a>> dVar) {
                return invoke2(o0Var, (zz.d<? super List<cu.a>>) dVar);
            }

            /* renamed from: invoke */
            public final Object invoke2(o0 o0Var, zz.d<? super List<cu.a>> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f22003a;
                if (i11 == 0) {
                    r.b(obj);
                    i q11 = this.f22004b.q();
                    this.f22003a = 1;
                    obj = q11.a(this);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    r.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(zz.d<? super c> dVar) {
            super(2, dVar);
            VehicleStatusWidgetConfigureActivity.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new c(dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f22001a;
            dv.b bVar = null;
            if (i11 == 0) {
                r.b(obj);
                dv.b bVar2 = VehicleStatusWidgetConfigureActivity.this.f21993b;
                if (bVar2 == null) {
                    s.x("binding");
                    bVar2 = null;
                }
                bVar2.f24253b.j();
                if (!VehicleStatusWidgetConfigureActivity.this.s().a()) {
                    VehicleStatusWidgetConfigureActivity.this.t();
                    return b0.f54756a;
                }
                j0 b11 = e1.b();
                a aVar = new a(VehicleStatusWidgetConfigureActivity.this, null);
                this.f22001a = 1;
                obj = v20.i.g(b11, aVar, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                VehicleStatusWidgetConfigureActivity.this.t();
                return b0.f54756a;
            } else if (list.size() == 1) {
                VehicleStatusWidgetConfigureActivity.this.u((cu.a) u.b0(list));
                return b0.f54756a;
            } else {
                dv.b bVar3 = VehicleStatusWidgetConfigureActivity.this.f21993b;
                if (bVar3 == null) {
                    s.x("binding");
                    bVar3 = null;
                }
                bVar3.f24254c.setAdapter(new a(VehicleStatusWidgetConfigureActivity.this, list));
                dv.b bVar4 = VehicleStatusWidgetConfigureActivity.this.f21993b;
                if (bVar4 == null) {
                    s.x("binding");
                } else {
                    bVar = bVar4;
                }
                bVar.f24253b.e();
                return b0.f54756a;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onWidgetVehicleSelected$1", f = "VehicleStatusWidgetConfigureActivity.kt", l = {115}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class d extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a */
        int f22005a;

        /* renamed from: c */
        final /* synthetic */ cu.a f22007c;

        @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onWidgetVehicleSelected$1$1", f = "VehicleStatusWidgetConfigureActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        public static final class a extends l implements p<o0, zz.d<? super b0>, Object> {

            /* renamed from: a */
            int f22008a;

            /* renamed from: b */
            final /* synthetic */ cu.a f22009b;

            /* renamed from: c */
            final /* synthetic */ VehicleStatusWidgetConfigureActivity f22010c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(cu.a aVar, VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f22009b = aVar;
                this.f22010c = vehicleStatusWidgetConfigureActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f22009b, this.f22010c, dVar);
            }

            @Override // h00.p
            public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String h11;
                a00.d.d();
                if (this.f22008a == 0) {
                    r.b(obj);
                    cu.a aVar = this.f22009b;
                    if (aVar == null || (h11 = aVar.h()) == null) {
                        return null;
                    }
                    VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity = this.f22010c;
                    vehicleStatusWidgetConfigureActivity.q().h(vehicleStatusWidgetConfigureActivity.f21992a, h11);
                    return b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(cu.a aVar, zz.d<? super d> dVar) {
            super(2, dVar);
            VehicleStatusWidgetConfigureActivity.this = r1;
            this.f22007c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f22007c, dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((d) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f22005a;
            if (i11 == 0) {
                r.b(obj);
                j0 b11 = e1.b();
                a aVar = new a(this.f22007c, VehicleStatusWidgetConfigureActivity.this, null);
                this.f22005a = 1;
                if (v20.i.g(b11, aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity = VehicleStatusWidgetConfigureActivity.this;
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(vehicleStatusWidgetConfigureActivity).getAppWidgetInfo(VehicleStatusWidgetConfigureActivity.this.f21992a);
            if (appWidgetInfo != null) {
                VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity2 = VehicleStatusWidgetConfigureActivity.this;
                String className = appWidgetInfo.provider.getClassName();
                if (s.c(className, VehicleStatusWidget.class.getName())) {
                    vehicleStatusWidgetConfigureActivity2.r().q(vehicleStatusWidgetConfigureActivity, new av.l(vehicleStatusWidgetConfigureActivity2.f21992a, com.tesla.widget.d.NORMAL, false, null, 12, null));
                } else if (s.c(className, VehicleStatusSquareWidget.class.getName())) {
                    vehicleStatusWidgetConfigureActivity2.r().q(vehicleStatusWidgetConfigureActivity, new av.l(vehicleStatusWidgetConfigureActivity2.f21992a, com.tesla.widget.d.SQUARE, false, null, 12, null));
                }
            }
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", VehicleStatusWidgetConfigureActivity.this.f21992a);
            VehicleStatusWidgetConfigureActivity.this.setResult(-1, intent);
            if (VehicleStatusWidgetConfigureActivity.this.getIntent().getBooleanExtra("com.teslamotors.tesla.key-from-widget", false)) {
                VehicleStatusWidgetConfigureActivity.this.moveTaskToBack(true);
            }
            VehicleStatusWidgetConfigureActivity.this.finish();
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.a<i> {

        /* renamed from: a */
        public static final e f22011a = new e();

        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final i mo11invoke() {
            return ev.b.f25256a.b();
        }
    }

    /* loaded from: classes6.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.a<j> {

        /* renamed from: a */
        public static final f f22012a = new f();

        f() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final j mo11invoke() {
            return ev.b.f25256a.c();
        }
    }

    /* loaded from: classes6.dex */
    static final class g extends kotlin.jvm.internal.u implements h00.a<ev.a> {

        /* renamed from: a */
        public static final g f22013a = new g();

        g() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final ev.a mo11invoke() {
            return ev.b.f25256a.d();
        }
    }

    public VehicleStatusWidgetConfigureActivity() {
        k a11;
        k a12;
        k a13;
        a11 = m.a(e.f22011a);
        this.f21994c = a11;
        a12 = m.a(f.f22012a);
        this.f21995d = a12;
        a13 = m.a(g.f22013a);
        this.f21996e = a13;
    }

    public final i q() {
        return (i) this.f21994c.mo16getValue();
    }

    public final j r() {
        return (j) this.f21995d.mo16getValue();
    }

    public final ev.a s() {
        return (ev.a) this.f21996e.mo16getValue();
    }

    public final void t() {
        u(null);
    }

    public final void u(cu.a aVar) {
        v20.k.d(w.a(this), null, null, new d(aVar, null), 3, null);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        dv.b c11 = dv.b.c(getLayoutInflater());
        s.f(c11, "inflate(layoutInflater)");
        this.f21993b = c11;
        if (c11 == null) {
            s.x("binding");
            c11 = null;
        }
        setContentView(c11.getRoot());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f21992a = extras.getInt("appWidgetId", 0);
        }
        if (this.f21992a != 0) {
            v20.k.d(w.a(this), null, null, new c(null), 3, null);
        } else {
            finish();
        }
    }
}
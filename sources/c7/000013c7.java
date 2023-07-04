package com.airbnb.android.react.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import je.q;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final p f9942a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9943b;

    /* renamed from: c  reason: collision with root package name */
    private final Resources f9944c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.drawee.view.b<?> f9945d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.datasource.c<qd.a<nf.c>> f9946e;

    /* renamed from: f  reason: collision with root package name */
    private final ge.d<nf.h> f9947f = new a();

    /* loaded from: classes.dex */
    class a extends ge.c<nf.h> {
        a() {
        }

        @Override // ge.c, ge.d
        /* renamed from: c */
        public void l(String str, nf.h hVar, Animatable animatable) {
            qd.a aVar;
            Throwable th2;
            Bitmap p11;
            try {
                aVar = (qd.a) q.this.f9946e.mo74g();
                if (aVar != null) {
                    try {
                        nf.c cVar = (nf.c) aVar.J();
                        if (cVar != null && (cVar instanceof nf.d) && (p11 = ((nf.d) cVar).p()) != null) {
                            Bitmap copy = p11.copy(Bitmap.Config.ARGB_8888, true);
                            q.this.f9942a.setIconBitmap(copy);
                            q.this.f9942a.setIconBitmapDescriptor(BitmapDescriptorFactory.fromBitmap(copy));
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        q.this.f9946e.close();
                        if (aVar != null) {
                            qd.a.C(aVar);
                        }
                        throw th2;
                    }
                }
                q.this.f9946e.close();
                if (aVar != null) {
                    qd.a.C(aVar);
                }
                q.this.f9942a.update();
            } catch (Throwable th4) {
                aVar = null;
                th2 = th4;
            }
        }
    }

    public q(Context context, Resources resources, p pVar) {
        this.f9943b = context;
        this.f9944c = resources;
        this.f9942a = pVar;
        com.facebook.drawee.view.b<?> e11 = com.facebook.drawee.view.b.e(c(resources), context);
        this.f9945d = e11;
        e11.k();
    }

    private ke.a c(Resources resources) {
        return new ke.b(resources).u(q.c.f33450b).v(0).a();
    }

    private BitmapDescriptor d(String str) {
        return BitmapDescriptorFactory.fromResource(e(str));
    }

    private int e(String str) {
        return this.f9944c.getIdentifier(str, "drawable", this.f9943b.getPackageName());
    }

    public void f(String str) {
        if (str == null) {
            this.f9942a.setIconBitmapDescriptor(null);
            this.f9942a.update();
        } else if (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("file://") && !str.startsWith("asset://") && !str.startsWith("data:")) {
            BitmapDescriptor d11 = d(str);
            if (d11 != null) {
                this.f9942a.setIconBitmapDescriptor(d11);
                this.f9942a.setIconBitmap(BitmapFactory.decodeResource(this.f9944c, e(str)));
            }
            this.f9942a.update();
        } else {
            com.facebook.imagepipeline.request.a a11 = ImageRequestBuilder.s(Uri.parse(str)).a();
            this.f9946e = be.c.a().d(a11, this);
            this.f9945d.o(be.c.g().C(a11).B(this.f9947f).b(this.f9945d.g()).build());
        }
    }
}
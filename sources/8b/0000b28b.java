package sn;

import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;
import pn.d;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f50472a;

    /* renamed from: b  reason: collision with root package name */
    public static final d.b<? extends Date> f50473b;

    /* renamed from: c  reason: collision with root package name */
    public static final d.b<? extends Date> f50474c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f50475d;

    /* renamed from: e  reason: collision with root package name */
    public static final v f50476e;

    /* renamed from: f  reason: collision with root package name */
    public static final v f50477f;

    /* loaded from: classes2.dex */
    class a extends d.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // pn.d.b
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // pn.d.b
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z11;
        try {
            Class.forName("java.sql.Date");
            z11 = true;
        } catch (ClassNotFoundException unused) {
            z11 = false;
        }
        f50472a = z11;
        if (z11) {
            f50473b = new a(java.sql.Date.class);
            f50474c = new b(Timestamp.class);
            f50475d = sn.a.f50466b;
            f50476e = sn.b.f50468b;
            f50477f = c.f50470b;
            return;
        }
        f50473b = null;
        f50474c = null;
        f50475d = null;
        f50476e = null;
        f50477f = null;
    }
}
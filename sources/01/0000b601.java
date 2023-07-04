package tv;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.document.DocumentDescription;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import nr.q;
import nr.v;
import nr.y;
import tv.a;
import tv.i;
import vv.b;
import vz.b0;
import wz.e0;
import wz.u;

/* loaded from: classes6.dex */
public final class j extends nr.k<a, d, b, c> {

    /* renamed from: a  reason: collision with root package name */
    private final tv.a f52583a;

    /* renamed from: b  reason: collision with root package name */
    private final tv.i f52584b;

    /* renamed from: c  reason: collision with root package name */
    private final b.a f52585c;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f52586a;

        /* renamed from: b  reason: collision with root package name */
        private final String f52587b;

        /* renamed from: c  reason: collision with root package name */
        private final List<DocumentDescription> f52588c;

        public a(String sessionToken, String inquiryId, List<DocumentDescription> documentDescriptions) {
            s.g(sessionToken, "sessionToken");
            s.g(inquiryId, "inquiryId");
            s.g(documentDescriptions, "documentDescriptions");
            this.f52586a = sessionToken;
            this.f52587b = inquiryId;
            this.f52588c = documentDescriptions;
        }

        public final List<DocumentDescription> a() {
            return this.f52588c;
        }

        public final String b() {
            return this.f52586a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f52586a, aVar.f52586a) && s.c(this.f52587b, aVar.f52587b) && s.c(this.f52588c, aVar.f52588c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f52586a.hashCode() * 31) + this.f52587b.hashCode()) * 31) + this.f52588c.hashCode();
        }

        public String toString() {
            return "Input(sessionToken=" + this.f52586a + ", inquiryId=" + this.f52587b + ", documentDescriptions=" + this.f52588c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f52589a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: tv.j$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1167b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1167b f52590a = new C1167b();

            private C1167b() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class d implements Parcelable {

        /* renamed from: a  reason: collision with root package name */
        private final List<DocumentDescription> f52598a;

        /* loaded from: classes6.dex */
        public static final class a extends d {
            public static final Parcelable.Creator<a> CREATOR = new C1169a();

            /* renamed from: b  reason: collision with root package name */
            private final List<DocumentDescription> f52599b;

            /* renamed from: tv.j$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1169a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList.add(DocumentDescription.CREATOR.createFromParcel(parcel));
                    }
                    return new a(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<DocumentDescription> remaining) {
                super(remaining, null);
                s.g(remaining, "remaining");
                this.f52599b = remaining;
            }

            @Override // tv.j.d
            public List<DocumentDescription> b() {
                return this.f52599b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.c(b(), ((a) obj).b());
            }

            public int hashCode() {
                return b().hashCode();
            }

            public String toString() {
                return "SelectDocument(remaining=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                List<DocumentDescription> list = this.f52599b;
                out.writeInt(list.size());
                for (DocumentDescription documentDescription : list) {
                    documentDescription.writeToParcel(out, i11);
                }
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends d {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            private final List<DocumentDescription> f52600b;

            /* loaded from: classes6.dex */
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList.add(DocumentDescription.CREATOR.createFromParcel(parcel));
                    }
                    return new b(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<DocumentDescription> remaining) {
                super(remaining, null);
                s.g(remaining, "remaining");
                this.f52600b = remaining;
            }

            @Override // tv.j.d
            public List<DocumentDescription> b() {
                return this.f52600b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.c(b(), ((b) obj).b());
            }

            public int hashCode() {
                return b().hashCode();
            }

            public String toString() {
                return "Start(remaining=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                List<DocumentDescription> list = this.f52600b;
                out.writeInt(list.size());
                for (DocumentDescription documentDescription : list) {
                    documentDescription.writeToParcel(out, i11);
                }
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends d {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            private final List<DocumentDescription> f52601b;

            /* loaded from: classes6.dex */
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList.add(DocumentDescription.CREATOR.createFromParcel(parcel));
                    }
                    return new c(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<DocumentDescription> remaining) {
                super(remaining, null);
                s.g(remaining, "remaining");
                this.f52601b = remaining;
            }

            @Override // tv.j.d
            public List<DocumentDescription> b() {
                return this.f52601b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && s.c(b(), ((c) obj).b());
            }

            public int hashCode() {
                return b().hashCode();
            }

            public String toString() {
                return "TakePhoto(remaining=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                List<DocumentDescription> list = this.f52601b;
                out.writeInt(list.size());
                for (DocumentDescription documentDescription : list) {
                    documentDescription.writeToParcel(out, i11);
                }
            }
        }

        /* renamed from: tv.j$d$d  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1170d extends d {
            public static final Parcelable.Creator<C1170d> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            private final String f52602b;

            /* renamed from: c  reason: collision with root package name */
            private final List<DocumentDescription> f52603c;

            /* renamed from: tv.j$d$d$a */
            /* loaded from: classes6.dex */
            public static final class a implements Parcelable.Creator<C1170d> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final C1170d createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList.add(DocumentDescription.CREATOR.createFromParcel(parcel));
                    }
                    return new C1170d(readString, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final C1170d[] newArray(int i11) {
                    return new C1170d[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1170d(String absoluteFilePath, List<DocumentDescription> remaining) {
                super(remaining, null);
                s.g(absoluteFilePath, "absoluteFilePath");
                s.g(remaining, "remaining");
                this.f52602b = absoluteFilePath;
                this.f52603c = remaining;
            }

            @Override // tv.j.d
            public List<DocumentDescription> b() {
                return this.f52603c;
            }

            public final String c() {
                return this.f52602b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1170d) {
                    C1170d c1170d = (C1170d) obj;
                    return s.c(this.f52602b, c1170d.f52602b) && s.c(b(), c1170d.b());
                }
                return false;
            }

            public int hashCode() {
                return (this.f52602b.hashCode() * 31) + b().hashCode();
            }

            public String toString() {
                return "UploadDocument(absoluteFilePath=" + this.f52602b + ", remaining=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.f52602b);
                List<DocumentDescription> list = this.f52603c;
                out.writeInt(list.size());
                for (DocumentDescription documentDescription : list) {
                    documentDescription.writeToParcel(out, i11);
                }
            }
        }

        private d(List<DocumentDescription> list) {
            this.f52598a = list;
        }

        public /* synthetic */ d(List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(list);
        }

        public final DocumentDescription a() {
            return (DocumentDescription) u.b0(b());
        }

        public List<DocumentDescription> b() {
            return this.f52598a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.k<a, d, b, c>.a f52605b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f52606a = new a();

            a() {
                super(1);
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new d.c(action.c().b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(nr.k<? super a, d, ? extends b, ? extends c>.a aVar) {
            super(0);
            this.f52605b = aVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            q<? super a, d, ? extends b> d11;
            j.this.f52583a.c();
            nr.h<q<? super a, d, ? extends b>> b11 = this.f52605b.b();
            d11 = y.d(j.this, null, a.f52606a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nr.k<a, d, b, c>.a f52608b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f52609a = new a();

            a() {
                super(1);
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new d.a(action.c().b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(nr.k<? super a, d, ? extends b, ? extends c>.a aVar) {
            super(0);
            this.f52608b = aVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            q<? super a, d, ? extends b> d11;
            j.this.f52584b.c();
            nr.h<q<? super a, d, ? extends b>> b11 = this.f52608b.b();
            d11 = y.d(j.this, null, a.f52609a, 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<a.AbstractC1162a, q<? super a, d, ? extends b>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.AbstractC1162a f52611a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.AbstractC1162a abstractC1162a) {
                super(1);
                this.f52611a = abstractC1162a;
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new d.C1170d(((a.AbstractC1162a.b) this.f52611a).a(), action.c().b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f52612a = new b();

            b() {
                super(1);
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new d.b(action.c().b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        g() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final q<a, d, b> invoke(a.AbstractC1162a it2) {
            q<a, d, b> d11;
            q<a, d, b> d12;
            s.g(it2, "it");
            if (it2 instanceof a.AbstractC1162a.b) {
                d12 = y.d(j.this, null, new a(it2), 1, null);
                return d12;
            } else if (s.c(it2, a.AbstractC1162a.C1163a.f52556a)) {
                d11 = y.d(j.this, null, b.f52612a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<i.a, q<? super a, d, ? extends b>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i.a f52614a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i.a aVar) {
                super(1);
                this.f52614a = aVar;
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new d.C1170d(((i.a.b) this.f52614a).a(), action.c().b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f52615a = new b();

            b() {
                super(1);
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.e(new d.b(action.c().b()));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        h() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final q<a, d, b> invoke(i.a it2) {
            q<a, d, b> d11;
            q<a, d, b> d12;
            s.g(it2, "it");
            if (it2 instanceof i.a.b) {
                d12 = y.d(j.this, null, new a(it2), 1, null);
                return d12;
            } else if (s.c(it2, i.a.C1166a.f52578a)) {
                d11 = y.d(j.this, null, b.f52615a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.l<b.AbstractC1233b, q<? super a, d, ? extends b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f52616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f52617b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f52618a = new a();

            a() {
                super(1);
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                List V;
                s.g(action, "$this$action");
                V = e0.V(action.c().b(), 1);
                action.e(new d.b(V));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f52619a = new b();

            b() {
                super(1);
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.d(b.C1167b.f52590a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<q<? super a, d, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f52620a = new c();

            c() {
                super(1);
            }

            public final void a(q<? super a, d, ? extends b>.c action) {
                s.g(action, "$this$action");
                action.d(b.a.f52589a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(q<? super a, d, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(d dVar, j jVar) {
            super(1);
            this.f52616a = dVar;
            this.f52617b = jVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final q<a, d, b> invoke(b.AbstractC1233b it2) {
            q<a, d, b> d11;
            q<a, d, b> d12;
            q<a, d, b> d13;
            s.g(it2, "it");
            if (s.c(it2, b.AbstractC1233b.C1234b.f54639a)) {
                if (this.f52616a.b().size() > 1) {
                    d13 = y.d(this.f52617b, null, a.f52618a, 1, null);
                    return d13;
                }
                d12 = y.d(this.f52617b, null, b.f52619a, 1, null);
                return d12;
            } else if (s.c(it2, b.AbstractC1233b.a.f54638a)) {
                d11 = y.d(this.f52617b, null, c.f52620a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public j(tv.a documentCameraWorker, tv.i documentSelectWorker, b.a documentUploadWorker) {
        s.g(documentCameraWorker, "documentCameraWorker");
        s.g(documentSelectWorker, "documentSelectWorker");
        s.g(documentUploadWorker, "documentUploadWorker");
        this.f52583a = documentCameraWorker;
        this.f52584b = documentSelectWorker;
        this.f52585c = documentUploadWorker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.os.Parcelable, java.lang.Object] */
    @Override // nr.k
    /* renamed from: j */
    public d d(a props, nr.i iVar) {
        s.g(props, "props");
        d dVar = null;
        if (iVar != null) {
            okio.i b11 = iVar.b();
            if (!(b11.z() > 0)) {
                b11 = null;
            }
            if (b11 != null) {
                Parcel obtain = Parcel.obtain();
                s.f(obtain, "obtain()");
                byte[] E = b11.E();
                obtain.unmarshall(E, 0, E.length);
                obtain.setDataPosition(0);
                ?? readParcelable = obtain.readParcelable(nr.i.class.getClassLoader());
                s.e(readParcelable);
                s.f(readParcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
                dVar = readParcelable;
            }
            dVar = dVar;
        }
        return dVar == null ? new d.b(props.a()) : dVar;
    }

    @Override // nr.k
    /* renamed from: k */
    public c f(a props, d state, nr.k<? super a, d, ? extends b, ? extends c>.a context) {
        s.g(props, "props");
        s.g(state, "state");
        s.g(context, "context");
        if (state instanceof d.b) {
            return new c.b(state.a().c(), state.a().b(), new e(context), new f(context));
        }
        if (state instanceof d.c) {
            v.i(context, this.f52583a, m0.m(tv.a.class), "", new g());
            return new c.b(state.a().c(), state.a().b(), null, null, 12, null);
        } else if (state instanceof d.a) {
            v.i(context, this.f52584b, m0.m(tv.i.class), "", new h());
            return new c.b(state.a().c(), state.a().b(), null, null, 12, null);
        } else if (state instanceof d.C1170d) {
            v.i(context, this.f52585c.a(props.b(), ((d.C1170d) state).c(), state.a().a()), m0.m(vv.b.class), "", new i(state, this));
            return c.a.f52591a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // nr.k
    /* renamed from: l */
    public nr.i g(d state) {
        s.g(state, "state");
        return jw.a.a(state);
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f52591a = new a();

            private a() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f52592a;

            /* renamed from: b  reason: collision with root package name */
            private final String f52593b;

            /* renamed from: c  reason: collision with root package name */
            private final h00.a<b0> f52594c;

            /* renamed from: d  reason: collision with root package name */
            private final h00.a<b0> f52595d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes6.dex */
            public static final class a extends kotlin.jvm.internal.u implements h00.a<b0> {

                /* renamed from: a  reason: collision with root package name */
                public static final a f52596a = new a();

                a() {
                    super(0);
                }

                @Override // h00.a
                public /* bridge */ /* synthetic */ b0 invoke() {
                    invoke2();
                    return b0.f54756a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: tv.j$c$b$b  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1168b extends kotlin.jvm.internal.u implements h00.a<b0> {

                /* renamed from: a  reason: collision with root package name */
                public static final C1168b f52597a = new C1168b();

                C1168b() {
                    super(0);
                }

                @Override // h00.a
                public /* bridge */ /* synthetic */ b0 invoke() {
                    invoke2();
                    return b0.f54756a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            }

            public /* synthetic */ b(String str, String str2, h00.a aVar, h00.a aVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? a.f52596a : aVar, (i11 & 8) != 0 ? C1168b.f52597a : aVar2);
            }

            public final h00.a<b0> a() {
                return this.f52595d;
            }

            public final h00.a<b0> b() {
                return this.f52594c;
            }

            public final String c() {
                return this.f52593b;
            }

            public final String d() {
                return this.f52592a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String title, String prompt, h00.a<b0> onTakePhotoClick, h00.a<b0> onSelectDocumentClick) {
                super(null);
                s.g(title, "title");
                s.g(prompt, "prompt");
                s.g(onTakePhotoClick, "onTakePhotoClick");
                s.g(onSelectDocumentClick, "onSelectDocumentClick");
                this.f52592a = title;
                this.f52593b = prompt;
                this.f52594c = onTakePhotoClick;
                this.f52595d = onSelectDocumentClick;
            }
        }
    }
}
package wv;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.governmentid.b;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class z implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final Id.b f56386a;

    /* renamed from: b  reason: collision with root package name */
    private final List<com.withpersona.sdk.inquiry.governmentid.a> f56387b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Id.b> f56388c;

    /* loaded from: classes6.dex */
    public static final class a extends z {
        public static final Parcelable.Creator<a> CREATOR = new C1281a();

        /* renamed from: d  reason: collision with root package name */
        private final Id.b f56389d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56390e;

        /* renamed from: f  reason: collision with root package name */
        private final Id f56391f;

        /* renamed from: g  reason: collision with root package name */
        private final List<Id.b> f56392g;

        /* renamed from: wv.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1281a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                Id createFromParcel = Id.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new a(valueOf, arrayList, createFromParcel, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56389d = currentSide;
            this.f56390e = uploadingIds;
            this.f56391f = id2;
            this.f56392g = remainingSides;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a f(a aVar, Id.b bVar, List list, Id id2, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = aVar.a();
            }
            if ((i11 & 2) != 0) {
                list = aVar.c();
            }
            if ((i11 & 4) != 0) {
                id2 = aVar.f56391f;
            }
            if ((i11 & 8) != 0) {
                list2 = aVar.b();
            }
            return aVar.e(bVar, list, id2, list2);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56389d;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56392g;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56390e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final a e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new a(currentSide, uploadingIds, id2, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a() == aVar.a() && kotlin.jvm.internal.s.c(c(), aVar.c()) && kotlin.jvm.internal.s.c(this.f56391f, aVar.f56391f) && kotlin.jvm.internal.s.c(b(), aVar.b());
            }
            return false;
        }

        public final Id g() {
            return this.f56391f;
        }

        public int hashCode() {
            return (((((a().hashCode() * 31) + c().hashCode()) * 31) + this.f56391f.hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "CountdownToCapture(currentSide=" + a() + ", uploadingIds=" + c() + ", id=" + this.f56391f + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f56389d.name());
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56390e;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            this.f56391f.writeToParcel(out, i11);
            List<Id.b> list2 = this.f56392g;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends z {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        private final Id.b f56401d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56402e;

        /* renamed from: f  reason: collision with root package name */
        private final Id f56403f;

        /* renamed from: g  reason: collision with root package name */
        private final com.withpersona.sdk.inquiry.governmentid.a f56404g;

        /* renamed from: h  reason: collision with root package name */
        private final List<Id.b> f56405h;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                Id createFromParcel = Id.CREATOR.createFromParcel(parcel);
                com.withpersona.sdk.inquiry.governmentid.a createFromParcel2 = com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new d(valueOf, arrayList, createFromParcel, createFromParcel2, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, com.withpersona.sdk.inquiry.governmentid.a idForReview, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(idForReview, "idForReview");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56401d = currentSide;
            this.f56402e = uploadingIds;
            this.f56403f = id2;
            this.f56404g = idForReview;
            this.f56405h = remainingSides;
        }

        public static /* synthetic */ d f(d dVar, Id.b bVar, List list, Id id2, com.withpersona.sdk.inquiry.governmentid.a aVar, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = dVar.a();
            }
            List<com.withpersona.sdk.inquiry.governmentid.a> list3 = list;
            if ((i11 & 2) != 0) {
                list3 = dVar.c();
            }
            List list4 = list3;
            if ((i11 & 4) != 0) {
                id2 = dVar.f56403f;
            }
            Id id3 = id2;
            if ((i11 & 8) != 0) {
                aVar = dVar.f56404g;
            }
            com.withpersona.sdk.inquiry.governmentid.a aVar2 = aVar;
            List<Id.b> list5 = list2;
            if ((i11 & 16) != 0) {
                list5 = dVar.b();
            }
            return dVar.e(bVar, list4, id3, aVar2, list5);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56401d;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56405h;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56402e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final d e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, com.withpersona.sdk.inquiry.governmentid.a idForReview, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(idForReview, "idForReview");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new d(currentSide, uploadingIds, id2, idForReview, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return a() == dVar.a() && kotlin.jvm.internal.s.c(c(), dVar.c()) && kotlin.jvm.internal.s.c(this.f56403f, dVar.f56403f) && kotlin.jvm.internal.s.c(this.f56404g, dVar.f56404g) && kotlin.jvm.internal.s.c(b(), dVar.b());
            }
            return false;
        }

        public final Id g() {
            return this.f56403f;
        }

        public final com.withpersona.sdk.inquiry.governmentid.a h() {
            return this.f56404g;
        }

        public int hashCode() {
            return (((((((a().hashCode() * 31) + c().hashCode()) * 31) + this.f56403f.hashCode()) * 31) + this.f56404g.hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "ReviewCapturedImage(currentSide=" + a() + ", uploadingIds=" + c() + ", id=" + this.f56403f + ", idForReview=" + this.f56404g + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f56401d.name());
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56402e;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            this.f56403f.writeToParcel(out, i11);
            this.f56404g.writeToParcel(out, i11);
            List<Id.b> list2 = this.f56405h;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends z {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        private final Id.b f56415d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56416e;

        /* renamed from: f  reason: collision with root package name */
        private final Id f56417f;

        /* renamed from: g  reason: collision with root package name */
        private final b.d.a.EnumC0419b f56418g;

        /* renamed from: h  reason: collision with root package name */
        private final List<Id.b> f56419h;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final h createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                Id createFromParcel = Id.CREATOR.createFromParcel(parcel);
                b.d.a.EnumC0419b valueOf2 = b.d.a.EnumC0419b.valueOf(parcel.readString());
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new h(valueOf, arrayList, createFromParcel, valueOf2, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final h[] newArray(int i11) {
                return new h[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, b.d.a.EnumC0419b manualCapture, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(manualCapture, "manualCapture");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56415d = currentSide;
            this.f56416e = uploadingIds;
            this.f56417f = id2;
            this.f56418g = manualCapture;
            this.f56419h = remainingSides;
        }

        public static /* synthetic */ h f(h hVar, Id.b bVar, List list, Id id2, b.d.a.EnumC0419b enumC0419b, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = hVar.a();
            }
            List<com.withpersona.sdk.inquiry.governmentid.a> list3 = list;
            if ((i11 & 2) != 0) {
                list3 = hVar.c();
            }
            List list4 = list3;
            if ((i11 & 4) != 0) {
                id2 = hVar.f56417f;
            }
            Id id3 = id2;
            if ((i11 & 8) != 0) {
                enumC0419b = hVar.f56418g;
            }
            b.d.a.EnumC0419b enumC0419b2 = enumC0419b;
            List<Id.b> list5 = list2;
            if ((i11 & 16) != 0) {
                list5 = hVar.b();
            }
            return hVar.e(bVar, list4, id3, enumC0419b2, list5);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56415d;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56419h;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56416e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final h e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, b.d.a.EnumC0419b manualCapture, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(manualCapture, "manualCapture");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new h(currentSide, uploadingIds, id2, manualCapture, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return a() == hVar.a() && kotlin.jvm.internal.s.c(c(), hVar.c()) && kotlin.jvm.internal.s.c(this.f56417f, hVar.f56417f) && this.f56418g == hVar.f56418g && kotlin.jvm.internal.s.c(b(), hVar.b());
            }
            return false;
        }

        public final Id g() {
            return this.f56417f;
        }

        public final b.d.a.EnumC0419b h() {
            return this.f56418g;
        }

        public int hashCode() {
            return (((((((a().hashCode() * 31) + c().hashCode()) * 31) + this.f56417f.hashCode()) * 31) + this.f56418g.hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "WaitForAutocapture(currentSide=" + a() + ", uploadingIds=" + c() + ", id=" + this.f56417f + ", manualCapture=" + this.f56418g + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f56415d.name());
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56416e;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            this.f56417f.writeToParcel(out, i11);
            out.writeString(this.f56418g.name());
            List<Id.b> list2 = this.f56419h;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private z(Id.b bVar, List<com.withpersona.sdk.inquiry.governmentid.a> list, List<? extends Id.b> list2) {
        this.f56386a = bVar;
        this.f56387b = list;
        this.f56388c = list2;
    }

    public /* synthetic */ z(Id.b bVar, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, list, list2);
    }

    public Id.b a() {
        return this.f56386a;
    }

    public List<Id.b> b() {
        return this.f56388c;
    }

    public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
        return this.f56387b;
    }

    public final z d(com.withpersona.sdk.inquiry.governmentid.a governmentId) {
        List v02;
        List v03;
        List v04;
        List v05;
        List v06;
        List v07;
        List v08;
        List v09;
        kotlin.jvm.internal.s.g(governmentId, "governmentId");
        if (this instanceof e) {
            v09 = wz.e0.v0(c(), governmentId);
            return e.f((e) this, null, v09, null, 5, null);
        } else if (this instanceof c) {
            v08 = wz.e0.v0(c(), governmentId);
            return c.f((c) this, null, v08, null, null, 13, null);
        } else if (this instanceof h) {
            v07 = wz.e0.v0(c(), governmentId);
            return h.f((h) this, null, v07, null, null, null, 29, null);
        } else if (this instanceof a) {
            v06 = wz.e0.v0(c(), governmentId);
            return a.f((a) this, null, v06, null, null, 13, null);
        } else if (this instanceof d) {
            v05 = wz.e0.v0(c(), governmentId);
            return d.f((d) this, null, v05, null, null, null, 29, null);
        } else if (this instanceof f) {
            v04 = wz.e0.v0(c(), governmentId);
            return f.f((f) this, v04, null, null, 6, null);
        } else if (this instanceof g) {
            v03 = wz.e0.v0(c(), governmentId);
            return g.f((g) this, null, v03, null, 5, null);
        } else if (this instanceof b) {
            v02 = wz.e0.v0(c(), governmentId);
            return b.f((b) this, null, v02, null, null, 13, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends z {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        private final Id.b f56397d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56398e;

        /* renamed from: f  reason: collision with root package name */
        private final Id f56399f;

        /* renamed from: g  reason: collision with root package name */
        private final List<Id.b> f56400g;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                Id createFromParcel = Id.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new c(valueOf, arrayList, createFromParcel, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public /* synthetic */ c(Id.b bVar, List list, Id id2, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Id.b.Front : bVar, (i11 & 2) != 0 ? wz.w.i() : list, id2, list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c f(c cVar, Id.b bVar, List list, Id id2, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = cVar.a();
            }
            if ((i11 & 2) != 0) {
                list = cVar.c();
            }
            if ((i11 & 4) != 0) {
                id2 = cVar.f56399f;
            }
            if ((i11 & 8) != 0) {
                list2 = cVar.b();
            }
            return cVar.e(bVar, list, id2, list2);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56397d;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56400g;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56398e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final c e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new c(currentSide, uploadingIds, id2, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return a() == cVar.a() && kotlin.jvm.internal.s.c(c(), cVar.c()) && kotlin.jvm.internal.s.c(this.f56399f, cVar.f56399f) && kotlin.jvm.internal.s.c(b(), cVar.b());
            }
            return false;
        }

        public final Id g() {
            return this.f56399f;
        }

        public int hashCode() {
            return (((((a().hashCode() * 31) + c().hashCode()) * 31) + this.f56399f.hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "RequestPermissions(currentSide=" + a() + ", uploadingIds=" + c() + ", id=" + this.f56399f + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f56397d.name());
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56398e;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            this.f56399f.writeToParcel(out, i11);
            List<Id.b> list2 = this.f56400g;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id id2, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56397d = currentSide;
            this.f56398e = uploadingIds;
            this.f56399f = id2;
            this.f56400g = remainingSides;
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends z {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56409d;

        /* renamed from: e  reason: collision with root package name */
        private final Id.b f56410e;

        /* renamed from: f  reason: collision with root package name */
        private final List<Id.b> f56411f;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new f(arrayList, valueOf, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        public /* synthetic */ f(List list, Id.b bVar, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? Id.b.Front : bVar, (i11 & 4) != 0 ? wz.w.i() : list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ f f(f fVar, List list, Id.b bVar, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = fVar.c();
            }
            if ((i11 & 2) != 0) {
                bVar = fVar.a();
            }
            if ((i11 & 4) != 0) {
                list2 = fVar.b();
            }
            return fVar.e(list, bVar, list2);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56410e;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56411f;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56409d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final f e(List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id.b currentSide, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new f(uploadingIds, currentSide, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return kotlin.jvm.internal.s.c(c(), fVar.c()) && a() == fVar.a() && kotlin.jvm.internal.s.c(b(), fVar.b());
            }
            return false;
        }

        public int hashCode() {
            return (((c().hashCode() * 31) + a().hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "Submit(uploadingIds=" + c() + ", currentSide=" + a() + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56409d;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            out.writeString(this.f56410e.name());
            List<Id.b> list2 = this.f56411f;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, Id.b currentSide, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56409d = uploadingIds;
            this.f56410e = currentSide;
            this.f56411f = remainingSides;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends z {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        private final Id.b f56393d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56394e;

        /* renamed from: f  reason: collision with root package name */
        private final com.withpersona.sdk.inquiry.governmentid.network.a f56395f;

        /* renamed from: g  reason: collision with root package name */
        private final List<Id.b> f56396g;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                com.withpersona.sdk.inquiry.governmentid.network.a valueOf2 = com.withpersona.sdk.inquiry.governmentid.network.a.valueOf(parcel.readString());
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new b(valueOf, arrayList, valueOf2, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public /* synthetic */ b(Id.b bVar, List list, com.withpersona.sdk.inquiry.governmentid.network.a aVar, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Id.b.Front : bVar, (i11 & 2) != 0 ? wz.w.i() : list, aVar, (i11 & 8) != 0 ? wz.w.i() : list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b f(b bVar, Id.b bVar2, List list, com.withpersona.sdk.inquiry.governmentid.network.a aVar, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar2 = bVar.a();
            }
            if ((i11 & 2) != 0) {
                list = bVar.c();
            }
            if ((i11 & 4) != 0) {
                aVar = bVar.f56395f;
            }
            if ((i11 & 8) != 0) {
                list2 = bVar.b();
            }
            return bVar.e(bVar2, list, aVar, list2);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56393d;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56396g;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56394e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final b e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, com.withpersona.sdk.inquiry.governmentid.network.a reason, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(reason, "reason");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new b(currentSide, uploadingIds, reason, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return a() == bVar.a() && kotlin.jvm.internal.s.c(c(), bVar.c()) && this.f56395f == bVar.f56395f && kotlin.jvm.internal.s.c(b(), bVar.b());
            }
            return false;
        }

        public final com.withpersona.sdk.inquiry.governmentid.network.a g() {
            return this.f56395f;
        }

        public int hashCode() {
            return (((((a().hashCode() * 31) + c().hashCode()) * 31) + this.f56395f.hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "Failed(currentSide=" + a() + ", uploadingIds=" + c() + ", reason=" + this.f56395f + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f56393d.name());
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56394e;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            out.writeString(this.f56395f.name());
            List<Id.b> list2 = this.f56396g;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, com.withpersona.sdk.inquiry.governmentid.network.a reason, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(reason, "reason");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56393d = currentSide;
            this.f56394e = uploadingIds;
            this.f56395f = reason;
            this.f56396g = remainingSides;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends z {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        private final Id.b f56406d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56407e;

        /* renamed from: f  reason: collision with root package name */
        private final List<Id.b> f56408f;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new e(valueOf, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        public e() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ e(Id.b bVar, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Id.b.Front : bVar, (i11 & 2) != 0 ? wz.w.i() : list, (i11 & 4) != 0 ? wz.w.i() : list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e f(e eVar, Id.b bVar, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = eVar.a();
            }
            if ((i11 & 2) != 0) {
                list = eVar.c();
            }
            if ((i11 & 4) != 0) {
                list2 = eVar.b();
            }
            return eVar.e(bVar, list, list2);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56406d;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56408f;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56407e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final e e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new e(currentSide, uploadingIds, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return a() == eVar.a() && kotlin.jvm.internal.s.c(c(), eVar.c()) && kotlin.jvm.internal.s.c(b(), eVar.b());
            }
            return false;
        }

        public int hashCode() {
            return (((a().hashCode() * 31) + c().hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "ShowInstructions(currentSide=" + a() + ", uploadingIds=" + c() + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f56406d.name());
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56407e;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            List<Id.b> list2 = this.f56408f;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56406d = currentSide;
            this.f56407e = uploadingIds;
            this.f56408f = remainingSides;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends z {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        private final Id.b f56412d;

        /* renamed from: e  reason: collision with root package name */
        private final List<com.withpersona.sdk.inquiry.governmentid.a> f56413e;

        /* renamed from: f  reason: collision with root package name */
        private final List<Id.b> f56414f;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final g createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Id.b valueOf = Id.b.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(com.withpersona.sdk.inquiry.governmentid.a.CREATOR.createFromParcel(parcel));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Id.b.valueOf(parcel.readString()));
                }
                return new g(valueOf, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final g[] newArray(int i11) {
                return new g[i11];
            }
        }

        public g() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ g(Id.b bVar, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Id.b.Front : bVar, (i11 & 2) != 0 ? wz.w.i() : list, (i11 & 4) != 0 ? wz.w.i() : list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ g f(g gVar, Id.b bVar, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = gVar.a();
            }
            if ((i11 & 2) != 0) {
                list = gVar.c();
            }
            if ((i11 & 4) != 0) {
                list2 = gVar.b();
            }
            return gVar.e(bVar, list, list2);
        }

        @Override // wv.z
        public Id.b a() {
            return this.f56412d;
        }

        @Override // wv.z
        public List<Id.b> b() {
            return this.f56414f;
        }

        @Override // wv.z
        public List<com.withpersona.sdk.inquiry.governmentid.a> c() {
            return this.f56413e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final g e(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, List<? extends Id.b> remainingSides) {
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            return new g(currentSide, uploadingIds, remainingSides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return a() == gVar.a() && kotlin.jvm.internal.s.c(c(), gVar.c()) && kotlin.jvm.internal.s.c(b(), gVar.b());
            }
            return false;
        }

        public int hashCode() {
            return (((a().hashCode() * 31) + c().hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "Wait(currentSide=" + a() + ", uploadingIds=" + c() + ", remainingSides=" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f56412d.name());
            List<com.withpersona.sdk.inquiry.governmentid.a> list = this.f56413e;
            out.writeInt(list.size());
            for (com.withpersona.sdk.inquiry.governmentid.a aVar : list) {
                aVar.writeToParcel(out, i11);
            }
            List<Id.b> list2 = this.f56414f;
            out.writeInt(list2.size());
            for (Id.b bVar : list2) {
                out.writeString(bVar.name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Id.b currentSide, List<com.withpersona.sdk.inquiry.governmentid.a> uploadingIds, List<? extends Id.b> remainingSides) {
            super(currentSide, uploadingIds, remainingSides, null);
            kotlin.jvm.internal.s.g(currentSide, "currentSide");
            kotlin.jvm.internal.s.g(uploadingIds, "uploadingIds");
            kotlin.jvm.internal.s.g(remainingSides, "remainingSides");
            this.f56412d = currentSide;
            this.f56413e = uploadingIds;
            this.f56414f = remainingSides;
        }
    }
}
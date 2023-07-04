package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.vd;
import com.plaid.link.configuration.LinkPublicKeyConfiguration;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import g30.b0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

@c30.c
@kotlinx.serialization.a
/* loaded from: classes2.dex */
public abstract class g6 implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public static final c f18615a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final vz.k<c30.b<Object>> f18616b;

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<c30.b<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18623a = new b();

        public b() {
            super(0);
        }

        @Override // h00.a
        public c30.b<Object> invoke() {
            return new c30.f("com.plaid.internal.workflow.model.LinkState", kotlin.jvm.internal.m0.b(g6.class), new n00.d[]{kotlin.jvm.internal.m0.b(i.class), kotlin.jvm.internal.m0.b(a.class), kotlin.jvm.internal.m0.b(k.class), kotlin.jvm.internal.m0.b(h.class), kotlin.jvm.internal.m0.b(d.class), kotlin.jvm.internal.m0.b(j.class)}, new c30.b[]{new g30.b1("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", i.f18640c, new Annotation[0]), a.C0340a.f18621a, k.a.f18657a, h.a.f18638a, d.a.f18627a, j.a.f18647a}, new Annotation[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
    }

    /* loaded from: classes2.dex */
    public interface e {
        List<vd> b();

        String c();

        vd d();
    }

    /* loaded from: classes2.dex */
    public interface f {
        String e();
    }

    /* loaded from: classes2.dex */
    public interface g {
        String a();
    }

    @kotlinx.serialization.a
    /* loaded from: classes2.dex */
    public static final class h extends g6 implements e, f, g {
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public final String f18629c;

        /* renamed from: d  reason: collision with root package name */
        public final vd f18630d;

        /* renamed from: e  reason: collision with root package name */
        public final String f18631e;

        /* renamed from: f  reason: collision with root package name */
        public final String f18632f;

        /* renamed from: g  reason: collision with root package name */
        public final String f18633g;

        /* renamed from: h  reason: collision with root package name */
        public final List<vd> f18634h;

        /* renamed from: i  reason: collision with root package name */
        public final String f18635i;

        /* renamed from: j  reason: collision with root package name */
        public final String f18636j;

        /* renamed from: k  reason: collision with root package name */
        public final String f18637k;

        /* loaded from: classes2.dex */
        public static final class a implements g30.b0<h> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18638a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ e30.f f18639b;

            static {
                a aVar = new a();
                f18638a = aVar;
                g30.g1 g1Var = new g30.g1("com.plaid.internal.workflow.model.LinkState.LocalError", aVar, 9);
                g1Var.k("workflowId", false);
                g1Var.k("currentPane", false);
                g1Var.k("continuationToken", false);
                g1Var.k("errorMessage", false);
                g1Var.k("errorCode", false);
                g1Var.k("backstack", false);
                g1Var.k("requestId", false);
                g1Var.k("linkOpenId", true);
                g1Var.k("oauthNonce", true);
                f18639b = g1Var;
            }

            @Override // g30.b0
            public KSerializer<?>[] childSerializers() {
                g30.u1 u1Var = g30.u1.f27647a;
                vd.a aVar = vd.a.f19652a;
                return new c30.b[]{u1Var, aVar, u1Var, u1Var, u1Var, new g30.f(aVar), u1Var, u1Var, u1Var};
            }

            @Override // c30.a
            public Object deserialize(f30.e decoder) {
                String str;
                String str2;
                String str3;
                Object obj;
                Object obj2;
                String str4;
                String str5;
                int i11;
                String str6;
                String str7;
                kotlin.jvm.internal.s.g(decoder, "decoder");
                e30.f fVar = f18639b;
                f30.c b11 = decoder.b(fVar);
                int i12 = 7;
                Object obj3 = null;
                if (b11.n()) {
                    String i13 = b11.i(fVar, 0);
                    vd.a aVar = vd.a.f19652a;
                    obj2 = b11.e(fVar, 1, aVar, null);
                    String i14 = b11.i(fVar, 2);
                    String i15 = b11.i(fVar, 3);
                    String i16 = b11.i(fVar, 4);
                    obj = b11.e(fVar, 5, new g30.f(aVar), null);
                    String i17 = b11.i(fVar, 6);
                    str4 = i13;
                    str6 = b11.i(fVar, 7);
                    str7 = i17;
                    str2 = i15;
                    str5 = b11.i(fVar, 8);
                    str3 = i16;
                    str = i14;
                    i11 = 511;
                } else {
                    int i18 = 0;
                    boolean z11 = true;
                    Object obj4 = null;
                    String str8 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    while (z11) {
                        int p11 = b11.p(fVar);
                        switch (p11) {
                            case -1:
                                z11 = false;
                                i12 = 7;
                            case 0:
                                str8 = b11.i(fVar, 0);
                                i18 |= 1;
                                i12 = 7;
                            case 1:
                                obj4 = b11.e(fVar, 1, vd.a.f19652a, obj4);
                                i18 |= 2;
                                i12 = 7;
                            case 2:
                                str = b11.i(fVar, 2);
                                i18 |= 4;
                                i12 = 7;
                            case 3:
                                str2 = b11.i(fVar, 3);
                                i18 |= 8;
                                i12 = 7;
                            case 4:
                                str3 = b11.i(fVar, 4);
                                i18 |= 16;
                                i12 = 7;
                            case 5:
                                obj3 = b11.e(fVar, 5, new g30.f(vd.a.f19652a), obj3);
                                i18 |= 32;
                                i12 = 7;
                            case 6:
                                str9 = b11.i(fVar, 6);
                                i18 |= 64;
                            case 7:
                                str10 = b11.i(fVar, i12);
                                i18 |= 128;
                            case 8:
                                str11 = b11.i(fVar, 8);
                                i18 |= 256;
                            default:
                                throw new UnknownFieldException(p11);
                        }
                    }
                    obj = obj3;
                    obj2 = obj4;
                    str4 = str8;
                    str5 = str11;
                    i11 = i18;
                    str6 = str10;
                    str7 = str9;
                }
                b11.d(fVar);
                return new h(i11, str4, (vd) obj2, str, str2, str3, (List) obj, str7, str6, str5, null);
            }

            @Override // c30.b, c30.h, c30.a
            public e30.f getDescriptor() {
                return f18639b;
            }

            @Override // c30.h
            public void serialize(f30.f encoder, Object obj) {
                h self = (h) obj;
                kotlin.jvm.internal.s.g(encoder, "encoder");
                kotlin.jvm.internal.s.g(self, "value");
                e30.f serialDesc = f18639b;
                f30.d output = encoder.b(serialDesc);
                Parcelable.Creator<h> creator = h.CREATOR;
                kotlin.jvm.internal.s.g(self, "self");
                kotlin.jvm.internal.s.g(output, "output");
                kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
                g6.a(self, output, serialDesc);
                boolean z11 = false;
                output.p(serialDesc, 0, self.f18629c);
                vd.a aVar = vd.a.f19652a;
                output.q(serialDesc, 1, aVar, self.f18630d);
                output.p(serialDesc, 2, self.f18631e);
                output.p(serialDesc, 3, self.f18632f);
                output.p(serialDesc, 4, self.f18633g);
                output.q(serialDesc, 5, new g30.f(aVar), self.f18634h);
                output.p(serialDesc, 6, self.f18635i);
                if (output.k(serialDesc, 7) || !kotlin.jvm.internal.s.c(self.f18636j, "")) {
                    output.p(serialDesc, 7, self.f18636j);
                }
                if (output.k(serialDesc, 8) || !kotlin.jvm.internal.s.c(self.f18637k, "")) {
                    z11 = true;
                }
                if (z11) {
                    output.p(serialDesc, 8, self.f18637k);
                }
                output.d(serialDesc);
            }

            @Override // g30.b0
            public KSerializer<?>[] typeParametersSerializers() {
                return b0.a.a(this);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public h createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                String readString = parcel.readString();
                vd vdVar = (vd) parcel.readParcelable(h.class.getClassLoader());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(parcel.readParcelable(h.class.getClassLoader()));
                }
                return new h(readString, vdVar, readString2, readString3, readString4, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(int i11, String str, vd vdVar, String str2, String str3, String str4, List list, String str5, String str6, String str7, g30.q1 q1Var) {
            super(i11, null);
            if (127 != (i11 & 127)) {
                g30.f1.a(i11, 127, a.f18638a.getDescriptor());
            }
            this.f18629c = str;
            this.f18630d = vdVar;
            this.f18631e = str2;
            this.f18632f = str3;
            this.f18633g = str4;
            this.f18634h = list;
            this.f18635i = str5;
            if ((i11 & 128) == 0) {
                this.f18636j = "";
            } else {
                this.f18636j = str6;
            }
            if ((i11 & 256) == 0) {
                this.f18637k = "";
            } else {
                this.f18637k = str7;
            }
        }

        @Override // com.plaid.internal.g6.g
        public String a() {
            return this.f18635i;
        }

        @Override // com.plaid.internal.g6.e
        public List<vd> b() {
            return this.f18634h;
        }

        @Override // com.plaid.internal.g6.e
        public String c() {
            return this.f18631e;
        }

        @Override // com.plaid.internal.g6.e
        public vd d() {
            return this.f18630d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.g6.f
        public String e() {
            return this.f18637k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return kotlin.jvm.internal.s.c(this.f18629c, hVar.f18629c) && kotlin.jvm.internal.s.c(this.f18630d, hVar.f18630d) && kotlin.jvm.internal.s.c(this.f18631e, hVar.f18631e) && kotlin.jvm.internal.s.c(this.f18632f, hVar.f18632f) && kotlin.jvm.internal.s.c(this.f18633g, hVar.f18633g) && kotlin.jvm.internal.s.c(this.f18634h, hVar.f18634h) && kotlin.jvm.internal.s.c(this.f18635i, hVar.f18635i);
            }
            return false;
        }

        @Override // com.plaid.internal.g6
        public String g() {
            return this.f18636j;
        }

        @Override // com.plaid.internal.g6
        public String h() {
            return this.f18629c;
        }

        public int hashCode() {
            int hashCode = this.f18630d.hashCode();
            int hashCode2 = this.f18631e.hashCode();
            int hashCode3 = this.f18632f.hashCode();
            int hashCode4 = this.f18633g.hashCode();
            int hashCode5 = this.f18634h.hashCode();
            return this.f18635i.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f18629c.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder a11 = g4.a("LocalError(workflowId=");
            a11.append(this.f18629c);
            a11.append(", currentPane=");
            a11.append(this.f18630d);
            a11.append(", continuationToken=");
            a11.append(this.f18631e);
            a11.append(", errorMessage=");
            a11.append(this.f18632f);
            a11.append(", errorCode=");
            a11.append(this.f18633g);
            a11.append(", backstack=");
            a11.append(this.f18634h);
            a11.append(", requestId=");
            a11.append(this.f18635i);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f18629c);
            out.writeParcelable(this.f18630d, i11);
            out.writeString(this.f18631e);
            out.writeString(this.f18632f);
            out.writeString(this.f18633g);
            List<vd> list = this.f18634h;
            out.writeInt(list.size());
            for (vd vdVar : list) {
                out.writeParcelable(vdVar, i11);
            }
            out.writeString(this.f18635i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String workflowId, vd currentPane, String continuationToken, String errorMessage, String errorCode, List<vd> backstack, String requestId) {
            super(null);
            kotlin.jvm.internal.s.g(workflowId, "workflowId");
            kotlin.jvm.internal.s.g(currentPane, "currentPane");
            kotlin.jvm.internal.s.g(continuationToken, "continuationToken");
            kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
            kotlin.jvm.internal.s.g(errorCode, "errorCode");
            kotlin.jvm.internal.s.g(backstack, "backstack");
            kotlin.jvm.internal.s.g(requestId, "requestId");
            this.f18629c = workflowId;
            this.f18630d = currentPane;
            this.f18631e = continuationToken;
            this.f18632f = errorMessage;
            this.f18633g = errorCode;
            this.f18634h = backstack;
            this.f18635i = requestId;
            this.f18636j = "";
            this.f18637k = "";
        }
    }

    @kotlinx.serialization.a
    /* loaded from: classes2.dex */
    public static final class i extends g6 {
        public static final Parcelable.Creator<i> CREATOR;

        /* renamed from: c  reason: collision with root package name */
        public static final i f18640c = new i();

        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.a<c30.b<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18641a = new a();

            public a() {
                super(0);
            }

            @Override // h00.a
            public c30.b<Object> invoke() {
                return new g30.b1("com.plaid.internal.workflow.model.LinkState.NoLinkConfiguration", i.f18640c, new Annotation[0]);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public i createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                parcel.readInt();
                return i.f18640c;
            }

            @Override // android.os.Parcelable.Creator
            public i[] newArray(int i11) {
                return new i[i11];
            }
        }

        static {
            vz.m.b(kotlin.b.PUBLICATION, a.f18641a);
            CREATOR = new b();
        }

        public i() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.g6
        public String g() {
            return "";
        }

        @Override // com.plaid.internal.g6
        public String h() {
            return "";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(1);
        }
    }

    @kotlinx.serialization.a
    /* loaded from: classes2.dex */
    public static final class j extends g6 implements g, f {
        public static final Parcelable.Creator<j> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public final String f18642c;

        /* renamed from: d  reason: collision with root package name */
        public final String f18643d;

        /* renamed from: e  reason: collision with root package name */
        public final String f18644e;

        /* renamed from: f  reason: collision with root package name */
        public final String f18645f;

        /* renamed from: g  reason: collision with root package name */
        public final String f18646g;

        /* loaded from: classes2.dex */
        public static final class a implements g30.b0<j> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18647a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ e30.f f18648b;

            static {
                a aVar = new a();
                f18647a = aVar;
                g30.g1 g1Var = new g30.g1("com.plaid.internal.workflow.model.LinkState.WebviewFallback", aVar, 5);
                g1Var.k("linkOpenId", false);
                g1Var.k("workflowId", false);
                g1Var.k("requestId", false);
                g1Var.k("oauthNonce", false);
                g1Var.k("url", false);
                f18648b = g1Var;
            }

            @Override // g30.b0
            public KSerializer<?>[] childSerializers() {
                g30.u1 u1Var = g30.u1.f27647a;
                return new c30.b[]{u1Var, u1Var, u1Var, u1Var, u1Var};
            }

            @Override // c30.a
            public Object deserialize(f30.e decoder) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                int i11;
                kotlin.jvm.internal.s.g(decoder, "decoder");
                e30.f fVar = f18648b;
                f30.c b11 = decoder.b(fVar);
                if (b11.n()) {
                    String i12 = b11.i(fVar, 0);
                    String i13 = b11.i(fVar, 1);
                    String i14 = b11.i(fVar, 2);
                    str = i12;
                    str2 = b11.i(fVar, 3);
                    str3 = b11.i(fVar, 4);
                    str4 = i14;
                    str5 = i13;
                    i11 = 31;
                } else {
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    int i15 = 0;
                    boolean z11 = true;
                    while (z11) {
                        int p11 = b11.p(fVar);
                        if (p11 == -1) {
                            z11 = false;
                        } else if (p11 == 0) {
                            str6 = b11.i(fVar, 0);
                            i15 |= 1;
                        } else if (p11 == 1) {
                            str10 = b11.i(fVar, 1);
                            i15 |= 2;
                        } else if (p11 == 2) {
                            str9 = b11.i(fVar, 2);
                            i15 |= 4;
                        } else if (p11 == 3) {
                            str7 = b11.i(fVar, 3);
                            i15 |= 8;
                        } else if (p11 != 4) {
                            throw new UnknownFieldException(p11);
                        } else {
                            str8 = b11.i(fVar, 4);
                            i15 |= 16;
                        }
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    i11 = i15;
                }
                b11.d(fVar);
                return new j(i11, str, str5, str4, str2, str3, null);
            }

            @Override // c30.b, c30.h, c30.a
            public e30.f getDescriptor() {
                return f18648b;
            }

            @Override // c30.h
            public void serialize(f30.f encoder, Object obj) {
                j self = (j) obj;
                kotlin.jvm.internal.s.g(encoder, "encoder");
                kotlin.jvm.internal.s.g(self, "value");
                e30.f serialDesc = f18648b;
                f30.d output = encoder.b(serialDesc);
                Parcelable.Creator<j> creator = j.CREATOR;
                kotlin.jvm.internal.s.g(self, "self");
                kotlin.jvm.internal.s.g(output, "output");
                kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
                g6.a(self, output, serialDesc);
                output.p(serialDesc, 0, self.f18642c);
                output.p(serialDesc, 1, self.f18643d);
                output.p(serialDesc, 2, self.f18644e);
                output.p(serialDesc, 3, self.f18645f);
                output.p(serialDesc, 4, self.f18646g);
                output.d(serialDesc);
            }

            @Override // g30.b0
            public KSerializer<?>[] typeParametersSerializers() {
                return b0.a.a(this);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public j createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public j[] newArray(int i11) {
                return new j[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(int i11, String str, String str2, String str3, String str4, String str5, g30.q1 q1Var) {
            super(i11, null);
            if (31 != (i11 & 31)) {
                g30.f1.a(i11, 31, a.f18647a.getDescriptor());
            }
            this.f18642c = str;
            this.f18643d = str2;
            this.f18644e = str3;
            this.f18645f = str4;
            this.f18646g = str5;
        }

        @Override // com.plaid.internal.g6.g
        public String a() {
            return this.f18644e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.g6.f
        public String e() {
            return this.f18645f;
        }

        @Override // com.plaid.internal.g6
        public String g() {
            return this.f18642c;
        }

        @Override // com.plaid.internal.g6
        public String h() {
            return this.f18643d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f18642c);
            out.writeString(this.f18643d);
            out.writeString(this.f18644e);
            out.writeString(this.f18645f);
            out.writeString(this.f18646g);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String linkOpenId, String workflowId, String requestId, String oauthNonce, String url) {
            super(null);
            kotlin.jvm.internal.s.g(linkOpenId, "linkOpenId");
            kotlin.jvm.internal.s.g(workflowId, "workflowId");
            kotlin.jvm.internal.s.g(requestId, "requestId");
            kotlin.jvm.internal.s.g(oauthNonce, "oauthNonce");
            kotlin.jvm.internal.s.g(url, "url");
            this.f18642c = linkOpenId;
            this.f18643d = workflowId;
            this.f18644e = requestId;
            this.f18645f = oauthNonce;
            this.f18646g = url;
        }
    }

    @kotlinx.serialization.a
    /* loaded from: classes2.dex */
    public static final class k extends g6 implements e, g, f {
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public final String f18649c;

        /* renamed from: d  reason: collision with root package name */
        public final String f18650d;

        /* renamed from: e  reason: collision with root package name */
        public final String f18651e;

        /* renamed from: f  reason: collision with root package name */
        public final String f18652f;

        /* renamed from: g  reason: collision with root package name */
        public final vd f18653g;

        /* renamed from: h  reason: collision with root package name */
        public final List<vd> f18654h;

        /* renamed from: i  reason: collision with root package name */
        public final List<vd> f18655i;

        /* renamed from: j  reason: collision with root package name */
        public final String f18656j;

        /* loaded from: classes2.dex */
        public static final class a implements g30.b0<k> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18657a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ e30.f f18658b;

            static {
                a aVar = new a();
                f18657a = aVar;
                g30.g1 g1Var = new g30.g1("com.plaid.internal.workflow.model.LinkState.Workflow", aVar, 8);
                g1Var.k("linkOpenId", false);
                g1Var.k("workflowId", false);
                g1Var.k("continuationToken", false);
                g1Var.k("oauthNonce", false);
                g1Var.k("currentPane", false);
                g1Var.k("additionalPanes", false);
                g1Var.k("backstack", false);
                g1Var.k("requestId", false);
                f18658b = g1Var;
            }

            @Override // g30.b0
            public KSerializer<?>[] childSerializers() {
                g30.u1 u1Var = g30.u1.f27647a;
                vd.a aVar = vd.a.f19652a;
                return new c30.b[]{u1Var, u1Var, u1Var, u1Var, aVar, new g30.f(aVar), new g30.f(aVar), u1Var};
            }

            @Override // c30.a
            public Object deserialize(f30.e decoder) {
                Object obj;
                Object obj2;
                Object obj3;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                int i11;
                kotlin.jvm.internal.s.g(decoder, "decoder");
                e30.f fVar = f18658b;
                f30.c b11 = decoder.b(fVar);
                int i12 = 7;
                Object obj4 = null;
                if (b11.n()) {
                    String i13 = b11.i(fVar, 0);
                    String i14 = b11.i(fVar, 1);
                    String i15 = b11.i(fVar, 2);
                    String i16 = b11.i(fVar, 3);
                    vd.a aVar = vd.a.f19652a;
                    obj3 = b11.e(fVar, 4, aVar, null);
                    obj2 = b11.e(fVar, 5, new g30.f(aVar), null);
                    obj = b11.e(fVar, 6, new g30.f(aVar), null);
                    str = i13;
                    str5 = b11.i(fVar, 7);
                    str4 = i16;
                    str3 = i15;
                    str2 = i14;
                    i11 = 255;
                } else {
                    int i17 = 0;
                    boolean z11 = true;
                    Object obj5 = null;
                    Object obj6 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    while (z11) {
                        int p11 = b11.p(fVar);
                        switch (p11) {
                            case -1:
                                z11 = false;
                                i12 = 7;
                            case 0:
                                str6 = b11.i(fVar, 0);
                                i17 |= 1;
                                i12 = 7;
                            case 1:
                                str7 = b11.i(fVar, 1);
                                i17 |= 2;
                                i12 = 7;
                            case 2:
                                str8 = b11.i(fVar, 2);
                                i17 |= 4;
                                i12 = 7;
                            case 3:
                                str9 = b11.i(fVar, 3);
                                i17 |= 8;
                                i12 = 7;
                            case 4:
                                obj6 = b11.e(fVar, 4, vd.a.f19652a, obj6);
                                i17 |= 16;
                                i12 = 7;
                            case 5:
                                obj5 = b11.e(fVar, 5, new g30.f(vd.a.f19652a), obj5);
                                i17 |= 32;
                                i12 = 7;
                            case 6:
                                obj4 = b11.e(fVar, 6, new g30.f(vd.a.f19652a), obj4);
                                i17 |= 64;
                                i12 = 7;
                            case 7:
                                str10 = b11.i(fVar, i12);
                                i17 |= 128;
                            default:
                                throw new UnknownFieldException(p11);
                        }
                    }
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    i11 = i17;
                }
                b11.d(fVar);
                return new k(i11, str, str2, str3, str4, (vd) obj3, (List) obj2, (List) obj, str5, null);
            }

            @Override // c30.b, c30.h, c30.a
            public e30.f getDescriptor() {
                return f18658b;
            }

            @Override // c30.h
            public void serialize(f30.f encoder, Object obj) {
                k self = (k) obj;
                kotlin.jvm.internal.s.g(encoder, "encoder");
                kotlin.jvm.internal.s.g(self, "value");
                e30.f serialDesc = f18658b;
                f30.d output = encoder.b(serialDesc);
                Parcelable.Creator<k> creator = k.CREATOR;
                kotlin.jvm.internal.s.g(self, "self");
                kotlin.jvm.internal.s.g(output, "output");
                kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
                g6.a(self, output, serialDesc);
                output.p(serialDesc, 0, self.f18649c);
                output.p(serialDesc, 1, self.f18650d);
                output.p(serialDesc, 2, self.f18651e);
                output.p(serialDesc, 3, self.f18652f);
                vd.a aVar = vd.a.f19652a;
                output.q(serialDesc, 4, aVar, self.f18653g);
                output.q(serialDesc, 5, new g30.f(aVar), self.f18654h);
                output.q(serialDesc, 6, new g30.f(aVar), self.f18655i);
                output.p(serialDesc, 7, self.f18656j);
                output.d(serialDesc);
            }

            @Override // g30.b0
            public KSerializer<?>[] typeParametersSerializers() {
                return b0.a.a(this);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public k createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                vd vdVar = (vd) parcel.readParcelable(k.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(parcel.readParcelable(k.class.getClassLoader()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(parcel.readParcelable(k.class.getClassLoader()));
                }
                return new k(readString, readString2, readString3, readString4, vdVar, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public k[] newArray(int i11) {
                return new k[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ k(int i11, String str, String str2, String str3, String str4, vd vdVar, List list, List list2, String str5, g30.q1 q1Var) {
            super(i11, null);
            if (255 != (i11 & 255)) {
                g30.f1.a(i11, 255, a.f18657a.getDescriptor());
            }
            this.f18649c = str;
            this.f18650d = str2;
            this.f18651e = str3;
            this.f18652f = str4;
            this.f18653g = vdVar;
            this.f18654h = list;
            this.f18655i = list2;
            this.f18656j = str5;
        }

        @Override // com.plaid.internal.g6.g
        public String a() {
            return this.f18656j;
        }

        @Override // com.plaid.internal.g6.e
        public List<vd> b() {
            return this.f18655i;
        }

        @Override // com.plaid.internal.g6.e
        public String c() {
            return this.f18651e;
        }

        @Override // com.plaid.internal.g6.e
        public vd d() {
            return this.f18653g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.g6.f
        public String e() {
            return this.f18652f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return kotlin.jvm.internal.s.c(this.f18649c, kVar.f18649c) && kotlin.jvm.internal.s.c(this.f18650d, kVar.f18650d) && kotlin.jvm.internal.s.c(this.f18651e, kVar.f18651e) && kotlin.jvm.internal.s.c(this.f18652f, kVar.f18652f) && kotlin.jvm.internal.s.c(this.f18653g, kVar.f18653g) && kotlin.jvm.internal.s.c(this.f18654h, kVar.f18654h) && kotlin.jvm.internal.s.c(this.f18655i, kVar.f18655i) && kotlin.jvm.internal.s.c(this.f18656j, kVar.f18656j);
            }
            return false;
        }

        @Override // com.plaid.internal.g6
        public String g() {
            return this.f18649c;
        }

        @Override // com.plaid.internal.g6
        public String h() {
            return this.f18650d;
        }

        public int hashCode() {
            int hashCode = this.f18650d.hashCode();
            int hashCode2 = this.f18651e.hashCode();
            int hashCode3 = this.f18652f.hashCode();
            int hashCode4 = this.f18653g.hashCode();
            int hashCode5 = this.f18654h.hashCode();
            int hashCode6 = this.f18655i.hashCode();
            return this.f18656j.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f18649c.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder a11 = g4.a("Workflow(linkOpenId=");
            a11.append(this.f18649c);
            a11.append(", workflowId=");
            a11.append(this.f18650d);
            a11.append(", continuationToken=");
            a11.append(this.f18651e);
            a11.append(", oauthNonce=");
            a11.append(this.f18652f);
            a11.append(", currentPane=");
            a11.append(this.f18653g);
            a11.append(", additionalPanes=");
            a11.append(this.f18654h);
            a11.append(", backstack=");
            a11.append(this.f18655i);
            a11.append(", requestId=");
            a11.append(this.f18656j);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f18649c);
            out.writeString(this.f18650d);
            out.writeString(this.f18651e);
            out.writeString(this.f18652f);
            out.writeParcelable(this.f18653g, i11);
            List<vd> list = this.f18654h;
            out.writeInt(list.size());
            for (vd vdVar : list) {
                out.writeParcelable(vdVar, i11);
            }
            List<vd> list2 = this.f18655i;
            out.writeInt(list2.size());
            for (vd vdVar2 : list2) {
                out.writeParcelable(vdVar2, i11);
            }
            out.writeString(this.f18656j);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String linkOpenId, String workflowId, String continuationToken, String oauthNonce, vd currentPane, List<vd> additionalPanes, List<vd> backstack, String requestId) {
            super(null);
            kotlin.jvm.internal.s.g(linkOpenId, "linkOpenId");
            kotlin.jvm.internal.s.g(workflowId, "workflowId");
            kotlin.jvm.internal.s.g(continuationToken, "continuationToken");
            kotlin.jvm.internal.s.g(oauthNonce, "oauthNonce");
            kotlin.jvm.internal.s.g(currentPane, "currentPane");
            kotlin.jvm.internal.s.g(additionalPanes, "additionalPanes");
            kotlin.jvm.internal.s.g(backstack, "backstack");
            kotlin.jvm.internal.s.g(requestId, "requestId");
            this.f18649c = linkOpenId;
            this.f18650d = workflowId;
            this.f18651e = continuationToken;
            this.f18652f = oauthNonce;
            this.f18653g = currentPane;
            this.f18654h = additionalPanes;
            this.f18655i = backstack;
            this.f18656j = requestId;
        }
    }

    static {
        vz.k<c30.b<Object>> b11;
        b11 = vz.m.b(kotlin.b.PUBLICATION, b.f18623a);
        f18616b = b11;
    }

    public g6() {
    }

    public /* synthetic */ g6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final void a(g6 self, f30.d output, e30.f serialDesc) {
        kotlin.jvm.internal.s.g(self, "self");
        kotlin.jvm.internal.s.g(output, "output");
        kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
    }

    public final vd f() {
        if (this instanceof a) {
            vd.CREATOR.getClass();
            return vd.f19647e;
        } else if (this instanceof k) {
            return ((k) this).f18653g;
        } else {
            if (this instanceof h) {
                return ((h) this).f18630d;
            }
            if (kotlin.jvm.internal.s.c(this, i.f18640c)) {
                vd.CREATOR.getClass();
                return vd.f19647e;
            } else if (this instanceof d) {
                vd.CREATOR.getClass();
                return vd.f19647e;
            } else if (this instanceof j) {
                vd.CREATOR.getClass();
                return vd.f19647e;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public abstract String g();

    public abstract String h();

    public /* synthetic */ g6(int i11, g30.q1 q1Var) {
    }

    @kotlinx.serialization.a
    /* loaded from: classes2.dex */
    public static final class d extends g6 {
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public final String f18624c;

        /* renamed from: d  reason: collision with root package name */
        public final LinkExit f18625d;

        /* renamed from: e  reason: collision with root package name */
        public final String f18626e;

        /* loaded from: classes2.dex */
        public static final class a implements g30.b0<d> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f18627a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ e30.f f18628b;

            static {
                a aVar = new a();
                f18627a = aVar;
                g30.g1 g1Var = new g30.g1("com.plaid.internal.workflow.model.LinkState.Exit", aVar, 2);
                g1Var.k("workflowId", false);
                g1Var.k("linkOpenId", true);
                f18628b = g1Var;
            }

            @Override // g30.b0
            public KSerializer<?>[] childSerializers() {
                g30.u1 u1Var = g30.u1.f27647a;
                return new c30.b[]{u1Var, u1Var};
            }

            @Override // c30.a
            public Object deserialize(f30.e decoder) {
                String str;
                String str2;
                int i11;
                kotlin.jvm.internal.s.g(decoder, "decoder");
                e30.f fVar = f18628b;
                f30.c b11 = decoder.b(fVar);
                if (b11.n()) {
                    str = b11.i(fVar, 0);
                    str2 = b11.i(fVar, 1);
                    i11 = 3;
                } else {
                    str = null;
                    String str3 = null;
                    int i12 = 0;
                    boolean z11 = true;
                    while (z11) {
                        int p11 = b11.p(fVar);
                        if (p11 == -1) {
                            z11 = false;
                        } else if (p11 == 0) {
                            str = b11.i(fVar, 0);
                            i12 |= 1;
                        } else if (p11 != 1) {
                            throw new UnknownFieldException(p11);
                        } else {
                            str3 = b11.i(fVar, 1);
                            i12 |= 2;
                        }
                    }
                    str2 = str3;
                    i11 = i12;
                }
                b11.d(fVar);
                return new d(i11, str, str2, null);
            }

            @Override // c30.b, c30.h, c30.a
            public e30.f getDescriptor() {
                return f18628b;
            }

            @Override // c30.h
            public void serialize(f30.f encoder, Object obj) {
                d self = (d) obj;
                kotlin.jvm.internal.s.g(encoder, "encoder");
                kotlin.jvm.internal.s.g(self, "value");
                e30.f serialDesc = f18628b;
                f30.d output = encoder.b(serialDesc);
                Parcelable.Creator<d> creator = d.CREATOR;
                kotlin.jvm.internal.s.g(self, "self");
                kotlin.jvm.internal.s.g(output, "output");
                kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
                g6.a(self, output, serialDesc);
                boolean z11 = false;
                output.p(serialDesc, 0, self.f18624c);
                if (output.k(serialDesc, 1) || !kotlin.jvm.internal.s.c(self.f18626e, "")) {
                    z11 = true;
                }
                if (z11) {
                    output.p(serialDesc, 1, self.f18626e);
                }
                output.d(serialDesc);
            }

            @Override // g30.b0
            public KSerializer<?>[] typeParametersSerializers() {
                return b0.a.a(this);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new d(parcel.readString(), LinkExit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(int i11, String str, String str2, g30.q1 q1Var) {
            super(i11, null);
            if (1 != (i11 & 1)) {
                g30.f1.a(i11, 1, a.f18627a.getDescriptor());
            }
            this.f18624c = str;
            e6 e6Var = e6.f18523a;
            this.f18625d = e6Var.a((LinkError) null, e6.a(e6Var, null, null, null, null, null, null, 31));
            if ((i11 & 2) == 0) {
                this.f18626e = "";
            } else {
                this.f18626e = str2;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(this.f18624c, dVar.f18624c) && kotlin.jvm.internal.s.c(this.f18625d, dVar.f18625d);
            }
            return false;
        }

        @Override // com.plaid.internal.g6
        public String g() {
            return this.f18626e;
        }

        @Override // com.plaid.internal.g6
        public String h() {
            return this.f18624c;
        }

        public int hashCode() {
            return this.f18625d.hashCode() + (this.f18624c.hashCode() * 31);
        }

        public String toString() {
            StringBuilder a11 = g4.a("Exit(workflowId=");
            a11.append(this.f18624c);
            a11.append(", linkExit=");
            a11.append(this.f18625d);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f18624c);
            this.f18625d.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String workflowId, LinkExit linkExit) {
            super(null);
            kotlin.jvm.internal.s.g(workflowId, "workflowId");
            kotlin.jvm.internal.s.g(linkExit, "linkExit");
            this.f18624c = workflowId;
            this.f18625d = linkExit;
            this.f18626e = "";
        }
    }

    @kotlinx.serialization.a
    /* loaded from: classes2.dex */
    public static final class a extends g6 implements f {
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public final String f18617c;

        /* renamed from: d  reason: collision with root package name */
        public final LinkPublicKeyConfiguration f18618d;

        /* renamed from: e  reason: collision with root package name */
        public final String f18619e;

        /* renamed from: f  reason: collision with root package name */
        public final String f18620f;

        /* renamed from: com.plaid.internal.g6$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0340a implements g30.b0<a> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0340a f18621a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ e30.f f18622b;

            static {
                C0340a c0340a = new C0340a();
                f18621a = c0340a;
                g30.g1 g1Var = new g30.g1("com.plaid.internal.workflow.model.LinkState.BeforeLinkOpen", c0340a, 3);
                g1Var.k("linkOpenId", false);
                g1Var.k("workflowId", true);
                g1Var.k("oauthNonce", true);
                f18622b = g1Var;
            }

            @Override // g30.b0
            public KSerializer<?>[] childSerializers() {
                g30.u1 u1Var = g30.u1.f27647a;
                return new c30.b[]{u1Var, u1Var, u1Var};
            }

            @Override // c30.a
            public Object deserialize(f30.e decoder) {
                String str;
                String str2;
                String str3;
                int i11;
                kotlin.jvm.internal.s.g(decoder, "decoder");
                e30.f fVar = f18622b;
                f30.c b11 = decoder.b(fVar);
                if (b11.n()) {
                    String i12 = b11.i(fVar, 0);
                    String i13 = b11.i(fVar, 1);
                    str = i12;
                    str2 = b11.i(fVar, 2);
                    str3 = i13;
                    i11 = 7;
                } else {
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    int i14 = 0;
                    boolean z11 = true;
                    while (z11) {
                        int p11 = b11.p(fVar);
                        if (p11 == -1) {
                            z11 = false;
                        } else if (p11 == 0) {
                            str4 = b11.i(fVar, 0);
                            i14 |= 1;
                        } else if (p11 == 1) {
                            str6 = b11.i(fVar, 1);
                            i14 |= 2;
                        } else if (p11 != 2) {
                            throw new UnknownFieldException(p11);
                        } else {
                            str5 = b11.i(fVar, 2);
                            i14 |= 4;
                        }
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    i11 = i14;
                }
                b11.d(fVar);
                return new a(i11, str, str3, str2, null);
            }

            @Override // c30.b, c30.h, c30.a
            public e30.f getDescriptor() {
                return f18622b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
                if (kotlin.jvm.internal.s.c(r4, r5) == false) goto L17;
             */
            @Override // c30.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void serialize(f30.f r8, java.lang.Object r9) {
                /*
                    r7 = this;
                    com.plaid.internal.g6$a r9 = (com.plaid.internal.g6.a) r9
                    java.lang.String r0 = "encoder"
                    kotlin.jvm.internal.s.g(r8, r0)
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.s.g(r9, r0)
                    e30.f r0 = com.plaid.internal.g6.a.C0340a.f18622b
                    f30.d r8 = r8.b(r0)
                    android.os.Parcelable$Creator<com.plaid.internal.g6$a> r1 = com.plaid.internal.g6.a.CREATOR
                    java.lang.String r1 = "self"
                    kotlin.jvm.internal.s.g(r9, r1)
                    java.lang.String r1 = "output"
                    kotlin.jvm.internal.s.g(r8, r1)
                    java.lang.String r1 = "serialDesc"
                    kotlin.jvm.internal.s.g(r0, r1)
                    com.plaid.internal.g6.a(r9, r8, r0)
                    java.lang.String r1 = r9.f18617c
                    r2 = 0
                    r8.p(r0, r2, r1)
                    r1 = 1
                    boolean r3 = r8.k(r0, r1)
                    if (r3 == 0) goto L34
                    goto L3e
                L34:
                    java.lang.String r3 = r9.f18619e
                    java.lang.String r4 = ""
                    boolean r3 = kotlin.jvm.internal.s.c(r3, r4)
                    if (r3 != 0) goto L40
                L3e:
                    r3 = r1
                    goto L41
                L40:
                    r3 = r2
                L41:
                    if (r3 == 0) goto L48
                    java.lang.String r3 = r9.f18619e
                    r8.p(r0, r1, r3)
                L48:
                    r3 = 2
                    boolean r4 = r8.k(r0, r3)
                    if (r4 == 0) goto L50
                    goto L65
                L50:
                    java.lang.String r4 = r9.f18620f
                    java.util.UUID r5 = java.util.UUID.randomUUID()
                    java.lang.String r5 = r5.toString()
                    java.lang.String r6 = "randomUUID().toString()"
                    kotlin.jvm.internal.s.f(r5, r6)
                    boolean r4 = kotlin.jvm.internal.s.c(r4, r5)
                    if (r4 != 0) goto L66
                L65:
                    r2 = r1
                L66:
                    if (r2 == 0) goto L6d
                    java.lang.String r9 = r9.f18620f
                    r8.p(r0, r3, r9)
                L6d:
                    r8.d(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.g6.a.C0340a.serialize(f30.f, java.lang.Object):void");
            }

            @Override // g30.b0
            public KSerializer<?>[] typeParametersSerializers() {
                return b0.a.a(this);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new a(parcel.readString(), LinkPublicKeyConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i11, String str, String str2, String str3, g30.q1 q1Var) {
            super(i11, null);
            if (1 != (i11 & 1)) {
                g30.f1.a(i11, 1, C0340a.f18621a.getDescriptor());
            }
            this.f18617c = str;
            this.f18618d = new LinkPublicKeyConfiguration.Builder().build();
            if ((i11 & 2) == 0) {
                this.f18619e = "";
            } else {
                this.f18619e = str2;
            }
            if ((i11 & 4) != 0) {
                this.f18620f = str3;
                return;
            }
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.f(uuid, "randomUUID().toString()");
            this.f18620f = uuid;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.plaid.internal.g6.f
        public String e() {
            return this.f18620f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(this.f18617c, aVar.f18617c) && kotlin.jvm.internal.s.c(this.f18618d, aVar.f18618d);
            }
            return false;
        }

        @Override // com.plaid.internal.g6
        public String g() {
            return this.f18617c;
        }

        @Override // com.plaid.internal.g6
        public String h() {
            return this.f18619e;
        }

        public int hashCode() {
            return this.f18618d.hashCode() + (this.f18617c.hashCode() * 31);
        }

        public String toString() {
            StringBuilder a11 = g4.a("BeforeLinkOpen(linkOpenId=");
            a11.append(this.f18617c);
            a11.append(", configuration=");
            a11.append(this.f18618d);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f18617c);
            this.f18618d.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String linkOpenId, LinkPublicKeyConfiguration configuration) {
            super(null);
            kotlin.jvm.internal.s.g(linkOpenId, "linkOpenId");
            kotlin.jvm.internal.s.g(configuration, "configuration");
            this.f18617c = linkOpenId;
            this.f18618d = configuration;
            this.f18619e = "";
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.f(uuid, "randomUUID().toString()");
            this.f18620f = uuid;
        }
    }
}
package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import g30.b0;
import java.util.Objects;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

@kotlinx.serialization.a
/* loaded from: classes2.dex */
public final class vd implements Parcelable {
    public static final b CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final vd f19647e = new vd("unknown", "unknown", "unknown");

    /* renamed from: a  reason: collision with root package name */
    public final String f19648a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19649b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19650c;

    /* renamed from: d  reason: collision with root package name */
    public final vz.k f19651d;

    /* loaded from: classes2.dex */
    public static final class a implements g30.b0<vd> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19652a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ e30.f f19653b;

        static {
            a aVar = new a();
            f19652a = aVar;
            g30.g1 g1Var = new g30.g1("com.plaid.internal.workflow.model.WorkflowPaneId", aVar, 3);
            g1Var.k("workflowId", false);
            g1Var.k("paneRenderingId", false);
            g1Var.k("paneNodeId", false);
            f19653b = g1Var;
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
            e30.f fVar = f19653b;
            f30.c b11 = decoder.b(fVar);
            if (b11.n()) {
                str = b11.i(fVar, 0);
                str3 = b11.i(fVar, 1);
                str2 = b11.i(fVar, 2);
                i11 = 7;
            } else {
                str = null;
                String str4 = null;
                String str5 = null;
                int i12 = 0;
                boolean z11 = true;
                while (z11) {
                    int p11 = b11.p(fVar);
                    if (p11 == -1) {
                        z11 = false;
                    } else if (p11 == 0) {
                        str = b11.i(fVar, 0);
                        i12 |= 1;
                    } else if (p11 == 1) {
                        str5 = b11.i(fVar, 1);
                        i12 |= 2;
                    } else if (p11 != 2) {
                        throw new UnknownFieldException(p11);
                    } else {
                        str4 = b11.i(fVar, 2);
                        i12 |= 4;
                    }
                }
                str2 = str4;
                str3 = str5;
                i11 = i12;
            }
            b11.d(fVar);
            return new vd(i11, str, str3, str2);
        }

        @Override // c30.b, c30.h, c30.a
        public e30.f getDescriptor() {
            return f19653b;
        }

        @Override // c30.h
        public void serialize(f30.f encoder, Object obj) {
            vd self = (vd) obj;
            kotlin.jvm.internal.s.g(encoder, "encoder");
            kotlin.jvm.internal.s.g(self, "value");
            e30.f serialDesc = f19653b;
            f30.d output = encoder.b(serialDesc);
            b bVar = vd.CREATOR;
            kotlin.jvm.internal.s.g(self, "self");
            kotlin.jvm.internal.s.g(output, "output");
            kotlin.jvm.internal.s.g(serialDesc, "serialDesc");
            output.p(serialDesc, 0, self.f19648a);
            output.p(serialDesc, 1, self.f19649b);
            output.p(serialDesc, 2, self.f19650c);
            output.d(serialDesc);
        }

        @Override // g30.b0
        public KSerializer<?>[] typeParametersSerializers() {
            return b0.a.a(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<vd> {
        public final vd a(Pane$PaneRendering pane$PaneRendering, String workflowId) {
            kotlin.jvm.internal.s.g(pane$PaneRendering, "<this>");
            kotlin.jvm.internal.s.g(workflowId, "workflowId");
            String id2 = pane$PaneRendering.getId();
            kotlin.jvm.internal.s.f(id2, "this.id");
            String paneNodeId = pane$PaneRendering.getPaneNodeId();
            kotlin.jvm.internal.s.f(paneNodeId, "this.paneNodeId");
            return new vd(workflowId, id2, paneNodeId);
        }

        @Override // android.os.Parcelable.Creator
        public vd createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            kotlin.jvm.internal.s.g(parcel, "parcel");
            String readString = parcel.readString();
            Objects.requireNonNull(readString, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.WorkflowId }");
            String readString2 = parcel.readString();
            Objects.requireNonNull(readString2, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneRenderingId }");
            String readString3 = parcel.readString();
            Objects.requireNonNull(readString3, "null cannot be cast to non-null type kotlin.String{ com.plaid.internal.workflow.model.WorkflowPaneIdKt.PaneNodeId }");
            return new vd(readString, readString2, readString3);
        }

        @Override // android.os.Parcelable.Creator
        public vd[] newArray(int i11) {
            return new vd[i11];
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<String> {
        public c() {
            super(0);
        }

        @Override // h00.a
        public String invoke() {
            return vd.this.f19648a + CoreConstants.COLON_CHAR + vd.this.f19649b;
        }
    }

    public /* synthetic */ vd(int i11, String str, String str2, String str3) {
        vz.k a11;
        if (7 != (i11 & 7)) {
            g30.f1.a(i11, 7, a.f19652a.getDescriptor());
        }
        this.f19648a = str;
        this.f19649b = str2;
        this.f19650c = str3;
        a11 = vz.m.a(new wd(this));
        this.f19651d = a11;
    }

    public final String a() {
        return (String) this.f19651d.getValue();
    }

    public final String b() {
        return this.f19648a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vd) {
            vd vdVar = (vd) obj;
            return kotlin.jvm.internal.s.c(this.f19648a, vdVar.f19648a) && kotlin.jvm.internal.s.c(this.f19649b, vdVar.f19649b) && kotlin.jvm.internal.s.c(this.f19650c, vdVar.f19650c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f19649b.hashCode();
        return this.f19650c.hashCode() + ((hashCode + (this.f19648a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("WorkflowPaneId(workflowId=");
        a11.append(this.f19648a);
        a11.append(", paneRenderingId=");
        a11.append(this.f19649b);
        a11.append(", paneNodeId=");
        a11.append(this.f19650c);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        kotlin.jvm.internal.s.g(parcel, "parcel");
        parcel.writeString(this.f19648a);
        parcel.writeString(this.f19649b);
        parcel.writeString(this.f19650c);
    }

    public vd(String str, String str2, String str3) {
        vz.k a11;
        this.f19648a = str;
        this.f19649b = str2;
        this.f19650c = str3;
        a11 = vz.m.a(new c());
        this.f19651d = a11;
    }
}
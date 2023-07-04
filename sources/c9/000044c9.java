package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class nd {

    /* renamed from: a  reason: collision with root package name */
    public final String f19101a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19102b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19103c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19104d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19105e;

    /* renamed from: f  reason: collision with root package name */
    public final h00.a<String> f19106f;

    /* renamed from: g  reason: collision with root package name */
    public final vz.k f19107g;

    /* renamed from: h  reason: collision with root package name */
    public final vz.k f19108h;

    /* renamed from: i  reason: collision with root package name */
    public final vz.k f19109i;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<Locale> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19110a = new a();

        public a() {
            super(0);
        }

        @Override // h00.a
        public Locale invoke() {
            return Locale.getDefault();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<Configuration$DeviceMetadata> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e3 f19111a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ nd f19112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e3 e3Var, nd ndVar) {
            super(0);
            this.f19111a = e3Var;
            this.f19112b = ndVar;
        }

        @Override // h00.a
        public Configuration$DeviceMetadata invoke() {
            Configuration$DeviceMetadata.a newBuilder = Configuration$DeviceMetadata.newBuilder();
            e3 e3Var = this.f19111a;
            nd ndVar = this.f19112b;
            newBuilder.d(e3Var.f());
            newBuilder.e(e3Var.h());
            newBuilder.f(e3Var.a());
            newBuilder.g(e3Var.g());
            newBuilder.c(nd.a(ndVar).toLanguageTag());
            newBuilder.a(((Locale) ndVar.f19107g.getValue()).getCountry());
            newBuilder.b(((Locale) ndVar.f19107g.getValue()).getLanguage());
            return newBuilder.build();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<Configuration$SDKMetadata> {
        public c() {
            super(0);
        }

        @Override // h00.a
        public Configuration$SDKMetadata invoke() {
            Configuration$SDKMetadata.a newBuilder = Configuration$SDKMetadata.newBuilder();
            nd ndVar = nd.this;
            newBuilder.a(q1.CLIENT_TYPE_ANDROID);
            newBuilder.c(ndVar.f19101a);
            newBuilder.b("56582c89a1");
            newBuilder.a(ndVar.f19104d);
            if (ndVar.f19102b != null) {
                newBuilder.a(Configuration$SDKMetadata.WrappingSDK.newBuilder().a(q1.CLIENT_TYPE_REACTNATIVEANDROID).a(ndVar.f19102b).build());
            }
            return newBuilder.build();
        }
    }

    public nd(e3 deviceInfo, String androidVersionName, String str, String str2, String packageName, String linkRedirectUrl, h00.a<String> workflowVersionOverride) {
        vz.k a11;
        vz.k a12;
        vz.k a13;
        kotlin.jvm.internal.s.g(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.s.g(androidVersionName, "androidVersionName");
        kotlin.jvm.internal.s.g(packageName, "packageName");
        kotlin.jvm.internal.s.g(linkRedirectUrl, "linkRedirectUrl");
        kotlin.jvm.internal.s.g(workflowVersionOverride, "workflowVersionOverride");
        this.f19101a = androidVersionName;
        this.f19102b = str;
        this.f19103c = str2;
        this.f19104d = packageName;
        this.f19105e = linkRedirectUrl;
        this.f19106f = workflowVersionOverride;
        a11 = vz.m.a(a.f19110a);
        this.f19107g = a11;
        a12 = vz.m.a(new b(deviceInfo, this));
        this.f19108h = a12;
        a13 = vz.m.a(new c());
        this.f19109i = a13;
    }

    public static final Locale a(nd ndVar) {
        return (Locale) ndVar.f19107g.getValue();
    }

    public final Workflow$LinkWorkflowStartRequest.a a() {
        Workflow$LinkWorkflowStartRequest.a a11 = Workflow$LinkWorkflowStartRequest.newBuilder().a((Configuration$SDKMetadata) this.f19109i.getValue()).a((Configuration$DeviceMetadata) this.f19108h.getValue());
        String invoke = this.f19106f.invoke();
        if (invoke == null) {
            invoke = "";
        }
        return a11.a(invoke);
    }
}
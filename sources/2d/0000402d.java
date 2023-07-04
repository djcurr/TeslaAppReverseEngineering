package com.plaid.internal.core.networking.models;

import kotlin.jvm.internal.u;
import kotlin.text.v;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class a extends u implements h00.a<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ResponseBody f18279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ResponseBody responseBody) {
        super(0);
        this.f18279a = responseBody;
    }

    @Override // h00.a
    public String invoke() {
        String string;
        String D;
        try {
            ResponseBody responseBody = this.f18279a;
            if (responseBody != null && (string = responseBody.string()) != null) {
                D = v.D(string, "\n", " ", false, 4, null);
                return D == null ? "unknown" : D;
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }
}
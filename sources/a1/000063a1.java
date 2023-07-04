package com.withpersona.sdk.inquiry.network;

import android.os.Build;
import com.squareup.moshi.f;
import com.squareup.moshi.p;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003H\u0007J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0007H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J@\u0010\u0013\u001a\u00020\u00122\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u000b2\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\f0\u000bH\u0007J%\u0010\u0018\u001a\u00020\u00172\u000b\u0010\u0015\u001a\u00070\u0002¢\u0006\u0002\b\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk/inquiry/network/NetworkModule;", "", "", "Lcom/withpersona/sdk/inquiry/network/HttpHeader;", "keyInflection", "Lokhttp3/Interceptor;", "interceptor", "", "headers", "Lokhttp3/OkHttpClient;", "okhttpClient", "", "Lcom/withpersona/sdk/inquiry/network/MoshiJsonAdapter;", "jsonAdapters", "Lcom/withpersona/sdk/inquiry/network/JsonAdapterBinding;", "jsonAdapterBindings", "Lcom/squareup/moshi/f$d;", "jsonAdapterFactory", "Lcom/squareup/moshi/p;", "moshi", "Lcom/withpersona/sdk/inquiry/network/ServerEndpoint;", "serverEndpoint", "okHttpClient", "Lretrofit2/t;", "retrofit", "<init>", "()V", "network_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class NetworkModule {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: interceptor$lambda-2  reason: not valid java name */
    public static final Response m586interceptor$lambda2(Interceptor.Chain chain) {
        try {
            return chain.proceed(chain.request());
        } catch (ConnectException e11) {
            Response.Builder code = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(500);
            String localizedMessage = e11.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            Response.Builder message = code.message(localizedMessage);
            MediaType mediaType = MediaType.get("text/plain");
            String localizedMessage2 = e11.getLocalizedMessage();
            return message.body(ResponseBody.create(mediaType, localizedMessage2 != null ? localizedMessage2 : "")).build();
        } catch (SocketTimeoutException e12) {
            Response.Builder code2 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(500);
            String localizedMessage3 = e12.getLocalizedMessage();
            if (localizedMessage3 == null) {
                localizedMessage3 = "";
            }
            Response.Builder message2 = code2.message(localizedMessage3);
            MediaType mediaType2 = MediaType.get("text/plain");
            String localizedMessage4 = e12.getLocalizedMessage();
            return message2.body(ResponseBody.create(mediaType2, localizedMessage4 != null ? localizedMessage4 : "")).build();
        } catch (UnknownHostException e13) {
            Response.Builder code3 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(500);
            String localizedMessage5 = e13.getLocalizedMessage();
            if (localizedMessage5 == null) {
                localizedMessage5 = "";
            }
            Response.Builder message3 = code3.message(localizedMessage5);
            MediaType mediaType3 = MediaType.get("text/plain");
            String localizedMessage6 = e13.getLocalizedMessage();
            return message3.body(ResponseBody.create(mediaType3, localizedMessage6 != null ? localizedMessage6 : "")).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: okhttpClient$lambda-1  reason: not valid java name */
    public static final Response m587okhttpClient$lambda1(Map headers, Interceptor.Chain chain) {
        s.g(headers, "$headers");
        Request.Builder newBuilder = chain.request().newBuilder();
        if (!chain.request().headers().names().contains(NetworkConstantsKt.HEADER_ACCEPT)) {
            newBuilder = newBuilder.header(NetworkConstantsKt.HEADER_ACCEPT, "application/json");
        }
        Request.Builder header = newBuilder.header("Persona-Version", "2020-11-29").header("Persona-Device-Manufacturer", Build.MANUFACTURER).header("Persona-Device-Model", Build.MODEL).header("Persona-Device-OS", "Android").header("Persona-Device-OS-Version", Build.VERSION.RELEASE).header("Persona-Device-Locale", Locale.getDefault().toString());
        for (Map.Entry entry : headers.entrySet()) {
            header.header((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.proceed(header.build());
    }

    public final Interceptor interceptor() {
        return new Interceptor() { // from class: com.withpersona.sdk.inquiry.network.b
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response m586interceptor$lambda2;
                m586interceptor$lambda2 = NetworkModule.m586interceptor$lambda2(chain);
                return m586interceptor$lambda2;
            }
        };
    }

    public final String keyInflection() {
        return "camel";
    }

    public final p moshi(Set<Object> jsonAdapters, Set<JsonAdapterBinding<?>> jsonAdapterBindings, Set<f.d> jsonAdapterFactory) {
        s.g(jsonAdapters, "jsonAdapters");
        s.g(jsonAdapterBindings, "jsonAdapterBindings");
        s.g(jsonAdapterFactory, "jsonAdapterFactory");
        p.b bVar = new p.b();
        for (Object obj : jsonAdapters) {
            bVar.b(obj);
        }
        Iterator<T> it2 = jsonAdapterBindings.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            bVar.c(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        for (f.d dVar : jsonAdapterFactory) {
            bVar.a(dVar);
        }
        p d11 = bVar.d();
        s.f(d11, "Builder()\n    .also { bu….add(it) } }\n    .build()");
        return d11;
    }

    public final OkHttpClient okhttpClient(Interceptor interceptor, final Map<String, String> headers) {
        s.g(interceptor, "interceptor");
        s.g(headers, "headers");
        OkHttpClient.Builder addNetworkInterceptor = new OkHttpClient.Builder().addNetworkInterceptor(new Interceptor() { // from class: com.withpersona.sdk.inquiry.network.a
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response m587okhttpClient$lambda1;
                m587okhttpClient$lambda1 = NetworkModule.m587okhttpClient$lambda1(headers, chain);
                return m587okhttpClient$lambda1;
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OkHttpClient build = addNetworkInterceptor.readTimeout(1L, timeUnit).connectTimeout(1L, timeUnit).addInterceptor(interceptor).build();
        s.f(build, "Builder()\n    .addNetwor…interceptor)\n    .build()");
        return build;
    }

    public final t retrofit(String serverEndpoint, OkHttpClient okHttpClient, p moshi) {
        s.g(serverEndpoint, "serverEndpoint");
        s.g(okHttpClient, "okHttpClient");
        s.g(moshi, "moshi");
        t e11 = new t.b().g(okHttpClient).c(serverEndpoint).b(k80.a.g(moshi)).e();
        s.f(e11, "Builder()\n    .client(ok…eate(moshi))\n    .build()");
        return e11;
    }
}
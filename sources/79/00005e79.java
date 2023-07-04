package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import expo.modules.constants.ExponentInstallationId;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a  reason: collision with root package name */
    private String f21337a;

    /* renamed from: b  reason: collision with root package name */
    private String f21338b;

    /* renamed from: c  reason: collision with root package name */
    private String f21339c;

    /* renamed from: d  reason: collision with root package name */
    private String f21340d;

    /* renamed from: e  reason: collision with root package name */
    private String f21341e;

    /* renamed from: f  reason: collision with root package name */
    private OAuthListener f21342f;

    /* renamed from: g  reason: collision with root package name */
    private c f21343g;

    /* loaded from: classes6.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public OAuthErrCode f21344a;

        /* renamed from: b  reason: collision with root package name */
        public String f21345b;

        /* renamed from: c  reason: collision with root package name */
        public String f21346c;

        /* renamed from: d  reason: collision with root package name */
        public String f21347d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f21348e;

        private a() {
        }

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String format;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i11 = jSONObject.getInt("errcode");
                        if (i11 != 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i11)));
                            aVar.f21344a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string != null && string.length() != 0) {
                            byte[] decode = Base64.decode(string, 0);
                            if (decode != null && decode.length != 0) {
                                aVar.f21344a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f21348e = decode;
                                aVar.f21345b = jSONObject.getString(ExponentInstallationId.LEGACY_UUID_KEY);
                                String string2 = jSONObject.getString("appname");
                                aVar.f21346c = string2;
                                Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f21345b, string2, Integer.valueOf(aVar.f21348e.length)));
                                return aVar;
                            }
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                            aVar.f21344a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                            return aVar;
                        }
                        Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        aVar.f21344a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e11) {
                        format = String.format("parse json fail, ex = %s", e11.getMessage());
                        Log.e("MicroMsg.SDK.GetQRCodeResult", format);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f21344a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e12) {
                    format = String.format("parse fail, build String fail, ex = %s", e12.getMessage());
                }
            }
            aVar.f21344a = oAuthErrCode;
            return aVar;
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f21337a = str;
        this.f21338b = str2;
        this.f21339c = str3;
        this.f21340d = str4;
        this.f21341e = str5;
        this.f21342f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.f21343g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String format = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f21337a, this.f21339c, this.f21340d, this.f21338b, this.f21341e);
        long currentTimeMillis = System.currentTimeMillis();
        byte[] a11 = com.tencent.mm.opensdk.channel.a.a.a(format, 60000);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", format, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        return a.a(a11);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f21344a;
        if (oAuthErrCode == OAuthErrCode.WechatAuth_Err_OK) {
            Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f21348e.length);
            this.f21342f.onAuthGotQrcode(aVar2.f21347d, aVar2.f21348e);
            c cVar = new c(aVar2.f21345b, this.f21342f);
            this.f21343g = cVar;
            if (Build.VERSION.SDK_INT >= 11) {
                cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            } else {
                cVar.execute(new Void[0]);
                return;
            }
        }
        Log.e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
        this.f21342f.onAuthFinish(aVar2.f21344a, null);
    }
}
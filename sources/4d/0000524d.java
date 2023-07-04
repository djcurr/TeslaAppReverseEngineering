package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.utils.StripeUrlUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public interface StripeIntent extends StripeModel {

    /* loaded from: classes6.dex */
    public static abstract class NextActionData implements StripeModel {
        public static final int $stable = 0;

        /* loaded from: classes6.dex */
        public static final class AlipayRedirect extends NextActionData {
            private final String authCompleteUrl;
            private final String data;
            private final String returnUrl;
            private final Uri webViewUrl;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<AlipayRedirect> CREATOR = new Creator();

            /* JADX INFO: Access modifiers changed from: private */
            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final String extractReturnUrl(String str) {
                    Object b11;
                    try {
                        q.a aVar = q.f54772b;
                        String queryParameter = Uri.parse(s.p("alipay://url?", str)).getQueryParameter("return_url");
                        if (queryParameter == null || !StripeUrlUtils.INSTANCE.isStripeUrl$payments_core_release(queryParameter)) {
                            queryParameter = null;
                        }
                        b11 = q.b(queryParameter);
                    } catch (Throwable th2) {
                        q.a aVar2 = q.f54772b;
                        b11 = q.b(r.a(th2));
                    }
                    return q.g(b11) ? null : b11;
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<AlipayRedirect> {
                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new AlipayRedirect(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(AlipayRedirect.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AlipayRedirect[] newArray(int i11) {
                    return new AlipayRedirect[i11];
                }
            }

            public /* synthetic */ AlipayRedirect(String str, String str2, Uri uri, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, uri, (i11 & 8) != 0 ? null : str3);
            }

            public static /* synthetic */ AlipayRedirect copy$default(AlipayRedirect alipayRedirect, String str, String str2, Uri uri, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = alipayRedirect.data;
                }
                if ((i11 & 2) != 0) {
                    str2 = alipayRedirect.authCompleteUrl;
                }
                if ((i11 & 4) != 0) {
                    uri = alipayRedirect.webViewUrl;
                }
                if ((i11 & 8) != 0) {
                    str3 = alipayRedirect.returnUrl;
                }
                return alipayRedirect.copy(str, str2, uri, str3);
            }

            public final String component1() {
                return this.data;
            }

            public final String component2() {
                return this.authCompleteUrl;
            }

            public final Uri component3() {
                return this.webViewUrl;
            }

            public final String component4() {
                return this.returnUrl;
            }

            public final AlipayRedirect copy(String data, String str, Uri webViewUrl, String str2) {
                s.g(data, "data");
                s.g(webViewUrl, "webViewUrl");
                return new AlipayRedirect(data, str, webViewUrl, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AlipayRedirect) {
                    AlipayRedirect alipayRedirect = (AlipayRedirect) obj;
                    return s.c(this.data, alipayRedirect.data) && s.c(this.authCompleteUrl, alipayRedirect.authCompleteUrl) && s.c(this.webViewUrl, alipayRedirect.webViewUrl) && s.c(this.returnUrl, alipayRedirect.returnUrl);
                }
                return false;
            }

            public final String getAuthCompleteUrl() {
                return this.authCompleteUrl;
            }

            public final String getData() {
                return this.data;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final Uri getWebViewUrl() {
                return this.webViewUrl;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = this.data.hashCode() * 31;
                String str = this.authCompleteUrl;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.webViewUrl.hashCode()) * 31;
                String str2 = this.returnUrl;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.data + ", authCompleteUrl=" + ((Object) this.authCompleteUrl) + ", webViewUrl=" + this.webViewUrl + ", returnUrl=" + ((Object) this.returnUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.data);
                out.writeString(this.authCompleteUrl);
                out.writeParcelable(this.webViewUrl, i11);
                out.writeString(this.returnUrl);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AlipayRedirect(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                s.g(data, "data");
                s.g(webViewUrl, "webViewUrl");
                this.data = data;
                this.authCompleteUrl = str;
                this.webViewUrl = webViewUrl;
                this.returnUrl = str2;
            }

            public /* synthetic */ AlipayRedirect(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? null : str3);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public AlipayRedirect(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r2 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.s.g(r3, r0)
                    java.lang.String r0 = "webViewUrl"
                    kotlin.jvm.internal.s.g(r4, r0)
                    com.stripe.android.model.StripeIntent$NextActionData$AlipayRedirect$Companion r0 = com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect.Companion
                    java.lang.String r0 = com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect.Companion.access$extractReturnUrl(r0, r3)
                    android.net.Uri r4 = android.net.Uri.parse(r4)
                    java.lang.String r1 = "parse(webViewUrl)"
                    kotlin.jvm.internal.s.f(r4, r1)
                    r2.<init>(r3, r0, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect.<init>(java.lang.String, java.lang.String, java.lang.String):void");
            }
        }

        /* loaded from: classes6.dex */
        public static final class BlikAuthorize extends NextActionData {
            public static final BlikAuthorize INSTANCE = new BlikAuthorize();
            public static final Parcelable.Creator<BlikAuthorize> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<BlikAuthorize> {
                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BlikAuthorize.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final BlikAuthorize[] newArray(int i11) {
                    return new BlikAuthorize[i11];
                }
            }

            private BlikAuthorize() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes6.dex */
        public static final class DisplayOxxoDetails extends NextActionData {
            private final int expiresAfter;
            private final String hostedVoucherUrl;
            private final String number;
            public static final Parcelable.Creator<DisplayOxxoDetails> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<DisplayOxxoDetails> {
                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new DisplayOxxoDetails(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DisplayOxxoDetails[] newArray(int i11) {
                    return new DisplayOxxoDetails[i11];
                }
            }

            public DisplayOxxoDetails() {
                this(0, null, null, 7, null);
            }

            public /* synthetic */ DisplayOxxoDetails(int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
            }

            public static /* synthetic */ DisplayOxxoDetails copy$default(DisplayOxxoDetails displayOxxoDetails, int i11, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = displayOxxoDetails.expiresAfter;
                }
                if ((i12 & 2) != 0) {
                    str = displayOxxoDetails.number;
                }
                if ((i12 & 4) != 0) {
                    str2 = displayOxxoDetails.hostedVoucherUrl;
                }
                return displayOxxoDetails.copy(i11, str, str2);
            }

            public final int component1() {
                return this.expiresAfter;
            }

            public final String component2() {
                return this.number;
            }

            public final String component3() {
                return this.hostedVoucherUrl;
            }

            public final DisplayOxxoDetails copy(int i11, String str, String str2) {
                return new DisplayOxxoDetails(i11, str, str2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof DisplayOxxoDetails) {
                    DisplayOxxoDetails displayOxxoDetails = (DisplayOxxoDetails) obj;
                    return this.expiresAfter == displayOxxoDetails.expiresAfter && s.c(this.number, displayOxxoDetails.number) && s.c(this.hostedVoucherUrl, displayOxxoDetails.hostedVoucherUrl);
                }
                return false;
            }

            public final int getExpiresAfter() {
                return this.expiresAfter;
            }

            public final String getHostedVoucherUrl() {
                return this.hostedVoucherUrl;
            }

            public final String getNumber() {
                return this.number;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = Integer.hashCode(this.expiresAfter) * 31;
                String str = this.number;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.hostedVoucherUrl;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.expiresAfter + ", number=" + ((Object) this.number) + ", hostedVoucherUrl=" + ((Object) this.hostedVoucherUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(this.expiresAfter);
                out.writeString(this.number);
                out.writeString(this.hostedVoucherUrl);
            }

            public DisplayOxxoDetails(int i11, String str, String str2) {
                super(null);
                this.expiresAfter = i11;
                this.number = str;
                this.hostedVoucherUrl = str2;
            }
        }

        /* loaded from: classes6.dex */
        public static final class RedirectToUrl extends NextActionData {
            private final String returnUrl;
            private final Uri url;
            public static final Parcelable.Creator<RedirectToUrl> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<RedirectToUrl> {
                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new RedirectToUrl((Uri) parcel.readParcelable(RedirectToUrl.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final RedirectToUrl[] newArray(int i11) {
                    return new RedirectToUrl[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RedirectToUrl(Uri url, String str) {
                super(null);
                s.g(url, "url");
                this.url = url;
                this.returnUrl = str;
            }

            public static /* synthetic */ RedirectToUrl copy$default(RedirectToUrl redirectToUrl, Uri uri, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    uri = redirectToUrl.url;
                }
                if ((i11 & 2) != 0) {
                    str = redirectToUrl.returnUrl;
                }
                return redirectToUrl.copy(uri, str);
            }

            public final Uri component1() {
                return this.url;
            }

            public final String component2() {
                return this.returnUrl;
            }

            public final RedirectToUrl copy(Uri url, String str) {
                s.g(url, "url");
                return new RedirectToUrl(url, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RedirectToUrl) {
                    RedirectToUrl redirectToUrl = (RedirectToUrl) obj;
                    return s.c(this.url, redirectToUrl.url) && s.c(this.returnUrl, redirectToUrl.returnUrl);
                }
                return false;
            }

            public final String getReturnUrl() {
                return this.returnUrl;
            }

            public final Uri getUrl() {
                return this.url;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                String str = this.returnUrl;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.url + ", returnUrl=" + ((Object) this.returnUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeParcelable(this.url, i11);
                out.writeString(this.returnUrl);
            }
        }

        /* loaded from: classes6.dex */
        public static abstract class SdkData extends NextActionData {
            public static final int $stable = 0;

            /* loaded from: classes6.dex */
            public static final class Use3DS1 extends SdkData {
                private final String url;
                public static final Parcelable.Creator<Use3DS1> CREATOR = new Creator();
                public static final int $stable = 8;

                /* loaded from: classes6.dex */
                public static final class Creator implements Parcelable.Creator<Use3DS1> {
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1 createFromParcel(Parcel parcel) {
                        s.g(parcel, "parcel");
                        return new Use3DS1(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Use3DS1[] newArray(int i11) {
                        return new Use3DS1[i11];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS1(String url) {
                    super(null);
                    s.g(url, "url");
                    this.url = url;
                }

                public static /* synthetic */ Use3DS1 copy$default(Use3DS1 use3DS1, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = use3DS1.url;
                    }
                    return use3DS1.copy(str);
                }

                public final String component1() {
                    return this.url;
                }

                public final Use3DS1 copy(String url) {
                    s.g(url, "url");
                    return new Use3DS1(url);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Use3DS1) && s.c(this.url, ((Use3DS1) obj).url);
                }

                public final String getUrl() {
                    return this.url;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public int hashCode() {
                    return this.url.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.url + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    s.g(out, "out");
                    out.writeString(this.url);
                }
            }

            /* loaded from: classes6.dex */
            public static final class Use3DS2 extends SdkData {
                private final DirectoryServerEncryption serverEncryption;
                private final String serverName;
                private final String source;
                private final String transactionId;
                public static final Parcelable.Creator<Use3DS2> CREATOR = new Creator();
                public static final int $stable = 8;

                /* loaded from: classes6.dex */
                public static final class Creator implements Parcelable.Creator<Use3DS2> {
                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2 createFromParcel(Parcel parcel) {
                        s.g(parcel, "parcel");
                        return new Use3DS2(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Use3DS2[] newArray(int i11) {
                        return new Use3DS2[i11];
                    }
                }

                /* loaded from: classes6.dex */
                public static final class DirectoryServerEncryption implements Parcelable {
                    private final String directoryServerId;
                    private final String dsCertificateData;
                    private final String keyId;
                    private final List<String> rootCertsData;
                    public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();
                    public static final int $stable = 8;

                    /* loaded from: classes6.dex */
                    public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                            s.g(parcel, "parcel");
                            return new DirectoryServerEncryption(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final DirectoryServerEncryption[] newArray(int i11) {
                            return new DirectoryServerEncryption[i11];
                        }
                    }

                    public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
                        s.g(directoryServerId, "directoryServerId");
                        s.g(dsCertificateData, "dsCertificateData");
                        s.g(rootCertsData, "rootCertsData");
                        this.directoryServerId = directoryServerId;
                        this.dsCertificateData = dsCertificateData;
                        this.rootCertsData = rootCertsData;
                        this.keyId = str;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ DirectoryServerEncryption copy$default(DirectoryServerEncryption directoryServerEncryption, String str, String str2, List list, String str3, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = directoryServerEncryption.directoryServerId;
                        }
                        if ((i11 & 2) != 0) {
                            str2 = directoryServerEncryption.dsCertificateData;
                        }
                        if ((i11 & 4) != 0) {
                            list = directoryServerEncryption.rootCertsData;
                        }
                        if ((i11 & 8) != 0) {
                            str3 = directoryServerEncryption.keyId;
                        }
                        return directoryServerEncryption.copy(str, str2, list, str3);
                    }

                    public final String component1() {
                        return this.directoryServerId;
                    }

                    public final String component2() {
                        return this.dsCertificateData;
                    }

                    public final List<String> component3() {
                        return this.rootCertsData;
                    }

                    public final String component4() {
                        return this.keyId;
                    }

                    public final DirectoryServerEncryption copy(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
                        s.g(directoryServerId, "directoryServerId");
                        s.g(dsCertificateData, "dsCertificateData");
                        s.g(rootCertsData, "rootCertsData");
                        return new DirectoryServerEncryption(directoryServerId, dsCertificateData, rootCertsData, str);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof DirectoryServerEncryption) {
                            DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) obj;
                            return s.c(this.directoryServerId, directoryServerEncryption.directoryServerId) && s.c(this.dsCertificateData, directoryServerEncryption.dsCertificateData) && s.c(this.rootCertsData, directoryServerEncryption.rootCertsData) && s.c(this.keyId, directoryServerEncryption.keyId);
                        }
                        return false;
                    }

                    public final String getDirectoryServerId() {
                        return this.directoryServerId;
                    }

                    public final String getDsCertificateData() {
                        return this.dsCertificateData;
                    }

                    public final String getKeyId() {
                        return this.keyId;
                    }

                    public final List<String> getRootCertsData() {
                        return this.rootCertsData;
                    }

                    public int hashCode() {
                        int hashCode = ((((this.directoryServerId.hashCode() * 31) + this.dsCertificateData.hashCode()) * 31) + this.rootCertsData.hashCode()) * 31;
                        String str = this.keyId;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", dsCertificateData=" + this.dsCertificateData + ", rootCertsData=" + this.rootCertsData + ", keyId=" + ((Object) this.keyId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i11) {
                        s.g(out, "out");
                        out.writeString(this.directoryServerId);
                        out.writeString(this.dsCertificateData);
                        out.writeStringList(this.rootCertsData);
                        out.writeString(this.keyId);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Use3DS2(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption) {
                    super(null);
                    s.g(source, "source");
                    s.g(serverName, "serverName");
                    s.g(transactionId, "transactionId");
                    s.g(serverEncryption, "serverEncryption");
                    this.source = source;
                    this.serverName = serverName;
                    this.transactionId = transactionId;
                    this.serverEncryption = serverEncryption;
                }

                public static /* synthetic */ Use3DS2 copy$default(Use3DS2 use3DS2, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = use3DS2.source;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = use3DS2.serverName;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = use3DS2.transactionId;
                    }
                    if ((i11 & 8) != 0) {
                        directoryServerEncryption = use3DS2.serverEncryption;
                    }
                    return use3DS2.copy(str, str2, str3, directoryServerEncryption);
                }

                public final String component1() {
                    return this.source;
                }

                public final String component2() {
                    return this.serverName;
                }

                public final String component3() {
                    return this.transactionId;
                }

                public final DirectoryServerEncryption component4() {
                    return this.serverEncryption;
                }

                public final Use3DS2 copy(String source, String serverName, String transactionId, DirectoryServerEncryption serverEncryption) {
                    s.g(source, "source");
                    s.g(serverName, "serverName");
                    s.g(transactionId, "transactionId");
                    s.g(serverEncryption, "serverEncryption");
                    return new Use3DS2(source, serverName, transactionId, serverEncryption);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Use3DS2) {
                        Use3DS2 use3DS2 = (Use3DS2) obj;
                        return s.c(this.source, use3DS2.source) && s.c(this.serverName, use3DS2.serverName) && s.c(this.transactionId, use3DS2.transactionId) && s.c(this.serverEncryption, use3DS2.serverEncryption);
                    }
                    return false;
                }

                public final DirectoryServerEncryption getServerEncryption() {
                    return this.serverEncryption;
                }

                public final String getServerName() {
                    return this.serverName;
                }

                public final String getSource() {
                    return this.source;
                }

                public final String getTransactionId() {
                    return this.transactionId;
                }

                @Override // com.stripe.android.core.model.StripeModel
                public int hashCode() {
                    return (((((this.source.hashCode() * 31) + this.serverName.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.serverEncryption.hashCode();
                }

                public String toString() {
                    return "Use3DS2(source=" + this.source + ", serverName=" + this.serverName + ", transactionId=" + this.transactionId + ", serverEncryption=" + this.serverEncryption + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    s.g(out, "out");
                    out.writeString(this.source);
                    out.writeString(this.serverName);
                    out.writeString(this.transactionId);
                    this.serverEncryption.writeToParcel(out, i11);
                }
            }

            private SdkData() {
                super(null);
            }

            public /* synthetic */ SdkData(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class VerifyWithMicrodeposits extends NextActionData {
            private final long arrivalDate;
            private final String hostedVerificationUrl;
            private final MicrodepositType microdepositType;
            public static final Parcelable.Creator<VerifyWithMicrodeposits> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<VerifyWithMicrodeposits> {
                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new VerifyWithMicrodeposits(parcel.readLong(), parcel.readString(), MicrodepositType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final VerifyWithMicrodeposits[] newArray(int i11) {
                    return new VerifyWithMicrodeposits[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyWithMicrodeposits(long j11, String hostedVerificationUrl, MicrodepositType microdepositType) {
                super(null);
                s.g(hostedVerificationUrl, "hostedVerificationUrl");
                s.g(microdepositType, "microdepositType");
                this.arrivalDate = j11;
                this.hostedVerificationUrl = hostedVerificationUrl;
                this.microdepositType = microdepositType;
            }

            public static /* synthetic */ VerifyWithMicrodeposits copy$default(VerifyWithMicrodeposits verifyWithMicrodeposits, long j11, String str, MicrodepositType microdepositType, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = verifyWithMicrodeposits.arrivalDate;
                }
                if ((i11 & 2) != 0) {
                    str = verifyWithMicrodeposits.hostedVerificationUrl;
                }
                if ((i11 & 4) != 0) {
                    microdepositType = verifyWithMicrodeposits.microdepositType;
                }
                return verifyWithMicrodeposits.copy(j11, str, microdepositType);
            }

            public final long component1() {
                return this.arrivalDate;
            }

            public final String component2() {
                return this.hostedVerificationUrl;
            }

            public final MicrodepositType component3() {
                return this.microdepositType;
            }

            public final VerifyWithMicrodeposits copy(long j11, String hostedVerificationUrl, MicrodepositType microdepositType) {
                s.g(hostedVerificationUrl, "hostedVerificationUrl");
                s.g(microdepositType, "microdepositType");
                return new VerifyWithMicrodeposits(j11, hostedVerificationUrl, microdepositType);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof VerifyWithMicrodeposits) {
                    VerifyWithMicrodeposits verifyWithMicrodeposits = (VerifyWithMicrodeposits) obj;
                    return this.arrivalDate == verifyWithMicrodeposits.arrivalDate && s.c(this.hostedVerificationUrl, verifyWithMicrodeposits.hostedVerificationUrl) && this.microdepositType == verifyWithMicrodeposits.microdepositType;
                }
                return false;
            }

            public final long getArrivalDate() {
                return this.arrivalDate;
            }

            public final String getHostedVerificationUrl() {
                return this.hostedVerificationUrl;
            }

            public final MicrodepositType getMicrodepositType() {
                return this.microdepositType;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return (((Long.hashCode(this.arrivalDate) * 31) + this.hostedVerificationUrl.hashCode()) * 31) + this.microdepositType.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.arrivalDate + ", hostedVerificationUrl=" + this.hostedVerificationUrl + ", microdepositType=" + this.microdepositType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeLong(this.arrivalDate);
                out.writeString(this.hostedVerificationUrl);
                out.writeString(this.microdepositType.name());
            }
        }

        /* loaded from: classes6.dex */
        public static final class WeChatPayRedirect extends NextActionData {
            public static final int $stable = 0;
            public static final Parcelable.Creator<WeChatPayRedirect> CREATOR = new Creator();
            private final WeChat weChat;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<WeChatPayRedirect> {
                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new WeChatPayRedirect(WeChat.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final WeChatPayRedirect[] newArray(int i11) {
                    return new WeChatPayRedirect[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WeChatPayRedirect(WeChat weChat) {
                super(null);
                s.g(weChat, "weChat");
                this.weChat = weChat;
            }

            public static /* synthetic */ WeChatPayRedirect copy$default(WeChatPayRedirect weChatPayRedirect, WeChat weChat, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    weChat = weChatPayRedirect.weChat;
                }
                return weChatPayRedirect.copy(weChat);
            }

            public final WeChat component1() {
                return this.weChat;
            }

            public final WeChatPayRedirect copy(WeChat weChat) {
                s.g(weChat, "weChat");
                return new WeChatPayRedirect(weChat);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WeChatPayRedirect) && s.c(this.weChat, ((WeChatPayRedirect) obj).weChat);
            }

            public final WeChat getWeChat() {
                return this.weChat;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                return this.weChat.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.weChat + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                this.weChat.writeToParcel(out, i11);
            }
        }

        private NextActionData() {
        }

        public /* synthetic */ NextActionData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public enum NextActionType {
        RedirectToUrl("redirect_to_url"),
        UseStripeSdk("use_stripe_sdk"),
        DisplayOxxoDetails("oxxo_display_details"),
        AlipayRedirect("alipay_handle_redirect"),
        BlikAuthorize("blik_authorize"),
        WeChatPayRedirect("wechat_pay_redirect_to_android_app"),
        VerifyWithMicrodeposits("verify_with_microdeposits");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NextActionType fromCode$payments_core_release(String str) {
                NextActionType[] values;
                for (NextActionType nextActionType : NextActionType.values()) {
                    if (s.c(nextActionType.getCode(), str)) {
                        return nextActionType;
                    }
                }
                return null;
            }
        }

        NextActionType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public enum Status {
        Canceled("canceled"),
        Processing(BaseSheetViewModel.SAVE_PROCESSING),
        RequiresAction("requires_action"),
        RequiresConfirmation("requires_confirmation"),
        RequiresPaymentMethod("requires_payment_method"),
        Succeeded("succeeded"),
        RequiresCapture("requires_capture");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromCode$payments_core_release(String str) {
                Status[] values;
                for (Status status : Status.values()) {
                    if (s.c(status.getCode(), str)) {
                        return status;
                    }
                }
                return null;
            }
        }

        Status(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public enum Usage {
        OnSession("on_session"),
        OffSession("off_session"),
        OneTime("one_time");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usage fromCode$payments_core_release(String str) {
                Usage[] values;
                for (Usage usage : Usage.values()) {
                    if (s.c(usage.getCode(), str)) {
                        return usage;
                    }
                }
                return null;
            }
        }

        Usage(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    String getClientSecret();

    long getCreated();

    String getDescription();

    String getId();

    String getLastErrorMessage();

    NextActionData getNextActionData();

    NextActionType getNextActionType();

    PaymentMethod getPaymentMethod();

    String getPaymentMethodId();

    List<String> getPaymentMethodTypes();

    Status getStatus();

    List<String> getUnactivatedPaymentMethods();

    boolean isConfirmed();

    boolean isLiveMode();

    boolean requiresAction();

    boolean requiresConfirmation();
}
package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.StripeIntent;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import wz.x;

/* loaded from: classes6.dex */
public final class Stripe3ds2Fingerprint implements Parcelable {
    public static final Parcelable.Creator<Stripe3ds2Fingerprint> CREATOR = new Creator();
    private final DirectoryServerEncryption directoryServerEncryption;
    private final String directoryServerName;
    private final String serverTransactionId;
    private final String source;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Stripe3ds2Fingerprint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Stripe3ds2Fingerprint(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint[] newArray(int i11) {
            return new Stripe3ds2Fingerprint[i11];
        }
    }

    public Stripe3ds2Fingerprint(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        s.g(source, "source");
        s.g(directoryServerName, "directoryServerName");
        s.g(serverTransactionId, "serverTransactionId");
        s.g(directoryServerEncryption, "directoryServerEncryption");
        this.source = source;
        this.directoryServerName = directoryServerName;
        this.serverTransactionId = serverTransactionId;
        this.directoryServerEncryption = directoryServerEncryption;
    }

    public static /* synthetic */ Stripe3ds2Fingerprint copy$default(Stripe3ds2Fingerprint stripe3ds2Fingerprint, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stripe3ds2Fingerprint.source;
        }
        if ((i11 & 2) != 0) {
            str2 = stripe3ds2Fingerprint.directoryServerName;
        }
        if ((i11 & 4) != 0) {
            str3 = stripe3ds2Fingerprint.serverTransactionId;
        }
        if ((i11 & 8) != 0) {
            directoryServerEncryption = stripe3ds2Fingerprint.directoryServerEncryption;
        }
        return stripe3ds2Fingerprint.copy(str, str2, str3, directoryServerEncryption);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.directoryServerName;
    }

    public final String component3() {
        return this.serverTransactionId;
    }

    public final DirectoryServerEncryption component4() {
        return this.directoryServerEncryption;
    }

    public final Stripe3ds2Fingerprint copy(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        s.g(source, "source");
        s.g(directoryServerName, "directoryServerName");
        s.g(serverTransactionId, "serverTransactionId");
        s.g(directoryServerEncryption, "directoryServerEncryption");
        return new Stripe3ds2Fingerprint(source, directoryServerName, serverTransactionId, directoryServerEncryption);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Stripe3ds2Fingerprint) {
            Stripe3ds2Fingerprint stripe3ds2Fingerprint = (Stripe3ds2Fingerprint) obj;
            return s.c(this.source, stripe3ds2Fingerprint.source) && s.c(this.directoryServerName, stripe3ds2Fingerprint.directoryServerName) && s.c(this.serverTransactionId, stripe3ds2Fingerprint.serverTransactionId) && s.c(this.directoryServerEncryption, stripe3ds2Fingerprint.directoryServerEncryption);
        }
        return false;
    }

    public final DirectoryServerEncryption getDirectoryServerEncryption() {
        return this.directoryServerEncryption;
    }

    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    public final String getServerTransactionId() {
        return this.serverTransactionId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((((this.source.hashCode() * 31) + this.directoryServerName.hashCode()) * 31) + this.serverTransactionId.hashCode()) * 31) + this.directoryServerEncryption.hashCode();
    }

    public String toString() {
        return "Stripe3ds2Fingerprint(source=" + this.source + ", directoryServerName=" + this.directoryServerName + ", serverTransactionId=" + this.serverTransactionId + ", directoryServerEncryption=" + this.directoryServerEncryption + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.source);
        out.writeString(this.directoryServerName);
        out.writeString(this.serverTransactionId);
        this.directoryServerEncryption.writeToParcel(out, i11);
    }

    /* loaded from: classes6.dex */
    public static final class DirectoryServerEncryption implements Parcelable {
        private final String directoryServerId;
        private final PublicKey directoryServerPublicKey;
        private final String keyId;
        private final List<X509Certificate> rootCerts;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate generateCertificate(String str) {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = str.getBytes(d.f35187b);
                s.f(bytes, "this as java.lang.String).getBytes(charset)");
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                Objects.requireNonNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) generateCertificate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List<X509Certificate> generateCertificates(List<String> list) {
                int t11;
                t11 = x.t(list, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (String str : list) {
                    arrayList.add(DirectoryServerEncryption.Companion.generateCertificate(str));
                }
                return arrayList;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new DirectoryServerEncryption(readString, publicKey, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption[] newArray(int i11) {
                return new DirectoryServerEncryption[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DirectoryServerEncryption(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String str) {
            s.g(directoryServerId, "directoryServerId");
            s.g(directoryServerPublicKey, "directoryServerPublicKey");
            s.g(rootCerts, "rootCerts");
            this.directoryServerId = directoryServerId;
            this.directoryServerPublicKey = directoryServerPublicKey;
            this.rootCerts = rootCerts;
            this.keyId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DirectoryServerEncryption copy$default(DirectoryServerEncryption directoryServerEncryption, String str, PublicKey publicKey, List list, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = directoryServerEncryption.directoryServerId;
            }
            if ((i11 & 2) != 0) {
                publicKey = directoryServerEncryption.directoryServerPublicKey;
            }
            if ((i11 & 4) != 0) {
                list = directoryServerEncryption.rootCerts;
            }
            if ((i11 & 8) != 0) {
                str2 = directoryServerEncryption.keyId;
            }
            return directoryServerEncryption.copy(str, publicKey, list, str2);
        }

        public final String component1() {
            return this.directoryServerId;
        }

        public final PublicKey component2() {
            return this.directoryServerPublicKey;
        }

        public final List<X509Certificate> component3() {
            return this.rootCerts;
        }

        public final String component4() {
            return this.keyId;
        }

        public final DirectoryServerEncryption copy(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String str) {
            s.g(directoryServerId, "directoryServerId");
            s.g(directoryServerPublicKey, "directoryServerPublicKey");
            s.g(rootCerts, "rootCerts");
            return new DirectoryServerEncryption(directoryServerId, directoryServerPublicKey, rootCerts, str);
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
                return s.c(this.directoryServerId, directoryServerEncryption.directoryServerId) && s.c(this.directoryServerPublicKey, directoryServerEncryption.directoryServerPublicKey) && s.c(this.rootCerts, directoryServerEncryption.rootCerts) && s.c(this.keyId, directoryServerEncryption.keyId);
            }
            return false;
        }

        public final String getDirectoryServerId() {
            return this.directoryServerId;
        }

        public final PublicKey getDirectoryServerPublicKey() {
            return this.directoryServerPublicKey;
        }

        public final String getKeyId() {
            return this.keyId;
        }

        public final List<X509Certificate> getRootCerts() {
            return this.rootCerts;
        }

        public int hashCode() {
            int hashCode = ((((this.directoryServerId.hashCode() * 31) + this.directoryServerPublicKey.hashCode()) * 31) + this.rootCerts.hashCode()) * 31;
            String str = this.keyId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", directoryServerPublicKey=" + this.directoryServerPublicKey + ", rootCerts=" + this.rootCerts + ", keyId=" + ((Object) this.keyId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.directoryServerId);
            out.writeSerializable(this.directoryServerPublicKey);
            List<X509Certificate> list = this.rootCerts;
            out.writeInt(list.size());
            for (X509Certificate x509Certificate : list) {
                out.writeSerializable(x509Certificate);
            }
            out.writeString(this.keyId);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DirectoryServerEncryption(java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5, java.lang.String r6) {
            /*
                r2 = this;
                java.lang.String r0 = "directoryServerId"
                kotlin.jvm.internal.s.g(r3, r0)
                java.lang.String r0 = "dsCertificateData"
                kotlin.jvm.internal.s.g(r4, r0)
                java.lang.String r0 = "rootCertsData"
                kotlin.jvm.internal.s.g(r5, r0)
                com.stripe.android.model.Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion r0 = com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption.Companion
                java.security.cert.X509Certificate r4 = com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption.Companion.access$generateCertificate(r0, r4)
                java.security.PublicKey r4 = r4.getPublicKey()
                java.lang.String r1 = "generateCertificate(dsCertificateData).publicKey"
                kotlin.jvm.internal.s.f(r4, r1)
                java.util.List r5 = com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption.Companion.access$generateCertificates(r0, r5)
                r2.<init>(r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2Fingerprint(StripeIntent.NextActionData.SdkData.Use3DS2 sdkData) {
        this(sdkData.getSource(), sdkData.getServerName(), sdkData.getTransactionId(), new DirectoryServerEncryption(sdkData.getServerEncryption().getDirectoryServerId(), sdkData.getServerEncryption().getDsCertificateData(), sdkData.getServerEncryption().getRootCertsData(), sdkData.getServerEncryption().getKeyId()));
        s.g(sdkData, "sdkData");
    }
}
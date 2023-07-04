package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.s;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public interface ChallengeRequestExecutor {

    /* loaded from: classes6.dex */
    public static final class Config implements Serializable, Parcelable {
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        private final String acsUrl;
        private final ChallengeRequestData creqData;
        private final Keys keys;
        private final MessageTransformer messageTransformer;
        private final String sdkReferenceId;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Config((MessageTransformer) parcel.readSerializable(), parcel.readString(), ChallengeRequestData.CREATOR.createFromParcel(parcel), parcel.readString(), Keys.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i11) {
                return new Config[i11];
            }
        }

        /* loaded from: classes6.dex */
        public static final class Keys implements Serializable, Parcelable {
            public static final Parcelable.Creator<Keys> CREATOR = new Creator();
            private final byte[] acsPublicKeyEncoded;
            private final byte[] sdkPrivateKeyEncoded;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Keys> {
                @Override // android.os.Parcelable.Creator
                public final Keys createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Keys(parcel.createByteArray(), parcel.createByteArray());
                }

                @Override // android.os.Parcelable.Creator
                public final Keys[] newArray(int i11) {
                    return new Keys[i11];
                }
            }

            public Keys(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                s.g(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                s.g(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.sdkPrivateKeyEncoded = sdkPrivateKeyEncoded;
                this.acsPublicKeyEncoded = acsPublicKeyEncoded;
            }

            public static /* synthetic */ Keys copy$default(Keys keys, byte[] bArr, byte[] bArr2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    bArr = keys.sdkPrivateKeyEncoded;
                }
                if ((i11 & 2) != 0) {
                    bArr2 = keys.acsPublicKeyEncoded;
                }
                return keys.copy(bArr, bArr2);
            }

            private final boolean typedEquals(Keys keys) {
                return Arrays.equals(this.sdkPrivateKeyEncoded, keys.sdkPrivateKeyEncoded) && Arrays.equals(this.acsPublicKeyEncoded, keys.acsPublicKeyEncoded);
            }

            public final byte[] component1$3ds2sdk_release() {
                return this.sdkPrivateKeyEncoded;
            }

            public final byte[] component2$3ds2sdk_release() {
                return this.acsPublicKeyEncoded;
            }

            public final Keys copy(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                s.g(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                s.g(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                return new Keys(sdkPrivateKeyEncoded, acsPublicKeyEncoded);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Keys) {
                    return typedEquals((Keys) obj);
                }
                return false;
            }

            public final byte[] getAcsPublicKeyEncoded$3ds2sdk_release() {
                return this.acsPublicKeyEncoded;
            }

            public final byte[] getSdkPrivateKeyEncoded$3ds2sdk_release() {
                return this.sdkPrivateKeyEncoded;
            }

            public int hashCode() {
                return ObjectUtils.hash(this.sdkPrivateKeyEncoded, this.acsPublicKeyEncoded);
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.sdkPrivateKeyEncoded) + ", acsPublicKeyEncoded=" + Arrays.toString(this.acsPublicKeyEncoded) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeByteArray(this.sdkPrivateKeyEncoded);
                out.writeByteArray(this.acsPublicKeyEncoded);
            }
        }

        public Config(MessageTransformer messageTransformer, String sdkReferenceId, ChallengeRequestData creqData, String acsUrl, Keys keys) {
            s.g(messageTransformer, "messageTransformer");
            s.g(sdkReferenceId, "sdkReferenceId");
            s.g(creqData, "creqData");
            s.g(acsUrl, "acsUrl");
            s.g(keys, "keys");
            this.messageTransformer = messageTransformer;
            this.sdkReferenceId = sdkReferenceId;
            this.creqData = creqData;
            this.acsUrl = acsUrl;
            this.keys = keys;
        }

        public static /* synthetic */ Config copy$default(Config config, MessageTransformer messageTransformer, String str, ChallengeRequestData challengeRequestData, String str2, Keys keys, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                messageTransformer = config.messageTransformer;
            }
            if ((i11 & 2) != 0) {
                str = config.sdkReferenceId;
            }
            String str3 = str;
            if ((i11 & 4) != 0) {
                challengeRequestData = config.creqData;
            }
            ChallengeRequestData challengeRequestData2 = challengeRequestData;
            if ((i11 & 8) != 0) {
                str2 = config.acsUrl;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                keys = config.keys;
            }
            return config.copy(messageTransformer, str3, challengeRequestData2, str4, keys);
        }

        public final MessageTransformer component1$3ds2sdk_release() {
            return this.messageTransformer;
        }

        public final String component2$3ds2sdk_release() {
            return this.sdkReferenceId;
        }

        public final ChallengeRequestData component3$3ds2sdk_release() {
            return this.creqData;
        }

        public final String component4$3ds2sdk_release() {
            return this.acsUrl;
        }

        public final Keys component5$3ds2sdk_release() {
            return this.keys;
        }

        public final Config copy(MessageTransformer messageTransformer, String sdkReferenceId, ChallengeRequestData creqData, String acsUrl, Keys keys) {
            s.g(messageTransformer, "messageTransformer");
            s.g(sdkReferenceId, "sdkReferenceId");
            s.g(creqData, "creqData");
            s.g(acsUrl, "acsUrl");
            s.g(keys, "keys");
            return new Config(messageTransformer, sdkReferenceId, creqData, acsUrl, keys);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Config) {
                Config config = (Config) obj;
                return s.c(this.messageTransformer, config.messageTransformer) && s.c(this.sdkReferenceId, config.sdkReferenceId) && s.c(this.creqData, config.creqData) && s.c(this.acsUrl, config.acsUrl) && s.c(this.keys, config.keys);
            }
            return false;
        }

        public final String getAcsUrl$3ds2sdk_release() {
            return this.acsUrl;
        }

        public final ChallengeRequestData getCreqData$3ds2sdk_release() {
            return this.creqData;
        }

        public final Keys getKeys$3ds2sdk_release() {
            return this.keys;
        }

        public final MessageTransformer getMessageTransformer$3ds2sdk_release() {
            return this.messageTransformer;
        }

        public final String getSdkReferenceId$3ds2sdk_release() {
            return this.sdkReferenceId;
        }

        public int hashCode() {
            return (((((((this.messageTransformer.hashCode() * 31) + this.sdkReferenceId.hashCode()) * 31) + this.creqData.hashCode()) * 31) + this.acsUrl.hashCode()) * 31) + this.keys.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.messageTransformer + ", sdkReferenceId=" + this.sdkReferenceId + ", creqData=" + this.creqData + ", acsUrl=" + this.acsUrl + ", keys=" + this.keys + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeSerializable(this.messageTransformer);
            out.writeString(this.sdkReferenceId);
            this.creqData.writeToParcel(out, i11);
            out.writeString(this.acsUrl);
            this.keys.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public interface Factory extends Serializable {
        ChallengeRequestExecutor create(ErrorReporter errorReporter, g gVar);
    }

    Object execute(ChallengeRequestData challengeRequestData, d<? super ChallengeRequestResult> dVar);
}